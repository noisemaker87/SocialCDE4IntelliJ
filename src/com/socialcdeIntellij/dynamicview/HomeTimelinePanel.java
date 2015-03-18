/*
 * Created by JFormDesigner on Fri Feb 27 11:36:02 CET 2015
 */

package com.socialcdeIntellij.dynamicview;

import java.awt.*;
import java.awt.event.MouseListener;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Calendar;
import java.util.HashMap;
import javax.swing.*;
import javax.swing.border.*;
import javax.swing.event.HyperlinkEvent;
import javax.swing.event.HyperlinkListener;

import com.socialcdeIntellij.action.ActionGeneral;
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
    private JLabel otherPostAvailable;
    private JLabel noPostAvailable;
    private JLabel labelDownloadPost;
    private JPanel DownloadOlderPosts;
    private JPanel controlToPost;
    private JPanel userPanel;
    private JLabel lblImgAvatar;
    private JLabel lblUsername;
    private JPanel pnlUser;
    private JPanel pnl;
    private JPanel subPanel;
    private JScrollPane scrollPane1;
    private JPanel panelDynamic;
    private JTextArea textArea1;
    private JPanel panelMsg;
    private CustomTextArea customTextArea1;
    private JLabel lblEnter;
    private ActionGeneral listener = new ActionGeneral();


    public HomeTimelinePanel() {
        initComponents();
    }

    private void initComponents() {

        timerUpdate = 0;

        scrollPane1 = new JScrollPane();
        panelDynamic = new JPanel();
        panelMsg = new JPanel();
        customTextArea1 = new CustomTextArea();
        lblEnter = new JLabel();

        subPanel = new JPanel(new VerticalLayout(10));
        subPanel.setBackground(Color.WHITE);

        insertTimeline(subPanel);
        panelDynamic.add(subPanel);

        setLayout(new VerticalLayout(30));

        //======== scrollPane1 ========
        {
            scrollPane1.setPreferredSize(new Dimension(403, 400));
            //scrollPane1.getVerticalScrollBar().setValue(scrollPane1.getVerticalScrollBar().getMinimum());

           /* SwingUtilities.invokeLater(new Runnable()
            {
                @Override
                public void run()
                {
                    scrollPane1.getVerticalScrollBar().setValue(0);
                }
            });*/


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
                    JPanel jp = new JPanel(new FlowLayout());
                    jp.add(otherPostAvailable);
                    panelDynamic.add(jp);

                        /* otherPostAvailable.addListener(SWT.Selection, azioni);
                        otherPostAvailable.setData("ID_action", "otherPostAvailable");*/
                }
                else {
                    JPanel jp = new JPanel(new FlowLayout());
                    noPostAvailable = new JLabel("There are no post in the cache.\n Please try again in two minutes.");
                    jp.add(noPostAvailable);
                    panelDynamic.add(jp);
                }

               // labelDownloadPost = new JLabel("Download old post");


            }
            scrollPane1.setViewportView(panelDynamic);
        }
        add(scrollPane1);

        //======== panelMsg ========
        {
            panelMsg.setLayout(new FlowLayout());
            JPanel panelMsg2 = new JPanel(new HorizontalLayout(15));


            //---- customTextArea1 ----
            customTextArea1.setPreferredSize(new Dimension(328, 70));
            customTextArea1.setName("Baloon");
            panelMsg2.add(customTextArea1);


            //---- lblEnter ----
            JPanel jp2 = new JPanel(new FlowLayout());
            try {
                lblEnter.setIcon(new ImageIcon(im.getSEND_MESSAGE(48,48)));
            } catch (IOException e) {
                e.printStackTrace();
            }

            lblEnter.setToolTipText("Send message");
            lblEnter.setName("btnSendMessage");
            lblEnter.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
            lblEnter.setHorizontalAlignment(SwingConstants.LEFT);
            lblEnter.setVerticalAlignment(SwingConstants.TOP);
            lblEnter.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
            lblEnter.setVerticalTextPosition(SwingConstants.TOP);
            lblEnter.setAlignmentX(Component.CENTER_ALIGNMENT);
            lblEnter.setAlignmentY(Component.CENTER_ALIGNMENT);
            jp2.add(lblEnter);
            panelMsg2.add(jp2);
            panelMsg.add(panelMsg2);

            lblEnter.addMouseListener(listener);
           /* btnSendMessage.setData("ID_action", "btnSendMessage");
            btnSendMessage.addListener(SWT.MouseDown, azioni);*/
        }

        add(panelMsg);

        //Controller.setWindowName("homeTimeline");

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
            }

        };
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - Pablo Rossi

    // JFormDesigner - End of variables declaration  //GEN-END:variables

    public HashMap<String, Object> getData() {

        HashMap<String, Object> uiData = new HashMap<String, Object>();

        uiData.put("LabelSendMessage", lblEnter);
        uiData.put("TextMessage", customTextArea1);
        uiData.put("Panel", this);
        uiData.put("Scroll", scrollPane1);
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
                    result = "<html><a href=\" " + subsequences[i] + "\" > " + subsequences[i] + "</a></html> ";
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
                    result += " <html><a href=\" " + subsequences[i] + "\" > " + subsequences[i] + "</a></html> ";
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
                                               pnl.setBorder(BorderFactory.createEmptyBorder(5, 10, 5, 0));
                                               pnl.setBackground(Color.WHITE);
                                               JPanel pnl2 = new JPanel(new VerticalLayout(10));
                                               pnl2.setBackground(Color.WHITE);

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
                                                   lblUsername.setFont(new Font("Calibri", Font.BOLD, 15));
                                                   //solo se user differente da proprio
                                               } else {
                                                   lblUsername.setFont(new Font("Calibri", Font.BOLD, 15));
                                                   lblUsername.setForeground(Color.BLUE);
                                               }

                                               pnl2.add(lblUsername);

                                               JTextPane message = new JTextPane();
                                               message.setContentType("text/html");
                                               message.setEditable(false);
                                               message.setBackground(Color.WHITE);
                                               message.setText(findLink(posts[j].getMessage()));
                                               message.addHyperlinkListener(new HyperlinkListener() {
                                                   @Override
                                                   public void hyperlinkUpdate(HyperlinkEvent e) {
                                                       if (e.getEventType() == HyperlinkEvent.EventType.ACTIVATED) {
                                                           if (Desktop.isDesktopSupported()) {
                                                               try {
                                                                   Desktop.getDesktop().browse(e.getURL().toURI());
                                                               } catch (IOException e1) {
                                                                   // TODO Auto-generated catch block
                                                                   e1.printStackTrace();
                                                               } catch (URISyntaxException e1) {
                                                                   // TODO Auto-generated catch block
                                                                   e1.printStackTrace();
                                                               }
                                                           }
                                                       }
                                                   }
                                               });
                                               pnl2.add(message);


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
                                               messageDate.setFont(new Font("Calibri", Font.ITALIC, 8));
                                               messageDate.setForeground(Color.LIGHT_GRAY);
                                               pnl2.add(messageDate);
                                               pnl.add(pnl2);
                                               panel.add(pnl);
                                           }
                                       }

            );

            ActionHomeTimeline.setLastId(posts[i].Id);

        }
    }
}
