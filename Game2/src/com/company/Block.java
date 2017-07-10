package com.company;

import java.awt.*;
import java.util.Random;

/**
 * Created by Man on 10.07.2017.
 */
public class Block {

    private int width, height;
    private int weight;
    private Color rgb;

    public Block(int width,int height, int weight, Color rgb){
        this.width = width;
        this.height = height;
        this.weight = weight;
        this.rgb = rgb;
    }

    public void draw(Graphics g, int num, int heigh, Color rgb){
        g.setColor(rgb);
        if(num == 1){
            g.fillRect((Constants.TOWER_X - (width / 2)) * num, Constants.TOWER_Y - (heigh * 15)+15, width, height);
            g.setColor(Color.BLACK);
            g.drawRect((Constants.TOWER_X - (width / 2)) * num, Constants.TOWER_Y - (heigh * 15)+15, width, height);
        }
        if(num == 2){
            g.fillRect((2*Constants.TOWER_X + 18 - (width / 2)), Constants.TOWER_Y - (heigh * 15)+15, width, height);
            g.setColor(Color.BLACK);
            g.drawRect((2*Constants.TOWER_X + 18 - (width / 2)), Constants.TOWER_Y - (heigh * 15)+15, width, height);
        }

        if(num == 3){
            g.fillRect((3*Constants.TOWER_X - (width / 2))+ 40, Constants.TOWER_Y - (heigh * 15)+15, width, height);
            g.setColor(Color.BLACK);
            g.drawRect((3*Constants.TOWER_X - (width / 2))+ 40, Constants.TOWER_Y - (heigh * 15)+15, width, height);
        }
        g.setColor(Color.BLACK);
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    public Color getRgb() {
        return rgb;
    }
}
