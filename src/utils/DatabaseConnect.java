/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author 84942
 */
public class DatabaseConnect {
    private static final String DRIVER="com.microsoft.sqlserver.jdbc.SQLServerDriver";
    private static final String URL="jdbc:sqlserver://localhost:1433;databaseName=zozu1";
    private static final String USE="sa";
    private static final String PASSWORD="1234";
    
    public static Connection getConnection(){
        Connection conn=null;
        try {
            Class.forName(DRIVER);
            conn=DriverManager.getConnection(URL,USE,PASSWORD);
        } catch ( ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
        return conn;
    }
}
