package com.mycompany.poly.app.model;

public class GiangVien {
    private String MaGiangVien, HoTen, MaLopHoc ,Email ,SoDT, DiaChi;
    private int GioiTinh;
    private byte[] Hinh;

    public GiangVien() {
    }

    public GiangVien(String MaGiangVien, String HoTen, String MaLopHoc, String Email, String SoDT, String DiaChi, int GioiTinh, byte[] Hinh) {
        this.MaGiangVien = MaGiangVien;
        this.HoTen = HoTen;
        this.MaLopHoc = MaLopHoc;
        this.Email = Email;
        this.SoDT = SoDT;
        this.DiaChi = DiaChi;
        this.GioiTinh = GioiTinh;
        this.Hinh = Hinh;
    }

    public String getMaGiangVien() {
        return MaGiangVien;
    }

    public void setMaGiangVien(String MaGiangVien) {
        this.MaGiangVien = MaGiangVien;
    }

    public String getHoTen() {
        return HoTen;
    }

    public void setHoTen(String HoTen) {
        this.HoTen = HoTen;
    }

    public String getMaLopHoc() {
        return MaLopHoc;
    }

    public void setMaLopHoc(String MaLopHoc) {
        this.MaLopHoc = MaLopHoc;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getSoDT() {
        return SoDT;
    }

    public void setSoDT(String SoDT) {
        this.SoDT = SoDT;
    }

    public String getDiaChi() {
        return DiaChi;
    }

    public void setDiaChi(String DiaChi) {
        this.DiaChi = DiaChi;
    }

    public int getGioiTinh() {
        return GioiTinh;
    }

    public void setGioiTinh(int GioiTinh) {
        this.GioiTinh = GioiTinh;
    }

    public byte[] getHinh() {
        return Hinh;
    }

    public void setHinh(byte[] Hinh) {
        this.Hinh = Hinh;
    }
}
