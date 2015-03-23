/*
 * Created by JFormDesigner on Mon Mar 02 17:58:11 CET 2015
 */

package com.socialcdeIntellij.dynamicview;

import java.awt.*;
import java.util.HashMap;
import javax.swing.*;

import com.socialcdeIntellij.action.ActionGeneral;
import org.jdesktop.swingx.*;

/**
 * @author Davide Rossi
 */
public class SettingPanel extends JPanel {
    ActionGeneral listener = new ActionGeneral();

    public SettingPanel() {
        initComponents();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - Pablo Rossi
        panel3 = new JPanel();
        label1 = new JLabel();
        lblAlert = new JLabel();
        panel1 = new JPanel();
        panel2 = new JPanel();
        label2 = new JLabel();
        txtOldPassword = new JTextField();
        label4 = new JLabel();
        txtNewPassword = new JTextField();
        panel4 = new JPanel();
        btnCancel = new JButton();
        btnOk = new JButton();

        //======== this ========
        setLayout(new CardLayout(0, 50));

        //======== panel3 ========
        {
            panel3.setLayout(new VerticalLayout(40));

            //---- label1 ----
            label1.setText("Change password");
            label1.setHorizontalAlignment(SwingConstants.CENTER);
            label1.setFont(new Font("Dialog", Font.BOLD, 18));
            panel3.add(label1);

            //---- lblAlert ----
            lblAlert.setText("text prova");
            lblAlert.setForeground(Color.red);
            lblAlert.setHorizontalAlignment(SwingConstants.CENTER);
            lblAlert.setVisible(false);
            panel3.add(lblAlert);

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

                    //---- txtOldPassword ----
                    txtOldPassword.setPreferredSize(new Dimension(150, 20));
                    txtOldPassword.setName("txtOldPassword");
                    panel2.add(txtOldPassword, new GridBagConstraints(1, 0, 1, 1, 0.0, 0.0,
                        GridBagConstraints.CENTER, GridBagConstraints.HORIZONTAL,
                        new Insets(0, 0, 20, 0), 0, 0));

                    //---- label4 ----
                    label4.setText("New password");
                    panel2.add(label4, new GridBagConstraints(0, 1, 1, 1, 0.0, 0.0,
                        GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                        new Insets(0, 0, 0, 20), 0, 0));

                    //---- txtNewPassword ----
                    txtNewPassword.setPreferredSize(new Dimension(150, 20));
                    txtNewPassword.setName("txtNewPassword");
                    panel2.add(txtNewPassword, new GridBagConstraints(1, 1, 1, 1, 0.0, 0.0,
                        GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                        new Insets(0, 0, 0, 0), 0, 0));
                }
                panel1.add(panel2);
            }
            panel3.add(panel1);

            //======== panel4 ========
            {
                panel4.setLayout(new FlowLayout());

                //---- btnCancel ----
                btnCancel.setText("Cancel");
                btnCancel.setPreferredSize(new Dimension(75, 32));
                btnCancel.setActionCommand("btnCancel");
                panel4.add(btnCancel);

                //---- btnOk ----
                btnOk.setText("Ok");
                btnOk.setPreferredSize(new Dimension(75, 32));
                btnOk.setActionCommand("btnOk");
                panel4.add(btnOk);
            }
            panel3.add(panel4);
        }
        add(panel3, "card1");
        // JFormDesigner - End of component initialization  //GEN-END:initComponents

        btnOk.addActionListener(listener);
        btnCancel.addActionListener(listener);
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - Pablo Rossi
    private JPanel panel3;
    private JLabel label1;
    private JLabel lblAlert;
    private JPanel panel1;
    private JPanel panel2;
    private JLabel label2;
    private JTextField txtOldPassword;
    private JLabel label4;
    private JTextField txtNewPassword;
    private JPanel panel4;
    private JButton btnCancel;
    private JButton btnOk;
    // JFormDesigner - End of variables declaration  //GEN-END:variables

    public HashMap<String, Object> getData() {
        // TODO Auto-generated method stub
        HashMap<String, Object> uiData = new HashMap<String, Object>();

        uiData.put("ButtonOk", btnOk);
        uiData.put("ButtonCancel", btnCancel);
        uiData.put("TextOldPassword", txtOldPassword);
        uiData.put("TextNewPassword", txtNewPassword);
        uiData.put("LabelAlert", lblAlert);

        return uiData;
    }
}
