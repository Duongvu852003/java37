

public class QuanLySinhVien {
    private int maSinhVien;
    private String hoVaTen;
    private double diemTrungBinh;
    private Lop lop;
    private Date date;
    public QuanLySinhVien(int maSinhVien, String hoVaTen, double diemTrungBinh, Lop lop, Date date){
        this.maSinhVien = maSinhVien;
        this.hoVaTen = hoVaTen;
        this.diemTrungBinh = diemTrungBinh;
        this.lop = lop;
        this.date = date;
    }

    public int getMaSinhVien() {
        return maSinhVien;
    }

    public void setMaSinhVien(int maSinhVien) {
        this.maSinhVien = maSinhVien;
    }

    public String getHoVaTen() {
        return hoVaTen;
    }

    public void setHoVaTen(String hoVaTen) {
        this.hoVaTen = hoVaTen;
    }

    public double getDiemTrungBinh() {
        return diemTrungBinh;
    }

    public void setDiemTrungBinh(double diemTrungBinh) {
        this.diemTrungBinh = diemTrungBinh;
    }

    public Lop getLop() {
        return lop;
    }

    public void setLop(Lop lop) {
        this.lop = lop;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
    public String toString(){
        // Xuất ra tên lớp của sinh viên
        return this.lop.getTenLop();
    }
    public boolean sinhVienCoDoHayKhong(){
        // kiểm tra sinh viên có đỗ hay không
        return this.diemTrungBinh >= 5;
    }
    public boolean kiemTraNgaySinh(Date dv){
        return this.date.getDay() == dv.getDay();
    }
    
    
}
