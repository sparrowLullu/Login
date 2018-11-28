/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author TheOS
 */
public class DBConnection {

    public static Connection conn = null; // make connection public and use static for not creating object

    public static Connection getDBConnection() {
        String drvr = "com.mysql.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/test";
        String db_user = "root";
        String db_passwd = "root";

        try {
            Class.forName(drvr);
            conn = DriverManager.getConnection(url, db_user, db_passwd);
        } catch (SQLException ex) {
            //Handle errors for Class.forName
            ex.printStackTrace();
        } catch (Exception e) {
            //Handle errors for Class.forName
            e.printStackTrace();
        }
        return conn;
    }
}
