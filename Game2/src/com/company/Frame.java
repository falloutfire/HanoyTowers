package com.company;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Man on 10.07.2017.
 */
public class Frame extends JFrame {

    PaintPanel paintPanel;
    ToolBar toolBar;


    Frame(){
        super("Ханойские Башни");
    }

    public void GUI(){
        toolBar = new ToolBar();
        paintPanel = new PaintPanel();
        paintPanel.setLayout(null);
        getContentPane().add(paintPanel);
        add(toolBar,BorderLayout.NORTH);

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {

                Frame paintFrame = new Frame();
                paintFrame.GUI();
                paintFrame.pack();
                paintFrame.setVisible(true);
                paintFrame.setMinimumSize(new Dimension(Constants.APP_WIDTH,Constants.APP_HEIGHT));
                paintFrame.setLocationRelativeTo(null);
            }
        });
    }

    public void GUIAutor() {
        JLabel help = new JLabel("Автор: Лихачев Илья гр.455");
        help.setVerticalAlignment(JLabel.CENTER);
        help.setHorizontalAlignment(JLabel.CENTER);
        setPreferredSize(new Dimension(250, 150));
        help.setBounds(50,0,80,20);
        this.add(help);
    }
}
