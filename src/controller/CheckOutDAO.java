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
import java.util.HashSet;
import java.util.Set;
import model.Bill;
import model.BookingRoom;
import model.CheckOut;
import model.ServiceBill;
import model.ServiceCk;

/**
 *
 * @author HNT
 */
public class CheckOutDAO {

    DAO DAO = new DAO();
    public Connection conn = DAO.DAO_DB();
    private ArrayList<CheckOut> list;

    public ArrayList<Bill> getCheckOutList() {
        ArrayList<Bill> bill = new ArrayList<Bill>();
        String get = "select * from tbl_HD where hdstatus=0";
        try {
            PreparedStatement ps = conn.prepareStatement(get);

            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Bill b = new Bill();
                b.setBillID(rs.getString("ID_HD"));
                b.setBookingID(rs.getString("ID_BK"));
                b.setDateFrom(rs.getDate("CheckinDate"));
                b.setTimeFrom(rs.getString("CheckinTime"));
                b.setStatus(rs.getBoolean("hdstatus"));
                bill.add(b);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return bill;
    }
    
    public int getSodem(String id){
       int sodem = 0;
       String get = "select SoDem from tbl_HD where ID_HD = ?";
       try {
            PreparedStatement ps = conn.prepareStatement(get);
            ps.setString(1, id);
            ResultSet rs = ps.executeQuery();
            rs.next();
            sodem = rs.getInt("SoDem");
             } catch (Exception e) {
            e.printStackTrace();
        }

        return sodem;
    }

    public BookingRoom getBooking(String id) {
        BookingRoom b = new BookingRoom();
        String get = "select * from tbl_BookedRoom where ID_BK = ?";
        try {
            PreparedStatement ps = conn.prepareStatement(get);
            ps.setString(1, id);
            ResultSet rs = ps.executeQuery();
            rs.next();
            b.setBookingID(rs.getString("ID_BK"));
            b.setRoomID(rs.getString("ID_R"));
            b.setCustID(rs.getString("ID_KH"));
            b.setDateFrom(rs.getDate("NgayNhan"));
            b.setDateTo(rs.getDate("NgayTra"));
            b.setStatus(rs.getBoolean("bkstatus"));

        } catch (Exception e) {
            e.printStackTrace();
        }

        return b;
    }

    public ServiceCk getSerivce(String id) {
        ServiceCk s = new ServiceCk();
        String get = "select * from tbl_DV where ID_DV = ?";
        try {
            PreparedStatement ps = conn.prepareStatement(get);
            ps.setString(1, id);
            ResultSet rs = ps.executeQuery();
            rs.next();
            s.setServiceID(rs.getString("ID_DV"));
            s.setName(rs.getString("Ten_DV"));
            s.setServiceID(rs.getString("Gia_DV"));
            s.setServiceID(rs.getString("GhiChu_DV"));

        } catch (Exception e) {
            e.printStackTrace();
        }

        return s;
    }

    public ArrayList<ServiceBill> getSerivceBill(String id) {
        ArrayList<ServiceBill> slist = new ArrayList<>();
        String get = "select * from tbl_ChiTietHD_DV where ID_HD = ?";
        System.out.println(id);
        try {
            PreparedStatement ps = conn.prepareStatement(get);
            ps.setString(1, id);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                ServiceBill s = new ServiceBill();
                s.setBillID(rs.getString("ID_HD"));
                s.setServiceID(rs.getString("ID_DV"));
                s.setServiceAmount(rs.getInt("SoLuong"));
                s.setServiceNote(rs.getString("GhiChu"));
                s.setServiceDbu(rs.getFloat("Denbu"));
                slist.add(s);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return slist;
    }
    public boolean addBillToPay(Bill b) {
        String insert = " update tbl_HD set ID_NV = ? , CheckoutDate = ? , CheckoutTime = ? where ID_HD like ? ";
        try {
            PreparedStatement ps = conn.prepareStatement(insert);
             ps.setString(1, b.getEmployeeID());
             ps.setDate(2, new Date(b.getDateTo().getTime()));
            ps.setString(3, b.getTimeTo());

            ps.setString(4, b.getBillID());

            return ps.executeUpdate() > 0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return true;
    }
       public boolean addSoDem(Bill b) {
        String insert = "update tbl_HD set SoDem = (select DATEDIFF(DAY,tbl_HD.CheckinDate,tbl_HD.CheckoutDate)) where ID_HD = ? ";
        try {
            PreparedStatement ps = conn.prepareStatement(insert);
            ps.setString(1, b.getBillID());

            return ps.executeUpdate() > 0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return true;
    }
     public float getServiceSalary(String id) {
        float ss = 0;
        String get = """
                        select sum(tbl_ChiTietHD_DV.SoLuong * tbl_DV.Gia_DV+ tbl_ChiTietHD_DV.DenBu) as tiendichvu from tbl_ChiTietHD_DV,tbl_DV,tbl_HD 
                        where tbl_HD.ID_HD = tbl_ChiTietHD_DV.ID_HD
                        and tbl_ChiTietHD_DV.ID_DV = tbl_DV.ID_DV
                        and tbl_HD.ID_HD = ? 
                     """;
        try {
            PreparedStatement ps = conn.prepareStatement(get);
            ps.setString(1, id);
            ResultSet rs = ps.executeQuery();
            rs.next();
            ss = rs.getFloat("tiendichvu");
            
        } catch (Exception e) {
            e.printStackTrace();
        }

        return ss;
    }

     public boolean updateStatusBill(String id, String status) {
        try {
            String update = "update tbl_HD set hdstatus = ? where ID_HD = ?";
            PreparedStatement ps = conn.prepareStatement(update);
            
            ps.setString(1, status);
            ps.setString(2, id);
            
            return ps.executeUpdate() > 0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return true;
    }
}
