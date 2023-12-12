/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

/**
 *
 * @author HP
 */
public class ViDuGhiText {
    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException {
        try {
            PrintWriter pw = new PrintWriter("C:\\Users\\HP\\Documents\\Workspace\\Java_Backend\\Java core\\Java_71\\file.txt", "UTF-8");
            pw.println("Xin chao cac ban");
            pw.print("Du lieu: ");
            Student sdt = new Student(1, "Huynh Tan Phat");
            pw.print(sdt);
            pw.print(3.14);
            pw.print(' ');
            pw.print("La so PI");
            pw.flush(); // Đẩy dữ liệu vào file
            pw.close(); // Quan trọng: phải đóng file sau khi không thực thi gì nữa
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
