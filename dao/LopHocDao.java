package com.mycompany.poly.app.dao;

import com.mycompany.poly.app.helpers.DatabaseHelper;
import com.mycompany.poly.app.model.GiangVien;
import com.mycompany.poly.app.model.LopHoc;
import com.mycompany.poly.app.model.SinhVien;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ADMIN
 */
public class LopHocDao {
    public boolean insert(LopHoc lh)
    throws Exception{
        String sql = "INSERT INTO dbo.LopHoc(MaLopHoc,TenLopHoc) values (?,?)";
        try(
                Connection con = DatabaseHelper.openconConnection();
                PreparedStatement pstmt = con.prepareStatement(sql);
            ){
            pstmt.setString(1, lh.getMaLopHoc());
            pstmt.setString(2, lh.getTenLopHoc());
            
            return pstmt.executeUpdate() > 0;
        }
    }
    
    public boolean update(LopHoc lh)
    throws Exception{
        String sql = "UPDATE [dbo].[LopHoc]" +
        " SET [TenLopHoc] = ?" +
        " WHERE [MaLopHoc] = ?";
        try(
                Connection con = DatabaseHelper.openconConnection();
                PreparedStatement pstmt = con.prepareStatement(sql);
            ){
            pstmt.setString(2, lh.getMaLopHoc());
            pstmt.setString(1, lh.getTenLopHoc());
            
            return pstmt.executeUpdate() > 0;
        }
    }
    
    public boolean deleteByMaLopHoc(String maLopHoc)
    throws Exception{
        String sql = "delete from LopHoc" +
        " WHERE [MaLopHoc] = ?";
        try(
                Connection con = DatabaseHelper.openconConnection();
                PreparedStatement pstmt = con.prepareStatement(sql);
            ){
            pstmt.setString(1, maLopHoc);
            
            return pstmt.executeUpdate() > 0;
        }
    }
    
    public LopHoc findByMaLopHoc(String maLopHoc)
    throws Exception{
        String sql = "select * from lophoc" +
        " WHERE [maLopHoc] = ?";
        try(
                Connection con = DatabaseHelper.openconConnection();
                PreparedStatement pstmt = con.prepareStatement(sql);
            ){
            pstmt.setString(1, maLopHoc);
            
            try(ResultSet rs = pstmt.executeQuery();){
                if (rs.next()){
                    LopHoc lh = createLopHoc(rs);
                    
                    return lh;
                }
            }
        }
        return null;
    }
    
    public List<LopHoc> finlAll()
    throws Exception{
        String sql = "select * from LopHoc";
        try(
                Connection con = DatabaseHelper.openconConnection();
                PreparedStatement pstmt = con.prepareStatement(sql);
            ){

            try(ResultSet rs = pstmt.executeQuery();){
                List<LopHoc> list = new ArrayList<>();
                while (rs.next()){
                    LopHoc lh = createLopHoc(rs);
                    list.add(lh);
                }
                return list;
            }
        }
    }
    
    private LopHoc createLopHoc(final ResultSet rs) throws SQLException {
        LopHoc lh = new LopHoc();
        lh.setMaLopHoc(rs.getString("MaLopHoc"));
        lh.setTenLopHoc(rs.getString("TenLopHoc"));
        return lh;
    }
    
    //Danh sách sinh viên thuộc lớp
    public List<SinhVien> findStudentsInClass(String maLopHoc)
    throws Exception{
        String sql = "select * from SinhVien" + 
                " where MaLopHoc = ?";
        try(
                Connection con = DatabaseHelper.openconConnection();
                PreparedStatement pstmt = con.prepareStatement(sql);
            ){
            
            pstmt.setString(1, maLopHoc);
            
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
    
    //Danh sách giảng viên thuộc lớp
    public List<GiangVien> findTeachersInClass(String maLopHoc)
    throws Exception{
        String sql = "select * from GiangVien" + 
                " where MaLopHoc = ?";
        try(
                Connection con = DatabaseHelper.openconConnection();
                PreparedStatement pstmt = con.prepareStatement(sql);
            ){
            
            pstmt.setString(1, maLopHoc);
            
            try(ResultSet rs = pstmt.executeQuery();){
                List<GiangVien> list = new ArrayList<>();
                while (rs.next()){
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
