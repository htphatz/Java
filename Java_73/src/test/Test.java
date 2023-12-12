/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

import java.util.Scanner;
import main.DanhSachSinhVien;
import main.SinhVien;

/**
 *
 * @author HP
 */
public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DanhSachSinhVien danhSachSinhVien = new DanhSachSinhVien();
        int luaChon = 0;
        do { 
            System.out.println("MENU-------------------");
            System.out.println("1. Thêm sinh viên vào danh sách");
            System.out.println("2. In danh sách sinh viên ra màn hình");
            System.out.println("3. Kiểm tra danh sách có rỗng hay không");
            System.out.println("4. Lấy ra số lượng sinh viên trong danh sách");
            System.out.println("5. Làm rỗng danh sách sinh viên");
            System.out.println("6. Dựa vào mã số sinh viên, kiểm tra sinh viên có trong danh sách không");
            System.out.println("7. Dựa vào mã số sinh viên xoá sinh viên");
            System.out.println("8. Tìm kiếm tất cả sinh viên dựa trên Tên được nhập từ bàn phím");
            System.out.println("9. Xuất ra danh sách sinh viên có điểm từ cao đến thấp");
            System.out.println("10. Viết đối tượng sinh viên vào file");
            System.out.println("0. Thoát!");
            System.out.print("Nhập vào lựa chọn của bạn: ");
            luaChon = scanner.nextInt();
            scanner.nextLine();
            
            switch (luaChon) {
                case 1:
                    {
                        System.out.print("Nhập mã sinh viên: ");
                        String maSinhVien = scanner.nextLine();
                        System.out.print("Nhập họ và tên: ");
                        String hoVaTen = scanner.nextLine();
                        System.out.print("Nhập năm sinh: ");
                        int namSinh = scanner.nextInt();
                        System.out.print("Nhập điểm trung bình: ");
                        double diemTrungBinh = scanner.nextDouble();
                        SinhVien sv = new SinhVien(maSinhVien, hoVaTen, namSinh, diemTrungBinh);
                        danhSachSinhVien.themSinhVien(sv);
                        break;
                    }
                case 2:
                    danhSachSinhVien.inDanhSachSinhVien();
                    break;
                case 3:
                    System.out.println("Danh sách rỗng: " + danhSachSinhVien.kiemTraDanhSachRong());
                    break;
                case 4:
                    System.out.println("Danh sách lớp có " + danhSachSinhVien.inSoLuongSinhVien() + " sinh viên");
                    break;
                case 5:
                    danhSachSinhVien.lamRongDanhSach();
                    break;
                case 6:
                    {
                        System.out.print("Nhập vào mã sinh viên: ");
                        String maSinhVien = scanner.nextLine();
                        SinhVien sv = new SinhVien(maSinhVien);
                        System.out.println("Kiểm tra sinh viên có trong danh sách: " + danhSachSinhVien.kiemTraTonTai(sv));
                        break;
                    }
                case 7: 
                    {
                        System.out.print("Nhập vào mã sinh viên: ");
                        String maSinhVien = scanner.nextLine();
                        SinhVien sv = new SinhVien(maSinhVien);
                        danhSachSinhVien.xoaSinhVien(sv);
                        break;
                    }
                case 8:
                    {
                        System.out.print("Nhập vào họ và tên");
                        String hoVaTen = scanner.nextLine();
                        danhSachSinhVien.timSinhVien(hoVaTen);
                        break;
                    }
                case 9:
                    danhSachSinhVien.sapXepSinhVienGiamDanTheoDiem();
                    break;
                case 10:
                    System.out.print("Nhập vào tên file: ");
                    String tenFile = scanner.nextLine();
                    danhSachSinhVien.ghiDuLieuVaoFile(tenFile);
                    break;
                default:
                    break;
            }
        } while (luaChon != 0);
    }
}
