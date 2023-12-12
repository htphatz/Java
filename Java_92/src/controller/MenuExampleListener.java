/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import view.MenuExampleView;

/**
 *
 * @author HP
 */
public class MenuExampleListener implements ActionListener{
    private MenuExampleView menuExampleView;

    public MenuExampleListener(MenuExampleView menuExampleView) {
        this.menuExampleView = menuExampleView;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String button = e.getActionCommand();
        if (button.equals("Exit")){
            System.exit(0);
        }
        else {
            this.menuExampleView.setJLabel("Bạn đã nhấm vào: " + button);
       }
    }
    
}
