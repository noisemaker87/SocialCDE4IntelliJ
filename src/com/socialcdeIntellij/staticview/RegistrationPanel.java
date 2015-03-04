/*
 * Created by JFormDesigner on Fri Feb 13 11:17:02 CET 2015
 */

package com.socialcdeIntellij.staticview;

import com.intellij.util.ui.UIUtil;
import com.socialcdeIntellij.object.ImagesMod;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.HashMap;

/**
 * @author Davide Rossi
 */
public class RegistrationPanel extends JPanel {
    private JLabel lblSign_Ok;
    private JLabel lblSign_No;
    private JLabel lblHidden;
    final ImagesMod im = new ImagesMod();

   // private final URL PATH_ICON_OK = this.getClass().getResource("images/yes_icon.png");
   // private final URL PATH_ICON_ERROR = this.getClass().getResource("images/no_icon.png"); + i 2 get

    public RegistrationPanel() throws IOException {
        initComponents();
    }

    private void initComponents() throws IOException {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - Davide Rossi
        panelRegAndAlert = new JPanel();
        lblRegistration = new JLabel();
        lblAlert = new JLabel();
        panelProxy = new JPanel();
        lblProxy = new JLabel();
        txtProxy = new JTextField();
        lblSign = new JLabel();
        panelEmail = new JPanel();
        lblEmail = new JLabel();
        txtEmail = new JTextField();
        lblSign2 = new JLabel();
        panelCode = new JPanel();
        lblCode = new JLabel();
        txtCode = new JTextField();
        lblSign3 = new JLabel();
        panelUsername = new JPanel();
        lblUsername = new JLabel();
        txtUsername = new JTextField();
        lblSign4 = new JLabel();
        panelPassword = new JPanel();
        lblPassword = new JLabel();
        txtPassword = new JTextField();
        lblSign5 = new JLabel();
        panelConfirmPsw = new JPanel();
        lblConfirmPsw = new JLabel();
        txtConfirmPsw = new JTextField();
        lblSign6 = new JLabel();
        panel1 = new JPanel();
        btnRegister = new JButton();
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
            lblRegistration.setText("REGISTRATION");
            lblRegistration.setFont(new Font("Calibri", Font.BOLD, 16));
            lblRegistration.setHorizontalAlignment(SwingConstants.CENTER);
            panelRegAndAlert.add(lblRegistration, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.0,
                GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                new Insets(0, 0, 0, 0), 0, 0));

            //---- lblAlert ----
            lblAlert.setText("text");
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
            //lblSign.setIcon(new ImageIcon("D:\\workspaceIntelliJ\\IntelliJPlugin\\images\\no_icon.png"));
            //System.out.println(im.getNO_ICON(32,16));
            //ImageIcon image = new ImageIcon(getClass().getResource("/pkimg/dado.png"));
            //System.out.println("qui****** "+im.getPATH_NO_ICON());
            //ImageIcon icon = new ImageIcon(im.getPATH_NO_ICON());
            lblSign.setIcon(new ImageIcon(im.getNO_ICON(32,16)));
            lblSign.setHorizontalAlignment(SwingConstants.CENTER);
            panelProxy.add(lblSign, new GridBagConstraints(2, 0, 1, 1, 0.0, 0.0,
                GridBagConstraints.WEST, GridBagConstraints.VERTICAL,
                new Insets(0, 0, 0, 0), 20, 0));
        }
        add(panelProxy);

        //======== panelEmail ========
        {
            panelEmail.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
            panelEmail.setPreferredSize(new Dimension(286, 24));
            panelEmail.setMinimumSize(new Dimension(276, 24));
            panelEmail.setLayout(new GridBagLayout());
            ((GridBagLayout)panelEmail.getLayout()).columnWidths = new int[] {124, 0, 0, 0};
            ((GridBagLayout)panelEmail.getLayout()).rowHeights = new int[] {0, 0};
            ((GridBagLayout)panelEmail.getLayout()).columnWeights = new double[] {1.0, 1.0, 1.0, 1.0E-4};
            ((GridBagLayout)panelEmail.getLayout()).rowWeights = new double[] {1.0, 1.0E-4};

            //---- lblEmail ----
            lblEmail.setText("Email");
            panelEmail.add(lblEmail, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.0,
                GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                new Insets(0, 10, 0, 10), 0, 0));

            //---- txtEmail ----
            txtEmail.setMinimumSize(new Dimension(76, 24));
            txtEmail.setPreferredSize(new Dimension(110, 24));
            txtEmail.setAutoscrolls(false);
            txtEmail.setMargin(new Insets(20, 10, 20, 59));
            txtEmail.setAlignmentX(28.5F);
            txtEmail.setMaximumSize(new Dimension(1000, 24));
            txtEmail.setCursor(Cursor.getPredefinedCursor(Cursor.TEXT_CURSOR));
            txtEmail.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
            panelEmail.add(txtEmail, new GridBagConstraints(1, 0, 1, 1, 20.0, 0.0,
                GridBagConstraints.ABOVE_BASELINE, GridBagConstraints.HORIZONTAL,
                new Insets(0, 0, 0, 0), 0, 0));

            //---- lblSign2 ----
            //
            lblSign2.setIcon(new ImageIcon(im.getYES_ICON(32,16)));
            lblSign2.setHorizontalAlignment(SwingConstants.CENTER);
            panelEmail.add(lblSign2, new GridBagConstraints(2, 0, 1, 1, 0.0, 0.0,
                GridBagConstraints.WEST, GridBagConstraints.VERTICAL,
                new Insets(0, 0, 0, 0), 20, 0));
        }
        add(panelEmail);

        //======== panelCode ========
        {
            panelCode.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
            panelCode.setLayout(new GridBagLayout());
            ((GridBagLayout)panelCode.getLayout()).columnWidths = new int[] {124, 0, 0, 0};
            ((GridBagLayout)panelCode.getLayout()).rowHeights = new int[] {0, 0};
            ((GridBagLayout)panelCode.getLayout()).columnWeights = new double[] {1.0, 1.0, 1.0, 1.0E-4};
            ((GridBagLayout)panelCode.getLayout()).rowWeights = new double[] {1.0, 1.0E-4};

            //---- lblCode ----
            lblCode.setText("Invitation code");
            panelCode.add(lblCode, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.0,
                GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                new Insets(0, 10, 0, 10), 0, 0));

            //---- txtCode ----
            txtCode.setMinimumSize(new Dimension(76, 24));
            txtCode.setPreferredSize(new Dimension(110, 24));
            txtCode.setAutoscrolls(false);
            txtCode.setMargin(new Insets(20, 10, 20, 59));
            txtCode.setAlignmentX(28.5F);
            txtCode.setMaximumSize(new Dimension(1000, 24));
            panelCode.add(txtCode, new GridBagConstraints(1, 0, 1, 1, 20.0, 0.0,
                GridBagConstraints.ABOVE_BASELINE, GridBagConstraints.HORIZONTAL,
                new Insets(0, 0, 0, 0), 0, 0));

            //---- lblSign3 ----
            //lblSign3.setIcon(new ImageIcon(im.getNO_ICON(32,32)));
            lblSign3.setHorizontalAlignment(SwingConstants.CENTER);
            panelCode.add(lblSign3, new GridBagConstraints(2, 0, 1, 1, 0.0, 0.0,
                GridBagConstraints.WEST, GridBagConstraints.VERTICAL,
                new Insets(0, 0, 0, 0), 20, 0));
        }
        add(panelCode);

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
            //lblSign4.setIcon(new ImageIcon(im.getNO_ICON(32,32)));
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
            //lblSign5.setIcon(new ImageIcon(im.getNO_ICON(32,32)));
            lblSign5.setHorizontalAlignment(SwingConstants.CENTER);
            panelPassword.add(lblSign5, new GridBagConstraints(2, 0, 1, 1, 0.0, 0.0,
                GridBagConstraints.WEST, GridBagConstraints.VERTICAL,
                new Insets(0, 0, 0, 0), 20, 0));
        }
        add(panelPassword);

        //======== panelConfirmPsw ========
        {
            panelConfirmPsw.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
            panelConfirmPsw.setLayout(new GridBagLayout());
            ((GridBagLayout)panelConfirmPsw.getLayout()).columnWidths = new int[] {124, 0, 0, 0};
            ((GridBagLayout)panelConfirmPsw.getLayout()).rowHeights = new int[] {0, 0};
            ((GridBagLayout)panelConfirmPsw.getLayout()).columnWeights = new double[] {1.0, 1.0, 1.0, 1.0E-4};
            ((GridBagLayout)panelConfirmPsw.getLayout()).rowWeights = new double[] {1.0, 1.0E-4};

            //---- lblConfirmPsw ----
            lblConfirmPsw.setText("Confirm password");
            panelConfirmPsw.add(lblConfirmPsw, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.0,
                GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                new Insets(0, 10, 0, 10), 0, 0));

            //---- txtConfirmPsw ----
            txtConfirmPsw.setMinimumSize(new Dimension(76, 24));
            txtConfirmPsw.setPreferredSize(new Dimension(110, 24));
            txtConfirmPsw.setHorizontalAlignment(SwingConstants.LEFT);
            txtConfirmPsw.setAutoscrolls(false);
            txtConfirmPsw.setMargin(new Insets(20, 10, 20, 59));
            txtConfirmPsw.setAlignmentX(28.5F);
            txtConfirmPsw.setMaximumSize(new Dimension(1000, 24));
            panelConfirmPsw.add(txtConfirmPsw, new GridBagConstraints(1, 0, 1, 1, 20.0, 0.0,
                GridBagConstraints.ABOVE_BASELINE, GridBagConstraints.HORIZONTAL,
                new Insets(0, 0, 0, 0), 0, 0));

            //---- lblSign6 ----
            //lblSign6.setIcon(new ImageIcon(im.getNO_ICON(32,32)));
            lblSign6.setHorizontalAlignment(SwingConstants.CENTER);
            panelConfirmPsw.add(lblSign6, new GridBagConstraints(2, 0, 1, 1, 0.0, 0.0,
                GridBagConstraints.WEST, GridBagConstraints.VERTICAL,
                new Insets(0, 0, 0, 0), 20, 0));
        }
        add(panelConfirmPsw);

        //======== panel1 ========
        {
            panel1.setLayout(new GridBagLayout());
            ((GridBagLayout)panel1.getLayout()).columnWidths = new int[] {0, 0};
            ((GridBagLayout)panel1.getLayout()).rowHeights = new int[] {0, 0};
            ((GridBagLayout)panel1.getLayout()).columnWeights = new double[] {1.0, 1.0E-4};
            ((GridBagLayout)panel1.getLayout()).rowWeights = new double[] {1.0, 1.0E-4};

            //---- btnRegister ----
            btnRegister.setText("Register");
            panel1.add(btnRegister, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.0,
                GridBagConstraints.WEST, GridBagConstraints.NONE,
                new Insets(0, 20, 0, 0), 50, 0));
        }
        add(panel1);

        //---- lblChange ----
        lblChange.setText("<html><u>I already have an account, I want to sign in</u></html> ");
        lblChange.setHorizontalAlignment(SwingConstants.CENTER);
        lblChange.setForeground(Color.blue);
        add(lblChange);
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    public HashMap<String, Object> getData() {
        HashMap<String, Object> uiData = new HashMap<String, Object>();
        uiData.put("LabelAlert", lblAlert);
        uiData.put("ProxyHost", txtProxy);
        uiData.put("LabelImageHostOk", lblSign_Ok);
        uiData.put("LabelImageHostNo", lblSign_No);
        uiData.put("LabelImageHostHidden", lblHidden);
        uiData.put("Email", txtEmail);
        uiData.put("LabelImageMailOk", lblSign_Ok);
        uiData.put("LabelImageMailNo", lblSign_No);
        uiData.put("LabelImageMailHidden", lblHidden);
        uiData.put("InvitationCode", txtCode);
        uiData.put("LabelImageInvitationCodeOk", lblSign_Ok);
        uiData.put("LabelImageInvitationCodeNo", lblSign_No);
        uiData.put("LabelImageInvitationCodeHidden", lblHidden);
        uiData.put("Username", txtUsername);
        uiData.put("LabelImageUsernameOk", lblSign_Ok);
        uiData.put("LabelImageUsernameNo", lblSign_No);
        uiData.put("LabelImageUsernameHidden", lblHidden);
        uiData.put("Password", txtPassword);
        uiData.put("LabelImagePasswordOk", lblSign_Ok);
        uiData.put("LabelImagePasswordNo", lblSign_No);
        uiData.put("LabelImagePasswordHidden", lblHidden);
        uiData.put("ConfirmPassword", txtConfirmPsw);
        uiData.put("LabelImageConfirmPasswordOk", lblSign_Ok);
        uiData.put("LabelImageConfirmPasswordNo", lblSign_No);
        uiData.put("LabelImageConfirmPasswordHidden", lblHidden);
        //mio
        uiData.put("ButtonRegister",btnRegister);

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
    private JPanel panelEmail;
    private JLabel lblEmail;
    private JTextField txtEmail;
    private JLabel lblSign2;
    private JPanel panelCode;
    private JLabel lblCode;
    private JTextField txtCode;
    private JLabel lblSign3;
    private JPanel panelUsername;
    private JLabel lblUsername;
    private JTextField txtUsername;
    private JLabel lblSign4;
    private JPanel panelPassword;
    private JLabel lblPassword;
    private JTextField txtPassword;
    private JLabel lblSign5;
    private JPanel panelConfirmPsw;
    private JLabel lblConfirmPsw;
    private JTextField txtConfirmPsw;
    private JLabel lblSign6;
    private JPanel panel1;
    private JButton btnRegister;
    private JLabel lblChange;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
