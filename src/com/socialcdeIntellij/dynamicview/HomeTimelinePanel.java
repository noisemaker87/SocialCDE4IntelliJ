/*
 * Created by JFormDesigner on Fri Feb 27 11:36:02 CET 2015
 */

package com.socialcdeIntellij.dynamicview;

import java.awt.*;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Calendar;
import java.util.HashMap;
import javax.swing.*;
import javax.swing.border.*;
import com.socialcdeIntellij.action.ActionHomeTimeline;
import com.socialcdeIntellij.controller.Controller;
import com.socialcdeIntellij.object.*;
import com.socialcdeIntellij.shared.library.WPost;
import org.jdesktop.swingx.*;

/**
 * @author Davide Rossi
 */
public class HomeTimelinePanel extends JPanel {

    private WPost[] posts;
    private static int totalField = 0;
    private static long timerUpdate = 0;
    ImagesMod im = new ImagesMod();
    JLabel otherPostAvailable;
    JLabel noPostAvailable;
    JLabel labelDownloadPost;
    private JPanel DownloadOlderPosts;
    private JPanel controlToPost;
    JPanel userPanel;
    JLabel lblImgAvatar;
    JLabel lblUsername;
    JPanel pnlUser;
    JPanel pnl;


    public HomeTimelinePanel() {
        initComponents();
    }

    private void createUIComponents() {
        // TODO: add custom component creation code here
    }

    private void initComponents() {

        timerUpdate = 0;

        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - Pablo Rossi
        scrollPane1 = new JScrollPane();
        panelDynamic = new JPanel();
        //textArea1 = new JTextArea();
        panelMsg = new JPanel();
        customTextArea1 = new CustomTextArea();
        lblEnter = new JLabel();

       // pnlUser = new JPanel(new HorizontalLayout(10));
        insertTimeline(panelDynamic); //
       // panelDynamic.add(pnlUser);

        //======== this ========

        // JFormDesigner evaluation mark
        setBorder(new javax.swing.border.CompoundBorder(
                new javax.swing.border.TitledBorder(new javax.swing.border.EmptyBorder(0, 0, 0, 0),
                        "JFormDesigner Evaluation", javax.swing.border.TitledBorder.CENTER,
                        javax.swing.border.TitledBorder.BOTTOM, new java.awt.Font("Dialog", java.awt.Font.BOLD, 12),
                        java.awt.Color.red), getBorder())); addPropertyChangeListener(new java.beans.PropertyChangeListener(){public void propertyChange(java.beans.PropertyChangeEvent e){if("border".equals(e.getPropertyName()))throw new RuntimeException();}});

        setLayout(new VerticalLayout(30));

        //======== scrollPane1 ========
        {
            scrollPane1.setPreferredSize(new Dimension(403, 400));

            //======== panelDynamic ========
            {
                panelDynamic.setBackground(Color.white);
                panelDynamic.setBorder(new BevelBorder(BevelBorder.LOWERED));
                panelDynamic.setLayout(new VerticalLayout(15));

                long secondCallpostStartTime = System.currentTimeMillis();

                WPost[] newPost = Controller.getProxy().GetHomeTimeline(
                        Controller.getCurrentUser().Username,
                        Controller.getCurrentUserPassword(),
                        ActionHomeTimeline.getLastId(), 0);

                long secondCallpostEndTime = System.currentTimeMillis();

                if (newPost == null || newPost.length == 2) {
                    newPost = new WPost[0];
                }

                if (newPost.length > 0) {
                    otherPostAvailable = new JLabel("<html><a>Click to view older posts</a></html>");
                    otherPostAvailable.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
                    panelDynamic.add(otherPostAvailable);

                        /* otherPostAvailable.addListener(SWT.Selection, azioni);
                        otherPostAvailable.setData("ID_action", "otherPostAvailable");*/
                }
                else {
                    noPostAvailable = new JLabel("There are no post in the cache.\n Please try again in two minutes.");
                    panelDynamic.add(noPostAvailable);
                }

               // labelDownloadPost = new JLabel("Download old post");


            }
            scrollPane1.setViewportView(panelDynamic);
        }
        add(scrollPane1);

        //======== panelMsg ========
        {
            //panelMsg.setPreferredSize(new Dimension(382, 80));
            panelMsg.setLayout(new FlowLayout());

            //---- customTextArea1 ----
            customTextArea1.setPreferredSize(new Dimension(350, 90));
            panelMsg.add(customTextArea1);

            //---- lblEnter ----
            try {
                lblEnter.setIcon(new ImageIcon(im.getSEND_MESSAGE(50,35)));
            } catch (IOException e) {
                e.printStackTrace();
            }
            lblEnter.setToolTipText("Send message");
            lblEnter.setHorizontalAlignment(SwingConstants.LEFT);
            lblEnter.setVerticalAlignment(SwingConstants.TOP);
            lblEnter.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
            lblEnter.setVerticalTextPosition(SwingConstants.TOP);
            panelMsg.add(lblEnter);
           /* btnSendMessage.setData("ID_action", "btnSendMessage");
            btnSendMessage.addListener(SWT.MouseDown, azioni);*/
        }
        add(panelMsg);
        // JFormDesigner - End of component initialization  //GEN-END:initComponents


        //Controller.setWindowName("homeTimeline");

        //panel.layout();


        Controller.getWindow().revalidate();



        final int time = 10000;
        final Runnable timer = new Runnable() {
            public void run() {

                if (timerUpdate == 0) {
                    System.out.println("Chiamata eseguita " + Calendar.getInstance().getTime().toString());
                    //updateTimeline();
                    panelDynamic.revalidate();
                    timerUpdate = Calendar.getInstance().getTimeInMillis();
                    System.out.println("Acquisito " + Calendar.getInstance().getTime().toString());
                } else {
                    long tempTimer = Calendar.getInstance().getTimeInMillis();
                    System.out.println("Acquisito 2" + Calendar.getInstance().getTime().toString());
                    System.out.println("Confronto " + (tempTimer - timerUpdate));
                    if ((tempTimer - timerUpdate) < 10010 && (tempTimer - timerUpdate) > 9990) {
                        System.out.println("Chiamata eseguita parte 2 " + Calendar.getInstance().getTime().toString());
                        //updateTimeline();

                        panelDynamic.revalidate();

                        timerUpdate = System.currentTimeMillis();
                    }
                    timerUpdate = tempTimer;
                }

                //Display.getCurrent().timerExec(time, this);
            }

        };
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - Pablo Rossi
    private JScrollPane scrollPane1;
    private JPanel panelDynamic;
    private JTextArea textArea1;
    private JPanel panelMsg;
    private CustomTextArea customTextArea1;
    private JLabel lblEnter;
    // JFormDesigner - End of variables declaration  //GEN-END:variables

    public HashMap<String, Object> getData() {

        HashMap<String, Object> uiData = new HashMap<String, Object>();

        /*uiData.put("superUserPostMaster", superUserPostMaster);
        uiData.put("userPostMaster", userPostMaster);
        uiData.put("otherPostWarning", otherPostWarning);
        uiData.put("userPostMaster", userPostMaster);
        uiData.put("textMessage", textMessage);
        uiData.put("labelDownloadPost", labelDownloadPost);
        uiData.put("pbar", pbar);
        uiData.put("action", azioni);*/

        return uiData;
    }

    private String findLink(String message) {
        String[] subsequences = message.split(" ");
        String result = "";
        for(int i=0;i<subsequences.length; i++)
        {
            if(result.equals(""))
            {
                if(subsequences[i].contains("http"))
                {
                    result = "<a href=\" " + subsequences[i] + "\" > " + subsequences[i] + "</a> ";
                }
                else
                {
                    result = subsequences[i] + " ";
                }
            }
            else
            {
                if(subsequences[i].contains("http"))
                {
                    result += "<a href=\" " + subsequences[i] + "\" > " + subsequences[i] + "</a> ";
                }
                else
                {
                    result += subsequences[i] + " ";
                }
            }
        }

        return result;
    }


    public void insertTimeline(final JPanel panel) {


        long postStartTime = System.currentTimeMillis();

        posts = Controller.getProxy().GetHomeTimeline(
                Controller.getCurrentUser().Username,
                Controller.getCurrentUserPassword());

        long postEndTime = System.currentTimeMillis();

        ActionHomeTimeline.setLastId(0);

        for (int i = 0; i < posts.length; i++) {


            final int j = i;

            SwingUtilities.invokeLater(new Runnable() {
                                           @Override
                                           public void run() {
                                               pnl = new JPanel(new HorizontalLayout(10));
                                               pnl.setBackground(Color.WHITE);
                                               //userPostComposite.setData("IdPost", posts[j].Id);
                                               lblImgAvatar = new JLabel();

                                               if (Controller.getUsersAvatar().get(posts[j].getUser().Username) == null) {
                                                   Controller.getUsersAvatar().put(posts[j].getUser().Username, im.getUserImage(posts[j].getUser().Avatar));
                                               }
                                               lblImgAvatar.setIcon(new ImageIcon(Controller.getUsersAvatar().get(posts[j].getUser().Username)));

                                               if (!posts[j].getUser().Username.equals(Controller
                                                       .getCurrentUser().Username)) {
                                                   lblImgAvatar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
                                                   lblImgAvatar.setToolTipText("View "
                                                           + posts[j].getUser().Username + " Timeline");


                                               }
                                               pnl.add(lblImgAvatar);

                                               lblUsername = new JLabel();

                                               lblUsername.setText(posts[j].getUser().Username);
                                               if (!posts[j].getUser().Username.equals(Controller
                                                       .getCurrentUser().Username)) {
                                                   lblUsername.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
                                                   lblUsername.setToolTipText("View " + posts[j].getUser().Username + " Timeline");


                                               } else {
                                                   lblUsername.setForeground(Color.BLUE);
                                               }

                                               pnl.add(lblUsername);

                                               JLabel message = new JLabel();
                                               message.setText(findLink(posts[j].getMessage()));

                                               pnl.add(message);


                                               Calendar nowDate = Calendar.getInstance();
                                               Calendar dateSelected = posts[j].getCreateAt();
                                               long millisDiff = nowDate.getTime().getTime()
                                                       - dateSelected.getTime().getTime();

                                               int seconds = (int) (millisDiff / 1000 % 60);
                                               int minutes = (int) (millisDiff / 60000 % 60);
                                               int hours = (int) (millisDiff / 3600000 % 24);
                                               int days = (int) (millisDiff / 86400000);

                                               JLabel messageDate = new JLabel();

                                               if (days > 1 && days < 30) {
                                                   messageDate.setText("About " + days + " days ago from "
                                                           + posts[j].getService().getName());
                                               } else if (days > 30) {
                                                   messageDate.setText("More than one month ago from "
                                                           + posts[j].getService().getName());
                                               } else if (days == 1) {
                                                   messageDate.setText("About " + days + " day ago from "
                                                           + posts[j].getService().getName());
                                               } else {
                                                   if (hours > 1) {
                                                       messageDate.setText("About " + hours
                                                               + " hours ago from "
                                                               + posts[j].getService().getName());
                                                   } else if (hours == 1) {
                                                       messageDate.setText("About " + hours
                                                               + " hour ago from "
                                                               + posts[j].getService().getName());
                                                   } else {

                                                       if (minutes > 1) {
                                                           messageDate.setText("About " + minutes
                                                                   + " minutes ago from "
                                                                   + posts[j].getService().getName());
                                                       } else if (minutes == 1) {
                                                           messageDate.setText("About " + minutes
                                                                   + " minute ago from "
                                                                   + posts[j].getService().getName());
                                                       } else {

                                                           if (seconds > 1) {
                                                               messageDate.setText("About " + seconds
                                                                       + " seconds ago from "
                                                                       + posts[j].getService().getName());
                                                           } else if (seconds == 1) {
                                                               messageDate.setText("About " + seconds
                                                                       + " second ago from "
                                                                       + posts[j].getService().getName());
                                                           } else {
                                                               messageDate.setText("Few seconds ago from "
                                                                       + posts[j].getService().getName());
                                                           }
                                                       }
                                                   }
                                               }
                                               pnl.add(messageDate);
                                               panel.add(pnl);
                                           }
                                       }

            );

            ActionHomeTimeline.setLastId(posts[i].Id);

        }
    }
}
