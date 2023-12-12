/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import java.io.File;
import java.io.IOException;

/**
 *
 * @author HP
 */
public class ViDuTaoTapTinVaThuMuc {
    public static void main(String[] args) {
        // Lưu ý
        // MS Windows: \ => \\ | Ví dụ: C:\\Folder1\\Folder2\\File1_txt
        // Linux, MacOS: / | Ví dụ: c:/Folder1/Folder2/File_1.txt
        
        // Kiểm tra thư mục hay file có tồn tại không
        File folder1 = new File("C:\\Users\\HP\\Documents\\Workspace\\Java_Backend\\Java core\\Java_67");
        File folder2 = new File("C:\\Users\\HP\\Documents\\Workspace\\Java_Backend\\Java core\\Java_167");
        System.out.println("Kiểm tra folder 1 có tồn tại: " + folder1.exists());
        System.out.println("Kiểm tra folder 2 có tồn tại: " + folder2.exists());
        
        // Hàm mkdir() => Tạo thư mục 
        File d1 = new File("C:\\Users\\HP\\Documents\\Workspace\\Java_Backend\\Java core\\Java_67\\Directory_mkdir");
        d1.mkdir();
        // Hàm mkdirs() => Tạo chính xác như đường dẫn đó chứ không phải nhiều thư mục (thư mục chi tiết)
        File d2 = new File("C:\\Users\\HP\\Documents\\Workspace\\Java_Backend\\Java core\\Java_67\\Directory_mkdirs\\Directory_1\\Directory_2");
        d2.mkdirs();
        
        // Hàm createNewFile() => Tạo tập tin (có phần mở rộng: .exe, .txt, .docs,...)
        File file1 = new File("C:\\Users\\HP\\Documents\\Workspace\\Java_Backend\\Java core\\Java_67\\Directory_mkdir\\ViDu_1.docx");
        File file2 = new File("C:\\Users\\HP\\Documents\\Workspace\\Java_Backend\\Java core\\Java_67\\Directory_mkdirs\\ViDu_1.docx");
        try {
            file1.createNewFile();
            file2.createNewFile();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
