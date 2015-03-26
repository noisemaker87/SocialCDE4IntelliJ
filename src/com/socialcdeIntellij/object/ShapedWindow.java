package com.socialcdeIntellij.object;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.geom.Ellipse2D;


public class ShapedWindow extends JFrame {

    int pX,pY;

    public ShapedWindow() {
        super("ShapedWindow");
        setLayout(new GridBagLayout());

        addComponentListener(new ComponentAdapter() {
            @Override
            public void componentResized(ComponentEvent e) {
                setShape(new Ellipse2D.Double(0,0,70,70));
            }
        });

        setEnabled(true);
        setUndecorated(true);
        setSize(300,200);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        final PopupPanel p = new PopupPanel();
        p.setLayout(null);
        p.setBackground(Color.GRAY);
        p.setVisible(true);
        add(p);

        p.addMouseListener(new MouseAdapter(){
            public void mousePressed(MouseEvent me){
                pX=me.getX();
                pY=me.getY();
            }

            @Override
            public void mouseClicked(MouseEvent e) {
                if(e.getClickCount() == 2)
                    dispose();

            }
        });

        p.addMouseMotionListener(new MouseAdapter(){
            public void mouseDragged(MouseEvent me){
                setLocation(getLocation().x+me.getX()-pX,getLocation().y+me.getY()-pY);
            }
        });

    }

  /*  public static void main(String[] args) {
        // Create the GUI on the event-dispatching thread
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {

                ShapedWindowDemo sw = new ShapedWindowDemo();

                sw.revalidate();
                sw.setVisible(true);
            }
        });
    }
*/





}