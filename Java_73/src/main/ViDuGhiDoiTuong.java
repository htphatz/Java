/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

/**
 *
 * @author HP
 */
public class ViDuGhiDoiTuong {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\HP\\Documents\\Workspace\\Java_Backend\\Java core\\Java_73\\data_test.txt");
        try {
            OutputStream os = new FileOutputStream(file);
            ObjectOutputStream oos = new ObjectOutputStream(os);
            
            SinhVien sv1 = new SinhVien("01", "TITV1", 2002, 9.2);
            SinhVien sv2 = new SinhVien("02", "TITV2", 2003, 7.5);
            SinhVien sv3 = new SinhVien("03", "TITV3", 2004, 4.4);
            oos.writeObject(sv1);
            oos.writeObject(sv2);
            oos.writeObject(sv3);
            oos.flush();
            oos.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
