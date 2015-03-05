/*
 * Created by JFormDesigner on Thu Mar 05 12:24:25 CET 2015
 */

package com.socialcdeIntellij.staticview;

import java.awt.*;
import java.util.HashMap;
import javax.swing.*;
import org.jdesktop.swingx.*;

/**
 * @author Davide Rossi
 */
public class LoginPanel extends JPanel {
    public LoginPanel() {
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
        lblUsername = new JLabel();
        lblPassword = new JLabel();
        panelTxt = new JPanel();
        txtProxy = new JTextField();
        txtUsername = new JTextField();
        txtPassword = new JTextField();
        panel3 = new JPanel();
        signProxy = new JLabel();
        signUsername = new JLabel();
        signPassword = new JLabel();
        panelButton = new JPanel();
        btnLogin = new JButton();
        panelCheckBtn = new JPanel();
        ckBxAuto_login = new JCheckBox();
        ckBxSave_psw = new JCheckBox();
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
        lblRegistration.setText("LOGIN");
        lblRegistration.setFont(new Font("Calibri", Font.BOLD, 16));
        lblRegistration.setHorizontalAlignment(SwingConstants.CENTER);
        add(lblRegistration);

        //---- lblAlert ----
        lblAlert.setText("text prova");
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

                //---- lblUsername ----
                lblUsername.setText("Username");
                lblUsername.setPreferredSize(new Dimension(89, 24));
                panelLabel.add(lblUsername);

                //---- lblPassword ----
                lblPassword.setText("Password");
                lblPassword.setPreferredSize(new Dimension(89, 24));
                panelLabel.add(lblPassword);
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
            }
            panelDati.add(panel3);
        }
        add(panelDati);

        //======== panelButton ========
        {
            panelButton.setLayout(new FlowLayout());

            //---- btnLogin ----
            btnLogin.setText("Login");
            btnLogin.setHorizontalTextPosition(SwingConstants.CENTER);
            btnLogin.setPreferredSize(new Dimension(100, 40));
            panelButton.add(btnLogin);
        }
        add(panelButton);

        //======== panelCheckBtn ========
        {
            panelCheckBtn.setLayout(new FlowLayout(FlowLayout.CENTER, 18, 5));

            //---- ckBxAuto_login ----
            ckBxAuto_login.setText("Auto login");
            panelCheckBtn.add(ckBxAuto_login);

            //---- ckBxSave_psw ----
            ckBxSave_psw.setText("Save password");
            ckBxSave_psw.setMargin(new Insets(2, 12, 2, 2));
            panelCheckBtn.add(ckBxSave_psw);
        }
        add(panelCheckBtn);

        //---- lblChange ----
        lblChange.setText("<html><u>I have no account, I want to register</u></html> ");
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
    private JLabel lblUsername;
    private JLabel lblPassword;
    private JPanel panelTxt;
    private JTextField txtProxy;
    private JTextField txtUsername;
    private JTextField txtPassword;
    private JPanel panel3;
    private JLabel signProxy;
    private JLabel signUsername;
    private JLabel signPassword;
    private JPanel panelButton;
    private JButton btnLogin;
    private JPanel panelCheckBtn;
    private JCheckBox ckBxAuto_login;
    private JCheckBox ckBxSave_psw;
    private JLabel lblChange;
    // JFormDesigner - End of variables declaration  //GEN-END:variables

    public HashMap<String, Object> getData() {
        HashMap<String, Object> uiData = new HashMap<String, Object>();
        uiData.put("LabelAlert", lblAlert);
        uiData.put("ProxyHost", txtProxy);
        uiData.put("LabelImageProxy",signProxy);
        uiData.put("Username", txtUsername);
        uiData.put("LabelImageUsername",signUsername);
        uiData.put("Password", txtPassword);
        uiData.put("LabelImagePassword",signPassword);
        uiData.put("Autologin", ckBxAuto_login);
        uiData.put("SavePassword", ckBxSave_psw);
        uiData.put("ButtonLogin",btnLogin);

        return uiData;
    }
}
