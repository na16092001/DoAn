/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author 84942
 */
public class DatabaseConnect {
    private static DatabaseConnect instance;
    private static Connection conn;
    private static final String DRIVER="com.microsoft.sqlserver.jdbc.SQLServerDriver";
    private static final String URL="jdbc:sqlserver://localhost:49884;databaseName=zozu1";
    private static final String USE="sa";
    private static final String PASSWORD="1234$";
    
    private DatabaseConnect (){
        try {
            Class.forName(DRIVER);
            conn = DriverManager.getConnection(URL, USE, PASSWORD); 
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(DatabaseConnect.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    public static Connection getConnection(){
        return conn;
    }
    public static DatabaseConnect getInstance() throws SQLException{
        if (instance == null) {
            instance = new DatabaseConnect();
        }else if(instance.getConnection().isClosed()){
            instance = new DatabaseConnect();
        }
        return instance;
    }
}
