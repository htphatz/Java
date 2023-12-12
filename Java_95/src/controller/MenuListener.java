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
        String monChinh = "";
        Enumeration buttons_monChinh =  menuView.buttonGroup_monChinh.getElements();
        while (buttons_monChinh.hasMoreElements()) {
            AbstractButton b = (AbstractButton) buttons_monChinh.nextElement();
            if(b.isSelected()) {
		monChinh = b.getText();
            }
        }
        
        String monPhu = "";
	for (AbstractButton b : menuView.list_buttonGroup_MonPhu) {
            if(b.isSelected()) {
		monPhu = monPhu + b.getText()+ "; ";
            }
	}
        
        menuView.menuModel.setLuaChonMonChinh(monChinh);
	menuView.menuModel.setLuaChonMonPhu(monPhu);
	menuView.menuModel.tinhTongTien();
	menuView.hienThiKetQua();
    }
    
}
