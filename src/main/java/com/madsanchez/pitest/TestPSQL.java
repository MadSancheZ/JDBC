/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.madsanchez.pitest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author 414
 */
public class TestPSQL {

}

class Test {

    Connection con;

    public void testing() {

        try {
            Class.forName("org.postgresql.Driver");
        } catch (ClassNotFoundException e) {
            e.getLocalizedMessage();
        }
        String url = "jdbc:postgresql://localhost:5432/newBD";
        String login = "postgres";
        String password = "";
        try {
            con = DriverManager.getConnection(url, login, password);
            System.out.println("connection succesful");
            con.close();
        } catch (SQLException ex) {
            ex.getLocalizedMessage();
        }
    }

}
