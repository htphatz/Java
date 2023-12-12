/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.List;

/**
 *
 * @author HP
 */
public class ViDuDocText {
    public static void main(String[] args) {
        
//        // Cach 1 
//        File f1 = new File("C:\\Users\\HP\\Documents\\Workspace\\Java_Backend\\Java core\\Java_72\\file.txt");
//        try {
//            BufferedReader br = Files.newBufferedReader(f1.toPath(), StandardCharsets.UTF_8);
//            String line = null;
//            while(true){
//                line = br.readLine(); // Đọc từng dòng sau đó xuống hàng
//                if(line == null){
//                    break;
//                }
//                System.out.println(line);
//            }
//        } catch (IOException ex) {
//            ex.printStackTrace();
//        }
        
        // Cach 2
        File f2 = new File("C:\\Users\\HP\\Documents\\Workspace\\Java_Backend\\Java core\\Java_72\\file.txt");
        try {
            // Tạo thành danh sách string của các dòng trong file
            List<String> lines = Files.readAllLines(f2.toPath(), StandardCharsets.UTF_8);
            for(String line : lines){
                System.out.println(line);
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        
    }
}
