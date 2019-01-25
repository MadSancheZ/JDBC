/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author 414
 */
public class Util {
    private static final String DB_DRIVER = "org.postgresql.Driver";
    private static final String DB_URL = "jdbc:postgresql://localhost:5432/newBD";
    private static final String DB_LOGIN = "postgres";
    private static final String DB_PASSWORD = "";
    
    public Connection getConnection(){
        Connection con=null;
        try {
            Class.forName(DB_DRIVER);
            con = DriverManager.getConnection(DB_URL, DB_LOGIN, DB_PASSWORD);
            System.out.println("Connection successful");
        } catch (SQLException |ClassNotFoundException ex) {
            ex.getLocalizedMessage();
            System.err.println("Connection fail");
        } 
        return con;
    }
}
