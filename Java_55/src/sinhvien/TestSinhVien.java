/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sinhvien;

import java.util.Arrays;

/**
 *
 * @author HP
 */
public class TestSinhVien {
    public static void main(String[] args) {
        SinhVien sv1 = new SinhVien(120, "Nguyen Van A", "ATTT19", 7.42);
        SinhVien sv2 = new SinhVien(15, "Huynh Thi B", "CTTT06", 5.12);
        SinhVien sv3 = new SinhVien(20, "Vo Trung N", "KHMT04", 6.19);
        SinhVien[] arr = {sv1, sv2, sv3};
        
        // Hàm xuất ra mảng sinh viên
        System.out.println("Mảng sinh viên ban đầu: " + Arrays.toString(arr));
        
        // Hàm sắp xếp theo thứ tự (Note: thứ tự được quyết định trong phần compareTo() trong class SinhVien)
        Arrays.sort(arr);
        System.out.println("Mảng sinh viên xếp theo mã sinh viên: " + Arrays.toString(arr));
        
        // Tìm kiếm nhị phân 
        System.out.println("Vị trí của bạn tên A: " + Arrays.binarySearch(arr, sv1));
        System.out.println("Vị trí của bạn tên B: " + Arrays.binarySearch(arr, sv2));
    }
}
