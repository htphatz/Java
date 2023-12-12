/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import controller.MenuListener;
import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.AbstractButton;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import model.MenuModel;

/**
 *
 * @author HP
 */
public class MenuView extends JFrame{
    public MenuModel menuModel;
    public JLabel jLabel_tongTien;
    public JCheckBox jCheckBox_traSua;
    public JCheckBox jCheckBox_cocacola;
    public JCheckBox jCheckBox_caVien;
    public JCheckBox jCheckBox_nem;
    public JRadioButton jRadioButton_pho;
    public JRadioButton jRadioButton_com;
    public JRadioButton jRadioButton_bun;
    public ButtonGroup buttonGroup_monChinh;
    public ArrayList<AbstractButton> list_buttonGroup_MonPhu;

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
        jPanel_monChinh.setLayout(new GridLayout(1, 3));
        jRadioButton_pho = new JRadioButton("PHO");
        jRadioButton_pho.setFont(font);
        jRadioButton_com = new JRadioButton("COM");
        jRadioButton_com.setFont(font);
        jRadioButton_bun = new JRadioButton("BUN");
        jRadioButton_bun.setFont(font);
        buttonGroup_monChinh = new ButtonGroup();
        buttonGroup_monChinh.add(jRadioButton_pho);
        buttonGroup_monChinh.add(jRadioButton_com);
        buttonGroup_monChinh.add(jRadioButton_bun);
        jPanel_monChinh.add(jRadioButton_pho);
        jPanel_monChinh.add(jRadioButton_com);
        jPanel_monChinh.add(jRadioButton_bun);
        
        JPanel jPanel_monPhu = new JPanel();
        jPanel_monPhu.setLayout(new GridLayout(2, 2));
        jCheckBox_traSua = new JCheckBox("TRA SUA");
        jCheckBox_traSua.setFont(font);
        jCheckBox_cocacola = new JCheckBox("COCACOLA");
        jCheckBox_cocacola.setFont(font);
        jCheckBox_caVien = new JCheckBox("CA VIEN");
        jCheckBox_caVien.setFont(font);
        jCheckBox_nem = new JCheckBox("NEM");
        jCheckBox_nem.setFont(font);
        list_buttonGroup_MonPhu = new ArrayList<>();
        list_buttonGroup_MonPhu.add(jCheckBox_traSua);
        list_buttonGroup_MonPhu.add(jCheckBox_cocacola);
        list_buttonGroup_MonPhu.add(jCheckBox_caVien);
        list_buttonGroup_MonPhu.add(jCheckBox_nem);
        jPanel_monPhu.add(jCheckBox_traSua);
        jPanel_monPhu.add(jCheckBox_cocacola);
        jPanel_monPhu.add(jCheckBox_caVien);
        jPanel_monPhu.add(jCheckBox_nem);
        
        JPanel jPanel_luaChon = new JPanel();
        jPanel_luaChon.setLayout(new BorderLayout());
        jPanel_luaChon.add(jPanel_monChinh, BorderLayout.CENTER);
        jPanel_luaChon.add(jPanel_monPhu, BorderLayout.SOUTH);
        
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
