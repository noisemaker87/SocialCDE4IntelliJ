/*
 * Created by JFormDesigner on Mon Mar 16 12:30:48 CET 2015
 */

package com.socialcdeIntellij.object;

import java.awt.*;
import javax.swing.*;
import com.intellij.uiDesigner.core.*;
import com.socialcdeIntellij.shared.library.WService;
import org.jdesktop.swingx.*;

/**
 * @author Pablo Rossi
 */
public class ButtonService extends JPanel {
    WService wService = null;

    public WService getwService() {
        return wService;
    }

    public void setwService(WService wService) {
        this.wService = wService;
    }

    public ButtonService() {
        initComponents();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - Pablo Rossi
        panel1 = new JPanel();
        btnService = new GeneralButton();
        panel3 = new JPanel();
        panel2 = new JPanel();
        lblService = new JLabel();
        lblServiceStatus = new JLabel();

        //======== this ========
        setBackground(Color.white);
        setName("btnService");

        setLayout(new HorizontalLayout(20));

        //======== panel1 ========
        {
            panel1.setBackground(Color.white);
            panel1.setLayout(new GridLayoutManager(1, 1, new Insets(0, 0, 0, 0), 0, 0));

            //---- btnService ----
            btnService.setPreferredSize(new Dimension(70, 70));
            btnService.setName("btnService");
            btnService.setActionCommand("btnService");
            btnService.setIcon(new ImageIcon(getClass().getResource("/images/Hide.png")));
            btnService.setBackground(Color.white);
            panel1.add(btnService, new GridConstraints(0, 0, 1, 1,
                GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE,
                GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                null, null, null));
        }
        add(panel1);

        //======== panel3 ========
        {
            panel3.setBackground(Color.white);
            panel3.setLayout(new GridBagLayout());
            ((GridBagLayout)panel3.getLayout()).columnWidths = new int[] {0, 0};
            ((GridBagLayout)panel3.getLayout()).rowHeights = new int[] {0, 0};
            ((GridBagLayout)panel3.getLayout()).columnWeights = new double[] {0.0, 1.0E-4};
            ((GridBagLayout)panel3.getLayout()).rowWeights = new double[] {1.0, 1.0E-4};

            //======== panel2 ========
            {
                panel2.setBackground(Color.white);
                panel2.setLayout(new VerticalLayout(10));

                //---- lblService ----
                lblService.setText("Service");
                lblService.setName("lblService");
                panel2.add(lblService);

                //---- lblServiceStatus ----
                lblServiceStatus.setText("Status:");
                lblServiceStatus.setName("lblServiceStatus");
                panel2.add(lblServiceStatus);
            }
            panel3.add(panel2, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.0,
                GridBagConstraints.CENTER, GridBagConstraints.HORIZONTAL,
                new Insets(0, 0, 0, 0), 0, 0));
        }
        add(panel3);
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }


    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - Pablo Rossi
    private JPanel panel1;
    private GeneralButton btnService;
    private JPanel panel3;
    private JPanel panel2;
    private JLabel lblService;
    private JLabel lblServiceStatus;
    // JFormDesigner - End of variables declaration  //GEN-END:variables

    public void setImage(Image img){
        btnService.setIcon(new ImageIcon(img));
    }

    public void setServiceName(String name){
        lblService.setText(name);
    }

    public void setServiceStatus(boolean bool){

        if(bool == true) {
            lblServiceStatus.setText("Status: Registered");
            lblServiceStatus.setForeground(Color.GREEN);
        }
        else{
            lblServiceStatus.setText("Status: Not Registered");
            lblServiceStatus.setForeground(Color.RED);
        }

    }

    public GeneralButton getButton(){return btnService;}


}
