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
import model.Client;
import model.FindRoom;

public class BookingRoomDAO {

    public Connection conn = new DAO().DAO_DB();

    public int getBookingId() {
        int id = 0;
        String getMaxId = "select max(ID_BK) as MAX_ID from tbl_BookedRoom";
        try {
            PreparedStatement ps = conn.prepareStatement(getMaxId);
            ResultSet rs = ps.executeQuery();
            rs.next();
            id = rs.getInt("MAX_ID");
        } catch (Exception e) {
            e.printStackTrace();
        }

        return id + 1;
    }

    public ArrayList<HotelRoom> getRoomFound(FindRoom f) {
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

        try {
            PreparedStatement ps = conn.prepareStatement(find);
            ps.setDate(1, new Date(f.getDateFrom().getTime()));
            ps.setDate(2, new Date(f.getDateTo().getTime()));
            ps.setString(3, "%" + String.valueOf(f.getType()) + "%");
            ps.setString(4, "%" + String.valueOf(f.getBed()) + "%");
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                HotelRoom r = new HotelRoom();

                r.setID(rs.getString("ID_R"));
                r.setName(rs.getString("Ten_R"));
                r.setType(rs.getString("Loai_R"));
                r.setNumberBed(rs.getInt("SoGiuong_R"));
                r.setPrice(rs.getFloat("Gia_R"));
                roomFound.add(r);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return roomFound;
    }

    public ArrayList<Client> getCustFound(String ID, String name, String phone, String address) {
        ArrayList<Client> cust = new ArrayList<Client>();
        String find = """
                 select * from tbl_KH where
                 ID_KH like ? and
                 Ten_KH like ? and
                 SDT_KH like ? and
                 DC_KH like ?
                 """;
        try {
            PreparedStatement ps = conn.prepareStatement(find);
            ps.setString(1, "%" + ID + "%");
            ps.setString(2, "%" + name + "%");
            ps.setString(3, "%" + phone + "%");
            ps.setString(4, "%" + address + "%");
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Client c = new Client();

                c.setID(rs.getString("ID_KH"));
                c.setName(rs.getString("Ten_KH"));
                c.setPhone(rs.getString("SDT_KH"));
                c.setAddress(rs.getString("DC_KH"));
                cust.add(c);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return cust;
    }

    public ArrayList<BookingRoom> getBookingList() {
        ArrayList<BookingRoom> bookingList = new ArrayList<BookingRoom>();
        String get = """
                     select ID_BK, ID_R, tbl_KH.ID_KH, Ten_KH, SDT_KH, NgayNhan, NgayTra 
                     from tbl_BookedRoom, tbl_KH where
                     tbl_BookedRoom.ID_KH = tbl_KH.ID_KH
                     """;
        try {
            PreparedStatement ps = conn.prepareStatement(get);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                BookingRoom b = new BookingRoom();
                b.setBookingID(rs.getString("ID_BK"));
                b.setRoomID(rs.getString("ID_R"));
                b.setCustID(rs.getString("ID_KH"));
                b.setCustName(rs.getString("Ten_KH"));
                b.setPhone(rs.getString("SDT_KH"));
                b.setDateFrom(rs.getDate("NgayNhan"));               
                b.setDateTo(rs.getDate("NgayTra"));
                bookingList.add(b);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return bookingList;
    }

    public ArrayList<BookingRoom> getBookingListFound(String search) {
        ArrayList<BookingRoom> bookingList = new ArrayList<BookingRoom>();
        String get = """
                    select ID_BK, ID_R, tbl_KH.ID_KH, Ten_KH, SDT_KH, NgayNhan, NgayTra 
                    from tbl_BookedRoom inner join tbl_KH on tbl_BookedRoom.ID_KH = tbl_KH.ID_KH 
                    where ID_BK like ? or ID_R like ? 
                    or tbl_BookedRoom.ID_KH like ?
                    or Ten_KH like ? or SDT_KH like ? 
                    or NgayNhan like ? or NgayTra like ?
                     """;
        try {
            PreparedStatement ps = conn.prepareStatement(get);
            ps.setString(1, "%" + search + "%");
            ps.setString(2, "%" + search + "%");
            ps.setString(3, "%" + search + "%");
            ps.setString(4, "%" + search + "%");
            ps.setString(5, "%" + search + "%");
            ps.setString(6, "%" + search + "%");
            ps.setString(7, "%" + search + "%");

            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                BookingRoom b = new BookingRoom();
                b.setBookingID(rs.getString("ID_BK"));
                b.setRoomID(rs.getString("ID_R"));
                b.setCustID(rs.getString("ID_KH"));
                b.setCustName(rs.getString("Ten_KH"));
                b.setPhone(rs.getString("SDT_KH"));
                b.setDateFrom(rs.getDate("NgayNhan"));               
                b.setDateTo(rs.getDate("NgayTra"));
                bookingList.add(b);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return bookingList;
    }

    public boolean addBooking(BookingRoom booking) {
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
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
    
    public boolean deleteBooking(String id) {
        String insert = "delete tbl_BookedRoom where ID_BK = ? ";
        try {
            PreparedStatement ps = conn.prepareStatement(insert);
            ps.setString(1, id);          
            return ps.executeUpdate() > 0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
    
    public boolean editBooking(BookingRoom b)
    {
        try {
            String edit = "update tbl_BookedRoom set ID_R = ?, ID_KH = ?, NgayNhan = ?, NgayTra = ? where ID_BK = ?";
            PreparedStatement ps = conn.prepareStatement(edit);
            ps.setString(1, b.getRoomID());
            ps.setString(2, b.getCustID());
            ps.setDate(3, new Date(b.getDateFrom().getTime()));
            ps.setDate(4, new Date(b.getDateTo().getTime()));
            ps.setString(5, b.getBookingID());
            return ps.executeUpdate() > 0;
        }catch(Exception e)
        {
            e.printStackTrace();
        }
        return true;
    }

}
