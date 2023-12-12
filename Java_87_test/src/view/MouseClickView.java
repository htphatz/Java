/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import controller.MouseClickListener;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import model.MouseClickModel;

/**
 *
 * @author HP
 */
public class MouseClickView extends JFrame{
    private MouseClickModel mouseClickModel;
    private JLabel jLabel_x;
    private JLabel jLabel_y;
    private JLabel jlabel_checkIn;
    private JLabel jLabel_numberOfClicks;

    public MouseClickView() throws HeadlessException {
        this.mouseClickModel = new MouseClickModel();
        this.init();
        this.setVisible(true);
    }

    private void init() {
        this.setTitle("Mouse Click Demo");
        this.setSize(800, 400);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        Font font = new Font("Arial", Font.BOLD, 25);
        
        MouseClickListener mcl = new MouseClickListener(this);
        
        // Tao khung chua content
        JPanel jPanel_content = new JPanel();
        jPanel_content.setLayout(new BorderLayout());
        JTextField jTextField_content = new JTextField(40);
        jTextField_content.setBackground(Color.red);
        jTextField_content.setOpaque(true);
        jTextField_content.addMouseListener(mcl);
        jTextField_content.addMouseMotionListener(mcl);
        jPanel_content.add(jTextField_content, BorderLayout.CENTER);
        
        // Tao khung chua inf
        JPanel jPanel_info = new JPanel();
        jPanel_info.setLayout(new GridLayout(3, 3));
        JLabel jLabel_location = new JLabel("Location: ");
        jLabel_location.setFont(font);
        jLabel_x = new JLabel("x = ");
        jLabel_x.setFont(font);
        jLabel_y = new JLabel("y = ");
        jLabel_y.setFont(font);
        JLabel jLabel_clicks = new JLabel("Number of clicks: ");
        jLabel_clicks.setFont(font);
        jLabel_numberOfClicks = new JLabel();
        jLabel_numberOfClicks.setFont(font);
        JLabel jLabel_empty1 = new JLabel();
        JLabel jLabel_check = new JLabel("In component: ");
        jLabel_check.setFont(font);
        jlabel_checkIn = new JLabel();
        jlabel_checkIn.setFont(font);
        JLabel jLabel_empty2 = new JLabel();
        jPanel_info.add(jLabel_location);
        jPanel_info.add(jLabel_x);
        jPanel_info.add(jLabel_y);
        jPanel_info.add(jLabel_clicks);
        jPanel_info.add(jLabel_numberOfClicks);
        jPanel_info.add(jLabel_empty1);
        jPanel_info.add(jLabel_check);
        jPanel_info.add(jlabel_checkIn);
        jPanel_info.add(jLabel_empty2);
        
        this.setLayout(new BorderLayout());
        this.add(jPanel_content, BorderLayout.CENTER);
        this.add(jPanel_info, BorderLayout.SOUTH);
    }

    public void addClick() {
        this.mouseClickModel.addClick();
        this.jLabel_numberOfClicks.setText(this.mouseClickModel.getNumberOfClick()+"");
    }

    public void inSite() {
        this.mouseClickModel.inSite();
        this.jLabel_x.setText(this.mouseClickModel.getX()+"");
        this.jLabel_y.setText(this.mouseClickModel.getY()+"");
        this.jlabel_checkIn.setText(this.mouseClickModel.getCheckIn());
    }

    public void outSite() {
        this.mouseClickModel.outSite();
        this.jlabel_checkIn.setText(this.mouseClickModel.getCheckIn());
    }

    public void update(int x, int y) {
        this.mouseClickModel.setX(x);
        this.mouseClickModel.setY(y);
    }
      
}
