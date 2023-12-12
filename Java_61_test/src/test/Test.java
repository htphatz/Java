/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

import java.util.Scanner;
import main.DanhSachSinhVien;

/**
 *
 * @author HP
 */
public class Test {
    public static void main(String[] args) {
        DanhSachSinhVien danhSachSinhVien = new DanhSachSinhVien();
        Scanner scanner = new Scanner(System.in);
        int luaChon = 0;
        do {            
            System.out.println("**********MENU**********");
            System.out.println("1. Them sinh vien vao danh sach");
            System.out.println("2. In danh sach sinh vien ra man hinh");
            System.out.println("3. Kiem tra danh sach rong hay khong");
            System.out.println("4. Lam rong danh sach sinh vien");
            System.out.println("5. Xuất ra danh sách sinh viên có điểm từ cao đến thấp");
            System.out.print("Nhap vao lua chon: ");
            luaChon = scanner.nextInt();
            System.out.println("----------------------------");
            
            switch (luaChon) {
                case 1:
                    danhSachSinhVien.themSinhVien();
                    break;
                case 2:
                    danhSachSinhVien.inDanhSachSinhVien();
                    break;
                case 3:
                    System.out.println("Kiem tra danh sach rong: " + danhSachSinhVien.kiemTraDanhSachRong());
                    break;
                case 4:
                    danhSachSinhVien.lamRongDanhSachSinhVien();
                    break;
                case 5:
                    danhSachSinhVien.sapXepDiemTrungBinhGiamDan();
                    break;
                default:
                    break;
            }
        } while (luaChon != 0);
    }
}
