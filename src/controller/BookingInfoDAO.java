/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import model.BookingInfo;
import model.CustomerStay;

/**
 *
 * @author HNT
 */
public class BookingInfoDAO {
    DAO DAO = new DAO();
    public Connection conn =  DAO.DAO_DB();
    private ArrayList<BookingInfo> list;
    
    
    public ArrayList<BookingInfo> getBookingInfo(BookingInfo b){
        ArrayList<BookingInfo> br = new ArrayList<>();
        String select = """
                      Select tbl_BookedRoom.ID_BK,tbl_BookedRoom.NgayNhan,tbl_BookedRoom.NgayTra
                      tbl_KH.Ten_KH, tbl_KH.DC_KH, tbl_KH.SDT_KH, tbl_HotelRoom.Loai_R,tbl_HotelRoom.Ten_R,tbl_HotelRoom.SoGiuong_R,tbl_HotelRoom.Gia_R
                        from tbl_HotelRoom,tbl_BookedRoom,tbl_KH
                      where tbl_BookedRoom.ID_R = tbl_HotelRoom.ID_R and tbl_KH.ID_KH = tbl_BookedRoom.ID_KH""" ;
        try{
             PreparedStatement ps = conn.prepareStatement(select);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                BookingInfo bk = new BookingInfo();
            //doc du lieu tu sql ra java
                bk.setBookingID(rs.getString("ID_BK"));
                bk.setName(rs.getString("TEN_KH"));
                bk.setSdt(rs.getString("SDT_KH"));
                bk.setAddress(rs.getString("DC_KH"));
                bk.setRoomName(rs.getString("TEN_R"));
                bk.setType(rs.getString("LOAI_R"));
                bk.setBed(rs.getInt("SoGiuong_R"));  
                bk.setPrice(rs.getFloat("Gia_R"));
                bk.setDateFrom(rs.getDate("NgayNhan"));
                bk.setDateTo(rs.getDate("NgayTra"));
                
            //thêm vào trong danh sách
                br.add(bk);
            }
            }catch (Exception e){
        
        }
      return br;
 }
    public int getIdHD(){
        int id = 0;
        String getMaxId = "select max(ID_HD) as MAX_ID from tbl_HD";
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
      public ArrayList<BookingInfo> getSearchBooking(String bookingID, String Name, String Sdt ){
    //public ArrayList<HotelRoom> getListTKRoom(String id ){
        ArrayList<BookingInfo> list_TK = new ArrayList<>();
        //String TK = "select * from tbl_HotelRoom where ID_R like "+id+" and Loai_R like '%"+TypeR+"% and SoGiuong_R like '%"+SG+"%'";
        try {
            String TK = "select tbl_BookedRoom.ID_BK,tbl_BookedRoom.NgayNhan,tbl_BookedRoom.NgayTra,\n" +
"	tbl_KH.Ten_KH, tbl_KH.DC_KH, tbl_KH.SDT_KH, tbl_HotelRoom.Loai_R,tbl_HotelRoom.Ten_R,tbl_HotelRoom.SoGiuong_R,tbl_HotelRoom.Gia_R\n" +
"from tbl_HotelRoom,tbl_BookedRoom,tbl_KH\n" +
"where tbl_BookedRoom.ID_R = tbl_HotelRoom.ID_R and tbl_KH.ID_KH = tbl_BookedRoom.ID_KH and ID_BK like ? and Ten_KH like ? and SDT_KH like ? ";
            PreparedStatement ps = conn.prepareStatement(TK);
            ps.setString(1, "%"+bookingID+"%");
            ps.setString(2, "%"+Name+"%");
            ps.setString(3, "%"+Sdt+"%");
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                BookingInfo r = new BookingInfo();
            //doc du lieu tu sql ra java
               r.setBookingID(rs.getString("ID_BK"));
                r.setName(rs.getString("TEN_KH"));
                r.setSdt(rs.getString("SDT_KH"));
                r.setAddress(rs.getString("DC_KH"));
                r.setRoomName(rs.getString("TEN_R"));
                r.setType(rs.getString("LOAI_R"));
                r.setBed(rs.getInt("SoGiuong_R"));  
                r.setPrice(rs.getFloat("Gia_R"));
                r.setDateFrom(rs.getDate("NgayNhan"));
                r.setDateTo(rs.getDate("NgayTra"));
            //thêm vào trong danh sách
                list_TK.add(r);
            }
        }catch(Exception e)
        {
            e.printStackTrace();
        }
        
        return list_TK;       
    }
      
      
      public boolean InsertCheckIn(BookingInfo r, String ID)
    {
        try {
            String insert = "";
            PreparedStatement ps = conn.prepareStatement(insert);
            ps.setString(1, r.getBookingID());
            ps.setString(4, r.getName());
            ps.setString(6, r.getSdt());       
            ps.setString(5, r.getAddress());           
           ps.setString(8, r.getRoomName());  
           ps.setString(7, r.getType());
           ps.setInt(9, r.getBed());
           ps.setFloat(10, r.getPrice());
           ps.setDate(2, new Date(r.getDateFrom().getTime()));
           ps.setDate(3, new Date(r.getDateTo().getTime()));
           
            return ps.executeUpdate() > 0;
        }catch(Exception e)
        {
            e.printStackTrace();
        }
        return true;
    }
     
           
     public static void main(String[] args) {
        new BookingInfoDAO();
    }

 }
