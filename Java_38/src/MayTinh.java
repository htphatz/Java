/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author HP
 */
public class MayTinh {
    private HangSanXuat hangSX;
    private NgaySanXuat ngaySX;
    private double giaBan;
    private int thoiGianBH;

    public MayTinh(HangSanXuat hangSX, NgaySanXuat ngaySX, double giaBan, int thoiGianBH) {
        this.hangSX = hangSX;
        this.ngaySX = ngaySX;
        this.giaBan = giaBan;
        this.thoiGianBH = thoiGianBH;
    }

    public HangSanXuat getHangSX() {
        return hangSX;
    }

    public void setHangSX(HangSanXuat hangSX) {
        this.hangSX = hangSX;
    }

    public NgaySanXuat getNgaySX() {
        return ngaySX;
    }

    public void setNgaySX(NgaySanXuat ngaySX) {
        this.ngaySX = ngaySX;
    }

    public double getGiaBan() {
        return giaBan;
    }

    public void setGiaBan(double giaBan) {
        this.giaBan = giaBan;
    }

    public int getThoiGianBH() {
        return thoiGianBH;
    }

    public void setThoiGianBH(int thoiGianBH) {
        this.thoiGianBH = thoiGianBH;
    }
    
    public boolean kiemTraGiaBanThapHon(MayTinh mayTinh){
        return this.giaBan < mayTinh.giaBan;
    }
    
    public String inTenQuocGia(){
        return this.hangSX.getQuocGia().getTenQG();
    }
}
