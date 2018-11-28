/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Bean.RegisterBean;
import DAO.LoginDAO;
import java.io.InvalidClassException;
import java.sql.SQLException;

/**
 *
 * @author TheOS
 */
public class Login_Service implements Login_Interface {

    @Override
    public boolean AuthenticateUserLogin(RegisterBean rgbean) {
        //  throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        LoginDAO lgdao = new LoginDAO();
        try {

            if (lgdao.checkUserLogin(rgbean)) {
                return true;
            } else {
                return false;
            }

        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public RegisterBean checkEmailId(String email) throws SQLException, InvalidClassException {
        // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        LoginDAO lgdao = new LoginDAO();
        return (RegisterBean) lgdao.findByEmailId(email);
    }

    @Override
    public boolean UpdatePasswordLogin(RegisterBean rgbean, String password) {
        //  throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        LoginDAO lgdao = new LoginDAO();
        try {
            return lgdao.changePassword(rgbean, password);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return false;
    }

    @Override
    public boolean forgetPasswordLogin(RegisterBean rgbean, String new_passwd) {
        // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        LoginDAO lgdao = new LoginDAO();
        try {
            return lgdao.resetPassword(lgdao, new_passwd);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return false;
    }

    @Override
    public boolean UpdateEmailId(RegisterBean rgbean, String new_emailId) {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.

        LoginDAO lg_dao = new LoginDAO();
        try {
           return lg_dao.changeEmailId(rgbean, new_emailId);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return false;
    }
}
