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
        SinhVien sv1 = new SinhVien(120, "Nguyen Van A", "ATTT18", 7.34);
        SinhVien sv2 = new SinhVien(150, "Huynh Thi K", "CTTT06", 5.94);
        SinhVien sv3 = new SinhVien(150, "Vu Trong P", "KHTM09", 8.94);
        
        System.out.println("Sinh vien 1 compareTo sinh vien 2: " + sv1.compareTo(sv2));
        System.out.println("Sinh vien 1 compareTo sinh vien 3: " + sv1.compareTo(sv3));
        System.out.println("Sinh vien 2 compareTo sinh vien 3 " + sv2.compareTo(sv3));
    }
}
