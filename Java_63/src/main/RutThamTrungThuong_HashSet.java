/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author HP
 */
public class RutThamTrungThuong_HashSet {
    Set thungPhieuDuThuong = new HashSet();
	
    public RutThamTrungThuong_HashSet() {
    }
	
    public boolean themPhieu(String giaTri) {
	return this.thungPhieuDuThuong.add(giaTri);
    }
	
    public boolean xoaPhieu(String giaTri) {
	return this.thungPhieuDuThuong.remove(giaTri);
    }
	
    public boolean kiemTraPhieuTonTai(String giaTri) {
	return this.thungPhieuDuThuong.contains(giaTri);
    }
	
    public void xoaTatCaPhieuDuThuong() {
	this.thungPhieuDuThuong.clear();
    }
	
    public int laySoLuong() {
	return this.thungPhieuDuThuong.size();
    }
	
    public String rutMotPhieu() {
	Random rd = new Random();
	int viTri = rd.nextInt(this.thungPhieuDuThuong.size());
	String ketQua = (String) this.thungPhieuDuThuong.toArray()[viTri];
	return ketQua;
    }
	
    public void inTatCa() {
	System.out.println(Arrays.toString(this.thungPhieuDuThuong.toArray()));
    }

    public static void main(String[] args) {
	int luaChon = 0;
	Scanner sc = new Scanner(System.in);
	RutThamTrungThuong_HashSet rt = new RutThamTrungThuong_HashSet();
	do {
            System.out.println("--------------------------------------");
            System.out.println("MENU: ");
            System.out.println("1. Thêm mã số dự thưởng.");
            System.out.println("2. Xóa mã số dự thưởng.");
            System.out.println("3. Kiểm tra mã số dự thưởng có tồn tại hay không?");
            System.out.println("4. Xóa tất cả các phiếu dự thưởng.");
            System.out.println("5. Số lượng phiếu dự thưởng.");
            System.out.println("6. Rút thăm trúng thưởng.");
            System.out.println("7. In ra tất cả các phiếu.");
            System.out.println("0. Thoát khỏi chương trình");
            luaChon = sc.nextInt();
            sc.nextLine();
			
            switch (luaChon) {
                case 1:
                case 2:
                case 3:
                    System.out.print("Nhập vào mã phiếu dự thưởng: ");
                    String giaTri = sc.nextLine();
                    if (luaChon == 1) {
                        rt.themPhieu(giaTri);
                    } else if(luaChon == 2) {
                        rt.xoaPhieu(giaTri);
                    } else {
                        System.out.println("Kết quả kiểm tra: " + rt.kiemTraPhieuTonTai(giaTri));
                    }       break;
                case 4:
                    rt.xoaTatCaPhieuDuThuong();
                    break;
                case 5:
                    System.out.println("Số lượng phiếu là: "+ rt.laySoLuong());
                    break;
                case 6:
                    System.out.println("Mã số trúng thưởng là: " + rt.rutMotPhieu());
                    break;
                case 7:
                    System.out.println("Các mã phiếu dự thưởng là: ");
                    rt.inTatCa();
                    break;
                default:
                    break;
            }
	} while(luaChon != 0);
    }
}
