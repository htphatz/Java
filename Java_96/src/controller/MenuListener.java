/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Enumeration;
import javax.swing.AbstractButton;
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
    }
    
}
