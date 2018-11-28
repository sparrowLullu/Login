/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.io.InvalidClassException;
import java.sql.SQLException;

/**
 *
 * @author TheOS
 */
public interface Login_Interface {
    boolean checkUserLogin(Object o)throws SQLException,InvalidClassException;
    boolean resetPassword(Object o,String new_password)throws SQLException,InvalidClassException;
    boolean changePassword(Object o,String up_passwd)throws SQLException,InvalidClassException;
  //  (Object) findByEmailId(String iddd)throws SQLException,InvalidClassException;
    boolean changeEmailId(Object o, String upd_emailId)throws SQLException,InvalidClassException;
    Object findByEmailId(String iddd)throws SQLException,InvalidClassException;
    
}
