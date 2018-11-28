/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Bean.RegisterBean;
import DAO.RegistrationDAO;
import java.sql.SQLException;

/**
 *
 * @author TheOS
 */
public class Registration_Class implements Registration_Interface {

    @Override
    public boolean addRegister(RegisterBean rgbean) {
        //  throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        RegistrationDAO rgdao = new RegistrationDAO();
        try {
            return rgdao.create(rgbean);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }


@Override
        public boolean modifyRegister(RegisterBean rgbean) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

  
    @Override
        public boolean deleteRegister(String idd) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
