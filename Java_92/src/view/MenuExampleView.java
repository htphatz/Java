/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.HeadlessException;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import controller.MenuExampleListener;
import controller.MenuExampleMouseListener;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.JToolBar;
import javax.swing.KeyStroke;

/**
 *
 * @author HP
 */
public class MenuExampleView extends JFrame{
    private JLabel jLabel_content;
    public JPopupMenu jPopupMenu;

    public MenuExampleView() throws HeadlessException {
        this.init();
    }

    private void init() {
        this.setTitle("Menu demo");
        this.setSize(500, 500);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new BorderLayout());
        
        MenuExampleListener mel = new MenuExampleListener(this);
        
        Font font = new Font("Arial", Font.BOLD, 25);
        
        // Tao menu bar
        JMenuBar jMenuBar = new JMenuBar();
        
        // Tao menu con
        JMenu jMenu_file = new JMenu("File");
        // Tao menu item cua tung menu con
        JMenuItem jMenuItem_new = new JMenuItem("New", KeyEvent.VK_N);
        jMenuItem_new.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N, InputEvent.CTRL_DOWN_MASK));
        jMenuItem_new.addActionListener(mel);
        
        JMenuItem jMenuItem_open = new JMenuItem("Open", KeyEvent.VK_O);
        jMenuItem_open.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_O, InputEvent.CTRL_DOWN_MASK));
        jMenuItem_open.addActionListener(mel);
        
        JMenuItem jMenuItem_exit = new JMenuItem("Exit", KeyEvent.VK_X);
        jMenuItem_exit.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_X, InputEvent.CTRL_DOWN_MASK));
        jMenuItem_exit.addActionListener(mel);
        
        jMenu_file.add(jMenuItem_new);
        jMenu_file.add(jMenuItem_open);
        jMenu_file.addSeparator();
        jMenu_file.add(jMenuItem_exit);
        
        JMenu jMenu_help = new JMenu("Help");
        JMenuItem jMenuItem_welcome = new JMenuItem("Welcome", KeyEvent.VK_W);
        jMenuItem_welcome.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_W, InputEvent.CTRL_DOWN_MASK));
        jMenuItem_welcome.addActionListener(mel);
        jMenu_help.add(jMenuItem_welcome);
        
        jMenuBar.add(jMenu_file);
        jMenuBar.add(jMenu_help);
        // Them thanh menu vao chuong trinh
        this.setJMenuBar(jMenuBar);
        
        // Tao menu khi click vao chuot phai
        jPopupMenu = new JPopupMenu();
        JMenu jMenu_font = new JMenu("Font");
        JMenuItem jMenuItem_type = new JMenuItem("Type");
        jMenuItem_type.addActionListener(mel);
        JMenuItem jMenuItem_size = new JMenuItem("Size");
        jMenuItem_size.addActionListener(mel);
        jMenu_font.add(jMenuItem_type);
        jMenu_font.add(jMenuItem_size);
        
        JMenuItem jMenuItem_cut = new JMenuItem("Cut");
        jMenuItem_cut.addActionListener(mel);
        JMenuItem jMenuItem_copy = new JMenuItem("Copy");
        jMenuItem_copy.addActionListener(mel);
        JMenuItem jMenuItem_paste = new JMenuItem("Paste");
        jMenuItem_paste.addActionListener(mel);
        jPopupMenu.add(jMenu_font);
        jPopupMenu.add(jMenuItem_cut);
        jPopupMenu.add(jMenuItem_copy);
        jPopupMenu.add(jMenuItem_paste);
        
        this.add(jPopupMenu);
        
        // Them su kien chuot phai vao Label
        MenuExampleMouseListener meml = new MenuExampleMouseListener(this);
        this.addMouseListener(meml);
        
        // Tao thanh cong cu (ToolBar)  
        JPanel jPanel_toolBar = new JPanel();
        jPanel_toolBar.setLayout(new BorderLayout());
        JToolBar jToolBar = new JToolBar();
        JButton jButton_undo = new JButton("Undo");
        jButton_undo.setToolTipText("Nhan vao de Undo");
        jButton_undo.addActionListener(mel);
        JButton jButton_redo = new JButton("Redo");
        jButton_redo.setToolTipText("Nhan vao de Redo");
        jButton_redo.addActionListener(mel);
        JButton jButton_copy = new JButton("Copy");
        jButton_copy.setToolTipText("Nhan vao de Copy");
        jButton_copy.addActionListener(mel);
        JButton jButton_cut = new JButton("Cut");
        jButton_cut.setToolTipText("Nhan vao de Cut");
        jButton_cut.addActionListener(mel);
        JButton jButton_paste = new JButton("Paste");
        jButton_paste.setToolTipText("Nhan vao de Paste");
        jButton_paste.addActionListener(mel);
        jToolBar.add(jButton_undo);
        jToolBar.add(jButton_redo);
        jToolBar.add(jButton_copy);
        jToolBar.add(jButton_cut);
        jToolBar.add(jButton_paste);
        jPanel_toolBar.add(jToolBar, BorderLayout.CENTER);
        this.add(jPanel_toolBar, BorderLayout.NORTH);
        
        jLabel_content = new JLabel();
        jLabel_content.setFont(font);
       
        this.add(jLabel_content, BorderLayout.CENTER);
        this.setVisible(true);
    }

    public void setJLabel(String s) {
        this.jLabel_content.setText(s);
    }
}
