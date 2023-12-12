/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author HP
 */
public class ViDu_GridLayout extends JFrame{

    public ViDu_GridLayout() {
        this.setTitle("ViDu_GridLayout");
        this.setSize(600, 400);
        // Canh ở giữa màn hình
        this.setLocationRelativeTo(null); 
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        //  Tạo layout
        GridLayout gridLayout = new GridLayout();
        GridLayout gridLayout_1 = new GridLayout(4, 4);
        GridLayout gridLayout_2 = new GridLayout(4, 4, 5, 5);
        //this.setLayout(gridLayout);
        //this.setLayout(gridLayout_1);
        this.setLayout(gridLayout_2);
        
        // Tạo các thành phần (Button) và thêm vào layout
        for(int i = 0; i < 16; i++){
            JButton jButton = new JButton(i+"");
            this.add(jButton);
        }
        
        this.setVisible(true);
    }
    
    public static void main(String[] args) {
        new ViDu_GridLayout();
    }
}
