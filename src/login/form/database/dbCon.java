/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package login.form.database;
import java.sql.*;

/**
 *
 * @author shehara pc
 */
public class dbCon {
    public Connection getConnection() {
        
    Connection conn = null;
    try {
        Class.forName("com.mysql.cj.jdbc.Driver");
        conn = DriverManager.getConnection("jdbc:mysql://localhost:3308/jdbc", "user", "1234");
        //System.out.println("connected");
    } catch (ClassNotFoundException | SQLException e) {
        System.out.println(e);
    }
    return conn;
}
    
    public static void main(String[] args) {
        
        dbCon db = new dbCon();
        Connection c = db.getConnection();
        
        if(c==null){
            System.out.println("error");
        }
        else{
            System.out.println("connected");
        }
            
        
    }
}
