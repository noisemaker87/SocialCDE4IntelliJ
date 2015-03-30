/*
 * Created by JFormDesigner on Mon Mar 30 10:11:16 CEST 2015
 */

package com.socialcdeIntellij.dynamicview;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;
import org.jdesktop.swingx.*;

/**
 * @author Pablo Rossi
 */
public class UserPanel extends JPanel {
    public UserPanel() {
        initComponents();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - David Rossi
        panelProfile = new JPanel();
        lblReturn = new JLabel();
        lblAvatar = new JLabel();
        panelInfo = new JPanel();
        panelSup = new JPanel();
        lblUsername = new JLabel();
        lblFollow = new JLabel();
        lblSkill = new JLabel();
        lblHide = new JLabel();
        panelInf = new JPanel();
        panelPost = new JPanel();
        lblPost = new JLabel();
        lblNumPost = new JLabel();
        panelFollowing = new JPanel();
        lblFollowing = new JLabel();
        lblNumFollowing = new JLabel();
        panelFollowers = new JPanel();
        lblFollowers = new JLabel();
        lblNumFollowers = new JLabel();
        panelTimeline = new JPanel();

        //======== this ========

        // JFormDesigner evaluation mark
        setBorder(new javax.swing.border.CompoundBorder(
            new javax.swing.border.TitledBorder(new javax.swing.border.EmptyBorder(0, 0, 0, 0),
                "JFormDesigner Evaluation", javax.swing.border.TitledBorder.CENTER,
                javax.swing.border.TitledBorder.BOTTOM, new java.awt.Font("Dialog", java.awt.Font.BOLD, 12),
                java.awt.Color.red), getBorder())); addPropertyChangeListener(new java.beans.PropertyChangeListener(){public void propertyChange(java.beans.PropertyChangeEvent e){if("border".equals(e.getPropertyName()))throw new RuntimeException();}});

        setLayout(new VerticalLayout(2));

        //======== panelProfile ========
        {
            panelProfile.setLayout(new HorizontalLayout(5));

            //---- lblReturn ----
            lblReturn.setIcon(new ImageIcon(getClass().getResource("/images/Toolbar/Back.png")));
            panelProfile.add(lblReturn);

            //---- lblAvatar ----
            lblAvatar.setIcon(null);
            panelProfile.add(lblAvatar);

            //======== panelInfo ========
            {
                panelInfo.setLayout(new VerticalLayout(2));

                //======== panelSup ========
                {
                    panelSup.setLayout(new HorizontalLayout());

                    //---- lblUsername ----
                    lblUsername.setText("username");
                    panelSup.add(lblUsername);

                    //---- lblFollow ----
                    lblFollow.setIcon(new ImageIcon(getClass().getResource("/images/Follow.png")));
                    panelSup.add(lblFollow);

                    //---- lblSkill ----
                    lblSkill.setIcon(new ImageIcon(getClass().getResource("/images/skills.png")));
                    panelSup.add(lblSkill);

                    //---- lblHide ----
                    lblHide.setIcon(new ImageIcon(getClass().getResource("/images/Hide.png")));
                    panelSup.add(lblHide);
                }
                panelInfo.add(panelSup);

                //======== panelInf ========
                {
                    panelInf.setLayout(new HorizontalLayout(10));

                    //======== panelPost ========
                    {
                        panelPost.setBorder(new MatteBorder(0, 0, 0, 1, Color.black));
                        panelPost.setLayout(new VerticalLayout(2));

                        //---- lblPost ----
                        lblPost.setText("Posts");
                        lblPost.setHorizontalAlignment(SwingConstants.CENTER);
                        panelPost.add(lblPost);

                        //---- lblNumPost ----
                        lblNumPost.setText("0");
                        lblNumPost.setHorizontalAlignment(SwingConstants.CENTER);
                        panelPost.add(lblNumPost);
                    }
                    panelInf.add(panelPost);

                    //======== panelFollowing ========
                    {
                        panelFollowing.setLayout(new VerticalLayout(2));

                        //---- lblFollowing ----
                        lblFollowing.setText("Following");
                        panelFollowing.add(lblFollowing);

                        //---- lblNumFollowing ----
                        lblNumFollowing.setText("0");
                        lblNumFollowing.setHorizontalAlignment(SwingConstants.CENTER);
                        panelFollowing.add(lblNumFollowing);
                    }
                    panelInf.add(panelFollowing);

                    //======== panelFollowers ========
                    {
                        panelFollowers.setBorder(new MatteBorder(0, 1, 0, 0, Color.black));
                        panelFollowers.setLayout(new VerticalLayout(2));

                        //---- lblFollowers ----
                        lblFollowers.setText("Followers");
                        panelFollowers.add(lblFollowers);

                        //---- lblNumFollowers ----
                        lblNumFollowers.setText("0");
                        lblNumFollowers.setHorizontalAlignment(SwingConstants.CENTER);
                        panelFollowers.add(lblNumFollowers);
                    }
                    panelInf.add(panelFollowers);
                }
                panelInfo.add(panelInf);
            }
            panelProfile.add(panelInfo);
        }
        add(panelProfile);

        //======== panelTimeline ========
        {
            panelTimeline.setLayout(new VerticalLayout(1));
        }
        add(panelTimeline);
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - David Rossi
    private JPanel panelProfile;
    private JLabel lblReturn;
    private JLabel lblAvatar;
    private JPanel panelInfo;
    private JPanel panelSup;
    private JLabel lblUsername;
    private JLabel lblFollow;
    private JLabel lblSkill;
    private JLabel lblHide;
    private JPanel panelInf;
    private JPanel panelPost;
    private JLabel lblPost;
    private JLabel lblNumPost;
    private JPanel panelFollowing;
    private JLabel lblFollowing;
    private JLabel lblNumFollowing;
    private JPanel panelFollowers;
    private JLabel lblFollowers;
    private JLabel lblNumFollowers;
    private JPanel panelTimeline;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
