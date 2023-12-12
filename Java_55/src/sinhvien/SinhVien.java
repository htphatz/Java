package sinhvien;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author HP
 */
public class SinhVien implements Comparable<SinhVien>{
    private int maSV;
    private String hoTen;
    private String tenLop;
    private double diemTrungBinh;

    public SinhVien() {
    }

    public SinhVien(int maSV, String hoTen, String tenLop, double diemTrungBinh) {
        this.maSV = maSV;
        this.hoTen = hoTen;
        this.tenLop = tenLop;
        this.diemTrungBinh = diemTrungBinh;
    }

    public int getMaSV() {
        return maSV;
    }

    public void setMaSV(int maSV) {
        this.maSV = maSV;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getTenLop() {
        return tenLop;
    }

    public void setTenLop(String tenLop) {
        this.tenLop = tenLop;
    }

    public double getDiemTrungBinh() {
        return diemTrungBinh;
    }

    public void setDiemTrungBinh(double diemTrungBinh) {
        this.diemTrungBinh = diemTrungBinh;
    }
    
    public String getTen(){
       String s = this.hoTen.trim();
       if(s.indexOf(" ") >= 0){
           int index = s.lastIndexOf(" ");
           return s.substring(index);
       } else {
           return s;
       }
    }

    @Override
    public String toString() {
        return "SinhVien{" + "maSV=" + maSV + ", hoTen=" + hoTen + ", tenLop=" + tenLop + ", diemTrungBinh=" + diemTrungBinh + '}';
    }

    @Override
    public int compareTo(SinhVien sv) {
        return this.maSV - sv.maSV;  
    }
}
