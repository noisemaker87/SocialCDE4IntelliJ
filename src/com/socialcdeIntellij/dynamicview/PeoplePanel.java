/*
 * Created by JFormDesigner on Thu Feb 26 18:23:02 CET 2015
 */

package com.socialcdeIntellij.dynamicview;

import java.awt.*;
import java.io.IOException;
import java.util.HashMap;
import javax.swing.*;

import com.socialcdeIntellij.action.ActionGeneral;
import com.socialcdeIntellij.controller.Controller;
import com.socialcdeIntellij.object.ImagesMod;
import com.socialcdeIntellij.shared.library.WUser;
import org.jdesktop.swingx.*;

/**
 * @author Davide Rossi
 */
public class PeoplePanel extends JPanel {

    JPanel pnlUser;
    JLabel lblImgUser;
    JLabel lblUsername;
    JLabel lblNext;
    ImagesMod im = new ImagesMod();
    ActionGeneral listener = new ActionGeneral();

    public PeoplePanel() {
        initComponents();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - Pablo Rossi
        scrollPane1 = new JScrollPane();
        panelPeople = new JPanel();
        panelSuggestions = new JPanel();
        lblSuggestions = new JLabel();
        lblTxtSuggestions = new JLabel();
        panelFollowings = new JPanel();
        lblFollowings = new JLabel();
        lblTxtSFollowings = new JLabel();
        panelFollowers = new JPanel();
        lblFollowers = new JLabel();
        lblTxtFollowers = new JLabel();
        panelHidden = new JPanel();
        lblHidden = new JLabel();
        lblTxtHidden = new JLabel();

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
            scrollPane1.setPreferredSize(new Dimension(450, 640));

            //======== panelPeople ========
            {
                panelPeople.setLayout(new VerticalLayout(10));

                //======== panelSuggestions ========
                {
                    panelSuggestions.setLayout(new VerticalLayout());

                    final WUser[] suggestion = Controller.getProxy().GetSuggestedFriends(
                            Controller.getCurrentUser().Username,
                            Controller.getCurrentUserPassword());

                    //---- lblSuggestions ----
                    lblSuggestions.setText("Suggestions");
                    lblSuggestions.setFont(new Font("Dialog", Font.BOLD, 18));
                    panelSuggestions.add(lblSuggestions);

                    //---- lblTxtSuggestions ----
                    if(suggestion.length == 0) {
                        lblTxtSuggestions.setText("We have no suggestion for you.\n\nPlease try again.");
                        panelSuggestions.add(lblTxtSuggestions);
                    }
                    else{
                        for (int i = 0; i < suggestion.length; i++) {
                            final int j = i;

                            SwingUtilities.invokeLater(new Runnable() {
                                @Override
                                public void run() {
                                    pnlUser = new JPanel(new HorizontalLayout(15));
                                    //JPanel p1 = new JPanel(new VerticalLayout(5));

                                    lblImgUser = new JLabel();

                                    lblUsername = new JLabel();
                                    lblNext = new JLabel();


                                    if (Controller.getUsersAvatar().get(suggestion[j].Username) == null) {
                                        Controller.getUsersAvatar().put(suggestion[j].Username, im.getUserImage(suggestion[j].Avatar));
                                    }

                                    lblImgUser.setIcon(new ImageIcon(Controller.getUsersAvatar().get(suggestion[j].Username)));
                                    lblImgUser.setName("lblImgUser");
                                    pnlUser.add(lblImgUser);

                                    lblUsername.setText(suggestion[j].Username);
                                    pnlUser.add(lblUsername);
                                    // p1.add(lblUsername);

                                    try {
                                        lblNext.setIcon(new ImageIcon(im.getNEXT(32, 32)));

                                    } catch (IOException e) {
                                        e.printStackTrace();
                                    }
                                    lblNext.setName("lblNext");

                                    lblImgUser.addMouseListener(listener);
                                    lblNext.addMouseListener(listener);

                                    /*compositeSuggestionUser.setData("ID_action",
                                            "User_selected");
                                    compositeSuggestionUser.setData("User_type",
                                            "Suggested");
                                    compositeSuggestionUser.setData("User_data",
                                            suggestion[j]);*/
                                }
                            });
                        }
                    }
                }
                panelPeople.add(panelSuggestions);

                //======== panelFollowings ========
                {
                    panelFollowings.setLayout(new VerticalLayout());

                    final WUser[] following = Controller.getProxy().GetFollowings(
                            Controller.getCurrentUser().Username,
                            Controller.getCurrentUserPassword());

                    //---- lblFollowings ----
                    lblFollowings.setText("Followings");
                    lblFollowings.setFont(new Font("Dialog", Font.BOLD, 18));
                    panelFollowings.add(lblFollowings);

                    if(following.length == 0) {
                        //---- lblTxtSFollowings ----
                        lblTxtSFollowings.setText("You are following no one");
                        panelFollowings.add(lblTxtSFollowings);
                    }
                    else{
                        for (int i = 0; i < following.length; i++) {
                            final int j = i;

                            SwingUtilities.invokeLater(new Runnable() {
                                @Override
                                public void run() {
                                    pnlUser = new JPanel(new HorizontalLayout(15));
                                    //JPanel p1 = new JPanel(new VerticalLayout(5));

                                    lblImgUser = new JLabel();
                                    lblUsername = new JLabel();
                                    lblNext = new JLabel();


                                    if (Controller.getUsersAvatar().get(following[j].Username) == null) {
                                        Controller.getUsersAvatar().put(following[j].Username, im.getUserImage(following[j].Avatar));
                                    }

                                    lblImgUser.setIcon(new ImageIcon(Controller.getUsersAvatar().get(following[j].Username)));
                                    lblImgUser.setName("lblImgUser");
                                    pnlUser.add(lblImgUser);

                                    lblUsername.setText(following[j].Username);
                                    pnlUser.add(lblUsername);
                                    // p1.add(lblUsername);

                                    try {
                                        lblNext.setIcon(new ImageIcon(im.getNEXT(32, 32)));

                                    } catch (IOException e) {
                                        e.printStackTrace();
                                    }
                                    lblNext.setName("lblNext");

                                    lblImgUser.addMouseListener(listener);
                                    lblNext.addMouseListener(listener);

                                    /*compositeFollowingUser.setData("ID_action",
                                            "User_selected");
                                    compositeFollowingUser
                                            .setData("User_type", "Following");
                                    compositeFollowingUser.setData("User_data",
                                            following[j]);*/
                                }
                            });
                        }
                    }


                }
                panelPeople.add(panelFollowings);

                //======== panelFollowers ========
                {
                    panelFollowers.setLayout(new VerticalLayout());

                    final WUser[] followers = Controller.getProxy().GetFollowers(
                            Controller.getCurrentUser().Username,
                            Controller.getCurrentUserPassword());

                    //---- lblFollowers ----
                    lblFollowers.setText("Followers");
                    lblFollowers.setFont(new Font("Dialog", Font.BOLD, 18));
                    panelFollowers.add(lblFollowers);

                    if(followers.length == 0) {
                        //---- lblTxtSFollowings ----
                        //---- lblTxtFollowers ----
                        lblTxtFollowers.setText("No one is following you");
                        panelFollowers.add(lblTxtFollowers);
                    }
                    else{
                        for (int i = 0; i < followers.length; i++) {
                            final int j = i;

                            SwingUtilities.invokeLater(new Runnable() {
                                @Override
                                public void run() {
                                    pnlUser = new JPanel(new HorizontalLayout(15));
                                    //JPanel p1 = new JPanel(new VerticalLayout(5));

                                    lblImgUser = new JLabel();
                                    lblUsername = new JLabel();
                                    lblNext = new JLabel();


                                    if (Controller.getUsersAvatar().get(followers[j].Username) == null) {
                                        Controller.getUsersAvatar().put(followers[j].Username, im.getUserImage(followers[j].Avatar));
                                    }

                                    lblImgUser.setIcon(new ImageIcon(Controller.getUsersAvatar().get(followers[j].Username)));
                                    lblImgUser.setName("lblImgUser");
                                    pnlUser.add(lblImgUser);

                                    lblUsername.setText(followers[j].Username);
                                    pnlUser.add(lblUsername);
                                    // p1.add(lblUsername);

                                    try {
                                        lblNext.setIcon(new ImageIcon(im.getNEXT(32, 32)));

                                    } catch (IOException e) {
                                        e.printStackTrace();
                                    }
                                    lblNext.setName("lblNext");

                                    lblImgUser.addMouseListener(listener);
                                    lblNext.addMouseListener(listener);

                                    /*compositeFollowersUser.setData("ID_action",
                                            "User_selected");
                                    compositeFollowersUser
                                            .setData("User_type", "Followers");
                                    compositeFollowersUser.setData("User_data",
                                            followers[j]);*/
                                }
                            });
                        }
                    }


                }
                panelPeople.add(panelFollowers);

                //======== panelHidden ========
                {
                    panelHidden.setLayout(new VerticalLayout());

                    final WUser[] hiddenUsers = Controller.getProxy().GetHiddenUsers(
                            Controller.getCurrentUser().Username,
                            Controller.getCurrentUserPassword());

                    //---- lblHidden ----
                    lblHidden.setText("Hidden");
                    lblHidden.setFont(new Font("Dialog", Font.BOLD, 18));
                    panelHidden.add(lblHidden);

                    if(hiddenUsers.length == 0) {
                        //---- lblTxtHidden ----
                        lblTxtHidden.setText("You have hidden no one");
                        panelHidden.add(lblTxtHidden);
                    }
                    else{
                        for (int i = 0; i < hiddenUsers.length; i++) {
                            final int j = i;

                            SwingUtilities.invokeLater(new Runnable() {
                                @Override
                                public void run() {
                                    pnlUser = new JPanel(new HorizontalLayout(15));
                                    //JPanel p1 = new JPanel(new VerticalLayout(5));

                                    lblImgUser = new JLabel();
                                    lblUsername = new JLabel();
                                    lblNext = new JLabel();


                                    if (Controller.getUsersAvatar().get(hiddenUsers[j].Username) == null) {
                                        Controller.getUsersAvatar().put(hiddenUsers[j].Username, im.getUserImage(hiddenUsers[j].Avatar));
                                    }

                                    lblImgUser.setIcon(new ImageIcon(Controller.getUsersAvatar().get(hiddenUsers[j].Username)));
                                    lblImgUser.setName("lblImgUser");
                                    pnlUser.add(lblImgUser);

                                    lblUsername.setText(hiddenUsers[j].Username);
                                    pnlUser.add(lblUsername);
                                    // p1.add(lblUsername);

                                    try {
                                        lblNext.setIcon(new ImageIcon(im.getNEXT(32, 32)));

                                    } catch (IOException e) {
                                        e.printStackTrace();
                                    }
                                    lblNext.setName("lblNext");

                                    lblImgUser.addMouseListener(listener);
                                    lblNext.addMouseListener(listener);

                                    /*compositeHiddenUser.setData("ID_action","User_selected");
						            compositeHiddenUser.setData("User_type", "Hidden");
						            compositeHiddenUser.setData("User_data", hiddenUsers[j]);*/
                                }
                            });
                        }
                    }


                }
                panelPeople.add(panelHidden);
            }
            scrollPane1.setViewportView(panelPeople);
        }
        add(scrollPane1, BorderLayout.CENTER);
        // JFormDesigner - End of component initialization  //GEN-END:initComponents

        Controller.getWindow().revalidate();
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - Pablo Rossi
    private JScrollPane scrollPane1;
    private JPanel panelPeople;
    private JPanel panelSuggestions;
    private JLabel lblSuggestions;
    private JLabel lblTxtSuggestions;
    private JPanel panelFollowings;
    private JLabel lblFollowings;
    private JLabel lblTxtSFollowings;
    private JPanel panelFollowers;
    private JLabel lblFollowers;
    private JLabel lblTxtFollowers;
    private JPanel panelHidden;
    private JLabel lblHidden;
    private JLabel lblTxtHidden;
    // JFormDesigner - End of variables declaration  //GEN-END:variables

    public HashMap<String, Object> getData() {
        // TODO Auto-generated method stub
        HashMap<String, Object> uiData = new HashMap<String, Object>();

        /*if (lblSuggestions != null) {
            uiData.put("labelsuggestionText", lblTxtSuggestions);
        } else {
            uiData.put("userSuggested", userSuggested);
        }

        if (labelFollowings != null) {
            uiData.put("labelFollowings", labelFollowings);
        } else {
            uiData.put("userFollowings", userFollowings);
        }*/

        return uiData;
    }
}
