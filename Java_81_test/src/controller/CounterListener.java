/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import view.CounterView;

/**
 *
 * @author HP
 */
public class CounterListener implements ActionListener{
    private CounterView couterView;

    public CounterListener(CounterView couterView) {
        this.couterView = couterView;
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        String src = e.getActionCommand();
        if(src.equals("UP")){
            this.couterView.increment();
        } else if (src.equals("DOWN")){
            this.couterView.decrement();
        }
    }
    
}
