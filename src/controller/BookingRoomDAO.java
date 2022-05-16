/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import model.HotelRoom;
import java.sql.Date;


public class BookingRoomDAO {
    DAO DAO = new DAO();
    public Connection conn = DAO.DAO_DB();
    HotelRoomDAO hotelRoomsDAO = new HotelRoomDAO();
    private ArrayList<HotelRoom> roomList = hotelRoomsDAO.getListRoom();;
   
    
    public boolean getRoomFound(Date dateFrom, Date dateTo, String type, int bed){
        String find = "select tbl_BookedRoom.ID_R from tbl_BookedRoom, tbl_HotelRoom \n" +
                        "where tbl_BookedRoom.ID_R = tbl_HotelRoom.ID_R \n" +
                        "and '?' not between NgayNhan and NgayTra \n" +
                        "and '?' not between NgayNhan and NgayTra \n" +
                        "and tbl_HotelRoom.Loai_R like '%?%'\n" +
                        "and tbl_HotelRoom.SoGiuong_R like '?'";
        
        try{
            PreparedStatement ps = conn.prepareStatement(find);
            ps.setDate(1, new Date(dateFrom.getTime()));
            ps.setDate(2, new Date(dateTo.getTime())); 
            ps.setString(3, type);
            ps.setInt(4, bed);
            return ps.executeUpdate() > 0;
        }catch(Exception e)
        {
            e.printStackTrace();
        }
          

        ArrayList<HotelRoom> roomFound = new ArrayList<>();
        return roomFound;
    }
    
    
    
}
