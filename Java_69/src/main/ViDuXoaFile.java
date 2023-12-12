/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import java.io.File;

/**
 *
 * @author HP
 */
public class ViDuXoaFile {
    
    public static void xoaFile(File fx){
        if (fx.isFile()){
            fx.delete();
        } else if (fx.isDirectory()){
            File[] fileCon = fx.listFiles();
            for (File f : fileCon){
                xoaFile(f);
            }
            fx.delete();
        }
    }
            
    public static void main(String[] args) {
        File testFile = new File("C:\\Users\\HP\\Documents\\Workspace\\Java_Backend\\Backup");
        File testFile2 = new File("C:\\Users\\HP\\Documents\\Workspace\\Java_Backend\\TestFile2");
        File testFile3 = new File("C:\\Users\\HP\\Documents\\Workspace\\Java_Backend\\TestFile3.txt");
        
        // Các hàm xóa file chỉ thực thi khi file rỗng, thư mục rỗng; còn thư mục chứ các file con, thư mục con bên trong thì không xóa được
        // Hàm delete() -> xóa file nhưng trước đó có kiểm tra sự tồn tại của file (boolean) 
        // Hàm deleteOnExit() -> xóa file (void)
        // System.out.println(testFile.delete());
        testFile2.deleteOnExit();
        testFile3.deleteOnExit();
        xoaFile(testFile);
    }
}
