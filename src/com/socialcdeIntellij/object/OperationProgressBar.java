/*
 * Created by JFormDesigner on Mon Mar 02 10:42:40 CET 2015
 */

package com.socialcdeIntellij.object;

import java.awt.*;
import javax.swing.*;
import org.jdesktop.swingx.*;

/**
 * @author Davide Rossi
 */
public class OperationProgressBar extends JPanel {
    public OperationProgressBar() {
        initComponents();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - Davide Rossi
        panelOperationBar = new JPanel();
        lblOpBar = new JLabel();
        progressOpBar = new JProgressBar();

        //======== this ========
        setBackground(Color.white);

        // JFormDesigner evaluation mark
        setBorder(new javax.swing.border.CompoundBorder(
            new javax.swing.border.TitledBorder(new javax.swing.border.EmptyBorder(0, 0, 0, 0),
                "JFormDesigner Evaluation", javax.swing.border.TitledBorder.CENTER,
                javax.swing.border.TitledBorder.BOTTOM, new java.awt.Font("Dialog", java.awt.Font.BOLD, 12),
                java.awt.Color.red), getBorder())); addPropertyChangeListener(new java.beans.PropertyChangeListener(){public void propertyChange(java.beans.PropertyChangeEvent e){if("border".equals(e.getPropertyName()))throw new RuntimeException();}});

        setLayout(new CardLayout(50, 150));

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
        add(panelOperationBar, "card1");
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - Davide Rossi
    private JPanel panelOperationBar;
    private JLabel lblOpBar;
    private JProgressBar progressOpBar;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
