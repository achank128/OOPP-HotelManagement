
package controller;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.DriverManager;
import model.HotelRoom;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.sql.ResultSet;
import java.util.Set;
import javax.swing.JOptionPane;

public class DAO {
    private Connection conn;
    ResultSet result = null;
    private ArrayList<HotelRoom> list;
    
    public Connection DAO_DB(){
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
//<<<<<<< HEAD
           //String dbURL = "jdbc:sqlserver://localhost:1433;databasename=DoAn;"
                  //  + "username=sa;password=02102001;encrypt=true;trustServerCertificate=true;"; //;encrypt=true;trustServerCertificate=true;
//==
            String dbURL = "jdbc:sqlserver://localhost:1433;databasename=HotelManagement;"
                    + "username=sa;password=01042001;encrypt=true;trustServerCertificate=true;"; //;encrypt=true;trustServerCertificate=true;
//>>>>>>> 116b8f6447296fb3a5e9c3029e4c9199283884fa

            conn = DriverManager.getConnection(dbURL);
            System.out.println("Ket noi sql server thanh cong");
            return conn;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    public boolean addRoom(HotelRoom r){
        String sql = "INSERT INTO tbl_HotelRoom(ID_R, Ten_R, Loai_R, SoGiuong_R, Gia_R)"
                + " VALUES(?,?,?,?,?) ";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
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
    
    public ArrayList<HotelRoom> getListRoom(){
        ArrayList<HotelRoom> list = new ArrayList<>();
        String sql = "Select * from tbl_HotelRoom";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
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
    
//    public HotelRoom findID(String ID)
//    {
//        list = getListRoom();
//        for( HotelRoom r : list )
//        {
//            if(r.getID().equalsIgnoreCase(ID))
//            {
//                return r;
//            }
//        }
//        return null;
//    }
    
    public boolean deleteRoom( HotelRoom r,Object c) {
        try {
            String deleteQuery = "delete tbl_HotelRoom where ID_R =?" ;
            PreparedStatement ps = conn.prepareStatement(deleteQuery); 
            ps.setString(1, c.toString());
            //ps.setString(1, r.getID());
            //ps.setString(1,jTable1.getValueAt(jTable1.getSelectRow(),0).toString());
             //ps.executeUpdate();
             list.remove(r);
             return ps.executeUpdate() > 0;
            }catch(Exception e)
        {
            e.printStackTrace();
        }
            return true;
    }
    
    public boolean editRoom(HotelRoom r)
    {
        try {
            String editR = "update tbl_HotelRoom set Ten_R=?, Loai_R=?, SoGiuong_R=?, Gia_R=?";
            PreparedStatement ps = conn.prepareStatement(editR);
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
        return true;
    }
    
    public static void main(String[] args) {
        new DAO();
    }
}
