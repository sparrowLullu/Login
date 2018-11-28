
package Service;

import Bean.RegisterBean;

public interface Registration_Interface {
    
    boolean addRegister(RegisterBean rgbean);
    boolean modifyRegister(RegisterBean rgbean);
    boolean deleteRegister(String idd);
    
}
