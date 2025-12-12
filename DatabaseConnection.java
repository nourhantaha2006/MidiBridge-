/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package db;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author Nourhan Taha
 */
public class DatabaseConnection {
    public static Connection connect() {
        Connection conn = null;

        try {
            String url = "jdbc:mysql://localhost:3306/hospital";
            String user = "root";
            String pass = "N0urh@n2006"; // لو عاملين باسورد حطيه

            conn = DriverManager.getConnection(url, user, pass);
            System.out.println("Connected Successfully!");

        } catch (SQLException e) {
            System.out.println("Connection Failed!");
        }

        return conn;
    }
    
}
