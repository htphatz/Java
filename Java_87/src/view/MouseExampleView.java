/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import controller.MouseExampleListener;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.awt.event.MouseListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import model.MouseExampleModel;

/**
 *
 * @author HP
 */
public class MouseExampleView extends JFrame{
    private MouseExampleModel mouseExampleModel;
    private JLabel jLabel_x;
    private JLabel jLabel_y;
    private JLabel jLabel_numberOfClicks;
    private JLabel jLabel_checkInComponent;

    public MouseExampleView() throws HeadlessException {
        this.mouseExampleModel = new MouseExampleModel();
        this.init();
        this.setVisible(true);
    }

    private void init() {
        this.setTitle("Mouse Demo");
        this.setSize(1000, 500);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        Font font = new Font("Arial", Font.BOLD, 30);
        
        MouseExampleListener ml = new MouseExampleListener(this);
        
        // Header
        JPanel jPanel_text = new JPanel();
        jPanel_text.setLayout(new BorderLayout());
        JLabel jLabel_text = new JLabel();
        jLabel_text.setBackground(Color.GREEN);
        jLabel_text.setOpaque(true);
        jLabel_text.addMouseListener(ml);
        jLabel_text.addMouseMotionListener(ml);
        jPanel_text.add(jLabel_text, BorderLayout.CENTER);
        
        // Center
        JPanel jPanel_result = new JPanel();
        jPanel_result.setLayout(new GridLayout(3, 3));
        JLabel jLabel_position = new JLabel("Position");
        jLabel_position.setFont(font);
        jLabel_x = new JLabel("x = ");
        jLabel_x.setFont(font);
        jLabel_y = new JLabel("y = ");
        jLabel_y.setFont(font);
        JLabel jLabel_clicks = new JLabel("Number of clicks: ");
        jLabel_clicks.setFont(font);
        jLabel_numberOfClicks = new JLabel();
        jLabel_numberOfClicks.setFont(font);
        JLabel jLabel_empty1 = new JLabel();
        jLabel_empty1.setFont(font);
        JLabel jLabel_check = new JLabel("Mouse in component: ");
        jLabel_check.setFont(font);
        jLabel_checkInComponent = new JLabel();
        jLabel_checkInComponent.setFont(font);
        JLabel jLabel_empty2 = new JLabel();
        jLabel_empty2.setFont(font);
        jPanel_result.add(jLabel_position);
        jPanel_result.add(jLabel_x);
        jPanel_result.add(jLabel_y);
        jPanel_result.add(jLabel_clicks);
        jPanel_result.add(jLabel_numberOfClicks);
        jPanel_result.add(jLabel_empty1);
        jPanel_result.add(jLabel_check);
        jPanel_result.add(jLabel_checkInComponent);
        jPanel_result.add(jLabel_empty2);
        
        this.setLayout(new BorderLayout());
        this.add(jPanel_text, BorderLayout.CENTER);
        this.add(jPanel_result, BorderLayout.SOUTH);
    }

    public void addClick() {
        this.mouseExampleModel.addClick(); 
        this.jLabel_numberOfClicks.setText(this.mouseExampleModel.getNumberOfClicks()+"");
    }

    public void update(int x, int y) {
        this.mouseExampleModel.setX(x);
        this.mouseExampleModel.setY(y);
        this.jLabel_x.setText(this.mouseExampleModel.getX()+"");
        this.jLabel_y.setText(this.mouseExampleModel.getY()+"");
    }

    public void enter() {
        this.mouseExampleModel.enter();
        this.jLabel_checkInComponent.setText(this.mouseExampleModel.getCheckIn());
    }

    public void exit() {
        this.mouseExampleModel.exit();
        this.jLabel_checkInComponent.setText(this.mouseExampleModel.getCheckIn());
    }

}
