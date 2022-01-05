package com.mycompany.poly.app.dao;

import com.mycompany.poly.app.helpers.DatabaseHelper;
import com.mycompany.poly.app.model.KhoaHoc;
import com.mycompany.poly.app.model.SinhVien;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class KhoaHocDao {
    public boolean insert(KhoaHoc kh)
    throws Exception{
        String sql = "INSERT INTO dbo.KhoaHoc(MaKhoaHoc,TenKhoaHoc) values (?,?)";
        try(
                Connection con = DatabaseHelper.openconConnection();
                PreparedStatement pstmt = con.prepareStatement(sql);
            ){
            pstmt.setString(1, kh.getMaKhoaHoc());
            pstmt.setString(2, kh.getTenKhoaHoc());
            
            return pstmt.executeUpdate() > 0;
        }
    }
    
    public boolean update(KhoaHoc kh)
    throws Exception{
        String sql = "UPDATE [dbo].[KhoaHoc]" +
        " SET [TenKhoaHoc] = ?" +
        " WHERE [MaKhoaHoc] = ?";
        try(
                Connection con = DatabaseHelper.openconConnection();
                PreparedStatement pstmt = con.prepareStatement(sql);
            ){
            pstmt.setString(2, kh.getMaKhoaHoc());
            pstmt.setString(1, kh.getTenKhoaHoc());
            
            return pstmt.executeUpdate() > 0;
        }
    }
    
    public boolean deleteByMaKhoaHoc(String maKhoaHoc)
    throws Exception{
        String sql = "delete from KhoaHoc" +
        " WHERE [MaKhoaHoc] = ?";
        try(
                Connection con = DatabaseHelper.openconConnection();
                PreparedStatement pstmt = con.prepareStatement(sql);
            ){
            pstmt.setString(1, maKhoaHoc);
            
            return pstmt.executeUpdate() > 0;
        }
    }
    
    public KhoaHoc findByMaKhoaHoc(String maKhoaHoc)
    throws Exception{
        String sql = "select * from KhoaHoc" +
        " WHERE [maKhoaHoc] = ?";
        try(
                Connection con = DatabaseHelper.openconConnection();
                PreparedStatement pstmt = con.prepareStatement(sql);
            ){
            pstmt.setString(1, maKhoaHoc);
            
            try(ResultSet rs = pstmt.executeQuery();){
                if (rs.next()){
                    KhoaHoc kh = createKhoaHoc(rs);
                    
                    return kh;
                }
            }
        }
        return null;
    }
    
    public List<KhoaHoc> finlAll()
    throws Exception{
        String sql = "select * from KhoaHoc";
        try(
                Connection con = DatabaseHelper.openconConnection();
                PreparedStatement pstmt = con.prepareStatement(sql);
            ){

            try(ResultSet rs = pstmt.executeQuery();){
                List<KhoaHoc> list = new ArrayList<>();
                while (rs.next()){
                    KhoaHoc kh = createKhoaHoc(rs);
                    list.add(kh);
                }
                return list;
            }
        }
    }
    
    private KhoaHoc createKhoaHoc(final ResultSet rs) throws SQLException {
        KhoaHoc kh = new KhoaHoc();
        kh.setMaKhoaHoc(rs.getString("MaKhoaHoc"));
        kh.setTenKhoaHoc(rs.getString("TenKhoaHoc"));
        return kh;
    }
    
    //Danh sách sinh viên thuộc khóa học
    public List<SinhVien> findStudentsInKhoaHoc(String maKhoaHoc)
    throws Exception{
        String sql = "select * from SinhVien" + 
                " where MaKhoaHoc = ?";
        try(
                Connection con = DatabaseHelper.openconConnection();
                PreparedStatement pstmt = con.prepareStatement(sql);
            ){
            
            pstmt.setString(1, maKhoaHoc);
            
            try(ResultSet rs = pstmt.executeQuery();){
                List<SinhVien> list = new ArrayList<>();
                while (rs.next()){
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
