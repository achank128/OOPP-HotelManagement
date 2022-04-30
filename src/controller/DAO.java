/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.sql.Connection;
import java.sql.DriverManager;


/**
 *
 * @author Than
 */
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
