package DAO;

import Bean.RegisterBean;
import Util.DBConnection;
import java.io.InvalidClassException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class LoginDAO implements Login_Interface {

    private Connection conn = null;
    PreparedStatement pst = null;
    ResultSet rs = null;

    ;

    @Override
    public boolean checkUserLogin(Object o) throws SQLException, InvalidClassException {
        // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        conn = DBConnection.getDBConnection();
        RegisterBean rgbean = null;
        rgbean = (RegisterBean) o;

        // storing the emailId and password in a variable from getter class
        String db_email_id = rgbean.getEmailId();
        String db_user_passwd = rgbean.getPassword();

        //taking String variable for storing emailid and password from database
        String userEmail = "";
        String userPasswd = "";

        String chk_login = "select reg_email_id,reg_password from tbl_reg where reg_email_id=?";
        try {
            pst = conn.prepareStatement(chk_login);
            pst.setString(1, db_email_id);  // or // pst.setString(1,rgbean.getEmailId();)
            rs = pst.executeQuery();
            while (rs.next()) {
                userEmail = rs.getString("reg_email_id");   //getting data from  database
                userPasswd = rs.getString("reg_password");
                if (db_email_id.equals(userEmail) && db_user_passwd.equals(userPasswd)) {
                    return true;
                }
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            conn.close();
        }
        return false;
    }

    @Override
    public boolean changePassword(Object o, String up_passwd) throws SQLException, InvalidClassException {
        //  throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        conn = DBConnection.getDBConnection();
        RegisterBean rgbean = null;
        String upd_passwd_qry = "update tbl_reg set reg_password=? where reg_email_id=? ";
        rgbean = (RegisterBean) o;
        int x = 0;
        try {
            pst = conn.prepareStatement(upd_passwd_qry);
            pst.setString(1, up_passwd);
            pst.setString(2, rgbean.getEmailId());
            x = pst.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
        }
        try {
            if (conn != null) {
                conn.close();
                pst.close();
            }
        } catch (SQLException se) {
            se.printStackTrace();
        }
        if (x > 0) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public Object findByEmailId(String iddd) throws SQLException, InvalidClassException {
        //  throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        RegisterBean rgbean = null;
        conn = DBConnection.getDBConnection();
        int x = 0;
        try {
            String sel_emailid_qry = "select * from tbl_reg where reg_email_id=?";
            pst = conn.prepareStatement(sel_emailid_qry);
            pst.setString(1, iddd);
            rs = pst.executeQuery();
            while (rs.next()) {
                rgbean = new RegisterBean();
                rgbean.setFirstName(rs.getString("reg_first_name")); //database column name 
                rgbean.setLastName(rs.getString("reg_last_name"));
                rgbean.setGender(rs.getString("reg_gender"));
                rgbean.setAddress(rs.getString("reg_address"));
                rgbean.setDob(rs.getDate("reg_dob"));
                rgbean.setMobileNo(rs.getString("reg_mobile_no"));
                rgbean.setEmailId(rs.getString("reg_email_id"));
                rgbean.setPassword(rs.getString("reg_password"));
                rgbean.setSecurityQuestion(rs.getString("reg_security_ques"));
                rgbean.setSecurityAnswer(rs.getString("reg_security_answer"));
                //  return rgbean;
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            try {
                if (conn != null) {
                    conn.close();
                    pst.close();
                }
            } catch (SQLException se) {
                se.printStackTrace();
            }
        }
        return rgbean;
    }

    @Override
    public boolean resetPassword(Object o, String new_password) throws SQLException, InvalidClassException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//        RegisterBean rgbean = null;
//        conn = DBConnection.getDBConnection();
//        int x = 0;
//        rgbean = (RegisterBean) o;
//
//        String c_my_question = rgbean.getSecurityQuestion(); //getting the value from the getter
//        String c_my_answer = rgbean.getSecurityAnswer();
//
//        String db_question = "";
//        String reset_passwd_qry = "update tbl_reg set reg_password=? where reg_email_id=?";
//        try {
//            pst = conn.prepareStatement(reset_passwd_qry);
//            pst.setString(1, new_password);
//            pst.setString(2, rgbean.getEmailId());
//            x = pst.executeUpdate();
//        } catch (SQLException se) {
//            se.printStackTrace();
//        } finally {
//            try {
//                if (conn != null) {
//                    pst.close();
//                    conn.close();
//                }
//            } catch (SQLException se) {
//                se.printStackTrace();
//            }
//        }
//        if (x > 0) {
//            return true;
//        } else {
//            return false;
//        }

    }

    @Override
    public boolean changeEmailId(Object o, String upd_emailId) throws SQLException, InvalidClassException {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        RegisterBean rgbean = null;
        conn = DBConnection.getDBConnection();
        rgbean = (RegisterBean) o;
        int x = 0;
        try {
            String up_email_qry = "update tbl_reg set reg_email_id=? where reg_email_id=?";
            pst = conn.prepareStatement(up_email_qry);
            pst.setString(1, upd_emailId);
            pst.setString(2, rgbean.getEmailId());
            x = pst.executeUpdate();

        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            try {
                if (conn != null) {
                    conn.close();
                    pst.close();
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
        if (x > 0) {
            return true;
        } else {
            return false;
        }
    }
}
