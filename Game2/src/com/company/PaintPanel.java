package com.company;

import javax.swing.*;
import java.awt.*;
import java.util.*;
import java.util.List;


/**
 * Created by Man on 10.07.2017.
 */
public class PaintPanel extends JPanel{

    private JButton moveTo1, moveTo2, moveTo3;
    public JRadioButton choise1, choise2, choise3;
    private List<Tower> towers;
    public ButtonGroup group;

    PaintPanel(){
        group = new ButtonGroup();

        towers = new ArrayList<Tower>();

        this.towers.add(0, new Tower(new Rectangle(100, 400, 158, 10), new Rectangle(175,250,10,150), 1));
        this.towers.add(1, new Tower(new Rectangle(300,400,158,10), new Rectangle(370,250,10,150), 2));
        this.towers.add(2, new Tower(new Rectangle(500,400,158,10), new Rectangle(570,250,10,150), 3));

        this.towers.get(0).addBlock(new Block(120, 15, 12,Color.BLUE));
        this.towers.get(0).addBlock(new Block(105, 15, 10,Color.CYAN));
        this.towers.get(0).addBlock(new Block(90, 15, 9,Color.PINK));
        this.towers.get(0).addBlock(new Block(75, 15, 7,Color.GREEN));
        this.towers.get(0).addBlock(new Block(60, 15, 5,Color.ORANGE));

        this.choise1 = new JRadioButton("Выбрать 1 башню");
        this.choise2 = new JRadioButton("Выбрать 2 башню");
        this.choise3 = new JRadioButton("Выбрать 3 башню");
        this.moveTo1 = new JButton("Переместить на 1 башню");
        this.moveTo2 = new JButton("Переместить на 2 башню");
        this.moveTo3 = new JButton("Переместить на 3 башню");

        this.choise1.setBounds(0, 0, Constants.BUTTON_WIDTH, Constants.BUTTON_HEIGHT);
        this.choise2.setBounds(0, Constants.BUTTON_HEIGHT * 1 + 5, Constants.BUTTON_WIDTH, Constants.BUTTON_HEIGHT);
        this.choise3.setBounds(0, Constants.BUTTON_HEIGHT * 2 + 10, Constants.BUTTON_WIDTH, Constants.BUTTON_HEIGHT);
        this.moveTo1.setBounds(Constants.APP_WIDTH - Constants.BUTTON_WIDTH , 0, Constants.BUTTON_WIDTH, Constants.BUTTON_HEIGHT);
        this.moveTo2.setBounds(Constants.APP_WIDTH - Constants.BUTTON_WIDTH , Constants.BUTTON_HEIGHT + 10, Constants.BUTTON_WIDTH, Constants.BUTTON_HEIGHT);
        this.moveTo3.setBounds(Constants.APP_WIDTH - Constants.BUTTON_WIDTH , Constants.BUTTON_HEIGHT * 2 + 20, Constants.BUTTON_WIDTH, Constants.BUTTON_HEIGHT);

        this.choise1.setVisible(true);
        this.choise2.setVisible(true);
        this.choise3.setVisible(true);
        this.moveTo1.setVisible(true);
        this.moveTo2.setVisible(true);
        this.moveTo3.setVisible(true);

        this.moveTo1.addActionListener(new ButtonListener(this));
        this.moveTo2.addActionListener(new ButtonListener(this));
        this.moveTo3.addActionListener(new ButtonListener(this));

        group.add(this.choise1);
        group.add(this.choise2);
        group.add(this.choise3);

        this.add(this.choise1);
        this.add(this.choise2);
        this.add(this.choise3);
        this.add(this.moveTo1);
        this.add(this.moveTo2);
        this.add(this.moveTo3);
    }

    public List<Tower> getTowers() {
        return towers;
    }

    @Override
    public void paint(Graphics g){
        super.paint(g);
        if(!towers.isEmpty()){
            for(Tower tower : towers){
                tower.draw(g);
            }
        }
    }
}
