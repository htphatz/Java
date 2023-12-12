/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import javax.swing.JFrame;

/**
 *
 * @author HP
 */
public class ViDu {
    public static void main(String[] args) {
        JFrame jf = new JFrame();
        
        // Gán title
        jf.setTitle("Vi du JFrame");
        // Gán vị trí
        jf.setLocation(400, 400);
        // Gán kích thước
        jf.setSize(600,400);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // Quan trọng vì nó quyết định hiển thị ra bên ngoài
        jf.setVisible(true);
    }
}
