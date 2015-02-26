/*
 * Created by JFormDesigner on Thu Feb 26 18:23:02 CET 2015
 */

package com.socialcdeIntellij.dynamic.view;

import java.awt.*;
import javax.swing.*;
import org.jdesktop.swingx.*;

/**
 * @author Davide Rossi
 */
public class DynamicPeople extends JScrollPane {
    public DynamicPeople() {
        initComponents();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - Davide Rossi
        panelPeople = new JPanel();
        panelSuggestions = new JPanel();
        lblSuggestions = new JLabel();
        User1 = new JPanel();
        lblImgUser = new JLabel();
        lblNickUser = new JLabel();
        panel2 = new JPanel();
        lblOther = new JLabel();
        User2 = new JPanel();
        lblImgUser2 = new JLabel();
        lblNickUser2 = new JLabel();
        panel4 = new JPanel();
        lblOther2 = new JLabel();
        User3 = new JPanel();
        lblImgUser3 = new JLabel();
        lblNickUser3 = new JLabel();
        panel6 = new JPanel();
        lblOther3 = new JLabel();
        User4 = new JPanel();
        lblImgUser4 = new JLabel();
        lblNickUser4 = new JLabel();
        panel8 = new JPanel();
        lblOther4 = new JLabel();
        User5 = new JPanel();
        lblImgUser5 = new JLabel();
        lblNickUser5 = new JLabel();
        panel10 = new JPanel();
        lblOther5 = new JLabel();
        panelFollowings = new JPanel();
        lblFollowings = new JLabel();
        User6 = new JPanel();
        lblImgUser6 = new JLabel();
        lblNickUser6 = new JLabel();
        panel14 = new JPanel();
        lblOther6 = new JLabel();
        User7 = new JPanel();
        lblImgUser7 = new JLabel();
        lblNickUser7 = new JLabel();
        panel16 = new JPanel();
        lblOther7 = new JLabel();
        User8 = new JPanel();
        lblImgUser8 = new JLabel();
        lblNickUser8 = new JLabel();
        panel18 = new JPanel();
        lblOther8 = new JLabel();
        User9 = new JPanel();
        lblImgUser9 = new JLabel();
        lblNickUser9 = new JLabel();
        panel20 = new JPanel();
        lblOther9 = new JLabel();
        User10 = new JPanel();
        lblImgUser10 = new JLabel();
        lblNickUser10 = new JLabel();
        panel22 = new JPanel();
        lblOther10 = new JLabel();

        //======== this ========

        //======== panelPeople ========
        {

            // JFormDesigner evaluation mark
            panelPeople.setBorder(new javax.swing.border.CompoundBorder(
                new javax.swing.border.TitledBorder(new javax.swing.border.EmptyBorder(0, 0, 0, 0),
                    "JFormDesigner Evaluation", javax.swing.border.TitledBorder.CENTER,
                    javax.swing.border.TitledBorder.BOTTOM, new java.awt.Font("Dialog", java.awt.Font.BOLD, 12),
                    java.awt.Color.red), panelPeople.getBorder())); panelPeople.addPropertyChangeListener(new java.beans.PropertyChangeListener(){public void propertyChange(java.beans.PropertyChangeEvent e){if("border".equals(e.getPropertyName()))throw new RuntimeException();}});

            panelPeople.setLayout(new VerticalLayout(2));

            //======== panelSuggestions ========
            {
                panelSuggestions.setLayout(new VerticalLayout());

                //---- lblSuggestions ----
                lblSuggestions.setText("Suggestions");
                lblSuggestions.setFont(new Font("Dialog", Font.BOLD, 18));
                panelSuggestions.add(lblSuggestions);

                //======== User1 ========
                {
                    User1.setLayout(new FlowLayout(FlowLayout.LEFT, 15, 5));

                    //---- lblImgUser ----
                    lblImgUser.setIcon(new ImageIcon("D:\\workspaceIntelliJ\\SocialCDEplugin\\images\\DefaultAvatar.png"));
                    User1.add(lblImgUser);

                    //---- lblNickUser ----
                    lblNickUser.setText("nicname user");
                    User1.add(lblNickUser);

                    //======== panel2 ========
                    {
                        panel2.setPreferredSize(new Dimension(100, 32));
                        panel2.setLayout(new BorderLayout(10, 0));

                        //---- lblOther ----
                        lblOther.setIcon(new ImageIcon("D:\\workspaceIntelliJ\\SocialCDEplugin\\images\\Toolbar\\Next.png"));
                        lblOther.setHorizontalAlignment(SwingConstants.RIGHT);
                        panel2.add(lblOther, BorderLayout.CENTER);
                    }
                    User1.add(panel2);
                }
                panelSuggestions.add(User1);

                //======== User2 ========
                {
                    User2.setLayout(new FlowLayout(FlowLayout.LEFT, 15, 5));

                    //---- lblImgUser2 ----
                    lblImgUser2.setIcon(new ImageIcon("D:\\workspaceIntelliJ\\SocialCDEplugin\\images\\DefaultAvatar.png"));
                    User2.add(lblImgUser2);

                    //---- lblNickUser2 ----
                    lblNickUser2.setText("nicname user");
                    User2.add(lblNickUser2);

                    //======== panel4 ========
                    {
                        panel4.setPreferredSize(new Dimension(100, 32));
                        panel4.setLayout(new BorderLayout(10, 0));

                        //---- lblOther2 ----
                        lblOther2.setIcon(new ImageIcon("D:\\workspaceIntelliJ\\SocialCDEplugin\\images\\Toolbar\\Next.png"));
                        lblOther2.setHorizontalAlignment(SwingConstants.RIGHT);
                        panel4.add(lblOther2, BorderLayout.CENTER);
                    }
                    User2.add(panel4);
                }
                panelSuggestions.add(User2);

                //======== User3 ========
                {
                    User3.setLayout(new FlowLayout(FlowLayout.LEFT, 15, 5));

                    //---- lblImgUser3 ----
                    lblImgUser3.setIcon(new ImageIcon("D:\\workspaceIntelliJ\\SocialCDEplugin\\images\\DefaultAvatar.png"));
                    User3.add(lblImgUser3);

                    //---- lblNickUser3 ----
                    lblNickUser3.setText("nicname user");
                    User3.add(lblNickUser3);

                    //======== panel6 ========
                    {
                        panel6.setPreferredSize(new Dimension(100, 32));
                        panel6.setLayout(new BorderLayout(10, 0));

                        //---- lblOther3 ----
                        lblOther3.setIcon(new ImageIcon("D:\\workspaceIntelliJ\\SocialCDEplugin\\images\\Toolbar\\Next.png"));
                        lblOther3.setHorizontalAlignment(SwingConstants.RIGHT);
                        panel6.add(lblOther3, BorderLayout.CENTER);
                    }
                    User3.add(panel6);
                }
                panelSuggestions.add(User3);

                //======== User4 ========
                {
                    User4.setLayout(new FlowLayout(FlowLayout.LEFT, 15, 5));

                    //---- lblImgUser4 ----
                    lblImgUser4.setIcon(new ImageIcon("D:\\workspaceIntelliJ\\SocialCDEplugin\\images\\DefaultAvatar.png"));
                    User4.add(lblImgUser4);

                    //---- lblNickUser4 ----
                    lblNickUser4.setText("nicname user");
                    User4.add(lblNickUser4);

                    //======== panel8 ========
                    {
                        panel8.setPreferredSize(new Dimension(100, 32));
                        panel8.setLayout(new BorderLayout(10, 0));

                        //---- lblOther4 ----
                        lblOther4.setIcon(new ImageIcon("D:\\workspaceIntelliJ\\SocialCDEplugin\\images\\Toolbar\\Next.png"));
                        lblOther4.setHorizontalAlignment(SwingConstants.RIGHT);
                        panel8.add(lblOther4, BorderLayout.CENTER);
                    }
                    User4.add(panel8);
                }
                panelSuggestions.add(User4);

                //======== User5 ========
                {
                    User5.setLayout(new FlowLayout(FlowLayout.LEFT, 15, 5));

                    //---- lblImgUser5 ----
                    lblImgUser5.setIcon(new ImageIcon("D:\\workspaceIntelliJ\\SocialCDEplugin\\images\\DefaultAvatar.png"));
                    User5.add(lblImgUser5);

                    //---- lblNickUser5 ----
                    lblNickUser5.setText("nicname user");
                    User5.add(lblNickUser5);

                    //======== panel10 ========
                    {
                        panel10.setPreferredSize(new Dimension(100, 32));
                        panel10.setLayout(new BorderLayout(10, 0));

                        //---- lblOther5 ----
                        lblOther5.setIcon(new ImageIcon("D:\\workspaceIntelliJ\\SocialCDEplugin\\images\\Toolbar\\Next.png"));
                        lblOther5.setHorizontalAlignment(SwingConstants.RIGHT);
                        panel10.add(lblOther5, BorderLayout.CENTER);
                    }
                    User5.add(panel10);
                }
                panelSuggestions.add(User5);
            }
            panelPeople.add(panelSuggestions);

            //======== panelFollowings ========
            {
                panelFollowings.setLayout(new VerticalLayout());

                //---- lblFollowings ----
                lblFollowings.setText("Followings");
                lblFollowings.setFont(new Font("Dialog", Font.BOLD, 18));
                panelFollowings.add(lblFollowings);

                //======== User6 ========
                {
                    User6.setLayout(new FlowLayout(FlowLayout.LEFT, 15, 5));

                    //---- lblImgUser6 ----
                    lblImgUser6.setIcon(new ImageIcon("D:\\workspaceIntelliJ\\SocialCDEplugin\\images\\DefaultAvatar.png"));
                    User6.add(lblImgUser6);

                    //---- lblNickUser6 ----
                    lblNickUser6.setText("nicname user");
                    User6.add(lblNickUser6);

                    //======== panel14 ========
                    {
                        panel14.setPreferredSize(new Dimension(100, 32));
                        panel14.setLayout(new BorderLayout(10, 0));

                        //---- lblOther6 ----
                        lblOther6.setIcon(new ImageIcon("D:\\workspaceIntelliJ\\SocialCDEplugin\\images\\Toolbar\\Next.png"));
                        lblOther6.setHorizontalAlignment(SwingConstants.RIGHT);
                        panel14.add(lblOther6, BorderLayout.CENTER);
                    }
                    User6.add(panel14);
                }
                panelFollowings.add(User6);

                //======== User7 ========
                {
                    User7.setLayout(new FlowLayout(FlowLayout.LEFT, 15, 5));

                    //---- lblImgUser7 ----
                    lblImgUser7.setIcon(new ImageIcon("D:\\workspaceIntelliJ\\SocialCDEplugin\\images\\DefaultAvatar.png"));
                    User7.add(lblImgUser7);

                    //---- lblNickUser7 ----
                    lblNickUser7.setText("nicname user");
                    User7.add(lblNickUser7);

                    //======== panel16 ========
                    {
                        panel16.setPreferredSize(new Dimension(100, 32));
                        panel16.setLayout(new BorderLayout(10, 0));

                        //---- lblOther7 ----
                        lblOther7.setIcon(new ImageIcon("D:\\workspaceIntelliJ\\SocialCDEplugin\\images\\Toolbar\\Next.png"));
                        lblOther7.setHorizontalAlignment(SwingConstants.RIGHT);
                        panel16.add(lblOther7, BorderLayout.CENTER);
                    }
                    User7.add(panel16);
                }
                panelFollowings.add(User7);

                //======== User8 ========
                {
                    User8.setLayout(new FlowLayout(FlowLayout.LEFT, 15, 5));

                    //---- lblImgUser8 ----
                    lblImgUser8.setIcon(new ImageIcon("D:\\workspaceIntelliJ\\SocialCDEplugin\\images\\DefaultAvatar.png"));
                    User8.add(lblImgUser8);

                    //---- lblNickUser8 ----
                    lblNickUser8.setText("nicname user");
                    User8.add(lblNickUser8);

                    //======== panel18 ========
                    {
                        panel18.setPreferredSize(new Dimension(100, 32));
                        panel18.setLayout(new BorderLayout(10, 0));

                        //---- lblOther8 ----
                        lblOther8.setIcon(new ImageIcon("D:\\workspaceIntelliJ\\SocialCDEplugin\\images\\Toolbar\\Next.png"));
                        lblOther8.setHorizontalAlignment(SwingConstants.RIGHT);
                        panel18.add(lblOther8, BorderLayout.CENTER);
                    }
                    User8.add(panel18);
                }
                panelFollowings.add(User8);

                //======== User9 ========
                {
                    User9.setLayout(new FlowLayout(FlowLayout.LEFT, 15, 5));

                    //---- lblImgUser9 ----
                    lblImgUser9.setIcon(new ImageIcon("D:\\workspaceIntelliJ\\SocialCDEplugin\\images\\DefaultAvatar.png"));
                    User9.add(lblImgUser9);

                    //---- lblNickUser9 ----
                    lblNickUser9.setText("nicname user");
                    User9.add(lblNickUser9);

                    //======== panel20 ========
                    {
                        panel20.setPreferredSize(new Dimension(100, 32));
                        panel20.setLayout(new BorderLayout(10, 0));

                        //---- lblOther9 ----
                        lblOther9.setIcon(new ImageIcon("D:\\workspaceIntelliJ\\SocialCDEplugin\\images\\Toolbar\\Next.png"));
                        lblOther9.setHorizontalAlignment(SwingConstants.RIGHT);
                        panel20.add(lblOther9, BorderLayout.CENTER);
                    }
                    User9.add(panel20);
                }
                panelFollowings.add(User9);

                //======== User10 ========
                {
                    User10.setLayout(new FlowLayout(FlowLayout.LEFT, 15, 5));

                    //---- lblImgUser10 ----
                    lblImgUser10.setIcon(new ImageIcon("D:\\workspaceIntelliJ\\SocialCDEplugin\\images\\DefaultAvatar.png"));
                    User10.add(lblImgUser10);

                    //---- lblNickUser10 ----
                    lblNickUser10.setText("nicname user");
                    User10.add(lblNickUser10);

                    //======== panel22 ========
                    {
                        panel22.setPreferredSize(new Dimension(100, 32));
                        panel22.setLayout(new BorderLayout(10, 0));

                        //---- lblOther10 ----
                        lblOther10.setIcon(new ImageIcon("D:\\workspaceIntelliJ\\SocialCDEplugin\\images\\Toolbar\\Next.png"));
                        lblOther10.setHorizontalAlignment(SwingConstants.RIGHT);
                        panel22.add(lblOther10, BorderLayout.CENTER);
                    }
                    User10.add(panel22);
                }
                panelFollowings.add(User10);
            }
            panelPeople.add(panelFollowings);
        }
        setViewportView(panelPeople);
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - Davide Rossi
    private JPanel panelPeople;
    private JPanel panelSuggestions;
    private JLabel lblSuggestions;
    private JPanel User1;
    private JLabel lblImgUser;
    private JLabel lblNickUser;
    private JPanel panel2;
    private JLabel lblOther;
    private JPanel User2;
    private JLabel lblImgUser2;
    private JLabel lblNickUser2;
    private JPanel panel4;
    private JLabel lblOther2;
    private JPanel User3;
    private JLabel lblImgUser3;
    private JLabel lblNickUser3;
    private JPanel panel6;
    private JLabel lblOther3;
    private JPanel User4;
    private JLabel lblImgUser4;
    private JLabel lblNickUser4;
    private JPanel panel8;
    private JLabel lblOther4;
    private JPanel User5;
    private JLabel lblImgUser5;
    private JLabel lblNickUser5;
    private JPanel panel10;
    private JLabel lblOther5;
    private JPanel panelFollowings;
    private JLabel lblFollowings;
    private JPanel User6;
    private JLabel lblImgUser6;
    private JLabel lblNickUser6;
    private JPanel panel14;
    private JLabel lblOther6;
    private JPanel User7;
    private JLabel lblImgUser7;
    private JLabel lblNickUser7;
    private JPanel panel16;
    private JLabel lblOther7;
    private JPanel User8;
    private JLabel lblImgUser8;
    private JLabel lblNickUser8;
    private JPanel panel18;
    private JLabel lblOther8;
    private JPanel User9;
    private JLabel lblImgUser9;
    private JLabel lblNickUser9;
    private JPanel panel20;
    private JLabel lblOther9;
    private JPanel User10;
    private JLabel lblImgUser10;
    private JLabel lblNickUser10;
    private JPanel panel22;
    private JLabel lblOther10;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
