/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.sql.Connection;
import java.util.ArrayList;
import java.sql.PreparedStatement;
import java.sql.Date;
import models.Bill;
import models.CustomerStay;
import java.sql.ResultSet;

/**
 *
 * @author HNT
 */
public class BillDAO {

    DAO DAO = new DAO();
    public Connection conn = DAO.DAO_DB();

    public int getBillId() {
        int id = 0;
        String getMaxId = "select max(ID_HD) as MAX_ID from tbl_HD";
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

    public boolean addBill(Bill b) {
        String insert = "  INSERT INTO tbl_HD(ID_HD,ID_BK, CheckinDate, CheckinTime) VALUES(?,?,?,?)";
        try {
            PreparedStatement ps = conn.prepareStatement(insert);
            ps.setString(1, b.getBillID());
            ps.setString(2, b.getBookingID());
            ps.setDate(3, new Date(b.getDateFrom().getTime()));
            ps.setString(4, b.getTimeFrom());

            return ps.executeUpdate() > 0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return true;
    }

    public boolean addCustomerStay(CustomerStay cs) {
        String insert = "INSERT INTO tbl_KH_stay(ID_HD,Ten_KH_stay, CCCD_KH_stay, NgaySinh, QuocTich)"
                + " VALUES(?,?,?,?,?) ";
        try {
            PreparedStatement ps = conn.prepareStatement(insert);
            ps.setString(1, cs.getId());
            ps.setString(2, cs.getName());
            ps.setString(3, cs.getCCCD());
            ps.setDate(4, new Date(cs.getDateOfBirth().getTime()));
            ps.setString(5, cs.getQuocTich());

            return ps.executeUpdate() > 0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return true;
    }

    public ArrayList<CustomerStay> getCustomerStay(String ID) {
        //public ArrayList<HotelRoom> getListTKRoom(String id ){
        ArrayList<CustomerStay> list_TK = new ArrayList<>();
        //String TK = "select * from tbl_HotelRoom where ID_R like "+id+" and Loai_R like '%"+TypeR+"% and SoGiuong_R like '%"+SG+"%'";
        try {
            String TK = " select tbl_KH_stay.ID_HD,tbl_KH_stay.Ten_KH_stay,tbl_KH_stay.CCCD_KH_stay,tbl_KH_stay.NgaySinh,tbl_KH_stay.QuocTich\n"
                    + " from tbl_KH_stay\n"
                    + " where tbl_KH_stay.ID_HD like ?";
            PreparedStatement ps = conn.prepareStatement(TK);
            ps.setString(1, "%" + ID + "%");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                CustomerStay cs = new CustomerStay();
                //doc du lieu tu sql ra java
                cs.setId(rs.getString("ID_HD"));
                cs.setName(rs.getString("Ten_KH_stay"));
                cs.setCCCD(rs.getString("CCCD_KH_stay"));
                cs.setDateOfBirth(rs.getDate("NgaySinh"));
                cs.setQuocTich(rs.getString("QuocTich"));
                //thêm vào trong danh sách
                list_TK.add(cs);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return list_TK;
    }
}
