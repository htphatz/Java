/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;

/**
 *
 * @author HP
 */
public class ViDuFile {
    
    public static void copyAll(File f1, File f2){
        try {
            // Copy chinh no
            Files.copy(f1.toPath(), f2.toPath(), StandardCopyOption.REPLACE_EXISTING);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        if (f1.isDirectory()){
            // Copy cac tap tin va thu muc con
            File[] fileCon = f1.listFiles();
            for(File file : fileCon) {
                File file_new = new File(f2.getAbsoluteFile() + "\\" + file.getName());
                copyAll(file, file_new);
            }
        }
    }
    
    public static void main(String[] args) {
        File f0 = new File("C:\\Users\\HP\\Documents\\Workspace\\Backend\\Java core\\Java_70\\File1.txt");
        File f1 = new File("C:\\Users\\HP\\Documents\\Workspace\\Backend\\Java core\\Java_70\\File2.txt");
        File f2 = new File("C:\\Users\\HP\\Documents\\Workspace\\Backend\\Java core\\Java_70\\File2_xyz.txt");
        
//        try {
//            f0.createNewFile();
//        } catch (IOException ex) {
//            ex.printStackTrace();
//        }
//        
//        // 1. Thay doi ten thu muc
//        // Su dung file de thay doi
//        f0.renameTo(f1);
//        try {
//            // Su dung files de thay doi
//            Files.move(f1.toPath(), f2.toPath(), StandardCopyOption.REPLACE_EXISTING);
//        } catch (IOException ex) {
//            ex.printStackTrace();
//        }
//        
//        // Di chuyen file
//        File f2_new = new File("C:\\Users\\HP\\Documents\\Workspace\\Java_Backend\\Java core\\Java_70\\TestDiChuyenFile\\File2_xyz.txt");
//        try {
//            Files.move(f2.toPath(), f2_new.toPath(), StandardCopyOption.REPLACE_EXISTING);
//        } catch (IOException ex) {
//            ex.printStackTrace();
//        }
        
        // Copy file (chỉ copy được file, thư mục rỗng. Nếu thư mục có các phần tử con thì chịu)
        File f_0 = new File("C:\\Users\\HP\\Documents\\Workspace\\Java_Backend\\Java core\\Java_70\\F0");
        File f_0_copy = new File("C:\\Users\\HP\\Documents\\Workspace\\Java_Backend\\Java core\\Java_70\\F0_COPY");
//        try {
//            Files.copy(f_0.toPath(), f_0_copy.toPath(), StandardCopyOption.REPLACE_EXISTING);
//        } catch (IOException ex) {
//            ex.printStackTrace();
//        }
        ViDuFile.copyAll(f_0, f_0_copy);
    }
}
