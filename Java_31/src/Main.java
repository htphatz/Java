/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author HP
 */
public class Main {
    public static void main(String[] args) {
        HoaDonCaPhe hd = new HoaDonCaPhe("Trung Nguyen 1", 200000, 5);
        System.out.println("Tong tien chua giam gia: " + hd.tinhTongTien());
        System.out.println("Kiem tra hoa don > 500000: " + hd.ktHoaDonLonHon500k());
        System.out.println("Kiem tra khoi luong > 2kg: " + hd.ktKhoiLuongLonHon(2));
        System.out.println("Kiem tra khoi luong > 6kg: " + hd.ktKhoiLuongLonHon(6));
        System.out.println("So tien giam gia 10%: " + hd.soTienGiamGiaXPhanTram(10));
        System.out.println("Tong tien phai tra cuoi cung: " + hd.soTienHoaDonSauGiam(10));
    }
}
