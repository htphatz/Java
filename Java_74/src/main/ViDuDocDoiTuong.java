/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;

/**
 *
 * @author HP
 */
public class ViDuDocDoiTuong {
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        File file = new File("C:\\Users\\HP\\Documents\\Workspace\\Java_Backend\\Java core\\Java_74\\data_test.txt");
        try {
            InputStream is = new FileInputStream(file);
            ObjectInputStream ois = new ObjectInputStream(is);
            SinhVien sv = null;
            while(true){
                sv = (SinhVien) ois.readObject();
                if(sv == null) {
                    break;
                }
                System.out.println(sv);
            }
            ois.close();
        } catch (EOFException e) {
        }
    }
}
