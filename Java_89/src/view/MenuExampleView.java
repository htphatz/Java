/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.HeadlessException;
import java.awt.Menu;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import controller.MenuExampleListener;

/**
 *
 * @author HP
 */
public class MenuExampleView extends JFrame{
    private JLabel jLabel_content;

    public MenuExampleView() throws HeadlessException {
        this.init();
        this.setVisible(true);
    }

    private void init() {
        this.setTitle("Menu demo");
        this.setSize(500, 500);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        MenuExampleListener mel = new MenuExampleListener(this);
        
        Font font = new Font("Arial", Font.BOLD, 40);
        
        // Tao menu bar
        JMenuBar jMenuBar = new JMenuBar();
        
        // Tao menu con
        JMenu jMenu_file = new JMenu("File");
        // Tao menu item cua tung menu con
        JMenuItem jMenuItem_open = new JMenuItem("Open");
        jMenuItem_open.addActionListener(mel);
        JMenuItem jMenuItem_exit = new JMenuItem("Exit");
        jMenuItem_exit.addActionListener(mel);
        jMenu_file.add(jMenuItem_open);
        jMenu_file.add(jMenuItem_exit);
        
        JMenu jMenu_help = new JMenu("Help");
        JMenuItem jMenuItem_welcome = new JMenuItem("Welcome");
        jMenuItem_welcome.addActionListener(mel);
        jMenu_help.add(jMenuItem_welcome);
        
        jMenuBar.add(jMenu_file);
        jMenuBar.add(jMenu_help);
        
        jLabel_content = new JLabel();
        jLabel_content.setFont(font);
        
        this.setJMenuBar(jMenuBar);
        this.setLayout(new BorderLayout());
        this.add(jLabel_content, BorderLayout.CENTER);
    }

    public void setJLabel(String s) {
        this.jLabel_content.setText(s);
    }
}
