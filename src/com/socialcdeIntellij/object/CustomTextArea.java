package com.socialcdeIntellij.object;

import javax.imageio.ImageIO;
import javax.imageio.stream.ImageInputStream;
import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;

public class CustomTextArea extends JTextArea {
    //private final InputStream PATH = this.getClass()
    //        .getClassLoader().getResourceAsStream("images/Baloon.png");

    //private final Image img  = new ImageIcon("D:\\workspaceIntelliJ\\IntelliJPlugin\\images\\Baloon.png")).getImage();
    private static final Image img = new ImageIcon("D:\\workspaceIntelliJ\\IntelliJPlugin\\images\\Baloon.png" ).getImage();

    public CustomTextArea() {
        super();
        setOpaque( false );
      /*  try{
            img = ImageIO.read(PATH);
        } catch(IOException e) {
            System.out.println(e.toString());
        }*/
    }

    @Override
    protected void paintComponent(Graphics g) {
        g.drawImage(img,0,0,null);
        super.paintComponent(g);
    }
}