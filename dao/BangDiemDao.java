/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.poly.app.dao;

import com.mycompany.poly.app.helpers.DatabaseHelper;
import com.mycompany.poly.app.model.BangDiem;
import com.mycompany.poly.app.model.SinhVien;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.sql.rowset.serial.SerialBlob;

/**
 *
 * @author ADMIN
 */
public class BangDiemDao {
    public boolean insert(BangDiem bd)
    throws Exception{
        String sql = "INSERT INTO dbo.BangDiem(MaSinhVien, MaMonHoc, DiemChuyenCan, DiemGiuaKi, DiemCuoiKi, DTB) values (?,?,?,?,?,?)";
        try(
                Connection con = DatabaseHelper.openconConnection();
                PreparedStatement pstmt = con.prepareStatement(sql);
            ){
            pstmt.setString(1, bd.getMaSinhVien());
            pstmt.setString(2, bd.getMaMonHoc());
            pstmt.setFloat(3, bd.getCC());
            pstmt.setFloat(4, bd.getGK());
            pstmt.setFloat(5, bd.getCK());
            pstmt.setFloat(6, bd.getDTB());
            
            return pstmt.executeUpdate() > 0;
        }
    }
    
    public boolean update(BangDiem bd)
    throws Exception{
        String sql = "UPDATE [dbo].[BangDiem]" +
        " SET [MaMonHoc] = ? ,[DiemChuyenCan] = ?,[DiemGiuaKi] = ?,[DiemCuoiKi] = ?, [DTB] = ?" +
        " WHERE [MaSinhVien] = ?";
        try(
                Connection con = DatabaseHelper.openconConnection();
                PreparedStatement pstmt = con.prepareStatement(sql);
            ){
            pstmt.setString(6, bd.getMaSinhVien());
            pstmt.setString(1, bd.getMaMonHoc());
            pstmt.setFloat(2, bd.getCC());
            pstmt.setFloat(3, bd.getGK());
            pstmt.setFloat(4, bd.getCK());
            pstmt.setFloat(5, bd.getDTB());
            
            return pstmt.executeUpdate() > 0;
        }
    }
    
    public boolean deleteByMaSinhVien(String maSinhVien, String maMonHoc)
    throws Exception{
        String sql = "delete from bangdiem" +
        " WHERE [MaSinhVien] = ? AND [MaMonHoc] = ?";
        try(
                Connection con = DatabaseHelper.openconConnection();
                PreparedStatement pstmt = con.prepareStatement(sql);
            ){
            pstmt.setString(1, maSinhVien);
            pstmt.setString(2, maMonHoc);
            
            return pstmt.executeUpdate() > 0;
        }
    }
    
    public BangDiem findByMaSinhVien(String maSinhVien, String maMonHoc)
    throws Exception{
        String sql = "select * from bangdiem" +
        " WHERE [MaSinhVien] = ? AND [MaMonHoc] = ?";
        try(
                Connection con = DatabaseHelper.openconConnection();
                PreparedStatement pstmt = con.prepareStatement(sql);
            ){
            pstmt.setString(1, maSinhVien);
            pstmt.setString(2, maMonHoc);
            
            try(ResultSet rs = pstmt.executeQuery();){
                if (rs.next()){
                    BangDiem bd = createBangDiem(rs);
                    
                    return bd;
                }
            }
        }
        return null;
    }
    
    public List<BangDiem> finlAll()
    throws Exception{
        String sql = "select * from bangdiem";
        try(
                Connection con = DatabaseHelper.openconConnection();
                PreparedStatement pstmt = con.prepareStatement(sql);
            ){

            try(ResultSet rs = pstmt.executeQuery();){
                List<BangDiem> list = new ArrayList<>();
                while (rs.next()){
                    BangDiem bd = createBangDiem(rs);
                    list.add(bd);
                }
                return list;
            }
        }
    }
    
    public List<BangDiem> findTop(int top)
    throws Exception{
        String sql = "select top " + top +" *,  DTB" +
                    " from BangDiem order by dtb desc";
        try(
                Connection con = DatabaseHelper.openconConnection();
                PreparedStatement pstmt = con.prepareStatement(sql);
            ){

            try(ResultSet rs = pstmt.executeQuery();){
                List<BangDiem> list = new ArrayList<>();
                while (rs.next()){
                    BangDiem bd = createBangDiem(rs);
                    list.add(bd);
                }
                return list;
            }
        }
    }

    private BangDiem createBangDiem(final ResultSet rs) throws SQLException {
        BangDiem bd = new BangDiem();
        bd.setMa(rs.getInt("Ma"));
        bd.setMaSinhVien(rs.getString("maSinhVien"));
        bd.setMaMonHoc(rs.getString("maMonHoc"));
        bd.setCC(rs.getFloat("DiemGiuaKi"));
        bd.setGK(rs.getFloat("DiemChuyenCan"));
        bd.setCK(rs.getFloat("DiemCuoiKi"));
        bd.setDTB();
        return bd;
    }
}
