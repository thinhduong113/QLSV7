public class People {

    private String maSo;

    private String ten;

    private int gioiTinh;

    private BirthDay birthDay;

    private String diaChi;

    private int SDT;

    People() {
        
    }
    
    //GETTER
    public String getMaSo() {
        return maSo;
    }

    public String getTen() {
        return ten;
    }

    public int getGioiTinh() {
        return gioiTinh;
    }

    public BirthDay getBirthDay() {
        return birthDay;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public int getSDT() {
        return SDT;
    }
    
    //SETTER
    public void setMaSo(String maSo) {
        this.maSo = maSo;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public void setGioiTinh(int gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public void setBirthDay(BirthDay birthDay) {
        this.birthDay = birthDay;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public void setSDT(int SDT) {
        this.SDT = SDT;
    }
}
