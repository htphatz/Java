/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.HeadlessException;
import java.awt.Image;
import java.awt.Toolkit;
import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.UIManager;

/**
 *
 * @author HP
 */
public class MainView extends JFrame {

    private final JLabel jLabel_content;

    public MainView() throws HeadlessException {
        this.setTitle("Test icons and images"); 
        this.setSize(500, 500);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new BorderLayout());
        
        Font font = new Font("Arial", Font.BOLD, 30);
        
        // Them icon vao JFrame
        URL urlIconNotepad = MainView.class.getResource("icon_notepad.png");
        Image img = Toolkit.getDefaultToolkit().createImage(urlIconNotepad);
        this.setIconImage(img);
        
        // Tao menu bar va cac menu ben trong
        JMenuBar jMenuBar = new JMenuBar();
        JMenu jMenu = new JMenu("Menu");
        JMenu jMenu_item1 = new JMenu("New");
        jMenu_item1.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().createImage(MainView.class.getResource("icon_new.png"))));
        JMenu jMenu_item2 = new JMenu("Save");
        jMenu_item2.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().createImage(MainView.class.getResource("icon_save.png"))));
        JMenu jMenu_item3 = new JMenu("File");
        jMenu_item3.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().createImage(MainView.class.getResource("icon_file.png"))));
        
        JMenu jMenu_subMenu = new JMenu("Sub menu");
        JMenuItem jMenuItem_item4 = new JMenuItem("Cat");
        jMenuItem_item4.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().createImage(MainView.class.getResource("icon_cat.png"))));
        JMenuItem jMenuItem_item5 = new JMenuItem("Exit");
        jMenuItem_item5.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().createImage(MainView.class.getResource("icon_exit.png"))));
        jMenu_subMenu.add(jMenuItem_item4);
        jMenu_subMenu.add(jMenuItem_item5);
        
        jMenu.add(jMenu_item1);
        jMenu.add(jMenu_item2);
        jMenu.add(jMenu_item3);
        jMenu.add(jMenu_subMenu);
        jMenuBar.add(jMenu);
        
        this.setJMenuBar(jMenuBar);
        
        // Tao Jlabel
        jLabel_content = new JLabel();
        jLabel_content.setFont(font);
        jLabel_content.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().createImage(MainView.class.getResource("image_dog.png"))));
        this.add(jLabel_content, BorderLayout.CENTER);
        
        // Tao button
        JButton jButton = new JButton("Text Button");
        jButton.setFont(font);
        jButton.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().createImage(MainView.class.getResource("icon_exit.png"))));
        this.add(jButton, BorderLayout.SOUTH);
        
        this.setVisible(true);
    }
    
    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            new MainView();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
}
