package com.mycompany.poly.app.dao;

import com.mycompany.poly.app.helpers.DatabaseHelper;
import com.mycompany.poly.app.model.NguoiDung;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class NguoiDungDao {
    public NguoiDung checkLogin(String tenDangNhap, String matKhau)
        throws Exception{
        String sql = "select tenDangNhap, matKhau, vaitro from nguoidung"
                + " where tendangnhap=? and matKhau = ?";
        try(
                Connection con = DatabaseHelper.openconConnection();
                PreparedStatement pstmt = con.prepareStatement(sql);
            ){
            pstmt.setString(1, tenDangNhap);
            pstmt.setString(2, matKhau);
            try(ResultSet rs = pstmt.executeQuery();){
                if (rs.next()){
                    NguoiDung nd = new NguoiDung();
                    nd.setTenDangNhap(tenDangNhap);
                    nd.setVaiTro(rs.getString("vaitro"));
                    return nd;
                }
            }
        }
        return null;
    }
}
