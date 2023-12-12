/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author HP
 */
public class DanhSachSinhVien {
    ArrayList<SinhVien> danhSachSinhVien;
    Scanner scanner = new Scanner(System.in);

    public DanhSachSinhVien() {
        this.danhSachSinhVien = new ArrayList<SinhVien>();
    }

    public DanhSachSinhVien(ArrayList<SinhVien> danhSachSinhVien) {
        this.danhSachSinhVien = danhSachSinhVien;
    }

    public ArrayList<SinhVien> getDanhSachSinhVien() {
        return danhSachSinhVien;
    }

    public void setDanhSachSinhVien(ArrayList<SinhVien> danhSachSinhVien) {
        this.danhSachSinhVien = danhSachSinhVien;
    }
    
    public void themSinhVien(){
        System.out.print("Nhap vao ma sinh vien: ");
        String maSinhVien = scanner.nextLine();
        System.out.print("Nhap vao ho va ten: ");
        String hoVaTen = scanner.nextLine();
        System.out.print("Nhap vao nam sinh: ");
        int namSinh = scanner.nextInt();
        System.out.print("Nhap vao diem trung binh: ");
        double diemTrungBinh = scanner.nextDouble();
        SinhVien sinhVien = new SinhVien(maSinhVien, hoVaTen, namSinh, diemTrungBinh);
        this.danhSachSinhVien.add(sinhVien);
    }
    
    public void inDanhSachSinhVien(){
        for(SinhVien sinhVien : danhSachSinhVien) {
            System.out.println(sinhVien);
        }
    }
    
    public boolean kiemTraDanhSachRong(){
        return this.danhSachSinhVien.isEmpty();
    }
    
    public void lamRongDanhSachSinhVien(){
        this.danhSachSinhVien.removeAll(danhSachSinhVien);
    }
    
    public boolean kiemTraSinhVien(SinhVien sv){
        return this.danhSachSinhVien.contains(sv);
    }
    
    public void sapXepDiemTrungBinhGiamDan(){
        Collections.sort(danhSachSinhVien, new Comparator<SinhVien>(){
            @Override
            public int compare(SinhVien sv1, SinhVien sv2) {
                if (sv1.getDiemTrungBinh() < sv2.getDiemTrungBinh()) {
                    return -1;
                }
                else if (sv1.getDiemTrungBinh() > sv2.getDiemTrungBinh()) {
                    return 1;
                }
                return 0;
            }    
        });
    }
        
}
