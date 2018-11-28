
package DAO;

import java.io.InvalidClassException;

public interface Registration_Interface {
    boolean create(Object o) throws InvalidClassException;
    boolean modify(Object o)throws InvalidClassException;
    boolean remove(String id);
    
}
