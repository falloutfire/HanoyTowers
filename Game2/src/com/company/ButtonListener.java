package com.company;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Man on 10.07.2017.
 */
public class ButtonListener implements ActionListener {

    PaintPanel paintPanel;

    public ButtonListener(PaintPanel paintPanel){
        this.paintPanel = paintPanel;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String str = e.getActionCommand();
        int weight;
        int from;
        if(paintPanel.choise1.isSelected()){
            from = 0;
            if (!paintPanel.getTowers().get(0).getBlocks().isEmpty()) {

                switch (str) {
                    case "Переместить на 1 башню": {
                        this.paintPanel.repaint();
                        this.paintPanel.group.clearSelection();
                        break;
                    }

                    case "Переместить на 2 башню": {
                        weight = paintPanel.getTowers().get(0).getTopWeight();
                        if (paintPanel.getTowers().get(1).getTopWeight() > weight || paintPanel.getTowers().get(1).getBlocks().isEmpty()) {
                            try {
                                this.paintPanel.getTowers().get(1).addBlock(this.paintPanel.getTowers().get(from).removeBlock());
                            } catch (Exception ex) {
                                System.out.println(ex.toString());
                            }
                            this.paintPanel.repaint();
                            this.paintPanel.group.clearSelection();
                            break;
                        }
                    }

                    case "Переместить на 3 башню": {
                        weight = paintPanel.getTowers().get(0).getTopWeight();
                        if (paintPanel.getTowers().get(2).getTopWeight() > weight || paintPanel.getTowers().get(2).getBlocks().isEmpty()) {
                            try {
                                this.paintPanel.getTowers().get(2).addBlock(this.paintPanel.getTowers().get(from).removeBlock());
                            } catch (Exception ex) {
                                System.out.println(ex.toString());
                            }
                            this.paintPanel.repaint();
                            this.paintPanel.group.clearSelection();
                            break;
                        }
                    }
                }
            }
        }

        if(paintPanel.choise2.isSelected()){
            from = 1;
            if (!paintPanel.getTowers().get(1).getBlocks().isEmpty()) {

                switch (str) {
                    case "Переместить на 1 башню": {
                        weight = paintPanel.getTowers().get(1).getTopWeight();
                        if (paintPanel.getTowers().get(0).getTopWeight() > weight || paintPanel.getTowers().get(0).getBlocks().isEmpty()) {
                            try {
                                this.paintPanel.getTowers().get(0).addBlock(this.paintPanel.getTowers().get(from).removeBlock());
                            } catch (Exception ex) {
                                System.out.println(ex.toString());
                            }
                            this.paintPanel.repaint();
                            this.paintPanel.group.clearSelection();
                            break;
                        }
                    }

                    case "Переместить на 2 башню": {
                        this.paintPanel.repaint();
                        this.paintPanel.group.clearSelection();
                        break;
                    }

                    case "Переместить на 3 башню": {
                        weight = paintPanel.getTowers().get(1).getTopWeight();
                        if (paintPanel.getTowers().get(2).getTopWeight() > weight || paintPanel.getTowers().get(2).getBlocks().isEmpty()) {
                            try {
                                this.paintPanel.getTowers().get(2).addBlock(this.paintPanel.getTowers().get(from).removeBlock());
                            } catch (Exception ex) {
                                System.out.println(ex.toString());
                            }
                            this.paintPanel.repaint();
                            this.paintPanel.group.clearSelection();
                            break;
                        }
                    }
                }
            }
        }

        if(paintPanel.choise3.isSelected()){
            from = 2;
            if (!paintPanel.getTowers().get(2).getBlocks().isEmpty()) {

                switch (str) {
                    case "Переместить на 1 башню": {
                        weight = paintPanel.getTowers().get(2).getTopWeight();
                        if (paintPanel.getTowers().get(0).getTopWeight() > weight || paintPanel.getTowers().get(0).getBlocks().isEmpty()) {
                            try {
                                this.paintPanel.getTowers().get(0).addBlock(this.paintPanel.getTowers().get(from).removeBlock());
                            } catch (Exception ex) {
                                System.out.println(ex.toString());
                            }
                            this.paintPanel.repaint();
                            this.paintPanel.group.clearSelection();
                            break;
                        }
                    }

                    case "Переместить на 2 башню": {
                        weight = paintPanel.getTowers().get(2).getTopWeight();
                        if (paintPanel.getTowers().get(1).getTopWeight() > weight || paintPanel.getTowers().get(1).getBlocks().isEmpty()) {
                            try {
                                this.paintPanel.getTowers().get(1).addBlock(this.paintPanel.getTowers().get(from).removeBlock());
                            } catch (Exception ex) {
                                System.out.println(ex.toString());
                            }
                            this.paintPanel.repaint();
                            this.paintPanel.group.clearSelection();
                            break;
                        }
                    }

                    case "Переместить на 3 башню": {
                        this.paintPanel.repaint();
                        this.paintPanel.group.clearSelection();
                        break;
                    }
                }
            }
        }
    }
}
