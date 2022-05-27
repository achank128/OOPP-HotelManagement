/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import model.StatisticalDV;
import model.StatisticalRoom;

/**
 *
 * @author HP
 */
public class StatisticalDAO {
    DAO DAO = new DAO();
    public Connection conn = DAO.DAO_DB();
    private ArrayList<StatisticalRoom> list;
    private ArrayList<StatisticalRoom> listDV;
    public ArrayList<StatisticalRoom> getListDT(){
        ArrayList<StatisticalRoom> list = new ArrayList<>();
        String select = "select a.ID_R,a.Ten_R,a.Loai_R,a.SoGiuong_R,a.Gia_R,e.Checkin,e.Checkout,e.SoDem,a.Gia_R* e.SoDem as Thanhtien \n" +
"from tbl_HotelRoom a,tbl_BookedRoom b , tbl_HD e\n" +
"where b.ID_BK = e.ID_BK and a.ID_R = b.ID_R ";
        try {
            PreparedStatement ps = conn.prepareStatement(select);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                StatisticalRoom r = new StatisticalRoom();
            //doc du lieu tu sql ra java
                r.setID(rs.getString("ID_R"));
                r.setTen_R(rs.getString("Ten_R"));
                r.setLoai_R(rs.getString("Loai_R"));
                r.setSoGiuong_R(rs.getInt("SoGiuong_R"));
                r.setGia_R(rs.getFloat("Gia_R"));               
                r.setNgayNhan(rs.getString("Checkin"));
                r.setNgayTra(rs.getString("Checkout"));
                r.setSoDem(rs.getInt("SoDem"));
                r.setThanhtien(rs.getFloat("Thanhtien"));  
            //thêm vào trong danh sách
                list.add(r);
            }
        }catch(Exception e)
        {
            e.printStackTrace();
        }
        
        return list;       
    }
    
    public ArrayList<StatisticalDV> getListDTDV(){
        ArrayList<StatisticalDV> listDV = new ArrayList<>();
        String select = "select a.ID_DV,b.Ten_DV,b.GhiChu_DV,b.Gia_DV,a.SoLuong as SoLuong,Sum(SoLuong*Gia_DV+a.DenBu) as Thanhtien\n" +
"from tbl_ChiTietHD_DV a,tbl_DV b where b.ID_DV = a.ID_DV  \n" +
"group by a.ID_DV ,b.Ten_DV ,a.SoLuong ,b.GhiChu_DV,b.Gia_DV ";
        try {
            PreparedStatement ps = conn.prepareStatement(select);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                StatisticalDV r = new StatisticalDV();
            //doc du lieu tu sql ra java               
                r.setID_DV(rs.getString("ID_DV"));
                r.setTen_DV(rs.getString("Ten_DV"));
                r.setGhiChu(rs.getString("GhiChu_DV"));
                r.setGia_DV(rs.getFloat("Gia_DV")); 
                r.setSoLuong(rs.getInt("SoLuong"));  
                r.setThanhtien(rs.getFloat("Thanhtien"));
            //thêm vào trong danh sách
                listDV.add(r);
            }
        }catch(Exception e)
        {
            e.printStackTrace();
        }
        
        return listDV;       
    }
}
