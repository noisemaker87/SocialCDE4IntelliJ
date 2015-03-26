package com.socialcdeIntellij.object;

import javax.swing.*;
import java.awt.*;


public class PopupPanel extends JPanel {
    private Image img;
    private String str = "+";

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }

    public Image getImg() {
        return img;
    }

    public void setImg(Image img) {
        this.img = img;
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        g.drawOval(30,2,25,25);
        g.setColor(Color.RED);
        g.setFont(new Font("Calibri", Font.BOLD, 18));
        g.drawImage(getImg(),0,0,null);
        addShape(g);
    }

    public void addShape(Graphics g) {
        g.drawString(getStr(), 39, 19);

    }

    @Override
    public Dimension getPreferredSize() {
        return new Dimension(300, 200);
    }
}
