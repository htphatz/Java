/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import view.MyColorView;

/**
 *
 * @author HP
 */
public class MyColorListener implements ActionListener{
    private MyColorView myColorView;

    public MyColorListener(MyColorView myColorView) {
        this.myColorView = myColorView;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String src = e.getActionCommand();
        if(src.equalsIgnoreCase("Red Text")){
            this.myColorView.changeColorText(Color.red);
        } 
        else if(src.equalsIgnoreCase("Yellow Text")){
            this.myColorView.changeColorText(Color.yellow);
        }
        else if(src.equalsIgnoreCase("Green Text")){
            this.myColorView.changeColorText(Color.green);
        }
        else if(src.equalsIgnoreCase("Red Background")){
            this.myColorView.changeColorBackground(Color.red);
        }
        else if(src.equalsIgnoreCase("Yellow Background")){
            this.myColorView.changeColorBackground(Color.yellow);
        }
        else if(src.equalsIgnoreCase("Green Background")){
            this.myColorView.changeColorBackground(Color.green);
        }
    }
    
}
