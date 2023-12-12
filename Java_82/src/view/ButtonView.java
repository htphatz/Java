/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import controller.ButtonListener;
import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import model.LastButtonModel;

/**
 *
 * @author HP
 */
public class ButtonView extends JFrame {
    private LastButtonModel lastButtonModel ;
    private JButton jButton_1;
    private JButton jButton_2;
    private JButton jButton_3;
    private JButton jButton_4;
    private JLabel jLabel_value;

    public ButtonView() {
        this.lastButtonModel = new LastButtonModel();
        this.init();
        this.setVisible(true);
    }

    private void init() {
        this.setTitle("Value of Button");
        this.setSize(350, 400);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // Tao font chu
        Font font = new Font("Arial", Font.BOLD, 20);
        
        ActionListener ac = new ButtonListener(this);
        
        JPanel jPanel_footer = new JPanel();
        jPanel_footer.setLayout(new BorderLayout());
        jLabel_value = new JLabel("----------------", JLabel.CENTER);
        jPanel_footer.add(jLabel_value, BorderLayout.CENTER);
        
        JPanel jPanel_buttons = new JPanel();
        jPanel_buttons.setLayout(new GridLayout(2, 2));
        jButton_1 = new JButton("1");
        jButton_1.setFont(font);
        jButton_1.addActionListener(ac);
        jButton_2 = new JButton("2");
        jButton_2.setFont(font);
        jButton_2.addActionListener(ac);
        jButton_3 = new JButton("3");
        jButton_3.setFont(font);
        jButton_3.addActionListener(ac);
        jButton_4 = new JButton("4");
        jButton_4.setFont(font);
        jButton_4.addActionListener(ac);
        jPanel_buttons.add(jButton_1);
        jPanel_buttons.add(jButton_2);
        jPanel_buttons.add(jButton_3);
        jPanel_buttons.add(jButton_4);
        
        this.setLayout(new BorderLayout());
        this.add(jPanel_buttons, BorderLayout.CENTER);
        this.add(jPanel_footer, BorderLayout.SOUTH);
    }

    public void setValue_1(){
        this.lastButtonModel.setValue_1();
        this.jLabel_value.setText("Last button pushed was to " + this.lastButtonModel.getValue()+"");
    }
    
    public void setValue_2(){
        this.lastButtonModel.setValue_2();
        this.jLabel_value.setText("Last button pushed was to " + this.lastButtonModel.getValue()+"");
    }
    
    public void setValue_3(){
        this.lastButtonModel.setValue_3();
        this.jLabel_value.setText("Last button pushed was to " + this.lastButtonModel.getValue()+"");
    }
    
    public void setValue_4(){
        this.lastButtonModel.setValue_4();
        this.jLabel_value.setText("Last button pushed was to " + this.lastButtonModel.getValue()+"");
    }
}
