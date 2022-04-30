
package controller;

import java.sql.Connection;
import java.sql.DriverManager;


public class DAO {
    private Connection conn;
    
    public DAO(){
        try {
            String dbURL = "jdbc:sqlserver://localhost;databaseName=Student;user=sa;password=120801;encrypt=true;trustServerCertificate=true;";
            conn = DriverManager.getConnection(dbURL);
            System.out.println("Ket noi sql server thanh cong");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public static void main(String[] args) {
        new DAO();
    }
}
