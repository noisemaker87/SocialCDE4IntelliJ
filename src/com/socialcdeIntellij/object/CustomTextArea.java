package com.socialcdeIntellij.object;

import javax.imageio.ImageIO;
import javax.imageio.stream.ImageInputStream;
import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;

public class CustomTextArea extends JTextArea{


    private final Image img = new ImageIcon(this.getClass().getClassLoader().getResource("images/Baloon.png")).getImage();//getClass().getResource("/images/Baloon.png")).getImage();

    public CustomTextArea() {
        super(3,0);
        setOpaque( false );
        setMargin(new Insets(2, 2, 20, 2));
        setWrapStyleWord(true);
        setLineWrap(true);
    }

    @Override
    protected void paintComponent(Graphics g) {

        g.drawImage(img,0,0,null);
        super.paintComponent(g);

    }
}