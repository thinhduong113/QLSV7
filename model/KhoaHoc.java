package com.mycompany.poly.app.model;

public class KhoaHoc {
    private String MaKhoaHoc, TenKhoaHoc;

    public KhoaHoc() {
    }

    public KhoaHoc(String MaKhoaHoc, String TenKhoaHoc) {
        this.MaKhoaHoc = MaKhoaHoc;
        this.TenKhoaHoc = TenKhoaHoc;
    }

    public String getMaKhoaHoc() {
        return MaKhoaHoc;
    }

    public void setMaKhoaHoc(String MaKhoaHoc) {
        this.MaKhoaHoc = MaKhoaHoc;
    }

    public String getTenKhoaHoc() {
        return TenKhoaHoc;
    }

    public void setTenKhoaHoc(String TenKhoaHoc) {
        this.TenKhoaHoc = TenKhoaHoc;
    }
    
    
}
