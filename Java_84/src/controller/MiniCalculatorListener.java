/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import view.MiniCalculatorView;

/**
 *
 * @author HP
 */
public class MiniCalculatorListener implements ActionListener{
    private MiniCalculatorView miniCalculatorView;

    public MiniCalculatorListener(MiniCalculatorView miniCalculatorView) {
        this.miniCalculatorView = miniCalculatorView;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String button = e.getActionCommand();
        if(button.equals("+")){
            this.miniCalculatorView.cong();
        }
        else if(button.equals("-")){
            this.miniCalculatorView.tru();
        }
        else if(button.equals("*")){
            this.miniCalculatorView.nhan();
        }
        else if(button.equals("/")){
            this.miniCalculatorView.chia();
        }
        else if(button.equals("^")){
            this.miniCalculatorView.mu();
        }
        else if(button.equalsIgnoreCase("MODE")){
            this.miniCalculatorView.chiaLayDu();
        }
    }
    
}
