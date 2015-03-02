/*
 * Created by JFormDesigner on Mon Mar 02 11:30:44 CET 2015
 */

package com.socialcdeIntellij.popup;

import org.jdesktop.swingx.VerticalLayout;

import javax.swing.*;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;
import java.awt.*;

/**
 * @author Davide Rossi
 */
public class PopupSkill extends JDialog {
    public PopupSkill(Frame owner) {
        super(owner);
        initComponents();
    }

    public PopupSkill(Dialog owner) {
        super(owner);
        initComponents();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - Davide Rossi
        dialogPane = new JPanel();
        scrollPane2 = new JScrollPane();
        textArea1 = new JTextArea();
        panel1 = new JPanel();
        btnReturn = new JButton();

        //======== this ========
        setResizable(false);
        setTitle("Skills");
        Container contentPane = getContentPane();
        contentPane.setLayout(new BorderLayout(0, 10));

        //======== dialogPane ========
        {
            dialogPane.setBorder(new EmptyBorder(12, 12, 12, 12));

            // JFormDesigner evaluation mark
            dialogPane.setBorder(new CompoundBorder(
                new TitledBorder(new EmptyBorder(0, 0, 0, 0),
                    "JFormDesigner Evaluation", TitledBorder.CENTER,
                    TitledBorder.BOTTOM, new Font("Dialog", Font.BOLD, 12),
                    Color.red), dialogPane.getBorder())); dialogPane.addPropertyChangeListener(new java.beans.PropertyChangeListener(){public void propertyChange(java.beans.PropertyChangeEvent e){if("border".equals(e.getPropertyName()))throw new RuntimeException();}});

            dialogPane.setLayout(new VerticalLayout(10));

            //======== scrollPane2 ========
            {

                //---- textArea1 ----
                textArea1.setCursor(Cursor.getPredefinedCursor(Cursor.TEXT_CURSOR));
                textArea1.setText("There are no skills or there are  no \"get your skills\" feature selected.\nTry again later");
                textArea1.setEditable(false);
                scrollPane2.setViewportView(textArea1);
            }
            dialogPane.add(scrollPane2);

            //======== panel1 ========
            {
                panel1.setPreferredSize(new Dimension(63, 50));
                panel1.setLayout(new GridBagLayout());
                ((GridBagLayout)panel1.getLayout()).columnWidths = new int[] {0, 0};
                ((GridBagLayout)panel1.getLayout()).rowHeights = new int[] {133, 0};
                ((GridBagLayout)panel1.getLayout()).columnWeights = new double[] {1.0, 1.0E-4};
                ((GridBagLayout)panel1.getLayout()).rowWeights = new double[] {1.0, 1.0E-4};

                //---- btnReturn ----
                btnReturn.setText("Back");
                panel1.add(btnReturn, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.0,
                    GridBagConstraints.NORTH, GridBagConstraints.NONE,
                    new Insets(0, 0, 0, 0), 0, 0));
            }
            dialogPane.add(panel1);
        }
        contentPane.add(dialogPane, BorderLayout.CENTER);
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - Davide Rossi
    private JPanel dialogPane;
    private JScrollPane scrollPane2;
    private JTextArea textArea1;
    private JPanel panel1;
    private JButton btnReturn;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
