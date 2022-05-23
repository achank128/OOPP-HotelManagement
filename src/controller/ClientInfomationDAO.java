/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import model.Client;

/**
 *
 * @author Minh Duc
 */
public class ClientInfomationDAO {

     DAO DAO = new DAO();
    public Connection conn = DAO.DAO_DB();
    private ArrayList<Client> list;
    private ArrayList<Client> list_TK;
    public ArrayList<Client> getListClient(){
        ArrayList<Client> list = new ArrayList<>();
        String select = "Select * from tbl_KH";
        try {
            PreparedStatement ps = conn.prepareStatement(select);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                Client r = new Client();
            //doc du lieu tu sql ra java
                r.setID(rs.getString("ID_KH"));
                r.setName(rs.getString("Ten_KH"));
                r.setAddress(rs.getString("DC_KH"));
                r.setSDT(rs.getString("SDT_KH"));
                 
            //thêm vào trong danh sách
                list.add(r);
            }
        }catch(Exception e)
        {
            e.printStackTrace();
        }
        
        return list;       
    }
    
    public boolean addClient(Client r){
        String insert = "INSERT INTO tbl_KH(ID_KH, Ten_KH, DC_KH, SDT_KH)"
                + " VALUES(?,?,?,?) ";
        try {
            PreparedStatement ps = conn.prepareStatement(insert);
            ps.setString(1, r.getID());
            ps.setString(2, r.getName());
            ps.setString(3, r.getAddress());
            ps.setString(4, r.getSDT());
            //ps.setFloat(5, r.getPrice());
            return ps.executeUpdate() > 0;
        }catch(Exception e)
        {
            e.printStackTrace();
        }
        return false;
    }
    
    public boolean deleteClient(String id) {
        try {
            String delete = "delete tbl_KH where ID_KH =?" ;
            PreparedStatement ps = conn.prepareStatement(delete); 
            ps.setString(1, id);              
             return ps.executeUpdate() > 0;
            }catch(Exception e)
        {
            e.printStackTrace();
        }
        return true;
    }
    
    public boolean editClient(Client r, String id)
    {
       try {
            String editR = "Update tbl_KH set Ten_KH=?, DC_KH=?, SDT_KH=? where ID_KH=?";
            PreparedStatement ps = conn.prepareStatement(editR);
            ps.setString(1, r.getName());
            ps.setString(2, r.getAddress());
            ps.setString(3, r.getSDT());                   
            ps.setString(4, id); // id can sua = id sua  
            return ps.executeUpdate() > 0;
        }catch(Exception e)
        {
            e.printStackTrace();
        }
        return true;
    }
    
    public ArrayList<Client> getListClienttk(String tk){
    ArrayList<Client> list_TK = new ArrayList<>();
        //String TK = "select * from tbl_HotelRoom where ID_R like "+id+" and Loai_R like '%"+TypeR+"% and SoGiuong_R like '%"+SG+"%'";
        try {
            String TK = "select * from tbl_KH where ID_KH like ? or Ten_KH like ? or SDT_KH like ?";
            PreparedStatement ps = conn.prepareStatement(TK);
            ps.setString(1, "%"+tk+"%");
            ps.setString(2, "%"+tk+"%");
            ps.setString(3, "%"+tk+"%");
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                Client KH = new Client();              
            //doc du lieu tu sql ra java
                KH.setID(rs.getString("ID_KH"));
                KH.setName(rs.getString("Ten_KH"));
                KH.setAddress(rs.getString("DC_KH"));
                KH.setSDT(rs.getString("SDT_KH"));
            //thêm vào trong danh sách
                list_TK.add(KH);
            }
        }catch(Exception e)
        {
            e.printStackTrace();
        }
        
        return list_TK;       
    }
}
