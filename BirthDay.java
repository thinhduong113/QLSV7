public class BirthDay {

    private int ngaySinh;

    private int thangSinh;

    private int namSinh;
    
    public BirthDay(int ngaySinh, int thangSinh, int namSinh){
        this.ngaySinh  = ngaySinh;
        this.thangSinh = thangSinh;
        this.namSinh   = namSinh;
    }
    
    //in ngày tháng năm sinh
    public String inBirthDay(){
        return this.getNgaySinh()+"/"+this.getThangSinh()+"/"+this.getNamSinh();
    }
    
    
    // GETTER
    public int getNgaySinh() {
        return ngaySinh;
    }

    public int getThangSinh() {
        return thangSinh;
    }

    public int getNamSinh() {
        return namSinh;
    }
    
    // SETTER
    public void setNgaySinh(int ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public void setThangSinh(int thangSinh) {
        this.thangSinh = thangSinh;
    }

    public void setNamSinh(int namSinh) {
        this.namSinh = namSinh;
    }
}
