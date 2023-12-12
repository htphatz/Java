/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import controller.MenuListener;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import model.MenuModel;

/**
 *
 * @author HP
 */
public class MenuView extends JFrame{
    public MenuModel menuModel;
    public JLabel jLabel_tongTien;
    public JList jList_monPhu;
    public JComboBox jComboBox_monChinh;
    

    public MenuView() {
        this.menuModel = new MenuModel();
        this.init();
        this.setVisible(true);
    }
    
    public void init(){
        this.setTitle("Menu");
        this.setSize(1000, 400);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new BorderLayout());
        
        Font font = new Font("Arial", Font.BOLD, 30);
        
        ActionListener ac = new MenuListener(this);
        
        JPanel jPanel_tieuDe = new JPanel();
        jPanel_tieuDe.setLayout(new BorderLayout());
        JLabel jLabel_tieuDe = new JLabel("Moi ban chon thuc don", JLabel.CENTER);
        jLabel_tieuDe.setFont(font);
        jPanel_tieuDe.add(jLabel_tieuDe, BorderLayout.CENTER);
        
        JPanel jPanel_monChinh = new JPanel();
        jPanel_monChinh.setLayout(new FlowLayout());
        String[] cacMonChinh = {"PHO", "COM", "BUN"};
        jComboBox_monChinh = new JComboBox(cacMonChinh);
        jComboBox_monChinh.setFont(font);
        jPanel_monChinh.add(jComboBox_monChinh);
        
        JPanel jPanel_monPhu = new JPanel();
        jPanel_monPhu.setLayout(new BorderLayout());
        String[] cacMonPhu = {"TRA SUA", "COCACOLA", "CA VIEN", "NEM"};
        jList_monPhu = new JList(cacMonPhu);
        jList_monPhu.setFont(font);
        jPanel_monPhu.add(jList_monPhu, BorderLayout.CENTER);
        
        JPanel jPanel_luaChon = new JPanel();
        jPanel_luaChon.setLayout(new BorderLayout());
        jPanel_luaChon.add(jPanel_monChinh, BorderLayout.NORTH);
        jPanel_luaChon.add(jPanel_monPhu, BorderLayout.CENTER);
        
        JPanel jPanel_thanhToan = new JPanel();
        jPanel_thanhToan.setLayout(new GridLayout(1, 2));
        JButton jButton_thanhToan = new JButton("THANH TOAN");
        jButton_thanhToan.setFont(font);
        jButton_thanhToan.addActionListener(ac);
        jLabel_tongTien = new JLabel();
        jPanel_thanhToan.add(jButton_thanhToan);
        jPanel_thanhToan.add(jLabel_tongTien);
        
        this.add(jPanel_tieuDe, BorderLayout.NORTH);
        this.add(jPanel_luaChon, BorderLayout.CENTER);
        this.add(jPanel_thanhToan, BorderLayout.SOUTH);
    }

    public void hienThiKetQua() {
        String kq = "Món chính: " + this.menuModel.getLuaChonMonChinh()
					+ "; Món phụ: " + this.menuModel.getLuaChonMonPhu()
					+ "; Tổng tiền: " + this.menuModel.getTongTien();
	this.jLabel_tongTien.setText(kq);
    }
}
