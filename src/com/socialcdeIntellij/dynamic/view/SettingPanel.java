/*
 * Created by JFormDesigner on Mon Mar 02 17:58:11 CET 2015
 */

package com.socialcdeIntellij.dynamic.view;

import java.awt.*;
import javax.swing.*;
import org.jdesktop.swingx.*;

/**
 * @author Davide Rossi
 */
public class SettingPanel extends JPanel {
    public SettingPanel() {
        initComponents();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - Davide Rossi
        label1 = new JLabel();
        panel1 = new JPanel();
        panel2 = new JPanel();
        label2 = new JLabel();
        textField1 = new JTextField();
        label4 = new JLabel();
        textField3 = new JTextField();
        panel4 = new JPanel();
        button2 = new JButton();
        button1 = new JButton();

        //======== this ========

        // JFormDesigner evaluation mark
        setBorder(new javax.swing.border.CompoundBorder(
            new javax.swing.border.TitledBorder(new javax.swing.border.EmptyBorder(0, 0, 0, 0),
                "JFormDesigner Evaluation", javax.swing.border.TitledBorder.CENTER,
                javax.swing.border.TitledBorder.BOTTOM, new java.awt.Font("Dialog", java.awt.Font.BOLD, 12),
                java.awt.Color.red), getBorder())); addPropertyChangeListener(new java.beans.PropertyChangeListener(){public void propertyChange(java.beans.PropertyChangeEvent e){if("border".equals(e.getPropertyName()))throw new RuntimeException();}});

        setLayout(new VerticalLayout(40));

        //---- label1 ----
        label1.setText("Change password");
        label1.setHorizontalAlignment(SwingConstants.CENTER);
        label1.setFont(new Font("Dialog", Font.BOLD, 18));
        add(label1);

        //======== panel1 ========
        {
            panel1.setLayout(new VerticalLayout());

            //======== panel2 ========
            {
                panel2.setLayout(new GridBagLayout());
                ((GridBagLayout)panel2.getLayout()).rowHeights = new int[] {0, 0, 0};
                ((GridBagLayout)panel2.getLayout()).rowWeights = new double[] {1.0, 0.0, 1.0E-4};

                //---- label2 ----
                label2.setText("Old password");
                panel2.add(label2, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.0,
                    GridBagConstraints.CENTER, GridBagConstraints.HORIZONTAL,
                    new Insets(0, 0, 20, 20), 0, 0));

                //---- textField1 ----
                textField1.setPreferredSize(new Dimension(150, 20));
                panel2.add(textField1, new GridBagConstraints(1, 0, 1, 1, 0.0, 0.0,
                    GridBagConstraints.CENTER, GridBagConstraints.HORIZONTAL,
                    new Insets(0, 0, 20, 0), 0, 0));

                //---- label4 ----
                label4.setText("New password");
                panel2.add(label4, new GridBagConstraints(0, 1, 1, 1, 0.0, 0.0,
                    GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                    new Insets(0, 0, 0, 20), 0, 0));

                //---- textField3 ----
                textField3.setPreferredSize(new Dimension(150, 20));
                panel2.add(textField3, new GridBagConstraints(1, 1, 1, 1, 0.0, 0.0,
                    GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                    new Insets(0, 0, 0, 0), 0, 0));
            }
            panel1.add(panel2);
        }
        add(panel1);

        //======== panel4 ========
        {
            panel4.setLayout(new FlowLayout());

            //---- button2 ----
            button2.setText("Cancel");
            button2.setPreferredSize(new Dimension(75, 32));
            panel4.add(button2);

            //---- button1 ----
            button1.setText("Ok");
            button1.setPreferredSize(new Dimension(75, 32));
            panel4.add(button1);
        }
        add(panel4);
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - Davide Rossi
    private JLabel label1;
    private JPanel panel1;
    private JPanel panel2;
    private JLabel label2;
    private JTextField textField1;
    private JLabel label4;
    private JTextField textField3;
    private JPanel panel4;
    private JButton button2;
    private JButton button1;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
