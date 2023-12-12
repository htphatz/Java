/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import view.ButtonView;

/**
 *
 * @author HP
 */
public class ButtonListener implements ActionListener{
    private ButtonView buttonView;

    public ButtonListener(ButtonView buttonView) {
        this.buttonView = buttonView;
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        String src = e.getActionCommand();
        if(src.equals("1")){
            this.buttonView.setValue_1();
        } else if(src.equals("2")){
            this.buttonView.setValue_2();
        } else if(src.equals("3")){
            this.buttonView.setValue_3();
        } else if(src.equals("4")){
            this.buttonView.setValue_4();
        }
    }
    
}
