package com.socialcdeIntellij.object;/*
 * Created by JFormDesigner on Mon Mar 02 10:42:40 CET 2015
 */

import org.jdesktop.swingx.*;
import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;

/**
 * @author Davide Rossi
 */
public class OperationProgressBar extends JPanel {
    private final Image img = new ImageIcon(this.getClass().getClassLoader().getResource("images/Wallpaper.png")).getImage();
    OperationProgressBarThread opt;


    public OperationProgressBar() {
        initComponents();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - Pablo Rossi
        panel2 = new JPanel();
        panel3 = new JPanel();
        lblOpBar = new JLabel();
        progressOpBar = new JProgressBar();

        //======== this ========
        setBackground(UIManager.getColor("Button.background"));
        setOpaque(false);

        // JFormDesigner evaluation mark
        setBorder(new javax.swing.border.CompoundBorder(
            new javax.swing.border.TitledBorder(new javax.swing.border.EmptyBorder(0, 0, 0, 0),
                "JFormDesigner Evaluation", javax.swing.border.TitledBorder.CENTER,
                javax.swing.border.TitledBorder.BOTTOM, new java.awt.Font("Dialog", java.awt.Font.BOLD, 12),
                java.awt.Color.red), getBorder())); addPropertyChangeListener(new java.beans.PropertyChangeListener(){public void propertyChange(java.beans.PropertyChangeEvent e){if("border".equals(e.getPropertyName()))throw new RuntimeException();}});

        setLayout(new BorderLayout());

        //======== panel2 ========
        {
            panel2.setLayout(new CardLayout(0, 190));

            //======== panel3 ========
            {
                panel3.setLayout(new VerticalLayout(10));

                //---- lblOpBar ----
                lblOpBar.setText("Operation in progress..");
                lblOpBar.setHorizontalAlignment(SwingConstants.CENTER);
                lblOpBar.setFont(new Font("Dialog", Font.BOLD, 20));
                panel3.add(lblOpBar);

                //---- progressOpBar ----
                progressOpBar.setStringPainted(true);
                progressOpBar.setBackground(Color.white);
                panel3.add(progressOpBar);
            }
            panel2.add(panel3, "card1");
        }
        add(panel2, BorderLayout.CENTER);
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    public void setLabelBar(String label){
        lblOpBar.setText(label);
    }

    public void updateBar(int newValue) {
        progressOpBar.setValue(newValue);
        update(this.getGraphics());
    }

    public void start(){
        for (int i = 0; i <= 100; i++) {
            final int percent = i;
            try {
                SwingUtilities.invokeLater(new Runnable() {
                    public void run() {
                        updateBar(percent);
                    }
                });
                java.lang.Thread.sleep(100);
            } catch (InterruptedException e) {
                ;
            }
        }
    }

    public void stop(){
        remove(this);
    }

    /*public void start(){
        opt = new OperationProgressBarThread(progressOpBar);
        opt.run();
    }*/

    /*@Override
    protected void paintComponent(Graphics g) {
        g.drawImage(img, 0, 0, null);
        super.paintComponent(g);
    }*/


    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - Pablo Rossi
    private JPanel panel2;
    private JPanel panel3;
    private JLabel lblOpBar;
    private JProgressBar progressOpBar;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
