package com.company;

import java.awt.*;
import java.awt.geom.Rectangle2D;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Man on 10.07.2017.
 */
public class Tower {

    private int num;
    private Rectangle2D top, bottom;
    private List<Block> blocks;

    public Tower(Rectangle bottom, Rectangle top, int num){
        blocks = new ArrayList<Block>();
        this.top = top;
        this.bottom = bottom;
        this.num = num;
    }

    public int getTopWeight(){
        if(blocks.isEmpty()){
            return 0;
        }
        return blocks.get(blocks.size() - 1).getWeight();
    }

    public void addBlock(Block block){
        blocks.add(block);
    }

    public Block removeBlock() throws Exception{
        if(blocks.isEmpty()){
            throw new Exception("Tower list is empty!");
        }
        Block block = this.blocks.get(this.blocks.size()-1);
        this.blocks.remove(this.blocks.size()-1);
        return block;

    }

    public List<Block> getBlocks() {
        return blocks;
    }

    public void setBlocks(List<Block> blocks) {
        this.blocks = blocks;
    }

    public void draw(Graphics g){
        g.setColor(Color.DARK_GRAY);
        g.fillRect((int)top.getX(), (int)top.getY(), (int)top.getWidth(), (int)top.getHeight());
        g.fillRect((int)bottom.getX(), (int)bottom.getY(), (int)bottom.getWidth(), (int)bottom.getHeight());

        if(!blocks.isEmpty()){
            for(int i = 0; i < blocks.size(); i++){
                blocks.get(i).draw(g, this.num, i, blocks.get(i).getRgb());
            }
        }
    }
}
