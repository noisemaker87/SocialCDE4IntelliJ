/*
 * Created by JFormDesigner on Thu Feb 26 17:53:14 CET 2015
 */

package com.socialcdeIntellij.dynamic.view;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;
import org.jdesktop.swingx.*;

/**
 * @author Davide Rossi
 */
public class DynamicHome extends JPanel {
    public DynamicHome() {
        initComponents();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - Pablo Rossi
        panelInfoUser = new JPanel();
        lblAvatar = new JLabel();
        panelInfo = new JPanel();
        panelSettings = new JPanel();
        lblNickname = new JLabel();
        panelSubSettings = new JPanel();
        lblSkills = new JLabel();
        lblSettings = new JLabel();
        panelInfo2 = new JPanel();
        panelPost = new JPanel();
        lblPosts = new JLabel();
        lblNumPost = new JLabel();
        panelfollowing = new JPanel();
        lblFollowing = new JLabel();
        lblNumFollowing = new JLabel();
        panelFollowers = new JPanel();
        lblFollowers = new JLabel();
        lblNumFollowers = new JLabel();
        scrollPane1 = new JScrollPane();
        panelService = new JPanel();
        panelserviceDemo = new JPanel();
        lblImageService = new JLabel();
        panel2 = new JPanel();
        lblService = new JLabel();
        lblStatus = new JLabel();
        panelserviceDemo2 = new JPanel();
        lblImageService2 = new JLabel();
        panel3 = new JPanel();
        lblService2 = new JLabel();
        lblStatus2 = new JLabel();

        //======== this ========
        setBackground(Color.white);

        // JFormDesigner evaluation mark
        setBorder(new javax.swing.border.CompoundBorder(
            new javax.swing.border.TitledBorder(new javax.swing.border.EmptyBorder(0, 0, 0, 0),
                "JFormDesigner Evaluation", javax.swing.border.TitledBorder.CENTER,
                javax.swing.border.TitledBorder.BOTTOM, new java.awt.Font("Dialog", java.awt.Font.BOLD, 12),
                java.awt.Color.red), getBorder())); addPropertyChangeListener(new java.beans.PropertyChangeListener(){public void propertyChange(java.beans.PropertyChangeEvent e){if("border".equals(e.getPropertyName()))throw new RuntimeException();}});

        setLayout(new VerticalLayout(10));

        //======== panelInfoUser ========
        {
            panelInfoUser.setBackground(Color.white);
            panelInfoUser.setLayout(new FlowLayout(FlowLayout.CENTER, 15, 5));

            //---- lblAvatar ----
            lblAvatar.setIcon(new ImageIcon(getClass().getResource("/images/DefaultAvatar.png")));
            panelInfoUser.add(lblAvatar);

            //======== panelInfo ========
            {
                panelInfo.setBackground(Color.white);
                panelInfo.setLayout(new GridLayout(2, 0, 0, 10));

                //======== panelSettings ========
                {
                    panelSettings.setBackground(Color.white);
                    panelSettings.setLayout(new FlowLayout(FlowLayout.CENTER, 25, 5));

                    //---- lblNickname ----
                    lblNickname.setText("nickname qui");
                    lblNickname.setHorizontalAlignment(SwingConstants.LEFT);
                    panelSettings.add(lblNickname);

                    //======== panelSubSettings ========
                    {
                        panelSubSettings.setBackground(Color.white);
                        panelSubSettings.setLayout(new FlowLayout());

                        //---- lblSkills ----
                        lblSkills.setIcon(new ImageIcon(getClass().getResource("/images/skills.png")));
                        panelSubSettings.add(lblSkills);

                        //---- lblSettings ----
                        lblSettings.setIcon(new ImageIcon(getClass().getResource("/images/settings.png")));
                        panelSubSettings.add(lblSettings);
                    }
                    panelSettings.add(panelSubSettings);
                }
                panelInfo.add(panelSettings);

                //======== panelInfo2 ========
                {
                    panelInfo2.setBackground(Color.white);
                    panelInfo2.setLayout(new GridLayout(1, 3, 10, 0));

                    //======== panelPost ========
                    {
                        panelPost.setBackground(Color.white);
                        panelPost.setBorder(new MatteBorder(0, 0, 0, 1, Color.black));
                        panelPost.setLayout(new GridLayout(2, 1));

                        //---- lblPosts ----
                        lblPosts.setText("Posts");
                        lblPosts.setHorizontalAlignment(SwingConstants.CENTER);
                        panelPost.add(lblPosts);

                        //---- lblNumPost ----
                        lblNumPost.setText("0");
                        lblNumPost.setHorizontalAlignment(SwingConstants.CENTER);
                        panelPost.add(lblNumPost);
                    }
                    panelInfo2.add(panelPost);

                    //======== panelfollowing ========
                    {
                        panelfollowing.setBackground(Color.white);
                        panelfollowing.setLayout(new GridLayout(2, 1));

                        //---- lblFollowing ----
                        lblFollowing.setText("Following");
                        lblFollowing.setHorizontalAlignment(SwingConstants.CENTER);
                        panelfollowing.add(lblFollowing);

                        //---- lblNumFollowing ----
                        lblNumFollowing.setText("1");
                        lblNumFollowing.setHorizontalAlignment(SwingConstants.CENTER);
                        panelfollowing.add(lblNumFollowing);
                    }
                    panelInfo2.add(panelfollowing);

                    //======== panelFollowers ========
                    {
                        panelFollowers.setBackground(Color.white);
                        panelFollowers.setBorder(new MatteBorder(0, 1, 0, 0, Color.black));
                        panelFollowers.setPreferredSize(new Dimension(86, 32));
                        panelFollowers.setLayout(new GridLayout(2, 1));

                        //---- lblFollowers ----
                        lblFollowers.setText("Followers");
                        lblFollowers.setHorizontalAlignment(SwingConstants.CENTER);
                        lblFollowers.setAlignmentX(0.5F);
                        lblFollowers.setHorizontalTextPosition(SwingConstants.CENTER);
                        panelFollowers.add(lblFollowers);

                        //---- lblNumFollowers ----
                        lblNumFollowers.setText("0");
                        lblNumFollowers.setHorizontalAlignment(SwingConstants.CENTER);
                        panelFollowers.add(lblNumFollowers);
                    }
                    panelInfo2.add(panelFollowers);
                }
                panelInfo.add(panelInfo2);
            }
            panelInfoUser.add(panelInfo);
        }
        add(panelInfoUser);

        //======== scrollPane1 ========
        {
            scrollPane1.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

            //======== panelService ========
            {
                panelService.setBackground(Color.white);
                panelService.setLayout(new VerticalLayout(5));

                //======== panelserviceDemo ========
                {
                    panelserviceDemo.setBackground(Color.white);
                    panelserviceDemo.setLayout(new FlowLayout(FlowLayout.LEFT, 30, 10));

                    //---- lblImageService ----
                    lblImageService.setIcon(new ImageIcon(getClass().getResource("/images/DefaultAvatar.png")));
                    panelserviceDemo.add(lblImageService);

                    //======== panel2 ========
                    {
                        panel2.setBackground(Color.white);
                        panel2.setLayout(new VerticalLayout(5));

                        //---- lblService ----
                        lblService.setText("Service");
                        panel2.add(lblService);

                        //---- lblStatus ----
                        lblStatus.setText("Status:");
                        lblStatus.setForeground(Color.red);
                        panel2.add(lblStatus);
                    }
                    panelserviceDemo.add(panel2);
                }
                panelService.add(panelserviceDemo);

                //======== panelserviceDemo2 ========
                {
                    panelserviceDemo2.setBackground(Color.white);
                    panelserviceDemo2.setLayout(new FlowLayout(FlowLayout.LEFT, 30, 10));

                    //---- lblImageService2 ----
                    lblImageService2.setIcon(new ImageIcon(getClass().getResource("/images/DefaultAvatar.png")));
                    panelserviceDemo2.add(lblImageService2);

                    //======== panel3 ========
                    {
                        panel3.setBackground(Color.white);
                        panel3.setLayout(new VerticalLayout(5));

                        //---- lblService2 ----
                        lblService2.setText("Service");
                        panel3.add(lblService2);

                        //---- lblStatus2 ----
                        lblStatus2.setText("Status:");
                        lblStatus2.setForeground(Color.red);
                        panel3.add(lblStatus2);
                    }
                    panelserviceDemo2.add(panel3);
                }
                panelService.add(panelserviceDemo2);
            }
            scrollPane1.setViewportView(panelService);
        }
        add(scrollPane1);
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - Pablo Rossi
    private JPanel panelInfoUser;
    private JLabel lblAvatar;
    private JPanel panelInfo;
    private JPanel panelSettings;
    private JLabel lblNickname;
    private JPanel panelSubSettings;
    private JLabel lblSkills;
    private JLabel lblSettings;
    private JPanel panelInfo2;
    private JPanel panelPost;
    private JLabel lblPosts;
    private JLabel lblNumPost;
    private JPanel panelfollowing;
    private JLabel lblFollowing;
    private JLabel lblNumFollowing;
    private JPanel panelFollowers;
    private JLabel lblFollowers;
    private JLabel lblNumFollowers;
    private JScrollPane scrollPane1;
    private JPanel panelService;
    private JPanel panelserviceDemo;
    private JLabel lblImageService;
    private JPanel panel2;
    private JLabel lblService;
    private JLabel lblStatus;
    private JPanel panelserviceDemo2;
    private JLabel lblImageService2;
    private JPanel panel3;
    private JLabel lblService2;
    private JLabel lblStatus2;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
