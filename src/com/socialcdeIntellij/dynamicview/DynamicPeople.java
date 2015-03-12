/*
 * Created by JFormDesigner on Thu Feb 26 18:23:02 CET 2015
 */

package com.socialcdeIntellij.dynamicview;

import java.awt.*;
import javax.swing.*;
import org.jdesktop.swingx.*;

/**
 * @author Davide Rossi
 */
public class DynamicPeople extends JPanel {
    public DynamicPeople() {
        initComponents();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - Davide Rossi
        scrollPane1 = new JScrollPane();
        panelPeople = new JPanel();
        panelSuggestions = new JPanel();
        lblSuggestions = new JLabel();
        User1 = new JPanel();
        lblImgUser = new JLabel();
        lblNickUser = new JLabel();
        panel2 = new JPanel();
        lblOther = new JLabel();
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
        panelFollowers = new JPanel();
        lblFollowers = new JLabel();
        User7 = new JPanel();
        lblImgUser7 = new JLabel();
        lblNickUser7 = new JLabel();
        panel15 = new JPanel();
        lblOther7 = new JLabel();
        panelHidden = new JPanel();
        lblHidden = new JLabel();
        User8 = new JPanel();
        lblImgUser8 = new JLabel();
        lblNickUser8 = new JLabel();
        panel16 = new JPanel();
        lblOther8 = new JLabel();

        //======== this ========

        // JFormDesigner evaluation mark
        setBorder(new javax.swing.border.CompoundBorder(
            new javax.swing.border.TitledBorder(new javax.swing.border.EmptyBorder(0, 0, 0, 0),
                "JFormDesigner Evaluation", javax.swing.border.TitledBorder.CENTER,
                javax.swing.border.TitledBorder.BOTTOM, new java.awt.Font("Dialog", java.awt.Font.BOLD, 12),
                java.awt.Color.red), getBorder())); addPropertyChangeListener(new java.beans.PropertyChangeListener(){public void propertyChange(java.beans.PropertyChangeEvent e){if("border".equals(e.getPropertyName()))throw new RuntimeException();}});

        setLayout(new BorderLayout());

        //======== scrollPane1 ========
        {

            //======== panelPeople ========
            {
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
                        lblImgUser.setIcon(new ImageIcon(getClass().getResource("/images/DefaultAvatar.png")));
                        User1.add(lblImgUser);

                        //---- lblNickUser ----
                        lblNickUser.setText("nickname user");
                        User1.add(lblNickUser);

                        //======== panel2 ========
                        {
                            panel2.setPreferredSize(new Dimension(100, 32));
                            panel2.setLayout(new BorderLayout(10, 0));

                            //---- lblOther ----
                            lblOther.setIcon(new ImageIcon(getClass().getResource("/images/Toolbar/Next.png")));
                            lblOther.setHorizontalAlignment(SwingConstants.RIGHT);
                            panel2.add(lblOther, BorderLayout.CENTER);
                        }
                        User1.add(panel2);
                    }
                    panelSuggestions.add(User1);

                    //======== User5 ========
                    {
                        User5.setLayout(new FlowLayout(FlowLayout.LEFT, 15, 5));

                        //---- lblImgUser5 ----
                        lblImgUser5.setIcon(new ImageIcon(getClass().getResource("/images/DefaultAvatar.png")));
                        User5.add(lblImgUser5);

                        //---- lblNickUser5 ----
                        lblNickUser5.setText("nickname user");
                        User5.add(lblNickUser5);

                        //======== panel10 ========
                        {
                            panel10.setPreferredSize(new Dimension(100, 32));
                            panel10.setLayout(new BorderLayout(10, 0));

                            //---- lblOther5 ----
                            lblOther5.setIcon(new ImageIcon(getClass().getResource("/images/Toolbar/Next.png")));
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
                        lblImgUser6.setIcon(new ImageIcon(getClass().getResource("/images/DefaultAvatar.png")));
                        User6.add(lblImgUser6);

                        //---- lblNickUser6 ----
                        lblNickUser6.setText("nickname user");
                        User6.add(lblNickUser6);

                        //======== panel14 ========
                        {
                            panel14.setPreferredSize(new Dimension(100, 32));
                            panel14.setLayout(new BorderLayout(10, 0));

                            //---- lblOther6 ----
                            lblOther6.setIcon(new ImageIcon(getClass().getResource("/images/Toolbar/Next.png")));
                            lblOther6.setHorizontalAlignment(SwingConstants.RIGHT);
                            panel14.add(lblOther6, BorderLayout.CENTER);
                        }
                        User6.add(panel14);
                    }
                    panelFollowings.add(User6);
                }
                panelPeople.add(panelFollowings);

                //======== panelFollowers ========
                {
                    panelFollowers.setLayout(new VerticalLayout());

                    //---- lblFollowers ----
                    lblFollowers.setText("Followers");
                    lblFollowers.setFont(new Font("Dialog", Font.BOLD, 18));
                    panelFollowers.add(lblFollowers);

                    //======== User7 ========
                    {
                        User7.setLayout(new FlowLayout(FlowLayout.LEFT, 15, 5));

                        //---- lblImgUser7 ----
                        lblImgUser7.setIcon(new ImageIcon(getClass().getResource("/images/DefaultAvatar.png")));
                        User7.add(lblImgUser7);

                        //---- lblNickUser7 ----
                        lblNickUser7.setText("nickname user");
                        User7.add(lblNickUser7);

                        //======== panel15 ========
                        {
                            panel15.setPreferredSize(new Dimension(100, 32));
                            panel15.setLayout(new BorderLayout(10, 0));

                            //---- lblOther7 ----
                            lblOther7.setIcon(new ImageIcon(getClass().getResource("/images/Toolbar/Next.png")));
                            lblOther7.setHorizontalAlignment(SwingConstants.RIGHT);
                            panel15.add(lblOther7, BorderLayout.CENTER);
                        }
                        User7.add(panel15);
                    }
                    panelFollowers.add(User7);
                }
                panelPeople.add(panelFollowers);

                //======== panelHidden ========
                {
                    panelHidden.setLayout(new VerticalLayout());

                    //---- lblHidden ----
                    lblHidden.setText("Hidden");
                    lblHidden.setFont(new Font("Dialog", Font.BOLD, 18));
                    panelHidden.add(lblHidden);

                    //======== User8 ========
                    {
                        User8.setLayout(new FlowLayout(FlowLayout.LEFT, 15, 5));

                        //---- lblImgUser8 ----
                        lblImgUser8.setIcon(new ImageIcon(getClass().getResource("/images/DefaultAvatar.png")));
                        User8.add(lblImgUser8);

                        //---- lblNickUser8 ----
                        lblNickUser8.setText("nickname user");
                        User8.add(lblNickUser8);

                        //======== panel16 ========
                        {
                            panel16.setPreferredSize(new Dimension(100, 32));
                            panel16.setLayout(new BorderLayout(10, 0));

                            //---- lblOther8 ----
                            lblOther8.setIcon(new ImageIcon(getClass().getResource("/images/Toolbar/Next.png")));
                            lblOther8.setHorizontalAlignment(SwingConstants.RIGHT);
                            panel16.add(lblOther8, BorderLayout.CENTER);
                        }
                        User8.add(panel16);
                    }
                    panelHidden.add(User8);
                }
                panelPeople.add(panelHidden);
            }
            scrollPane1.setViewportView(panelPeople);
        }
        add(scrollPane1, BorderLayout.CENTER);
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - Davide Rossi
    private JScrollPane scrollPane1;
    private JPanel panelPeople;
    private JPanel panelSuggestions;
    private JLabel lblSuggestions;
    private JPanel User1;
    private JLabel lblImgUser;
    private JLabel lblNickUser;
    private JPanel panel2;
    private JLabel lblOther;
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
    private JPanel panelFollowers;
    private JLabel lblFollowers;
    private JPanel User7;
    private JLabel lblImgUser7;
    private JLabel lblNickUser7;
    private JPanel panel15;
    private JLabel lblOther7;
    private JPanel panelHidden;
    private JLabel lblHidden;
    private JPanel User8;
    private JLabel lblImgUser8;
    private JLabel lblNickUser8;
    private JPanel panel16;
    private JLabel lblOther8;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
