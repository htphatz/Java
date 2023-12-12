/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import controller.MiniCalculatorListener;
import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.plaf.FontUIResource;
import model.MiniCalculatorModel;

/**
 *
 * @author HP
 */
public class MiniCalculatorView extends JFrame{
    private MiniCalculatorModel miniCaculatorModel;
    JTextField jTextField_firstValue;
    JTextField jTextField_secondValue;
    JTextField jTextField_answer;

    public MiniCalculatorView() {
        this.miniCaculatorModel = new MiniCalculatorModel();
        this.init();
        this.setVisible(true);
    }

    private void init() {
        this.setTitle("MiniCaculator");
        this.setSize(500, 400);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        Font font = new FontUIResource("Arial", Font.BOLD, 30);
        
        ActionListener ac = new MiniCalculatorListener(this);
        
        // Tao panel chua 1st value, 2nd value, answer
        JPanel jPanel_IO = new JPanel();
        jPanel_IO.setLayout(new GridLayout(3, 2));
        JLabel jLabel_firstValue = new JLabel("1st value");
        jLabel_firstValue.setFont(font);
        JLabel jLabel_secondValue = new JLabel("2nd value");
        jLabel_secondValue.setFont(font);
        JLabel jLabel_answer = new JLabel("Answer");
        jLabel_answer.setFont(font);
        jTextField_firstValue = new JTextField(50);
        jTextField_firstValue.setFont(font);
        jTextField_secondValue = new JTextField(50);
        jTextField_secondValue.setFont(font);
        jTextField_answer = new JTextField(50);
        jTextField_answer.setFont(font);
        jPanel_IO.add(jLabel_firstValue);
        jPanel_IO.add(jTextField_firstValue);
        jPanel_IO.add(jLabel_secondValue);
        jPanel_IO.add(jTextField_secondValue);
        jPanel_IO.add(jLabel_answer);
        jPanel_IO.add(jTextField_answer);
        
        // Tao panel chua cac button
        JPanel jPanel_buttons = new JPanel();
        jPanel_buttons.setLayout(new GridLayout(3, 2));
        JButton jButton_cong = new JButton("+");
        jButton_cong.setFont(font);
        jButton_cong.addActionListener(ac);
        JButton jButton_tru = new JButton("-");
        jButton_tru.setFont(font);
        jButton_tru.addActionListener(ac);
        JButton jButton_nhan = new JButton("*");
        jButton_nhan.setFont(font);
        jButton_nhan.addActionListener(ac);
        JButton jButton_chia = new JButton("/");
        jButton_chia.setFont(font);
        jButton_chia.addActionListener(ac);
        JButton jButton_mu = new JButton("^");
        jButton_mu.setFont(font);
        jButton_mu.addActionListener(ac);
        JButton jButton_chiaLayDu = new JButton("MODE");
        jButton_chiaLayDu.setFont(font);
        jButton_chiaLayDu.addActionListener(ac);
        jPanel_buttons.add(jButton_cong);
        jPanel_buttons.add(jButton_tru);
        jPanel_buttons.add(jButton_nhan);
        jPanel_buttons.add(jButton_chia);
        jPanel_buttons.add(jButton_mu);
        jPanel_buttons.add(jButton_chiaLayDu);
        
        this.setLayout(new BorderLayout());
        this.add(jPanel_IO, BorderLayout.CENTER);
        this.add(jPanel_buttons, BorderLayout.SOUTH);
    }

    public void cong() {
        Double firstValue = Double.valueOf(this.jTextField_firstValue.getText());
        Double secondValue = Double.valueOf(this.jTextField_secondValue.getText());
        this.miniCaculatorModel.setFirstValue(firstValue);
        this.miniCaculatorModel.setSecondValue(secondValue);
        this.miniCaculatorModel.cong();
        this.jTextField_answer.setText(this.miniCaculatorModel.getAnswer()+"");
    }

    public void tru() {
        Double firstValue = Double.valueOf(this.jTextField_firstValue.getText());
        Double secondValue = Double.valueOf(this.jTextField_secondValue.getText());
        this.miniCaculatorModel.setFirstValue(firstValue);
        this.miniCaculatorModel.setSecondValue(secondValue);
        this.miniCaculatorModel.tru();
        this.jTextField_answer.setText(this.miniCaculatorModel.getAnswer()+"");
    }

    public void nhan() {
        Double firstValue = Double.valueOf(this.jTextField_firstValue.getText());
        Double secondValue = Double.valueOf(this.jTextField_secondValue.getText());
        this.miniCaculatorModel.setFirstValue(firstValue);
        this.miniCaculatorModel.setSecondValue(secondValue);
        this.miniCaculatorModel.nhan();
        this.jTextField_answer.setText(this.miniCaculatorModel.getAnswer()+"");
    }

    public void chia() {
        Double firstValue = Double.valueOf(this.jTextField_firstValue.getText());
        Double secondValue = Double.valueOf(this.jTextField_secondValue.getText());
        this.miniCaculatorModel.setFirstValue(firstValue);
        this.miniCaculatorModel.setSecondValue(secondValue);
        this.miniCaculatorModel.chia();
        this.jTextField_answer.setText(this.miniCaculatorModel.getAnswer()+"");
    }

    public void mu() {
        Double firstValue = Double.valueOf(this.jTextField_firstValue.getText());
        Double secondValue = Double.valueOf(this.jTextField_secondValue.getText());
        this.miniCaculatorModel.setFirstValue(firstValue);
        this.miniCaculatorModel.setSecondValue(secondValue);
        this.miniCaculatorModel.mu();
        this.jTextField_answer.setText(this.miniCaculatorModel.getAnswer()+"");
    }

    public void chiaLayDu() {
        Double firstValue = Double.valueOf(this.jTextField_firstValue.getText());
        Double secondValue = Double.valueOf(this.jTextField_secondValue.getText());
        this.miniCaculatorModel.setFirstValue(firstValue);
        this.miniCaculatorModel.setSecondValue(secondValue);
        this.miniCaculatorModel.chiaLayDu();
        this.jTextField_answer.setText(this.miniCaculatorModel.getAnswer()+"");
    }
    
}
