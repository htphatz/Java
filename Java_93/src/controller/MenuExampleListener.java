/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.AbstractButton;
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
        else if (button.equals("Toolbar")) {
            // Lay Object ra bang getSource(), lay String ra bang getActionCommand()
            AbstractButton checkBox = (AbstractButton) e.getSource(); 
            boolean check = checkBox.isSelected();
            if (check) {
                this.menuExampleView.enableJToolBar();
            } else {
                this.menuExampleView.unnableJToolBar();
            }
        }
        else {
            this.menuExampleView.setJLabel("Bạn đã nhấm vào: " + button);
       }
    }
    
}
