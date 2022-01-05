package com.mycompany.poly.app.dao;

import com.mycompany.poly.app.helpers.DatabaseHelper;
import com.mycompany.poly.app.model.NguoiDung;
import com.mycompany.poly.app.model.SinhVien;
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

public class SinhVienDao {
    public boolean insert(SinhVien sv)
    throws Exception{
        String sql = "INSERT INTO dbo.SinhVien(MaSinhVien, MaLopHoc, MaKhoaHoc, HoTen, Email, SoDT, GioiTinh, DiaChi, Hinh)"
                + "values(?,?,?,?,?,?,?,?,?)";
        try(
                Connection con = DatabaseHelper.openconConnection();
                PreparedStatement pstmt = con.prepareStatement(sql);
            ){
            pstmt.setString(1, sv.getMaSinhVien());
            pstmt.setString(2, sv.getMaLopHoc());
            pstmt.setString(3, sv.getMaKhoaHoc());
            pstmt.setString(4, sv.getHoTen());
            pstmt.setString(5, sv.getEmail());
            pstmt.setString(6, sv.getSoDT());
            pstmt.setInt(7, sv.getGioiTinh());
            pstmt.setString(8, sv.getDiaChi());
            
            if(sv.getHinh() != null){
                Blob hinh = new SerialBlob(sv.getHinh());
                pstmt.setBlob(9, hinh);
            }else{
                Blob hinh = null;
                pstmt.setBlob(9, hinh);
            }
             return pstmt.executeUpdate() > 0;
        }
    }
    
    public boolean update(SinhVien sv)
    throws Exception{
         
         
        String sql = "UPDATE dbo.SinhVien" 
                + " SET HoTen = ?, MaLopHoc = ?, MaKhoaHoc = ?, Email = ?, SoDT = ?, GioiTinh = ?, DiaChi = ?, Hinh = ?"
                + " where MaSinhVien = ?";
        try(
                Connection con = DatabaseHelper.openconConnection();
                PreparedStatement pstmt = con.prepareStatement(sql);
            ){
            pstmt.setString(9, sv.getMaSinhVien());
            pstmt.setString(1, sv.getHoTen());
            pstmt.setString(2, sv.getMaLopHoc());
            pstmt.setString(3, sv.getMaKhoaHoc());
            pstmt.setString(4, sv.getEmail());
            pstmt.setString(5, sv.getSoDT());
            pstmt.setInt(6, sv.getGioiTinh());
            pstmt.setString(7, sv.getDiaChi());
            
            if(sv.getHinh() != null){
                Blob hinh = new SerialBlob(sv.getHinh());
                pstmt.setBlob(8, hinh);
            }else{
                Blob hinh = null;
                pstmt.setBlob(8, hinh);
            }
             return pstmt.executeUpdate() > 0;
        }
    }
     
    public boolean delete(String maSinhVien)
    throws Exception{
        String sql = "delete from sinhvien" + " where MaSinhVien = ?";
        try(
                Connection con = DatabaseHelper.openconConnection();
                PreparedStatement pstmt = con.prepareStatement(sql);
            ){
            pstmt.setString(1, maSinhVien);
            
            return pstmt.executeUpdate() > 0;
        }
    }
    
    public SinhVien findById(String maSinhVien)
    throws Exception{
        String sql = "select * from sinhvien where MaSinhVien =?";
        try(
                Connection con = DatabaseHelper.openconConnection();
                PreparedStatement pstmt = con.prepareStatement(sql);
            ){
            pstmt.setString(1, maSinhVien);
            
            try(ResultSet rs = pstmt.executeQuery();){
                if(rs.next()){
                    SinhVien sv = createSinhVien(rs);
                    return sv;
                }
            }
        }
        return null;
    }
    
    public List< SinhVien> findAll()
    throws Exception{
        String sql = "select * from sinhvien";
        try(
                Connection con = DatabaseHelper.openconConnection();
                PreparedStatement pstmt = con.prepareStatement(sql);
            ){
            try(ResultSet rs = pstmt.executeQuery();){
                List<SinhVien> list = new ArrayList<>();
                while(rs.next()){
                    SinhVien sv = createSinhVien(rs);
                    list.add(sv);
                }
                return list;
            }
        }
    }

    private SinhVien createSinhVien(final ResultSet rs) throws SQLException {
        SinhVien sv = new SinhVien();
        sv.setMaSinhVien(rs.getString("masinhvien"));
        sv.setHoTen(rs.getString("hoten"));
        sv.setMaLopHoc(rs.getString("MaLopHoc"));
        sv.setMaKhoaHoc(rs.getString("MaKhoaHoc"));
        sv.setEmail(rs.getString("email"));
        sv.setSoDT(rs.getString("soDT"));
        sv.setDiaChi(rs.getString("diachi"));
        sv.setGioiTinh(rs.getInt("gioiTinh"));
        Blob blob = rs.getBlob("hinh");
        if(blob != null)
            sv.setHinh(blob.getBytes(1 , (int) blob.length()));
        return sv;
    }
}
