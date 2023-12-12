/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import java.io.File;
import java.util.Scanner;

/**
 *
 * @author HP
 */
public class ViDuFile {
    File file;

    public ViDuFile(String tenFile) {
        this.file = new File(tenFile);
    }
    
    public boolean kiemTraThucThi(){
        return this.file.canExecute();
    }
    
    public boolean kiemTraDoc(){
        return this.file.canRead();
    }
    
    public boolean kiemTraGhi(){
        return this.file.canWrite();
    }
    
    public String inDuongDan(){
        return this.file.getAbsolutePath();
    }
    
    public String inTenFile(){
        return this.file.getName();
    }
    
    public void kiemTraThuMucHayTapTin(){
        if (this.file.isDirectory()){
            System.out.println("Đây là thư mục");
        } else if (this.file.isFile()) {
            System.out.println("Đây là tập tin");
        }
    }
    
    public void inDanhSachCacFileCon(){
        if (this.file.isDirectory()){
            System.out.println("Đây là thư mục, các tập tin con và thư mục con là: ");
            File[] fileCon = this.file.listFiles();
            for(File file : fileCon) {
                System.out.println(file.getAbsolutePath());
            }
        } else if (this.file.isFile()) {
            System.out.println("Đây là tập tin nên không có tập tin con và thư mục con");
        }
    }
    
    public void inCayThuMuc() {
	this.inChiTietCayThucMuc(this.file, 1);
    }

    public void inChiTietCayThucMuc(File f, int bac) {
//	System.out.print("|");
	for (int i = 0; i < bac; i++) {
            System.out.print("\t");
	}
	System.out.print("|__");
	System.out.println(f.getName());
	if (f.canRead() && f.isDirectory()) {
            File[] mangCon = f.listFiles();
            for (File fx : mangCon) {
		inChiTietCayThucMuc(fx, bac + 1);
            }
	}
}
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int luaChon = 0;
        System.out.print("Nhập tên file: ");
        String tenFile = scanner.nextLine();
        ViDuFile vdF = new ViDuFile(tenFile);
        do {            
            System.out.println("Menu-------------------------");
            System.out.println("1. Kiểm tra file có thể thực thi");
            System.out.println("2. Kiểm tra file có thể đọc");
            System.out.println("3. Kiểm tra file có thể ghi");
            System.out.println("4. In đường dẫn");
            System.out.println("5. In tên file");
            System.out.println("6. Kiểm tra file là thư mục hay tập tin");
            System.out.println("7. In ra danh sách các tập tin con và thư mục con");
            System.out.println("8. In ra cây thư mục");
            System.out.println("0. Thoat chuong trinh!");
            luaChon = scanner.nextInt();
            
            switch (luaChon) {
                case 1:
                    System.out.println("File có thể thực thi: " + vdF.kiemTraThucThi());
                    break;
                case 2:
                    System.out.println("File có thể đọc: " + vdF.kiemTraDoc());
                    break;
                case 3:
                    System.out.println("File có thể ghi: " + vdF.kiemTraGhi());
                    break;
                case 4:
                    System.out.println("Đường dẫn của file là " + vdF.inDuongDan());
                    break;
                case 5:
                    System.out.println("Tên của file là " + vdF.inTenFile());
                    break;
                case 6:
                    vdF.kiemTraThuMucHayTapTin();
                    break;
                case 7:
                    vdF.inDanhSachCacFileCon();
                    break;
                case 8:
                    vdF.inCayThuMuc();
                    break;
                default:
                    break;
            }
        } while (luaChon != 0);
    }
}
