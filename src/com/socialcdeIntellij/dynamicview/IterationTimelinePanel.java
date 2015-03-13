/*
 * Created by JFormDesigner on Mon Mar 02 12:18:08 CET 2015
 */

package com.socialcdeIntellij.dynamicview;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;
import com.socialcdeIntellij.object.*;
import org.jdesktop.swingx.*;

/**
 * @author Davide Rossi
 */
public class IterationTimelinePanel extends JPanel {
    public IterationTimelinePanel() {
        initComponents();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - Davide Rossi
        scrollPane1 = new JScrollPane();
        panelDynamic = new JPanel();
        textArea1 = new JTextArea();
        panelMsg = new JPanel();
        customTextArea1 = new CustomTextArea();
        lblEnter = new JLabel();

        //======== this ========

        // JFormDesigner evaluation mark
        setBorder(new javax.swing.border.CompoundBorder(
            new javax.swing.border.TitledBorder(new javax.swing.border.EmptyBorder(0, 0, 0, 0),
                "JFormDesigner Evaluation", javax.swing.border.TitledBorder.CENTER,
                javax.swing.border.TitledBorder.BOTTOM, new java.awt.Font("Dialog", java.awt.Font.BOLD, 12),
                java.awt.Color.red), getBorder())); addPropertyChangeListener(new java.beans.PropertyChangeListener(){public void propertyChange(java.beans.PropertyChangeEvent e){if("border".equals(e.getPropertyName()))throw new RuntimeException();}});

        setLayout(new VerticalLayout(30));

        //======== scrollPane1 ========
        {
            scrollPane1.setPreferredSize(new Dimension(403, 400));

            //======== panelDynamic ========
            {
                panelDynamic.setBackground(Color.white);
                panelDynamic.setPreferredSize(new Dimension(400, 800));
                panelDynamic.setBorder(new BevelBorder(BevelBorder.LOWERED));
                panelDynamic.setMinimumSize(new Dimension(400, 800));
                panelDynamic.setLayout(new VerticalLayout(15));

                //---- textArea1 ----
                textArea1.setText("There are no post in the cache.\nPlease try again in two minutes");
                textArea1.setWrapStyleWord(true);
                textArea1.setEditable(false);
                panelDynamic.add(textArea1);
            }
            scrollPane1.setViewportView(panelDynamic);
        }
        add(scrollPane1);

        //======== panelMsg ========
        {
            panelMsg.setLayout(new FlowLayout());

            //---- customTextArea1 ----
            customTextArea1.setMinimumSize(new Dimension(20, 16));
            customTextArea1.setPreferredSize(new Dimension(330, 70));
            customTextArea1.setWrapStyleWord(true);
            panelMsg.add(customTextArea1);

            //---- lblEnter ----
            lblEnter.setIcon(new ImageIcon(getClass().getResource("/images/send_message.png")));
            lblEnter.setHorizontalAlignment(SwingConstants.LEFT);
            lblEnter.setVerticalAlignment(SwingConstants.TOP);
            lblEnter.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
            lblEnter.setVerticalTextPosition(SwingConstants.TOP);
            panelMsg.add(lblEnter);
        }
        add(panelMsg);
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - Davide Rossi
    private JScrollPane scrollPane1;
    private JPanel panelDynamic;
    private JTextArea textArea1;
    private JPanel panelMsg;
    private CustomTextArea customTextArea1;
    private JLabel lblEnter;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
