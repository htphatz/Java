/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

/**
 *
 * @author HP
 */
public class JPanelDraw extends JPanel{
    
    public JPanelDraw() {
	this.setBackground(Color.white);
    }
    
    @Override
    protected void paintComponent(Graphics g) {
	super.paintComponent(g);
	g.setColor(Color.red);
	g.drawLine(15, 15, 50, 150); // ve duong thang
		
	g.setColor(Color.blue);
	g.drawOval(255, 255, 50, 50);
		
	g.setColor(Color.green);
	g.drawRect(45, 150, 30, 90);
		
	g.setColor(Color.pink);
	g.fillOval(400, 300, 50, 50);
		
	g.setColor(Color.DARK_GRAY);
	g.fillRect(100, 100, 150, 150);
		
	g.setColor(Color.YELLOW);
	g.drawString("HELLO TITV", 250, 250);	
    }
}
