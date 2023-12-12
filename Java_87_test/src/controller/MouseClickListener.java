/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import view.MouseClickView;

/**
 *
 * @author HP
 */
public class MouseClickListener implements MouseListener, MouseMotionListener{
    private MouseClickView mouseClickView;

    public MouseClickListener(MouseClickView mouseClickView) {
        this.mouseClickView = mouseClickView;
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        this.mouseClickView.addClick();
    }

    @Override
    public void mousePressed(MouseEvent e) {
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        this.mouseClickView.inSite();
    }

    @Override
    public void mouseExited(MouseEvent e) {
        this.mouseClickView.outSite();
    }

    @Override
    public void mouseDragged(MouseEvent e) {
    }

    @Override
    public void mouseMoved(MouseEvent e) {
        this.mouseClickView.inSite();
        int x = e.getX();
        int y = e.getY();
        this.mouseClickView.update(x , y);
    }
    
}
