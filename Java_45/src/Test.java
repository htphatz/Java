/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author HP
 */
public class Test {
    public static void main(String[] args) {
        HangSanXuat hsx1 = new HangSanXuat("Hang A", "Vietnam");
        HangSanXuat hsx2 = new HangSanXuat("Hang B", "Thailand");
        HangSanXuat hsx3 = new HangSanXuat("Hang C", "Cambodia");
        
        PhuongTienDiChuyen ptdc1 = new MayBay("Xang A", hsx1);
        PhuongTienDiChuyen ptdc2 = new XeDap(hsx2);
        PhuongTienDiChuyen ptdc3 = new XeOto(hsx3);
        
        // Lay van toc tung phuong tien
        System.out.println("Van toc cua may bay la: " + ptdc1.layVanToc());
        System.out.println("Van toc cua xe dap la: " + ptdc2.layVanToc());
        System.out.println("Van toc cua xe oto la: " + ptdc3.layVanToc());
        // Lay hang san xuat tung phuong tien
        System.out.println("Hang san xuat cua may bay la: " + ptdc1.layTenHangSanXuat());
        System.out.println("Hang san xuat cua xe dap la: " + ptdc2.layTenHangSanXuat());
        System.out.println("Hang san xuat cua xe oto la: " + ptdc3.layTenHangSanXuat());
    }
}
