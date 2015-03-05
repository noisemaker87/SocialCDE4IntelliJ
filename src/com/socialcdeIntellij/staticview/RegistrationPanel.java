/*
 * Created by JFormDesigner on Thu Mar 05 12:07:17 CET 2015
 */

package com.socialcdeIntellij.staticview;

import java.awt.*;
import java.util.HashMap;
import javax.swing.*;
import org.jdesktop.swingx.*;

/**
 * @author Davide Rossi
 */
public class RegistrationPanel extends JPanel {
    public RegistrationPanel() {
        initComponents();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - Davide Rossi
        lblRegistration = new JLabel();
        lblAlert = new JLabel();
        panelDati = new JPanel();
        panelLabel = new JPanel();
        lblProxy = new JLabel();
        lblEmail = new JLabel();
        lblCode = new JLabel();
        lblUsername = new JLabel();
        lblPassword = new JLabel();
        lblConfirmPsw = new JLabel();
        panelTxt = new JPanel();
        txtProxy = new JTextField();
        txtEmail = new JTextField();
        txtCode = new JTextField();
        txtUsername = new JTextField();
        txtPassword = new JTextField();
        txtConfirmPsw = new JTextField();
        panel3 = new JPanel();
        signProxy = new JLabel();
        signEmail = new JLabel();
        signCode = new JLabel();
        signUsername = new JLabel();
        signPassword = new JLabel();
        signConfirmPassword = new JLabel();
        panelButton = new JPanel();
        btnRegister = new JButton();
        lblChange = new JLabel();

        //======== this ========

        // JFormDesigner evaluation mark
        setBorder(new javax.swing.border.CompoundBorder(
            new javax.swing.border.TitledBorder(new javax.swing.border.EmptyBorder(0, 0, 0, 0),
                "JFormDesigner Evaluation", javax.swing.border.TitledBorder.CENTER,
                javax.swing.border.TitledBorder.BOTTOM, new java.awt.Font("Dialog", java.awt.Font.BOLD, 12),
                java.awt.Color.red), getBorder())); addPropertyChangeListener(new java.beans.PropertyChangeListener(){public void propertyChange(java.beans.PropertyChangeEvent e){if("border".equals(e.getPropertyName()))throw new RuntimeException();}});

        setLayout(new VerticalLayout(10));

        //---- lblRegistration ----
        lblRegistration.setText("REGISTRATION");
        lblRegistration.setFont(new Font("Calibri", Font.BOLD, 16));
        lblRegistration.setHorizontalAlignment(SwingConstants.CENTER);
        add(lblRegistration);

        //---- lblAlert ----
        lblAlert.setText("text");
        lblAlert.setForeground(Color.red);
        lblAlert.setHorizontalAlignment(SwingConstants.CENTER);
        add(lblAlert);

        //======== panelDati ========
        {
            panelDati.setLayout(new FlowLayout());

            //======== panelLabel ========
            {
                panelLabel.setLayout(new VerticalLayout(4));

                //---- lblProxy ----
                lblProxy.setText("Proxy server host");
                lblProxy.setAlignmentX(10.0F);
                lblProxy.setHorizontalAlignment(SwingConstants.LEFT);
                lblProxy.setPreferredSize(new Dimension(89, 24));
                panelLabel.add(lblProxy);

                //---- lblEmail ----
                lblEmail.setText("Email");
                lblEmail.setPreferredSize(new Dimension(89, 24));
                panelLabel.add(lblEmail);

                //---- lblCode ----
                lblCode.setText("Invitation code");
                lblCode.setPreferredSize(new Dimension(89, 24));
                panelLabel.add(lblCode);

                //---- lblUsername ----
                lblUsername.setText("Username");
                lblUsername.setPreferredSize(new Dimension(89, 24));
                panelLabel.add(lblUsername);

                //---- lblPassword ----
                lblPassword.setText("Password");
                lblPassword.setPreferredSize(new Dimension(89, 24));
                panelLabel.add(lblPassword);

                //---- lblConfirmPsw ----
                lblConfirmPsw.setText("Confirm password");
                lblConfirmPsw.setPreferredSize(new Dimension(97, 24));
                panelLabel.add(lblConfirmPsw);
            }
            panelDati.add(panelLabel);

            //======== panelTxt ========
            {
                panelTxt.setLayout(new VerticalLayout(4));

                //---- txtProxy ----
                txtProxy.setMinimumSize(new Dimension(100, 24));
                txtProxy.setPreferredSize(new Dimension(250, 24));
                txtProxy.setAutoscrolls(false);
                txtProxy.setMargin(new Insets(20, 20, 20, 20));
                txtProxy.setAlignmentX(28.5F);
                txtProxy.setMaximumSize(new Dimension(300, 24));
                txtProxy.setCursor(Cursor.getPredefinedCursor(Cursor.TEXT_CURSOR));
                txtProxy.setHorizontalAlignment(SwingConstants.LEFT);
                panelTxt.add(txtProxy);

                //---- txtEmail ----
                txtEmail.setMinimumSize(new Dimension(76, 24));
                txtEmail.setPreferredSize(new Dimension(250, 24));
                txtEmail.setAutoscrolls(false);
                txtEmail.setMargin(new Insets(20, 10, 20, 59));
                txtEmail.setAlignmentX(28.5F);
                txtEmail.setMaximumSize(new Dimension(1000, 24));
                txtEmail.setCursor(Cursor.getPredefinedCursor(Cursor.TEXT_CURSOR));
                txtEmail.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
                panelTxt.add(txtEmail);

                //---- txtCode ----
                txtCode.setMinimumSize(new Dimension(76, 24));
                txtCode.setPreferredSize(new Dimension(250, 24));
                txtCode.setAutoscrolls(false);
                txtCode.setMargin(new Insets(20, 10, 20, 59));
                txtCode.setAlignmentX(28.5F);
                txtCode.setMaximumSize(new Dimension(1000, 24));
                panelTxt.add(txtCode);

                //---- txtUsername ----
                txtUsername.setMinimumSize(new Dimension(76, 24));
                txtUsername.setPreferredSize(new Dimension(250, 24));
                txtUsername.setAutoscrolls(false);
                txtUsername.setMargin(new Insets(20, 10, 20, 59));
                txtUsername.setAlignmentX(28.5F);
                txtUsername.setMaximumSize(new Dimension(1000, 24));
                panelTxt.add(txtUsername);

                //---- txtPassword ----
                txtPassword.setMinimumSize(new Dimension(76, 24));
                txtPassword.setPreferredSize(new Dimension(250, 24));
                txtPassword.setAutoscrolls(false);
                txtPassword.setMargin(new Insets(20, 10, 20, 59));
                txtPassword.setAlignmentX(28.5F);
                txtPassword.setMaximumSize(new Dimension(1000, 24));
                panelTxt.add(txtPassword);

                //---- txtConfirmPsw ----
                txtConfirmPsw.setMinimumSize(new Dimension(76, 24));
                txtConfirmPsw.setPreferredSize(new Dimension(250, 24));
                txtConfirmPsw.setAutoscrolls(false);
                txtConfirmPsw.setMargin(new Insets(20, 10, 20, 59));
                txtConfirmPsw.setAlignmentX(28.5F);
                txtConfirmPsw.setMaximumSize(new Dimension(1000, 24));
                panelTxt.add(txtConfirmPsw);
            }
            panelDati.add(panelTxt);

            //======== panel3 ========
            {
                panel3.setLayout(new VerticalLayout(4));

                //---- signProxy ----
                signProxy.setIcon(new ImageIcon(getClass().getResource("/images/no_icon.png")));
                signProxy.setHorizontalAlignment(SwingConstants.LEFT);
                signProxy.setPreferredSize(new Dimension(32, 24));
                signProxy.setFocusable(false);
                panel3.add(signProxy);

                //---- signEmail ----
                signEmail.setIcon(new ImageIcon(getClass().getResource("/images/yes_icon.png")));
                signEmail.setHorizontalAlignment(SwingConstants.LEFT);
                signEmail.setPreferredSize(new Dimension(32, 24));
                signEmail.setFocusable(false);
                panel3.add(signEmail);

                //---- signCode ----
                signCode.setIcon(new ImageIcon("D:\\workspaceIntelliJ\\IntelliJPlugin\\images\\no_icon.png"));
                signCode.setHorizontalAlignment(SwingConstants.LEFT);
                signCode.setPreferredSize(new Dimension(32, 24));
                signCode.setFocusable(false);
                panel3.add(signCode);

                //---- signUsername ----
                signUsername.setIcon(new ImageIcon(getClass().getResource("/images/yes_icon.png")));
                signUsername.setHorizontalAlignment(SwingConstants.LEFT);
                signUsername.setPreferredSize(new Dimension(32, 24));
                signUsername.setFocusable(false);
                panel3.add(signUsername);

                //---- signPassword ----
                signPassword.setIcon(new ImageIcon("D:\\workspaceIntelliJ\\IntelliJPlugin\\images\\no_icon.png"));
                signPassword.setHorizontalAlignment(SwingConstants.LEFT);
                signPassword.setPreferredSize(new Dimension(32, 24));
                signPassword.setFocusable(false);
                panel3.add(signPassword);

                //---- signConfirmPassword ----
                signConfirmPassword.setIcon(new ImageIcon(getClass().getResource("/images/yes_icon.png")));
                signConfirmPassword.setHorizontalAlignment(SwingConstants.LEFT);
                signConfirmPassword.setPreferredSize(new Dimension(32, 24));
                signConfirmPassword.setFocusable(false);
                panel3.add(signConfirmPassword);
            }
            panelDati.add(panel3);
        }
        add(panelDati);

        //======== panelButton ========
        {
            panelButton.setLayout(new FlowLayout());

            //---- btnRegister ----
            btnRegister.setText("Register");
            btnRegister.setHorizontalTextPosition(SwingConstants.CENTER);
            btnRegister.setPreferredSize(new Dimension(100, 40));
            panelButton.add(btnRegister);
        }
        add(panelButton);

        //---- lblChange ----
        lblChange.setText("<html><u>I already have an account, I want to sign in</u></html> ");
        lblChange.setHorizontalAlignment(SwingConstants.CENTER);
        lblChange.setForeground(Color.blue);
        add(lblChange);
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - Davide Rossi
    private JLabel lblRegistration;
    private JLabel lblAlert;
    private JPanel panelDati;
    private JPanel panelLabel;
    private JLabel lblProxy;
    private JLabel lblEmail;
    private JLabel lblCode;
    private JLabel lblUsername;
    private JLabel lblPassword;
    private JLabel lblConfirmPsw;
    private JPanel panelTxt;
    private JTextField txtProxy;
    private JTextField txtEmail;
    private JTextField txtCode;
    private JTextField txtUsername;
    private JTextField txtPassword;
    private JTextField txtConfirmPsw;
    private JPanel panel3;
    private JLabel signProxy;
    private JLabel signEmail;
    private JLabel signCode;
    private JLabel signUsername;
    private JLabel signPassword;
    private JLabel signConfirmPassword;
    private JPanel panelButton;
    private JButton btnRegister;
    private JLabel lblChange;
    // JFormDesigner - End of variables declaration  //GEN-END:variables

    public HashMap<String, Object> getData() {
        HashMap<String, Object> uiData = new HashMap<String, Object>();
        uiData.put("LabelAlert", lblAlert);
        uiData.put("ProxyHost", txtProxy);
        uiData.put("LabelImageProxy",signProxy);
        uiData.put("Email", txtEmail);
        uiData.put("LabelImageEmail",signEmail);
        uiData.put("InvitationCode", txtCode);
        uiData.put("LabelImageInvitationCode",signCode);
        uiData.put("Username", txtUsername);
        uiData.put("LabelImageUsername",signUsername);
        uiData.put("Password", txtPassword);
        uiData.put("LabelImagePassword",signPassword);
        uiData.put("ConfirmPassword", txtConfirmPsw);
        uiData.put("LabelImageConfirmPassword",signConfirmPassword);
        uiData.put("ButtonRegister",btnRegister);

        return uiData;
    }
}
