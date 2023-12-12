/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import java.awt.HeadlessException;
import javax.swing.JFrame;

/**
 *
 * @author HP
 */
public class MyWindow extends JFrame{

    public MyWindow() {
    }
   
    public void showIt(String ten, int x, int y){
        this.setTitle(ten);
        this.setSize(x, y);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
    
    public static void main(String[] args) {
        MyWindow wd = new MyWindow();
        wd.showIt("My Window", 6000, 400);
    }
}
