/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author HP
 */
public class ViDu_FlowLayout extends JFrame{

    public ViDu_FlowLayout() {
        this.setTitle("ViDu_FlowLayout");
        this.setSize(600, 400);
        // Canh ở giữa màn hình
        this.setLocationRelativeTo(null); 
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        //  Tạo layout
        FlowLayout flowLayout = new FlowLayout();
        FlowLayout flowLayout_1 = new FlowLayout(FlowLayout.RIGHT);
        FlowLayout flowLayout_2 = new FlowLayout(FlowLayout.CENTER, 15, 15);
        //this.setLayout(flowLayout);
        //this.setLayout(flowLayout_1);
        this.setLayout(flowLayout_2);
        
        // Tạo các thành phần (Button)
        JButton jButton_1 = new JButton("1");
        JButton jButton_2 = new JButton("2");
        JButton jButton_3 = new JButton("3");
        JButton jButton_4 = new JButton("4");
        JButton jButton_5 = new JButton("5");
        
        // Thêm thành phần vào layout
        this.add(jButton_1);
        this.add(jButton_2);
        this.add(jButton_3);
        this.add(jButton_4);
        this.add(jButton_5);

        this.setVisible(true);
    }
    
    public static void main(String[] args) {
        new ViDu_FlowLayout();
    }
}
