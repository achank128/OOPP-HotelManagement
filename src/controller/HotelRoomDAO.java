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
import model.HotelRoom;


public class HotelRoomDAO {
    DAO DAO = new DAO();
    public Connection conn = DAO.DAO_DB();
    private ArrayList<HotelRoom> list;
    
    public ArrayList<HotelRoom> getListRoom(){
        ArrayList<HotelRoom> list = new ArrayList<>();
        String select = "Select * from tbl_HotelRoom";
        try {
            PreparedStatement ps = conn.prepareStatement(select);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                HotelRoom r = new HotelRoom();
            //doc du lieu tu sql ra java
                r.setID(rs.getString("ID_R"));
                r.setName(rs.getString("Ten_R"));
                r.setType(rs.getString("Loai_R"));
                r.setNumberBed(rs.getInt("SoGiuong_R"));
                r.setPrice(rs.getFloat("Gia_R"));           
            //thêm vào trong danh sách
                list.add(r);
            }
        }catch(Exception e)
        {
            e.printStackTrace();
        }
        
        return list;       
    }
    
    public boolean addRoom(HotelRoom r){
        String insert = "INSERT INTO tbl_HotelRoom(ID_R, Ten_R, Loai_R, SoGiuong_R, Gia_R)"
                + " VALUES(?,?,?,?,?) ";
        try {
            PreparedStatement ps = conn.prepareStatement(insert);
            ps.setString(1, r.getID());
            ps.setString(2, r.getName());
            ps.setString(3, r.getType());
            ps.setInt(4, r.getNumberBed());
            //ps.setFloat(5, r.getPrice());
            ps.setBigDecimal(5, new BigDecimal(r.getPrice()));
            return ps.executeUpdate() > 0;
        }catch(Exception e)
        {
            e.printStackTrace();
        }
        return false;
    }
    
    public boolean deleteRoom(String id) {
        try {
            String delete = "delete tbl_HotelRoom where ID_R =?" ;
            PreparedStatement ps = conn.prepareStatement(delete); 
            ps.setString(1, id);              
             return ps.executeUpdate() > 0;
            }catch(Exception e)
        {
            e.printStackTrace();
        }
        return true;
    }
    
    public boolean editRoom(HotelRoom r, String id)
    {
        try {
            String editR = "update tbl_HotelRoom set Ten_R=?, Loai_R=?, SoGiuong_R=?, Gia_R=? where ID_R=?";
            PreparedStatement ps = conn.prepareStatement(editR);
            ps.setString(1, r.getName());
            ps.setString(2, r.getType());
            ps.setInt(3, r.getNumberBed());        
            ps.setBigDecimal(4, new BigDecimal(r.getPrice()));           
            ps.setString(5, id); // id can sua = id sua  
            return ps.executeUpdate() > 0;
        }catch(Exception e)
        {
            e.printStackTrace();
        }
        return true;
    }
}
