/*
 * Created by JFormDesigner on Tue Mar 17 18:27:11 CET 2015
 */

package com.socialcdeIntellij.popup;

import java.awt.*;
import javax.swing.*;

import com.socialcdeIntellij.shared.library.WOAuthData;
import com.socialcdeIntellij.shared.library.WService;
import org.jdesktop.swingx.*;

/**
 * @author Pablo Rossi
 */
public class PinWindow extends JDialog {

    private WService service;
    private WOAuthData oauthData;

    public PinWindow(JFrame frame) {

    }

    public WService getService() {
        return service;
    }

    public JButton getBtnOk() {
        return btnOk;
    }

    public JButton getBtnCancel() {
        return btnCancel;
    }

    public void setService(WService service) {
        this.service = service;
    }

    public WOAuthData getOauthData() {
        return oauthData;
    }

    public void setOauthData(WOAuthData oauthData) {
        this.oauthData = oauthData;
    }

    public PinWindow() {
        initComponents();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - Pablo Rossi
        lblPin = new JLabel();
        txtPin = new JTextField();
        panel1 = new JPanel();
        btnOk = new JButton();
        btnCancel = new JButton();

        //======== this ========
        Container contentPane = getContentPane();
        contentPane.setLayout(new VerticalLayout(10));

        //---- lblPin ----
        lblPin.setText("Inserisci il PIN:");
        lblPin.setName("lblPin");
        contentPane.add(lblPin);

        //---- txtPin ----
        txtPin.setName("txtPin");
        contentPane.add(txtPin);

        //======== panel1 ========
        {

            // JFormDesigner evaluation mark
            panel1.setBorder(new javax.swing.border.CompoundBorder(
                new javax.swing.border.TitledBorder(new javax.swing.border.EmptyBorder(0, 0, 0, 0),
                    "JFormDesigner Evaluation", javax.swing.border.TitledBorder.CENTER,
                    javax.swing.border.TitledBorder.BOTTOM, new java.awt.Font("Dialog", java.awt.Font.BOLD, 12),
                    java.awt.Color.red), panel1.getBorder())); panel1.addPropertyChangeListener(new java.beans.PropertyChangeListener(){public void propertyChange(java.beans.PropertyChangeEvent e){if("border".equals(e.getPropertyName()))throw new RuntimeException();}});

            panel1.setLayout(new FlowLayout());

            //---- btnOk ----
            btnOk.setText("Ok");
            btnOk.setActionCommand("btnOk");
            btnOk.setPreferredSize(new Dimension(66, 32));
            panel1.add(btnOk);

            //---- btnCancel ----
            btnCancel.setText("Cancel");
            btnCancel.setActionCommand("btnCancel");
            panel1.add(btnCancel);
        }
        contentPane.add(panel1);
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - Pablo Rossi
    private JLabel lblPin;
    private JTextField txtPin;
    private JPanel panel1;
    private JButton btnOk;
    private JButton btnCancel;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
