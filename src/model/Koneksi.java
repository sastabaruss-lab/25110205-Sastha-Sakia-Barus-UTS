package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Koneksi {
    private static Connection conn;

    public static Connection getKoneksi() {
        if (conn == null) {
            try {
                String url = "jdbc:mysql://localhost:3306/db_inventori";
                String user = "root";
                String pass = "";
                
                DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
                conn = DriverManager.getConnection(url, user, pass);
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Koneksi Ke Database Gagal: " + e.getMessage(), "Error Koneksi", JOptionPane.ERROR_MESSAGE);
            }
        }
        return conn;
    }
}