/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Bean.RegisterBean;
import java.io.InvalidClassException;
import java.sql.SQLException;

/**
 *
 * @author TheOS
 */
public interface Login_Interface {
    boolean AuthenticateUserLogin(RegisterBean rgbean);
  boolean UpdatePasswordLogin(RegisterBean rgbean,String password);  
  boolean forgetPasswordLogin(RegisterBean rgbean,String new_passwd); // reset the forget password
  boolean UpdateEmailId(RegisterBean rgbean, String new_emailId);
   RegisterBean checkEmailId(String email)throws SQLException,InvalidClassException;
   
}
