
package controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;


public class DAO {
    private Connection conn;
    ResultSet result = null;
    
     public Connection DAO_DB(){
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String dbURL = "jdbc:sqlserver://localhost:1433;databasename=HotelManagement;"

                    + "username=sa;password=01042001;encrypt=true;trustServerCertificate=true;";
//>>>>>>> 6756ca442fc4f2c27ebcfe95dea28411598f5a37
            conn = DriverManager.getConnection(dbURL);
            System.out.println("Ket noi SQLserver thanh cong!");
            return conn;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    
    public static void main(String[] args) {
        new DAO();
    }
}
