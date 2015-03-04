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
    private int max,stop =0;
    private final InputStream PATH_WALLPAPER = this.getClass().getClassLoader()
            .getResourceAsStream("images/Wallpaper.png");

    private BufferedImage resize(BufferedImage originalImage, int width, int height) throws IOException {
        BufferedImage resizedImage = null;
        Graphics2D g = resizedImage.createGraphics();
        g.drawImage(originalImage, 0, 0, width, height, null);
        g.dispose();
        return resizedImage;
    }//ridimensione immagine

    public Image get_ImageStream(InputStream stream) throws IOException {
        Image image = ImageIO.read(stream);
        return image;
    }//prende immagine da stream

    public OperationProgressBar() {
        initComponents();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - Davide Rossi
        panel1 = new JPanel();
        panelOperationBar = new JPanel();
        lblOpBar = new JLabel();
        progressOpBar = new JProgressBar();

        //======== this ========

        // JFormDesigner evaluation mark
        setBorder(new javax.swing.border.CompoundBorder(
            new javax.swing.border.TitledBorder(new javax.swing.border.EmptyBorder(0, 0, 0, 0),
                "JFormDesigner Evaluation", javax.swing.border.TitledBorder.CENTER,
                javax.swing.border.TitledBorder.BOTTOM, new java.awt.Font("Dialog", java.awt.Font.BOLD, 12),
                java.awt.Color.red), getBorder())); addPropertyChangeListener(new java.beans.PropertyChangeListener(){public void propertyChange(java.beans.PropertyChangeEvent e){if("border".equals(e.getPropertyName()))throw new RuntimeException();}});

        setLayout(new BorderLayout());

        //======== panel1 ========
        {
            panel1.setBackground(Color.white);
            panel1.setLayout(new CardLayout(50, 150));

            //======== panelOperationBar ========
            {
                panelOperationBar.setBackground(Color.white);
                panelOperationBar.setLayout(new VerticalLayout(10));

                //---- lblOpBar ----
                lblOpBar.setText("Operation in progress");
                lblOpBar.setHorizontalAlignment(SwingConstants.CENTER);
                lblOpBar.setFont(new Font("Dialog", Font.BOLD, 22));
                panelOperationBar.add(lblOpBar);

                //---- progressOpBar ----
                progressOpBar.setStringPainted(true);
                progressOpBar.setBackground(Color.white);
                panelOperationBar.add(progressOpBar);
            }
            panel1.add(panelOperationBar, "card1");
        }
        add(panel1, BorderLayout.CENTER);
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    public void setLabelBar(String label){
        lblOpBar.setText(label);
    }

    /*public void setStop(int stop) {
        this.stop = stop;
    }*/

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

    @Override
    protected void paintComponent(Graphics g) {
        try {
            g.drawImage(get_ImageStream(PATH_WALLPAPER), 0, 0, null);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - Davide Rossi
    private JPanel panel1;
    private JPanel panelOperationBar;
    private JLabel lblOpBar;
    private JProgressBar progressOpBar;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
