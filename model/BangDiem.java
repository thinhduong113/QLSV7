package com.mycompany.poly.app.model;

public class BangDiem {
    private int ma;
    private String MaSinhVien, MaMonHoc;
    private float CC,GK,CK,DTB;

    public BangDiem() {
    }

    public BangDiem(int ma, String MaSinhVien, String MaMonHoc, float CC, float GK, float CK, float DTB) {
        this.ma = ma;
        this.MaSinhVien = MaSinhVien;
        this.MaMonHoc = MaMonHoc;
        this.CC = CC;
        this.GK = GK;
        this.CK = CK;
        this.DTB = DTB;
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

    public String getMaMonHoc() {
        return MaMonHoc;
    }

    public void setMaMonHoc(String MaMonHoc) {
        this.MaMonHoc = MaMonHoc;
    }

    public float getCC() {
        return CC;
    }

    public void setCC(float CC) {
        this.CC = CC;
    }

    public float getGK() {
        return GK;
    }

    public void setGK(float GK) {
        this.GK = GK;
    }

    public float getCK() {
        return CK;
    }

    public void setCK(float CK) {
        this.CK = CK;
    }

    public float getDTB() {
        this.DTB=(float) ((this.CC*2.0 + this.GK*2.0 + this.CK*6.0)/10.0);
        return DTB;
    }

    public void setDTB() {
        this.DTB=(float) ((this.CC*2.0 + this.GK*2.0 + this.CK*6.0)/10.0);
    }
}
