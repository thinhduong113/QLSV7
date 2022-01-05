package com.mycompany.poly.app.model;

public class LopHoc {
    private String MaLopHoc, TenLopHoc, MaGiangVien, MaSinhVien;

    public LopHoc() {
    }

    public LopHoc(String MaLopHoc, String TenLopHoc, String MaGiangVien, String MaSinhVien) {
        this.MaLopHoc = MaLopHoc;
        this.TenLopHoc = TenLopHoc;
    }

    public String getMaLopHoc() {
        return MaLopHoc;
    }

    public void setMaLopHoc(String MaLopHoc) {
        this.MaLopHoc = MaLopHoc;
    }

    public String getTenLopHoc() {
        return TenLopHoc;
    }

    public void setTenLopHoc(String TenLopHoc) {
        this.TenLopHoc = TenLopHoc;
    }
}
