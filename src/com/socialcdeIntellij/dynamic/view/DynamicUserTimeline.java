/*
 * Created by JFormDesigner on Fri Feb 27 12:57:28 CET 2015
 */

package com.socialcdeIntellij.dynamic.view;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;
import org.jdesktop.swingx.*;

/**
 * @author Davide Rossi
 */
public class DynamicUserTimeline extends JPanel {
    public DynamicUserTimeline() {
        initComponents();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - Davide Rossi
        panelProfile = new JPanel();
        lblReturn = new JLabel();
        lblAvatar = new JLabel();
        panelInfo = new JPanel();
        panelSettings = new JPanel();
        lblNickname = new JLabel();
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
        panelIcon = new JPanel();
        lblFollow = new JLabel();
        lblSkill = new JLabel();
        lblHide = new JLabel();
        scrollPane1 = new JScrollPane();
        panelDynamic = new JPanel();

        //======== this ========
        setPreferredSize(new Dimension(450, 600));

        // JFormDesigner evaluation mark
        setBorder(new javax.swing.border.CompoundBorder(
            new javax.swing.border.TitledBorder(new javax.swing.border.EmptyBorder(0, 0, 0, 0),
                "JFormDesigner Evaluation", javax.swing.border.TitledBorder.CENTER,
                javax.swing.border.TitledBorder.BOTTOM, new java.awt.Font("Dialog", java.awt.Font.BOLD, 12),
                java.awt.Color.red), getBorder())); addPropertyChangeListener(new java.beans.PropertyChangeListener(){public void propertyChange(java.beans.PropertyChangeEvent e){if("border".equals(e.getPropertyName()))throw new RuntimeException();}});

        setLayout(new VerticalLayout());

        //======== panelProfile ========
        {
            panelProfile.setBackground(Color.white);
            panelProfile.setLayout(new FlowLayout(FlowLayout.LEFT));

            //---- lblReturn ----
            lblReturn.setIcon(new ImageIcon("D:\\workspaceIntelliJ\\IntelliJPlugin\\images\\Toolbar\\Back.png"));
            lblReturn.setBackground(new Color(204, 204, 204));
            panelProfile.add(lblReturn);

            //---- lblAvatar ----
            lblAvatar.setIcon(new ImageIcon("D:\\workspaceIntelliJ\\IntelliJPlugin\\images\\DefaultAvatar.png"));
            panelProfile.add(lblAvatar);

            //======== panelInfo ========
            {
                panelInfo.setBackground(Color.white);
                panelInfo.setLayout(new GridLayout(2, 0, 0, 10));

                //======== panelSettings ========
                {
                    panelSettings.setBackground(Color.white);
                    panelSettings.setLayout(new FlowLayout(FlowLayout.LEFT, 25, 5));

                    //---- lblNickname ----
                    lblNickname.setText("nickname qui");
                    lblNickname.setHorizontalAlignment(SwingConstants.LEFT);
                    panelSettings.add(lblNickname);
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
            panelProfile.add(panelInfo);
        }
        add(panelProfile);

        //======== panelIcon ========
        {
            panelIcon.setBackground(Color.white);
            panelIcon.setLayout(new FlowLayout(FlowLayout.LEFT, 25, 5));

            //---- lblFollow ----
            lblFollow.setIcon(new ImageIcon("D:\\workspaceIntelliJ\\IntelliJPlugin\\images\\Follow.png"));
            panelIcon.add(lblFollow);

            //---- lblSkill ----
            lblSkill.setIcon(new ImageIcon("D:\\workspaceIntelliJ\\IntelliJPlugin\\images\\skills.png"));
            panelIcon.add(lblSkill);

            //---- lblHide ----
            lblHide.setIcon(new ImageIcon("D:\\workspaceIntelliJ\\IntelliJPlugin\\images\\Hide.png"));
            panelIcon.add(lblHide);
        }
        add(panelIcon);

        //======== scrollPane1 ========
        {

            //======== panelDynamic ========
            {
                panelDynamic.setBackground(Color.white);
                panelDynamic.setPreferredSize(new Dimension(400, 800));
                panelDynamic.setBorder(new BevelBorder(BevelBorder.LOWERED));
                panelDynamic.setMinimumSize(new Dimension(400, 800));
                panelDynamic.setLayout(new VerticalLayout(15));
            }
            scrollPane1.setViewportView(panelDynamic);
        }
        add(scrollPane1);
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - Davide Rossi
    private JPanel panelProfile;
    private JLabel lblReturn;
    private JLabel lblAvatar;
    private JPanel panelInfo;
    private JPanel panelSettings;
    private JLabel lblNickname;
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
    private JPanel panelIcon;
    private JLabel lblFollow;
    private JLabel lblSkill;
    private JLabel lblHide;
    private JScrollPane scrollPane1;
    private JPanel panelDynamic;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
