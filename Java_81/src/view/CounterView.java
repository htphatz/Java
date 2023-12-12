/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import controller.CounterListener;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import model.CounterModel;

/**
 *
 * @author HP
 */
public class CounterView extends JFrame{
    private CounterModel counterModel;
    private JButton jButton_up;
    private JButton jButton_down;
    private JLabel jLabel_value;

    public CounterView() {
        this.counterModel = new CounterModel();
        this.init();
        this.setVisible(true);
    }

    private void init() {
        this.setTitle("Count");
        this.setSize(300, 400);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        ActionListener ac = new CounterListener(this);
        
        JPanel jPanel = new JPanel();
        jPanel.setLayout(new BorderLayout());
        jButton_up = new JButton("UP");
        jButton_up.addActionListener(ac);
        jButton_down = new JButton("DOWN");
        jButton_down.addActionListener(ac);
        jLabel_value = new JLabel(this.counterModel.getValue()+"", JLabel.CENTER);
        jPanel.add(jButton_up, BorderLayout.WEST);
        jPanel.add(jButton_down, BorderLayout.EAST);
        jPanel.add(jLabel_value, BorderLayout.CENTER);
        
        this.setLayout(new BorderLayout());
        this.add(jPanel, BorderLayout.CENTER);
    }
    
    public void increment(){
        this.counterModel.increment();
        this.jLabel_value.setText(this.counterModel.getValue()+"");
    }
    
    public void decrement(){
        this.counterModel.decrement();
        this.jLabel_value.setText(this.counterModel.getValue()+"");
    }
    
}
