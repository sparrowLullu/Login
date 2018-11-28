package DAO;

import Bean.RegisterBean;
import Util.DBConnection;
import java.io.InvalidClassException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author TheOS
 */
public class RegistrationDAO implements Registration_Interface {

    private Connection conn = null;
    PreparedStatement pst = null;
    ResultSet rs = null;

    //method for data insertion 

    @Override
    public boolean create(Object o) throws InvalidClassException {
        //  throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        RegisterBean rgbean = null;
        String add = "insert into tbl_reg(reg_first_name,reg_last_name,reg_gender,reg_dob,reg_address,reg_email_id,reg_mobile_no,reg_password,reg_security_ques,reg_security_answer)values(?,?,?,?,?,?,?,?,?,?)";
        conn = DBConnection.getDBConnection();
        int x = 0;
        try {
            rgbean = (RegisterBean) o;
            pst = conn.prepareStatement(add);
            // pst.setString(1, regbean.getId());  // from here we cannot send null value to database
            pst.setString(1, rgbean.getFirstName());
            pst.setString(2, rgbean.getLastName());
            pst.setString(3, rgbean.getGender());
            pst.setDate(4, rgbean.getDob());
            pst.setString(5, rgbean.getAddress());
            pst.setString(6, rgbean.getEmailId());
            pst.setString(7, rgbean.getMobileNo());
            pst.setString(8, rgbean.getPassword());
            pst.setString(9,rgbean.getSecurityQuestion());
            pst.setString(10, rgbean.getSecurityAnswer());
            x = pst.executeUpdate();
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
        if (x > 0) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean modify(Object o) throws InvalidClassException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean remove(String id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
