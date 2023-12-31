/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author HP
 */
public class SinhVien {
    private String maSV;
    private String hoTen;
    private NgaySinh ngaySinh;
    private double diemTB;
    private Lop lop;

    public SinhVien(String maSV, String hoTen, NgaySinh ngaySinh, double diemTB, Lop lop) {
        this.maSV = maSV;
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.diemTB = diemTB;
        this.lop = lop;
    }

    public String getMaSV() {
        return maSV;
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public NgaySinh getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(NgaySinh ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public double getDiemTB() {
        return diemTB;
    }

    public void setDiemTB(double diemTB) {
        this.diemTB = diemTB;
    }

    public Lop getLop() {
        return lop;
    }

    public void setLop(Lop lop) {
        this.lop = lop;
    }
    
    public String inTenKhoa(){
        return this.lop.getTenKhoa();
    }
    
    public boolean kiemTraDauHayKhong(){
        return this.diemTB >= 5;
    }
    
    public boolean kiemTraSinhVienCungNgaySinh(SinhVien sinhVien){
        return this.ngaySinh.equals(sinhVien.ngaySinh);
    }
}
