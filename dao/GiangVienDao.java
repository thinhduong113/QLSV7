package com.mycompany.poly.app.dao;

import com.mycompany.poly.app.helpers.DatabaseHelper;
import com.mycompany.poly.app.model.GiangVien;
import com.mycompany.poly.app.model.NguoiDung;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.imageio.ImageIO;
import javax.sql.rowset.serial.SerialBlob;

public class GiangVienDao {
    public boolean insert(GiangVien gv)
    throws Exception{
        String sql = "INSERT INTO dbo.GiangVien(MaGiangVien, HoTen, MaLopHoc,Email, SoDT, GioiTinh, DiaChi, Hinh)"
                + "values(?,?,?,?,?,?,?,?)";
        try(
                Connection con = DatabaseHelper.openconConnection();
                PreparedStatement pstmt = con.prepareStatement(sql);
            ){
            pstmt.setString(1, gv.getMaGiangVien());
            pstmt.setString(2, gv.getHoTen());
            pstmt.setString(3, gv.getMaLopHoc());
            pstmt.setString(4, gv.getEmail());
            pstmt.setString(5, gv.getSoDT());
            pstmt.setInt(6, gv.getGioiTinh());
            pstmt.setString(7, gv.getDiaChi());
            
            if(gv.getHinh() != null){
                Blob hinh = new SerialBlob(gv.getHinh());
                pstmt.setBlob(8, hinh);
            }else{
                Blob hinh = null;
                pstmt.setBlob(8, hinh);
            }
             return pstmt.executeUpdate() > 0;
        }
    }
    
    public boolean update(GiangVien gv)
    throws Exception{
        String sql = "UPDATE dbo.GiangVien" 
                + " SET HoTen = ?, MaLopHoc = ?,Email = ?,SoDT = ?,GioiTinh = ?,DiaChi = ?,Hinh = ?"
                + " where MaGiangVien = ?";
        try(
                Connection con = DatabaseHelper.openconConnection();
                PreparedStatement pstmt = con.prepareStatement(sql);
            ){
            pstmt.setString(7, gv.getMaGiangVien());
            pstmt.setString(1, gv.getHoTen());
            pstmt.setString(2, gv.getMaLopHoc());
            pstmt.setString(3, gv.getEmail());
            pstmt.setString(4, gv.getSoDT());
            pstmt.setInt(5, gv.getGioiTinh());
            pstmt.setString(6, gv.getDiaChi());
            
            if(gv.getHinh() != null){
                Blob hinh = new SerialBlob(gv.getHinh());
                pstmt.setBlob(7, hinh);
            }else{
                Blob hinh = null;
                pstmt.setBlob(7, hinh);
            }
             return pstmt.executeUpdate() > 0;
        }
    }
     
    public boolean delete(String maGiangVien)
    throws Exception{
        String sql = "delete from GiangVien" + " where MaGiangVien = ?";
        try(
                Connection con = DatabaseHelper.openconConnection();
                PreparedStatement pstmt = con.prepareStatement(sql);
            ){
            pstmt.setString(1, maGiangVien);
            
            return pstmt.executeUpdate() > 0;
        }
    }
    
    public GiangVien findById(String maGiangVien)
    throws Exception{
        String sql = "select * from giangvien where MaGiangVien =?";
        try(
                Connection con = DatabaseHelper.openconConnection();
                PreparedStatement pstmt = con.prepareStatement(sql);
            ){
            pstmt.setString(1, maGiangVien);
            
            try(ResultSet rs = pstmt.executeQuery();){
                if(rs.next()){
                    GiangVien gv = createGiangVien(rs);
                    return gv;
                }
            }
        }
        return null;
    }
    
    public List<GiangVien> findAll()
    throws Exception{
        String sql = "select * from giangvien";
        try(
                Connection con = DatabaseHelper.openconConnection();
                PreparedStatement pstmt = con.prepareStatement(sql);
            ){
            try(ResultSet rs = pstmt.executeQuery();){
                List<GiangVien> list = new ArrayList<>();
                while(rs.next()){
                    GiangVien gv = createGiangVien(rs);
                    list.add(gv);
                }
                return list;
            }
        }
    }

    private GiangVien createGiangVien(final ResultSet rs) throws SQLException {
        GiangVien gv = new GiangVien();
        gv.setMaGiangVien(rs.getString("MaGiangVien"));
        gv.setHoTen(rs.getString("hoten"));
        gv.setMaLopHoc(rs.getString("MaLopHoc"));
        gv.setEmail(rs.getString("email"));
        gv.setSoDT(rs.getString("soDT"));
        gv.setDiaChi(rs.getString("diachi"));
        gv.setGioiTinh(rs.getInt("gioiTinh"));
        Blob blob = rs.getBlob("hinh");
        if(blob != null)
            gv.setHinh(blob.getBytes(1 , (int) blob.length()));
        return gv;
    }
}
