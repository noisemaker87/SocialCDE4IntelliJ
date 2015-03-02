/*
 * Created by JFormDesigner on Mon Mar 02 10:23:46 CET 2015
 */

package com.socialcdeIntellij.object;

import java.awt.*;
import javax.swing.*;
import com.intellij.uiDesigner.core.*;
import info.clearthought.layout.*;
import org.jdesktop.swingx.*;

/**
 * @author Davide Rossi
 */
public class LoginProgressBar extends JPanel {
    public LoginProgressBar() {
        initComponents();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - Davide Rossi
        panelLoginBar = new JPanel();
        lblLogBar = new JLabel();
        progressLogBar = new JProgressBar();

        //======== this ========
        setBackground(Color.white);

        // JFormDesigner evaluation mark
        setBorder(new javax.swing.border.CompoundBorder(
            new javax.swing.border.TitledBorder(new javax.swing.border.EmptyBorder(0, 0, 0, 0),
                "JFormDesigner Evaluation", javax.swing.border.TitledBorder.CENTER,
                javax.swing.border.TitledBorder.BOTTOM, new java.awt.Font("Dialog", java.awt.Font.BOLD, 12),
                java.awt.Color.red), getBorder())); addPropertyChangeListener(new java.beans.PropertyChangeListener(){public void propertyChange(java.beans.PropertyChangeEvent e){if("border".equals(e.getPropertyName()))throw new RuntimeException();}});

        setLayout(new CardLayout(50, 150));

        //======== panelLoginBar ========
        {
            panelLoginBar.setBackground(Color.white);
            panelLoginBar.setLayout(new VerticalLayout(10));

            //---- lblLogBar ----
            lblLogBar.setText("Login in progress");
            lblLogBar.setHorizontalAlignment(SwingConstants.CENTER);
            lblLogBar.setFont(new Font("Dialog", Font.BOLD, 22));
            panelLoginBar.add(lblLogBar);

            //---- progressLogBar ----
            progressLogBar.setStringPainted(true);
            progressLogBar.setBackground(Color.white);
            panelLoginBar.add(progressLogBar);
        }
        add(panelLoginBar, "card1");
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - Davide Rossi
    private JPanel panelLoginBar;
    private JLabel lblLogBar;
    private JProgressBar progressLogBar;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
