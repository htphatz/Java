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
        if (button.equals("Open")){
            this.menuExampleView.setJLabel("Bạn đã nhấm vào menu Open");
        }
        else if (button.equals("New")){
            this.menuExampleView.setJLabel("Bạn đã nhấm vào menu New");
        }
        else if (button.equals("Exit")){
            System.exit(0);
        }
        else if (button.equals("Welcome")){
            this.menuExampleView.setJLabel("Bạn đã nhấm vào menu Welcome");
        }
    }
    
}
