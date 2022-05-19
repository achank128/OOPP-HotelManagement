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
import java.sql.ResultSet;
import model.BookingRoom;
import model.Custumer;
import model.FindRoom;


public class BookingRoomDAO {
    public Connection conn = new DAO().DAO_DB();
    
    public int getBookingId(){
        int id = 0;
        String getMaxId = "select max(ID_BK) as MAX_ID from tbl_BookedRoom";
        try{
            PreparedStatement ps = conn.prepareStatement(getMaxId);
            ResultSet rs = ps.executeQuery();
            rs.next();
            id = rs.getInt("MAX_ID");        
        }catch(Exception e)
        {
            e.printStackTrace();
        }      
        
        return id + 1;
    }
    
    public ArrayList<HotelRoom> getRoomFound(FindRoom f){
        ArrayList<HotelRoom> roomFound = new ArrayList<HotelRoom>();
        
        String find = """
                      select * from tbl_HotelRoom where ID_R not in 
                      (select tbl_BookedRoom.ID_R from tbl_BookedRoom, tbl_HotelRoom 
                      where tbl_BookedRoom.ID_R = tbl_HotelRoom.ID_R 
                      and ? between NgayNhan and NgayTra 
                      and ? between NgayNhan and NgayTra ) 
                      and tbl_HotelRoom.Loai_R like ?
                      and tbl_HotelRoom.SoGiuong_R like ?
                      """;
        
        try{
            PreparedStatement ps = conn.prepareStatement(find);
            ps.setDate(1, new Date(f.getDateFrom().getTime()));
            ps.setDate(2, new Date(f.getDateTo().getTime()));
            ps.setString(3, "%"+String.valueOf(f.getType())+"%");
            ps.setString(4, "%"+String.valueOf(f.getBed())+"%");
            ResultSet rs = ps.executeQuery();
            
            while(rs.next()){
                HotelRoom r = new HotelRoom();

                r.setID(rs.getString("ID_R"));
                r.setName(rs.getString("Ten_R"));
                r.setType(rs.getString("Loai_R"));
                r.setNumberBed(rs.getInt("SoGiuong_R"));
                r.setPrice(rs.getFloat("Gia_R"));           
                roomFound.add(r);    
            }
            
        }catch(Exception e)
        {
            e.printStackTrace();
        }
  
        return roomFound;    
    }
    
    public ArrayList<Custumer> getCustFound(String ID, String name, String phone, String address){
        ArrayList<Custumer> cust = new ArrayList<Custumer>();
        String find = """
                 select * from tbl_KH where
                 ID_KH like ? and
                 Ten_KH like ? and
                 SDT_KH like ? and
                 DC_KH like ?
                 """;
        try {
            PreparedStatement ps = conn.prepareStatement(find);
            ps.setString(1, "%"+ID+"%");
            ps.setString(2, "%"+name+"%");
            ps.setString(3, "%"+phone+"%");
            ps.setString(4, "%"+address+"%");
            ResultSet rs = ps.executeQuery();
            
            while(rs.next()){
                Custumer c = new Custumer();

                c.setCustID(rs.getString("ID_KH"));
                c.setName(rs.getString("Ten_KH"));
                c.setPhone(rs.getString("SDT_KH"));
                c.setAddress(rs.getString("DC_KH"));                    
                cust.add(c);    
            }
            
        }catch(Exception e)
        {
            e.printStackTrace();
        }
        
        return cust;
    }
    
    public ArrayList<BookingRoom> getBookingList (){
        ArrayList<BookingRoom> bookingList = new ArrayList<BookingRoom>();
        return bookingList;
    }
    
    public boolean addBooking (BookingRoom booking){
        String insert = """
                        insert into tbl_BookedRoom(ID_BK,ID_R,ID_KH,NgayNhan,NgayTra) 
                        values(?,?,?,?,?)
                        """;
        try {
            PreparedStatement ps = conn.prepareStatement(insert);
            ps.setString(1, booking.getBookingID());
            ps.setString(2, booking.getRoomID());
            ps.setString(3, booking.getCustID());
            ps.setDate(4, new Date(booking.getDateFrom().getTime()));
            ps.setDate(5, new Date(booking.getDateTo().getTime()));            
            return ps.executeUpdate() > 0;
        }catch(Exception e)
        {
            e.printStackTrace();
        }
        return false;
    }
    
    
}
