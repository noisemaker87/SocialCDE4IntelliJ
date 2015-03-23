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
public class OperationProgressBar extends JPanel  {
    //private final Image img = new ImageIcon(this.getClass().getClassLoader().getResource("images/Wallpaper.png")).getImage();

    int stop = 0;
    int max = 100;
    boolean flag = false;
    Thread thread;

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

        setLayout(new BorderLayout());

        //======== panel2 ========
        {
            panel2.setLayout(new CardLayout(0, 160));

            //======== panel3 ========
            {
                panel3.setLayout(new VerticalLayout(10));

                //---- lblOpBar ----
                lblOpBar.setText("Operation in progress");
                lblOpBar.setHorizontalAlignment(SwingConstants.CENTER);
                lblOpBar.setFont(new Font("Dialog", Font.BOLD, 20));
                panel3.add(lblOpBar);

                //---- progressOpBar ----
                progressOpBar.setBackground(Color.white);
                progressOpBar.setPreferredSize(new Dimension(146, 20));
                progressOpBar.setStringPainted(true);
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

    public void updateBar() {
        int count = (progressOpBar.getValue() == 100 ? 0 : progressOpBar.getValue() + 10);
        progressOpBar.setValue(count);
        //this.updateUI();
       // update(getGraphics());
        this.revalidate();
    }

    public void setStop(int stop) {
        this.stop = stop;
    }

    public void setFlag(boolean newflag){this.flag = newflag;}

    public boolean getFlag(){return this.flag;}

    public void start(){
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                //setVisible(true);
                thread = new Thread(new UpdateRunnable());
                thread.start();

            }
        });
    }

    public int getStop(){return stop; }

    private class UpdateRunnable implements Runnable {
        public void run() {
            try {
                for (int i = 1; i <= 100; i++) {
                    Thread.sleep(100);   // 100 ms

                    final int val = i;

                    if(stop == 1) {
                        setFlag(true);

                        //System.out.println("qui invece "+getFlag());
                        //progressOpBar.setValue(0);
                       // thread.interrupt();
                        return;
                    }

                    SwingUtilities.invokeLater(new Runnable() {
                        public void run() {
                            progressOpBar.setValue(val);
                        }
                    });
                }
            } catch (InterruptedException e) {
                System.err.println(e);
            }
        }
    }


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
