/*
 * Created by JFormDesigner on Fri Feb 13 11:17:02 CET 2015
 */

package com.socialcdeIntellij.staticview;

import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.event.EventListenerList;
import java.awt.*;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Vector;

/**
 * @author Davide Rossi
 */
public class LoginPanel extends JPanel {
    private JLabel lblSign_No;
    private JLabel lblSign_Ok;
    private JLabel lblHidden;
    private static EventListenerList lista;
    Vector<JPanel> vec;

    public Image get_ImageStream(InputStream stream) throws IOException {
        Image image = ImageIO.read(stream);
        return image;
    }//prende immagine da stream

    public LoginPanel() {
        initComponents();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - Davide Rossi
        panelRegAndAlert = new JPanel();
        lblRegistration = new JLabel();
        lblAlert = new JLabel();
        panelProxy = new JPanel();
        lblProxy = new JLabel();
        txtProxy = new JTextField();
        lblSign = new JLabel();
        panelUsername = new JPanel();
        lblUsername = new JLabel();
        txtUsername = new JTextField();
        lblSign4 = new JLabel();
        panelPassword = new JPanel();
        lblPassword = new JLabel();
        txtPassword = new JTextField();
        lblSign5 = new JLabel();
        panelBtnLogin = new JPanel();
        btnLogin = new JButton();
        panelCheckBtn = new JPanel();
        ckBxAuto_login = new JCheckBox();
        ckBxSave_psw = new JCheckBox();
        lblChange = new JLabel();

        //======== this ========
        setAlignmentY(47.5F);

        // JFormDesigner evaluation mark
        setBorder(new javax.swing.border.CompoundBorder(
            new javax.swing.border.TitledBorder(new javax.swing.border.EmptyBorder(0, 0, 0, 0),
                "JFormDesigner Evaluation", javax.swing.border.TitledBorder.CENTER,
                javax.swing.border.TitledBorder.BOTTOM, new java.awt.Font("Dialog", java.awt.Font.BOLD, 12),
                java.awt.Color.red), getBorder())); addPropertyChangeListener(new java.beans.PropertyChangeListener(){public void propertyChange(java.beans.PropertyChangeEvent e){if("border".equals(e.getPropertyName()))throw new RuntimeException();}});

        setLayout(new GridLayout(9, 2, 2, 2));

        //======== panelRegAndAlert ========
        {
            panelRegAndAlert.setLayout(new GridBagLayout());
            ((GridBagLayout)panelRegAndAlert.getLayout()).columnWidths = new int[] {0, 0};
            ((GridBagLayout)panelRegAndAlert.getLayout()).rowHeights = new int[] {0, 0, 0};
            ((GridBagLayout)panelRegAndAlert.getLayout()).columnWeights = new double[] {1.0, 1.0E-4};
            ((GridBagLayout)panelRegAndAlert.getLayout()).rowWeights = new double[] {1.0, 0.0, 1.0E-4};

            //---- lblRegistration ----
            lblRegistration.setText("LOGIN");
            lblRegistration.setFont(new Font("Calibri", Font.BOLD, 16));
            lblRegistration.setHorizontalAlignment(SwingConstants.CENTER);
            panelRegAndAlert.add(lblRegistration, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.0,
                GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                new Insets(0, 0, 0, 0), 0, 0));

            //---- lblAlert ----
            lblAlert.setText("text prova");
            lblAlert.setForeground(Color.red);
            lblAlert.setHorizontalAlignment(SwingConstants.CENTER);
            panelRegAndAlert.add(lblAlert, new GridBagConstraints(0, 1, 1, 1, 0.0, 0.0,
                GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                new Insets(0, 0, 0, 0), 0, 0));
        }
        add(panelRegAndAlert);

        //======== panelProxy ========
        {
            panelProxy.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
            panelProxy.setLayout(new GridBagLayout());
            ((GridBagLayout)panelProxy.getLayout()).columnWidths = new int[] {124, 0, 0, 0};
            ((GridBagLayout)panelProxy.getLayout()).rowHeights = new int[] {0, 0};
            ((GridBagLayout)panelProxy.getLayout()).columnWeights = new double[] {1.0, 1.0, 1.0, 1.0E-4};
            ((GridBagLayout)panelProxy.getLayout()).rowWeights = new double[] {1.0, 1.0E-4};

            //---- lblProxy ----
            lblProxy.setText("Proxy server host");
            lblProxy.setAlignmentX(10.0F);
            panelProxy.add(lblProxy, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.0,
                GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                new Insets(0, 10, 0, 10), 0, 0));

            //---- txtProxy ----
            txtProxy.setMinimumSize(new Dimension(100, 24));
            txtProxy.setPreferredSize(new Dimension(110, 24));
            txtProxy.setAutoscrolls(false);
            txtProxy.setMargin(new Insets(20, 100, 20, 200));
            txtProxy.setAlignmentX(28.5F);
            txtProxy.setMaximumSize(new Dimension(1000, 24));
            txtProxy.setCursor(Cursor.getPredefinedCursor(Cursor.TEXT_CURSOR));
            panelProxy.add(txtProxy, new GridBagConstraints(1, 0, 1, 1, 20.0, 0.0,
                GridBagConstraints.ABOVE_BASELINE, GridBagConstraints.HORIZONTAL,
                new Insets(0, 0, 0, 0), 0, 0));

            //---- lblSign ----
            lblSign.setIcon(new ImageIcon("D:\\workspaceIntelliJ\\SocialCDEplugin\\images\\no_icon.png"));
            lblSign.setHorizontalAlignment(SwingConstants.CENTER);
            panelProxy.add(lblSign, new GridBagConstraints(2, 0, 1, 1, 0.0, 0.0,
                GridBagConstraints.WEST, GridBagConstraints.VERTICAL,
                new Insets(0, 0, 0, 0), 20, 0));
        }
        add(panelProxy);

        //======== panelUsername ========
        {
            panelUsername.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
            panelUsername.setLayout(new GridBagLayout());
            ((GridBagLayout)panelUsername.getLayout()).columnWidths = new int[] {124, 0, 0, 0};
            ((GridBagLayout)panelUsername.getLayout()).rowHeights = new int[] {0, 0};
            ((GridBagLayout)panelUsername.getLayout()).columnWeights = new double[] {1.0, 1.0, 1.0, 1.0E-4};
            ((GridBagLayout)panelUsername.getLayout()).rowWeights = new double[] {1.0, 1.0E-4};

            //---- lblUsername ----
            lblUsername.setText("Username");
            panelUsername.add(lblUsername, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.0,
                GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                new Insets(0, 10, 0, 10), 0, 0));

            //---- txtUsername ----
            txtUsername.setMinimumSize(new Dimension(76, 24));
            txtUsername.setPreferredSize(new Dimension(110, 24));
            txtUsername.setHorizontalAlignment(SwingConstants.LEFT);
            txtUsername.setAutoscrolls(false);
            txtUsername.setMargin(new Insets(20, 10, 20, 59));
            txtUsername.setAlignmentX(28.5F);
            txtUsername.setMaximumSize(new Dimension(1000, 24));
            panelUsername.add(txtUsername, new GridBagConstraints(1, 0, 1, 1, 20.0, 0.0,
                GridBagConstraints.ABOVE_BASELINE, GridBagConstraints.HORIZONTAL,
                new Insets(0, 0, 0, 0), 0, 0));

            //---- lblSign4 ----
            lblSign4.setIcon(new ImageIcon("D:\\workspaceIntelliJ\\SocialCDEplugin\\images\\no_icon.png"));
            lblSign4.setHorizontalAlignment(SwingConstants.CENTER);
            panelUsername.add(lblSign4, new GridBagConstraints(2, 0, 1, 1, 0.0, 0.0,
                GridBagConstraints.WEST, GridBagConstraints.VERTICAL,
                new Insets(0, 0, 0, 0), 20, 0));
        }
        add(panelUsername);

        //======== panelPassword ========
        {
            panelPassword.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
            panelPassword.setLayout(new GridBagLayout());
            ((GridBagLayout)panelPassword.getLayout()).columnWidths = new int[] {124, 0, 0, 0};
            ((GridBagLayout)panelPassword.getLayout()).rowHeights = new int[] {0, 0};
            ((GridBagLayout)panelPassword.getLayout()).columnWeights = new double[] {1.0, 1.0, 1.0, 1.0E-4};
            ((GridBagLayout)panelPassword.getLayout()).rowWeights = new double[] {1.0, 1.0E-4};

            //---- lblPassword ----
            lblPassword.setText("Password");
            panelPassword.add(lblPassword, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.0,
                GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                new Insets(0, 10, 0, 10), 0, 0));

            //---- txtPassword ----
            txtPassword.setMinimumSize(new Dimension(76, 24));
            txtPassword.setPreferredSize(new Dimension(110, 24));
            txtPassword.setHorizontalAlignment(SwingConstants.LEFT);
            txtPassword.setAutoscrolls(false);
            txtPassword.setMargin(new Insets(20, 10, 20, 59));
            txtPassword.setAlignmentX(28.5F);
            txtPassword.setMaximumSize(new Dimension(1000, 24));
            panelPassword.add(txtPassword, new GridBagConstraints(1, 0, 1, 1, 20.0, 0.0,
                GridBagConstraints.ABOVE_BASELINE, GridBagConstraints.HORIZONTAL,
                new Insets(0, 0, 0, 0), 0, 0));

            //---- lblSign5 ----
            lblSign5.setIcon(new ImageIcon("D:\\workspaceIntelliJ\\SocialCDEplugin\\images\\no_icon.png"));
            lblSign5.setHorizontalAlignment(SwingConstants.CENTER);
            panelPassword.add(lblSign5, new GridBagConstraints(2, 0, 1, 1, 0.0, 0.0,
                GridBagConstraints.WEST, GridBagConstraints.VERTICAL,
                new Insets(0, 0, 0, 0), 20, 0));
        }
        add(panelPassword);

        //======== panelBtnLogin ========
        {
            panelBtnLogin.setLayout(new GridBagLayout());
            ((GridBagLayout)panelBtnLogin.getLayout()).columnWidths = new int[] {197, 0};
            ((GridBagLayout)panelBtnLogin.getLayout()).rowHeights = new int[] {0, 0};
            ((GridBagLayout)panelBtnLogin.getLayout()).columnWeights = new double[] {1.0, 1.0E-4};
            ((GridBagLayout)panelBtnLogin.getLayout()).rowWeights = new double[] {1.0, 1.0E-4};

            //---- btnLogin ----
            btnLogin.setText("Login");
            panelBtnLogin.add(btnLogin, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.0,
                GridBagConstraints.WEST, GridBagConstraints.NONE,
                new Insets(0, 20, 0, 0), 50, 0));
        }
        add(panelBtnLogin);

        //======== panelCheckBtn ========
        {
            panelCheckBtn.setLayout(new FlowLayout(FlowLayout.LEFT, 18, 5));

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

    public HashMap<String, Object> getData() {
        HashMap<String, Object> uiData = new HashMap<String, Object>();
        uiData.put("labelAlert", lblAlert);
        uiData.put("txtProxyHost", txtProxy);
        uiData.put("labelImageHostOk", lblSign_Ok);
        uiData.put("labelImageHostNo", lblSign_No);
        uiData.put("txtUsername", txtUsername);
        uiData.put("labelImageUsernameOk", lblSign_Ok);
        uiData.put("labelImageUsernameNo", lblSign_No);
        uiData.put("txtPassword", txtPassword);
        uiData.put("labelImagePasswordOk", lblSign_Ok);
        uiData.put("labelImagePasswordNo", lblSign_No);
        uiData.put("chkAutologin", ckBxAuto_login);
        uiData.put("chkSavePassword", ckBxSave_psw);
        uiData.put("btnLogin",btnLogin);
        uiData.put("labelHiddenProxyHost", lblHidden);
        uiData.put("labelHiddenUsername", lblHidden);
        uiData.put("labelHiddenPassword", lblHidden);

        return uiData;
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - Davide Rossi
    private JPanel panelRegAndAlert;
    private JLabel lblRegistration;
    private JLabel lblAlert;
    private JPanel panelProxy;
    private JLabel lblProxy;
    private JTextField txtProxy;
    private JLabel lblSign;
    private JPanel panelUsername;
    private JLabel lblUsername;
    private JTextField txtUsername;
    private JLabel lblSign4;
    private JPanel panelPassword;
    private JLabel lblPassword;
    private JTextField txtPassword;
    private JLabel lblSign5;
    private JPanel panelBtnLogin;
    private JButton btnLogin;
    private JPanel panelCheckBtn;
    private JCheckBox ckBxAuto_login;
    private JCheckBox ckBxSave_psw;
    private JLabel lblChange;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
