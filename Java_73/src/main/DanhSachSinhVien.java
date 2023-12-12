/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 *
 * @author HP
 */
public class DanhSachSinhVien {
    private ArrayList<SinhVien> danhSachSinhVien;

    public DanhSachSinhVien() {
        this.danhSachSinhVien = new ArrayList<SinhVien>();
    }

    public DanhSachSinhVien(ArrayList<SinhVien> danhSachSinhVien) {
        this.danhSachSinhVien = danhSachSinhVien;
    }

    public ArrayList<SinhVien> getDanhSachSinhVien() {
        return danhSachSinhVien;
    }

    public void setDanhSach(ArrayList<SinhVien> danhSachSinhVien) {
        this.danhSachSinhVien = danhSachSinhVien;
    }
    
    // 1. Thêm sinh viên
    public void themSinhVien(SinhVien sv){
        this.danhSachSinhVien.add(sv);
    }
    
    // 2. In danh sách sinh viên
    public void inDanhSachSinhVien(){
        for (SinhVien sinhVien : danhSachSinhVien){
            System.out.println(sinhVien);
        }
    }
    
    // 3. Kiểm tra danh sách rỗng hay không
    public boolean kiemTraDanhSachRong(){
        return this.danhSachSinhVien.isEmpty();
    }
    
    // 4. Lấy ra số lượng sinh viên trong danh sách
    public int inSoLuongSinhVien(){
        return this.danhSachSinhVien.size();
    }
    
    // 5. Lấy ra số lượng sinh viên trong danh sách
    public void lamRongDanhSach(){
        this.danhSachSinhVien.removeAll(danhSachSinhVien);
    }
    
    // 6. Kiểm tra sinh viên có tồn tại hay không
    public boolean kiemTraTonTai(SinhVien sv){
        return this.danhSachSinhVien.contains(sv);
    }
    
    // 7. Xóa sinh viên trong danh sách dựa trên mã sinh viên
    public void xoaSinhVien(SinhVien sv){
        this.danhSachSinhVien.remove(sv);
    }
    
    // 8. Tìm tất cả sinh viên dựa trên Tên nhập từ bàn phím
    public void timSinhVien(String ten){
        for(SinhVien sinhVien : danhSachSinhVien){
            if(sinhVien.getHoVaTen().indexOf(ten) >= 0)
                System.out.println(sinhVien);
        }
    }
    
    // 9. Xuất danh sách sinh viên có điểm từ cao xuống thấp
    public void sapXepSinhVienGiamDanTheoDiem(){
        Collections.sort(this.danhSachSinhVien, new Comparator<SinhVien>(){
            @Override
            public int compare(SinhVien sv1, SinhVien sv2) {
                if (sv1.getDiemTrungBinh() < sv2.getDiemTrungBinh()){
                    return 1;
                } else if (sv1.getDiemTrungBinh() > sv2.getDiemTrungBinh()){
                    return -1;
                } else {
                    return 0;
                }
            }
        });
    }
    
    // 10. Viết dữ liệu vào file
    public void ghiDuLieuVaoFile(String tenFile){
        File file = new File(tenFile);
        try {
            file.createNewFile();
            OutputStream os = new FileOutputStream(file);
            ObjectOutputStream oos = new ObjectOutputStream(os);
            for(SinhVien sinhVien : danhSachSinhVien){
                oos.writeObject(sinhVien);
            }
            oos.flush();
            oos.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

