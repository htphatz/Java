/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Enumeration;
import javax.swing.AbstractButton;
import javax.swing.JOptionPane;
import view.MenuView;

/**
 *
 * @author HP
 */
public class MenuListener implements ActionListener{
    private MenuView menuView;

    public MenuListener(MenuView menuView) {
        this.menuView = menuView;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String monChinh = menuView.jComboBox_monChinh.getSelectedItem().toString();
        
        String monPhu = "";
        Object[] luaChonMonPhu = menuView.jList_monPhu.getSelectedValues();
	for (Object ob : luaChonMonPhu) {
		monPhu = monPhu + ob.toString() + "; ";
            
	}
        
        menuView.menuModel.setLuaChonMonChinh(monChinh);
	menuView.menuModel.setLuaChonMonPhu(monPhu);
	menuView.menuModel.tinhTongTien();
	menuView.hienThiKetQua();
        
        String tongTien = JOptionPane.showInputDialog(
            menuView,
            menuView.jLabel_tongTien.getText()
            + "\n Nhap vao so tien: ",
            "Thong bao",
            JOptionPane.INFORMATION_MESSAGE
        );
        
        try {
            double tienKhachThanhToan = Double.valueOf(tongTien);
            if (tienKhachThanhToan > menuView.menuModel.getTongTien())
            JOptionPane.showMessageDialog(
                    menuView, 
                    "So tien thoi lai cho khac la: " + (tienKhachThanhToan - menuView.menuModel.getTongTien()), 
                    "INFORMATION", 
                    JOptionPane.INFORMATION_MESSAGE
            );
            else {
                JOptionPane.showMessageDialog(
                    menuView, 
                    "Quy khach khong du tien de thanh toan", 
                    "WARNING", 
                    JOptionPane.WARNING_MESSAGE
                );
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(
                    menuView, 
                    "Quy khach nhap sai", 
                    "ERROR", 
                    JOptionPane.ERROR_MESSAGE
            );
        }
    }
    
}
