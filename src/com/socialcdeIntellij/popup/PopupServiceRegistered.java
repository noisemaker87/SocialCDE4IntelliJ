/*
 * Created by JFormDesigner on Mon Mar 02 12:00:16 CET 2015
 */

package com.socialcdeIntellij.popup;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;
import org.jdesktop.swingx.*;

/**
 * @author Davide Rossi
 */
public class PopupServiceRegistered extends JDialog {
    public PopupServiceRegistered(Frame owner) {
        super(owner);
        initComponents();
    }

    public PopupServiceRegistered(Dialog owner) {
        super(owner);
        initComponents();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - Davide Rossi
        dialogPane = new JPanel();
        contentPanel = new JPanel();
        panel1 = new JPanel();
        label1 = new JLabel();
        label2 = new JLabel();
        panel2 = new JPanel();
        label3 = new JLabel();
        panel3 = new JPanel();
        checkBox1 = new JCheckBox();
        checkBox2 = new JCheckBox();
        checkBox3 = new JCheckBox();
        checkBox4 = new JCheckBox();
        buttonBar = new JPanel();
        btnUnsubscrive = new JButton();
        btnSave = new JButton();

        //======== this ========
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

            //======== contentPanel ========
            {
                contentPanel.setLayout(new VerticalLayout(25));

                //======== panel1 ========
                {
                    panel1.setLayout(new FlowLayout(FlowLayout.LEFT, 15, 5));

                    //---- label1 ----
                    label1.setText("Registration of service:");
                    panel1.add(label1);

                    //---- label2 ----
                    label2.setText("text");
                    panel1.add(label2);
                }
                contentPanel.add(panel1);

                //======== panel2 ========
                {
                    panel2.setLayout(new FlowLayout());

                    //---- label3 ----
                    label3.setText("imm servizio");
                    label3.setIcon(UIManager.getIcon("OptionPane.errorIcon"));
                    panel2.add(label3);

                    //======== panel3 ========
                    {
                        panel3.setLayout(new GridBagLayout());
                        ((GridBagLayout)panel3.getLayout()).columnWidths = new int[] {0, 0};
                        ((GridBagLayout)panel3.getLayout()).rowHeights = new int[] {0, 0, 0, 0, 0, 0};
                        ((GridBagLayout)panel3.getLayout()).columnWeights = new double[] {0.0, 1.0E-4};
                        ((GridBagLayout)panel3.getLayout()).rowWeights = new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 1.0E-4};

                        //---- checkBox1 ----
                        checkBox1.setText("Show your avatar");
                        panel3.add(checkBox1, new GridBagConstraints(0, 1, 1, 1, 0.0, 0.0,
                            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                            new Insets(0, 0, 10, 0), 0, 0));

                        //---- checkBox2 ----
                        checkBox2.setText("Show your timeline");
                        panel3.add(checkBox2, new GridBagConstraints(0, 2, 1, 1, 0.0, 0.0,
                            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                            new Insets(0, 0, 10, 0), 0, 0));

                        //---- checkBox3 ----
                        checkBox3.setText("Access your followings");
                        panel3.add(checkBox3, new GridBagConstraints(0, 3, 1, 1, 0.0, 0.0,
                            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                            new Insets(0, 0, 10, 0), 0, 0));

                        //---- checkBox4 ----
                        checkBox4.setText("Access your followers");
                        panel3.add(checkBox4, new GridBagConstraints(0, 4, 1, 1, 0.0, 0.0,
                            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                            new Insets(0, 0, 0, 0), 0, 0));
                    }
                    panel2.add(panel3);
                }
                contentPanel.add(panel2);
            }
            dialogPane.add(contentPanel, BorderLayout.CENTER);

            //======== buttonBar ========
            {
                buttonBar.setBorder(new EmptyBorder(12, 0, 0, 0));
                buttonBar.setLayout(new GridBagLayout());
                ((GridBagLayout)buttonBar.getLayout()).columnWidths = new int[] {0, 85, 80};
                ((GridBagLayout)buttonBar.getLayout()).columnWeights = new double[] {1.0, 0.0, 0.0};

                //---- btnUnsubscrive ----
                btnUnsubscrive.setText("Unsubscrive");
                buttonBar.add(btnUnsubscrive, new GridBagConstraints(1, 0, 1, 1, 0.0, 0.0,
                    GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                    new Insets(0, 0, 0, 5), 0, 0));

                //---- btnSave ----
                btnSave.setText("Save");
                btnSave.setPreferredSize(new Dimension(105, 26));
                buttonBar.add(btnSave, new GridBagConstraints(2, 0, 1, 1, 0.0, 0.0,
                    GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                    new Insets(0, 0, 0, 0), 0, 0));
            }
            dialogPane.add(buttonBar, BorderLayout.SOUTH);
        }
        contentPane.add(dialogPane, BorderLayout.CENTER);
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - Davide Rossi
    private JPanel dialogPane;
    private JPanel contentPanel;
    private JPanel panel1;
    private JLabel label1;
    private JLabel label2;
    private JPanel panel2;
    private JLabel label3;
    private JPanel panel3;
    private JCheckBox checkBox1;
    private JCheckBox checkBox2;
    private JCheckBox checkBox3;
    private JCheckBox checkBox4;
    private JPanel buttonBar;
    private JButton btnUnsubscrive;
    private JButton btnSave;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
