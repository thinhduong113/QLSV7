package com.mycompany.poly.app.model;

public class BangDiem {
    private int ma;
    private String MaSinhVien;
    private float TiengAnh,TinHoc,GDTC;

    public BangDiem() {
    }

    public BangDiem(int ma, String MaSinhVien, float TiengAnh, float TinHoc, float GDTC) {
        this.ma = ma;
        this.MaSinhVien = MaSinhVien;
        this.TiengAnh = TiengAnh;
        this.TinHoc = TinHoc;
        this.GDTC = GDTC;
    }

    public int getMa() {
        return ma;
    }

    public void setMa(int ma) {
        this.ma = ma;
    }

    public String getMaSinhVien() {
        return MaSinhVien;
    }

    public void setMaSinhVien(String MaSinhVien) {
        this.MaSinhVien = MaSinhVien;
    }

    public float getTiengAnh() {
        return TiengAnh;
    }

    public void setTiengAnh(float TiengAnh) {
        this.TiengAnh = TiengAnh;
    }

    public float getTinHoc() {
        return TinHoc;
    }

    public void setTinHoc(float TinHoc) {
        this.TinHoc = TinHoc;
    }

    public float getGDTC() {
        return GDTC;
    }

    public void setGDTC(float GDTC) {
        this.GDTC = GDTC;
    }
    
    
}
