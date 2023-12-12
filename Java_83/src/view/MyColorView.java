/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import controller.MyColorListener;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import model.MyColorModel;

/**
 *
 * @author HP
 */
public class MyColorView extends JFrame {
    private MyColorModel myColorModel;
    private JLabel jLabel;
    
    public MyColorView() {
        this.myColorModel = new MyColorModel();
        this.init();
        this.setVisible(true);
    }

    private void init() {
        this.setTitle("My Color");
        this.setSize(400, 500);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        Font font_button = new Font("Arial", Font.BOLD, 15);
        Font font_text = new Font("Arial", Font.BOLD, 40);
        
        ActionListener ac = new MyColorListener(this);
        
        // Tao panel chua label
        JPanel jPanel_text = new JPanel();
        jPanel_text.setLayout(new BorderLayout());
        jLabel = new JLabel("TEXT, ...", JLabel.LEFT);
        jLabel.setFont(font_text);
        jPanel_text.add(jLabel, BorderLayout.CENTER);
        
        // Tao cac button
        JButton jButton_text_red = new JButton("Red Text");
        jButton_text_red.setForeground(Color.red);
        jButton_text_red.setFont(font_button);
        jButton_text_red.addActionListener(ac);
        
        JButton jButton_text_yellow = new JButton("Yellow Text");
        jButton_text_yellow.setForeground(Color.yellow);
        jButton_text_yellow.setFont(font_button);
        jButton_text_yellow.addActionListener(ac);
        
        JButton jButton_text_green = new JButton("Green Text");
        jButton_text_green.setForeground(Color.green);
        jButton_text_green.setFont(font_button);
        jButton_text_green.addActionListener(ac);
        
        JButton jButton_red_background = new JButton("Red Background");
        jButton_red_background.setBackground(Color.red);
        jButton_red_background.setFont(font_button);
        jButton_red_background.addActionListener(ac);
        
        JButton jButton_yellow_background = new JButton("Yellow Background");
        jButton_yellow_background.setBackground(Color.yellow);
        jButton_yellow_background.setFont(font_button);
        jButton_yellow_background.addActionListener(ac);
        
        JButton jButton_green_background = new JButton("Green Background");
        jButton_green_background.setBackground(Color.green);
        jButton_green_background.setFont(font_button);
        jButton_green_background.addActionListener(ac);
        
        // Tao panel chua cac button
        JPanel jPanel_buttons = new JPanel();
        jPanel_buttons.setLayout(new GridLayout(2, 3));
        jPanel_buttons.add(jButton_text_red);
        jPanel_buttons.add(jButton_text_yellow);
        jPanel_buttons.add(jButton_text_green);
        jPanel_buttons.add(jButton_red_background);
        jPanel_buttons.add(jButton_yellow_background);
        jPanel_buttons.add(jButton_green_background);
        
        this.setLayout(new BorderLayout());
        this.add(jPanel_text, BorderLayout.NORTH);
        this.add(jPanel_buttons, BorderLayout.CENTER);
    }

    public void changeColorText(Color color) {
        this.jLabel.setForeground(color);
    }

    public void changeColorBackground(Color color) {
        this.jLabel.setBackground(color);
        this.jLabel.setOpaque(true);
    }
    
}
