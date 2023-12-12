/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author HP
 */
public class HoaDonCaPhe {
    private String tenCaPhe;
    private double giaTien1Kg;
    private double khoiLuong;

    public HoaDonCaPhe(String tenCaPhe, double giaTien1Kg, double khoiLuong) {
        this.tenCaPhe = tenCaPhe;
        this.giaTien1Kg = giaTien1Kg;
        this.khoiLuong = khoiLuong;
    }

    public String getTenCaPhe() {
        return tenCaPhe;
    }

    public void setTenCaPhe(String tenCaPhe) {
        this.tenCaPhe = tenCaPhe;
    }

    public double getGiaTien1Kg() {
        return giaTien1Kg;
    }

    public void setGiaTien1Kg(double giaTien1Kg) {
        this.giaTien1Kg = giaTien1Kg;
    }

    public double getKhoiLuong() {
        return khoiLuong;
    }

    public void setKhoiLuong(double khoiLuong) {
        this.khoiLuong = khoiLuong;
    }
    
    public double tinhTongTien(){
        return this.giaTien1Kg * this.khoiLuong;
    }
    
    public boolean ktKhoiLuongLonHon(double kl){
        return this.khoiLuong > kl;
    }
    
    public boolean ktHoaDonLonHon500k(){
        return this.tinhTongTien() > 500000;
    }
    
    public double soTienGiamGiaXPhanTram(double x){
        if (this.tinhTongTien() > 500000)
            return this.tinhTongTien() * 10 / 100;
        return 0;
    }
    
    public double soTienHoaDonSauGiam(double x){
        return this.tinhTongTien() - this.soTienGiamGiaXPhanTram(x);
    }
}
