/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import view.MouseExampleView;



/**
 *
 * @author HP
 */
public class MouseExampleListener implements MouseListener, MouseMotionListener{
    private MouseExampleView mouseExampleView;

    public MouseExampleListener(MouseExampleView mouseExampleView) {
        this.mouseExampleView = mouseExampleView;
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        this.mouseExampleView.addClick();
    }

    @Override
    public void mousePressed(MouseEvent e) {
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        this.mouseExampleView.enter();
    }

    @Override
    public void mouseExited(MouseEvent e) {
        this.mouseExampleView.exit();
    }

    @Override
    public void mouseDragged(MouseEvent e) {
    }

    @Override
    public void mouseMoved(MouseEvent e) {
        int x = e.getX();
        int y = e.getY();
        this.mouseExampleView.update(x, y);
    }
    
}
