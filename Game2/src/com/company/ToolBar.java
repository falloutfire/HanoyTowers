package com.company;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Man on 10.07.2017.
 */
public class ToolBar extends JToolBar {

    JButton autor;

    public ToolBar() {

        setFloatable(false);
        autor = new JButton("Автор");
        add(autor);
        autor.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String string = e.getActionCommand();
                if(string.equals("Автор")){
                    Frame frame = new Frame();
                    frame.GUIAutor();
                    frame.pack();
                    frame.setVisible(true);
                    frame.setLocationRelativeTo(null);
                }
            }
        });
    }
}
