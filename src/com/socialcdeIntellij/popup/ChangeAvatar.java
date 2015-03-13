/*
 * Created by JFormDesigner on Mon Mar 02 10:55:23 CET 2015
 */

package com.socialcdeIntellij.popup;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;

/**
 * @author Davide Rossi
 */
public class ChangeAvatar extends JDialog {
    public ChangeAvatar(Frame owner) {
        super(owner);
        initComponents();
    }

    public ChangeAvatar(Dialog owner) {
        super(owner);
        initComponents();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - Pablo Rossi
        dialogPane = new JPanel();
        scrollPane1 = new JScrollPane();
        contentPanel = new JPanel();
        label1 = new JLabel();
        label2 = new JLabel();
        label3 = new JLabel();
        panel1 = new JPanel();
        okButton = new JButton();

        //======== this ========
        setResizable(false);
        Container contentPane = getContentPane();
        contentPane.setLayout(new BorderLayout());

        //======== dialogPane ========
        {
            dialogPane.setBorder(new EmptyBorder(12, 12, 12, 12));

            // JFormDesigner evaluation mark
            dialogPane.setBorder(new javax.swing.border.CompoundBorder(
                new javax.swing.border.TitledBorder(new javax.swing.border.EmptyBorder(0, 0, 0, 0),
                    "JFormDesigner Evaluation", javax.swing.border.TitledBorder.CENTER,
                    javax.swing.border.TitledBorder.BOTTOM, new java.awt.Font("Dialog", java.awt.Font.BOLD, 12),
                    java.awt.Color.red), dialogPane.getBorder())); dialogPane.addPropertyChangeListener(new java.beans.PropertyChangeListener(){public void propertyChange(java.beans.PropertyChangeEvent e){if("border".equals(e.getPropertyName()))throw new RuntimeException();}});

            dialogPane.setLayout(new BorderLayout());

            //======== scrollPane1 ========
            {
                scrollPane1.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
                scrollPane1.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

                //======== contentPanel ========
                {
                    contentPanel.setBackground(Color.white);
                    contentPanel.setPreferredSize(new Dimension(327, 140));
                    contentPanel.setLayout(new FlowLayout());

                    //---- label1 ----
                    label1.setText("text");
                    label1.setIcon(new ImageIcon("D:\\workspaceIntelliJ\\IntelliJPlugin\\images\\DefaultAvatar.png"));
                    contentPanel.add(label1);

                    //---- label2 ----
                    label2.setText("text");
                    label2.setIcon(new ImageIcon("D:\\workspaceIntelliJ\\IntelliJPlugin\\images\\DefaultAvatar.png"));
                    contentPanel.add(label2);

                    //---- label3 ----
                    label3.setText("text");
                    label3.setIcon(new ImageIcon("D:\\workspaceIntelliJ\\IntelliJPlugin\\images\\DefaultAvatar.png"));
                    contentPanel.add(label3);
                }
                scrollPane1.setViewportView(contentPanel);
            }
            dialogPane.add(scrollPane1, BorderLayout.PAGE_START);

            //======== panel1 ========
            {
                panel1.setLayout(new GridBagLayout());
                ((GridBagLayout)panel1.getLayout()).columnWidths = new int[] {0, 0};
                ((GridBagLayout)panel1.getLayout()).rowHeights = new int[] {133, 0};
                ((GridBagLayout)panel1.getLayout()).columnWeights = new double[] {1.0, 1.0E-4};
                ((GridBagLayout)panel1.getLayout()).rowWeights = new double[] {1.0, 1.0E-4};

                //---- okButton ----
                okButton.setText("OK");
                panel1.add(okButton, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.0,
                    GridBagConstraints.SOUTH, GridBagConstraints.NONE,
                    new Insets(0, 0, 0, 0), 0, 0));
            }
            dialogPane.add(panel1, BorderLayout.CENTER);
        }
        contentPane.add(dialogPane, BorderLayout.CENTER);
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - Pablo Rossi
    private JPanel dialogPane;
    private JScrollPane scrollPane1;
    private JPanel contentPanel;
    private JLabel label1;
    private JLabel label2;
    private JLabel label3;
    private JPanel panel1;
    private JButton okButton;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
