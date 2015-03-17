/*
 * Created by JFormDesigner on Thu Feb 26 18:23:02 CET 2015
 */

package com.socialcdeIntellij.dynamicview;

import java.awt.*;
import java.util.HashMap;
import javax.swing.*;

import com.socialcdeIntellij.controller.Controller;
import com.socialcdeIntellij.shared.library.WUser;
import org.jdesktop.swingx.*;

/**
 * @author Davide Rossi
 */
public class PeoplePanel extends JPanel {
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
                }
                panelPeople.add(panelSuggestions);

                //======== panelFollowings ========
                {
                    panelFollowings.setLayout(new VerticalLayout());

                    //---- lblFollowings ----
                    lblFollowings.setText("Followings");
                    lblFollowings.setFont(new Font("Dialog", Font.BOLD, 18));
                    panelFollowings.add(lblFollowings);

                    //---- lblTxtSFollowings ----
                    lblTxtSFollowings.setText("You are following no one");
                    panelFollowings.add(lblTxtSFollowings);
                }
                panelPeople.add(panelFollowings);

                //======== panelFollowers ========
                {
                    panelFollowers.setLayout(new VerticalLayout());

                    //---- lblFollowers ----
                    lblFollowers.setText("Followers");
                    lblFollowers.setFont(new Font("Dialog", Font.BOLD, 18));
                    panelFollowers.add(lblFollowers);

                    //---- lblTxtFollowers ----
                    lblTxtFollowers.setText("No one is following you");
                    panelFollowers.add(lblTxtFollowers);
                }
                panelPeople.add(panelFollowers);

                //======== panelHidden ========
                {
                    panelHidden.setLayout(new VerticalLayout());

                    //---- lblHidden ----
                    lblHidden.setText("Hidden");
                    lblHidden.setFont(new Font("Dialog", Font.BOLD, 18));
                    panelHidden.add(lblHidden);

                    //---- lblTxtHidden ----
                    lblTxtHidden.setText("You have hidden no one");
                    panelHidden.add(lblTxtHidden);
                }
                panelPeople.add(panelHidden);
            }
            scrollPane1.setViewportView(panelPeople);
        }
        add(scrollPane1, BorderLayout.CENTER);
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
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
