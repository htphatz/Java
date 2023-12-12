/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import view.TimKiemView;

/**
 *
 * @author HP
 */
public class TimKiemListener implements ActionListener{
    private TimKiemView timKiemView;
	
    public TimKiemListener(TimKiemView timKiemView) {
	this.timKiemView = timKiemView;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        this.timKiemView.timKiem();
    }
    
}
