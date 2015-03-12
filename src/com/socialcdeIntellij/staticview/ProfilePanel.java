/*
 * Created by JFormDesigner on Mon Feb 23 12:22:55 CET 2015
 */

package com.socialcdeIntellij.staticview;

import com.socialcdeIntellij.dynamicview.*;
import com.socialcdeIntellij.action.ActionGeneral;
import com.socialcdeIntellij.controller.Controller;
import com.socialcdeIntellij.object.ImagesMod;
import org.jdesktop.swingx.VerticalLayout;
import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;
import java.util.HashMap;

/**
 * @author Davide Rossi
 */
public class ProfilePanel extends JPanel {

    private ImagesMod im = new ImagesMod();

    private ActionGeneral listener;


    public ProfilePanel() {
        initComponents();
    }

    private void initComponents()  {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - Pablo Rossi
        panelToolbar = new JPanel();
        lblProfile = new JLabel();
        lblPeople = new JLabel();
        lblHomeTimeline = new JLabel();
        lblIterationTimeline = new JLabel();
        lblInteractiveTimeline = new JLabel();
        lblLogout = new JLabel();
        panelDynamic = new JPanel();

        //======== this ========
        setPreferredSize(new Dimension(400, 650));
        setMinimumSize(new Dimension(400, 650));

        // JFormDesigner evaluation mark
        setBorder(new javax.swing.border.CompoundBorder(
            new javax.swing.border.TitledBorder(new javax.swing.border.EmptyBorder(0, 0, 0, 0),
                "JFormDesigner Evaluation", javax.swing.border.TitledBorder.CENTER,
                javax.swing.border.TitledBorder.BOTTOM, new java.awt.Font("Dialog", java.awt.Font.BOLD, 12),
                java.awt.Color.red), getBorder())); addPropertyChangeListener(new java.beans.PropertyChangeListener(){public void propertyChange(java.beans.PropertyChangeEvent e){if("border".equals(e.getPropertyName()))throw new RuntimeException();}});

        setLayout(new VerticalLayout(2));

        //======== panelToolbar ========
        {
            panelToolbar.setBackground(new Color(204, 204, 204));
            panelToolbar.setLayout(new FlowLayout(FlowLayout.LEFT, 15, 5));

            //---- lblProfile ----
            lblProfile.setIcon(new ImageIcon(getClass().getResource("/images/Toolbar/Profile.png")));
            lblProfile.setToolTipText("Profile");
            lblProfile.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
            lblProfile.setName("lblProfile");
            panelToolbar.add(lblProfile);

            //---- lblPeople ----
            lblPeople.setIcon(new ImageIcon(getClass().getResource("/images/Toolbar/People.png")));
            lblPeople.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
            lblPeople.setName("lblPeople");
            lblPeople.setToolTipText("People");
            panelToolbar.add(lblPeople);

            //---- lblHomeTimeline ----
            lblHomeTimeline.setIcon(new ImageIcon(getClass().getResource("/images/Toolbar/Home.png")));
            lblHomeTimeline.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
            lblHomeTimeline.setName("lblHomeTimeline");
            lblHomeTimeline.setToolTipText("Home Timeline");
            panelToolbar.add(lblHomeTimeline);

            //---- lblIterationTimeline ----
            lblIterationTimeline.setIcon(new ImageIcon(getClass().getResource("/images/Toolbar/IterationTimeline.png")));
            lblIterationTimeline.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
            lblIterationTimeline.setToolTipText("Iteration Timeline");
            lblIterationTimeline.setName("lblIterationTimeline");
            panelToolbar.add(lblIterationTimeline);

            //---- lblInteractiveTimeline ----
            lblInteractiveTimeline.setIcon(new ImageIcon(getClass().getResource("/images/Toolbar/InteractiveTimeline.png")));
            lblInteractiveTimeline.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
            lblInteractiveTimeline.setName("lblInteractiveTimeline");
            lblInteractiveTimeline.setToolTipText("Interactive Timeline");
            panelToolbar.add(lblInteractiveTimeline);

            //---- lblLogout ----
            lblLogout.setIcon(new ImageIcon(getClass().getResource("/images/Toolbar/Logout.png")));
            lblLogout.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
            lblLogout.setToolTipText("Logout");
            lblLogout.setName("lblLogout");
            panelToolbar.add(lblLogout);
        }
        add(panelToolbar);

        //======== panelDynamic ========
        {
            panelDynamic.setBackground(Color.white);
            panelDynamic.setPreferredSize(new Dimension(400, 800));
            panelDynamic.setBorder(new BevelBorder(BevelBorder.LOWERED));
            panelDynamic.setMinimumSize(new Dimension(400, 800));
            panelDynamic.setLayout(new VerticalLayout(15));
        }
        add(panelDynamic);
        // JFormDesigner - End of component initialization  //GEN-END:initComponents

        listener = new ActionGeneral();

        lblProfile.addMouseListener(listener);
        lblPeople.addMouseListener(listener);
        lblHomeTimeline.addMouseListener(listener);
        lblIterationTimeline.addMouseListener(listener);
        lblInteractiveTimeline.addMouseListener(listener);
        lblLogout.addMouseListener(listener);

        //Controller.selectDynamicWindow(0);
        panelDynamic.add(Controller.getHomePanel());
    }


    public JPanel getDynamic() {
        return panelDynamic;
    }

    public void setDynamic(JPanel panelDynamic) {
        this.panelDynamic = panelDynamic;
    }



    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - Pablo Rossi
    private JPanel panelToolbar;
    private JLabel lblProfile;
    private JLabel lblPeople;
    private JLabel lblHomeTimeline;
    private JLabel lblIterationTimeline;
    private JLabel lblInteractiveTimeline;
    private JLabel lblLogout;
    private JPanel panelDynamic;
    // JFormDesigner - End of variables declaration  //GEN-END:variables


    public HashMap<String, Object> getData() {
        HashMap<String, Object> uiData = new HashMap<String, Object>();
        uiData.put("LabelProfile", lblProfile);
        uiData.put("LabelPeople", lblPeople);
        uiData.put("LabelHomeTimeline",lblHomeTimeline);
        uiData.put("LabelIterationTimeline", lblIterationTimeline);
        uiData.put("LabelInteractiveTimeline",lblInteractiveTimeline);
        uiData.put("LabelLogout", lblLogout);

        /*uiData.put("LabelUsername",lblNickname);
        uiData.put("LabelAvatar", lblAvatar);
        uiData.put("LabelN_Post",lblNumPost);
        uiData.put("LabelN_Following", lblNumFollowing);
        uiData.put("LabelN_Followers",lblNumFollowers);
        uiData.put("LabelSkills", lblSkills);
        uiData.put("LabelSettings",lblSettings);*/

        return uiData;
    }
}
