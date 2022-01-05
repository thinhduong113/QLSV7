/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.poly.app.dao;

import com.mycompany.poly.app.helpers.DatabaseHelper;
import com.mycompany.poly.app.model.MonHoc;
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
public class MonHocDao {
    public boolean insert(MonHoc mh)
    throws Exception{
        String sql = "INSERT INTO dbo.MonHoc(MaMonHoc,TenMonHoc) values (?,?)";
        try(
                Connection con = DatabaseHelper.openconConnection();
                PreparedStatement pstmt = con.prepareStatement(sql);
            ){
            pstmt.setString(1, mh.getMaMonHoc());
            pstmt.setString(2, mh.getTenMonHoc());
            
            return pstmt.executeUpdate() > 0;
        }
    }
    
    public boolean update(MonHoc mh)
    throws Exception{
        String sql = "UPDATE [dbo].[MonHoc]" +
        " SET [TenMonHoc] = ?" +
        " WHERE [MaMonHoc] = ?";
        try(
                Connection con = DatabaseHelper.openconConnection();
                PreparedStatement pstmt = con.prepareStatement(sql);
            ){
            pstmt.setString(2, mh.getMaMonHoc());
            pstmt.setString(1, mh.getTenMonHoc());
            
            return pstmt.executeUpdate() > 0;
        }
    }
    
    public boolean deleteByMaMonHoc(String maMonHoc)
    throws Exception{
        String sql = "delete from MonHoc" +
        " WHERE [MaMonHoc] = ?";
        try(
                Connection con = DatabaseHelper.openconConnection();
                PreparedStatement pstmt = con.prepareStatement(sql);
            ){
            pstmt.setString(1, maMonHoc);
            
            return pstmt.executeUpdate() > 0;
        }
    }
    
    public MonHoc findByMaMonHoc(String maMonHoc)
    throws Exception{
        String sql = "select * from MonHoc" +
        " WHERE [maMonHoc] = ?";
        try(
                Connection con = DatabaseHelper.openconConnection();
                PreparedStatement pstmt = con.prepareStatement(sql);
            ){
            pstmt.setString(1, maMonHoc);
            
            try(ResultSet rs = pstmt.executeQuery();){
                if (rs.next()){
                    MonHoc mh = createMonHoc(rs);
                    
                    return mh;
                }
            }
        }
        return null;
    }
    
    public List<MonHoc> finlAll()
    throws Exception{
        String sql = "select * from MonHoc";
        try(
                Connection con = DatabaseHelper.openconConnection();
                PreparedStatement pstmt = con.prepareStatement(sql);
            ){

            try(ResultSet rs = pstmt.executeQuery();){
                List<MonHoc> list = new ArrayList<>();
                while (rs.next()){
                    MonHoc mh = createMonHoc(rs);
                    list.add(mh);
                }
                return list;
            }
        }
    }
    
    private MonHoc createMonHoc(final ResultSet rs) throws SQLException {
        MonHoc mh = new MonHoc();
        mh.setMaMonHoc(rs.getString("MaMonHoc"));
        mh.setTenMonHoc(rs.getString("TenMonHoc"));
        return mh;
    }
}
