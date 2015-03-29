package com.socialcdeIntellij.dynamicview;

import com.socialcdeIntellij.action.ActionGeneral;
import com.socialcdeIntellij.action.ActionHomeTimeline;
import com.socialcdeIntellij.controller.Controller;
import com.socialcdeIntellij.object.CustomTextArea;
import com.socialcdeIntellij.object.GeneralLabel;
import com.socialcdeIntellij.object.ImagesMod;
import com.socialcdeIntellij.object.LabelClicked;
import com.socialcdeIntellij.shared.library.WPost;
import org.jdesktop.swingx.HorizontalLayout;
import org.jdesktop.swingx.VerticalLayout;
import javax.swing.*;
import javax.swing.border.BevelBorder;
import javax.swing.event.HyperlinkEvent;
import javax.swing.event.HyperlinkListener;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URISyntaxException;
import java.util.Calendar;
import java.util.HashMap;


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
    private LabelClicked lblImgAvatar;
    private LabelClicked lblUsername;
    private JPanel pnlUser;
    private JPanel pnl;
    private JPanel subPanel;
    private final JScrollPane scrollPane1 = new JScrollPane();
    private JPanel panelDynamic;
    private JTextArea textArea1;
    private JPanel panelMsg;
    private CustomTextArea customTextArea1;
    private JLabel lblEnter;
    private ActionGeneral listener = new ActionGeneral();
    JPanel jp1;
    JPanel jp2;


    public HomeTimelinePanel() {
        initComponents();

    }

    private void initComponents() {

        timerUpdate = 0;

        jp1 = new JPanel(new FlowLayout());
        jp2 = new JPanel(new FlowLayout());
        panelDynamic = new JPanel();
        panelMsg = new JPanel();
        customTextArea1 = new CustomTextArea();
        lblEnter = new JLabel();

        subPanel = new JPanel(new VerticalLayout(10));
        subPanel.setBackground(Color.WHITE);

        setLayout(new VerticalLayout(30));

        //========= scrollPane ==========
        {
            //======== panelDynamic ========
            {
                panelDynamic.setBackground(Color.white);
                panelDynamic.setBorder(new BevelBorder(BevelBorder.LOWERED));
                panelDynamic.setLayout(new VerticalLayout(15));

                insertTimeline(subPanel);

                panelDynamic.add(subPanel);


                long secondCallpostStartTime = System.currentTimeMillis();

                WPost[] newPost = Controller.getProxy().GetHomeTimeline(
                        Controller.getCurrentUser().Username,
                        Controller.getCurrentUserPassword(),
                        ActionHomeTimeline.getLastId(), 0);

                long secondCallpostEndTime = System.currentTimeMillis();

                if (newPost == null || newPost.length == 2) {
                    newPost = new WPost[0];
                }

                otherPostAvailable = new JLabel("<html><a>Click to view older posts</a></html>");
                otherPostAvailable.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
                otherPostAvailable.setName("otherPostAvaible");

                jp1.add(otherPostAvailable);
                panelDynamic.add(jp1);

                noPostAvailable = new JLabel("There are no post in the cache.\n Please try again in two minutes.");

                jp2.add(noPostAvailable);
                panelDynamic.add(jp2);


                if (newPost.length >0) {
                    jp1.setVisible(true);
                    jp2.setVisible(false);

                }
                else {
                    jp1.setVisible(false);
                    jp2.setVisible(true);
                }

            }

            scrollPane1.setPreferredSize(new Dimension(0, 400));
            scrollPane1.setViewportView(panelDynamic);
            add(scrollPane1);

        }

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
                lblEnter.setIcon(new ImageIcon(im.getSEND_MESSAGE(48, 48)));
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
            otherPostAvailable.addMouseListener(listener);

        }

        add(panelMsg);


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
                        updateTimeline(subPanel);

                        timerUpdate = System.currentTimeMillis();
                    }
                    timerUpdate = tempTimer;
                }
            }

        };

        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                scrollPane1.getVerticalScrollBar().setValue(0);
            }
        });

    }



    public HashMap<String, Object> getData() {

        HashMap<String, Object> uiData = new HashMap<String, Object>();

        uiData.put("LabelSendMessage", lblEnter);
        uiData.put("TextMessage", customTextArea1);
        uiData.put("Panel", this);
        uiData.put("panelDynamic", panelDynamic);
        uiData.put("scroll", scrollPane1);
        uiData.put("PanelOtherPost", jp1);
        uiData.put("PanelNoPost", jp2);
        uiData.put("PanelSubDynamic", subPanel);
        uiData.put("LabelUsername", lblUsername);
        uiData.put("LabelAvatar", lblImgAvatar);

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
                    lblImgAvatar = new LabelClicked();
                    //lblImgAvatar.setName("lblUser");

                    if (Controller.getUsersAvatar().get(posts[j].getUser().Username) == null) {
                        Controller.getUsersAvatar().put(posts[j].getUser().Username, im.getUserImage(posts[j].getUser().Avatar));
                    }
                    //lblImgAvatar.setIcon(new ImageIcon(Controller.getUsersAvatar().get(posts[j].getUser().Username)));
                    try {
                        lblImgAvatar.getLabel().setIcon(new ImageIcon(im.resize((BufferedImage) Controller.getUsersAvatar().get(posts[j].getUser().Username), 75, 75)));
                    } catch (IOException e) {
                        e.printStackTrace();
                    }

                    if (!posts[j].getUser().Username.equals(Controller
                            .getCurrentUser().Username)) {
                        lblImgAvatar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
                        lblImgAvatar.setToolTipText("View "
                                + posts[j].getUser().Username + " Timeline");
                        // Controller.temporaryInformation.put("User_selected", posts[j].getUser());

                        lblImgAvatar.getLabel().setwUser(posts[j].getUser());
                        lblImgAvatar.addMouseListener(listener);

                    }
                    pnl.add(lblImgAvatar);

                    lblUsername = new LabelClicked();
                    //lblUsername.setName("lblUsername");

                    lblUsername.getLabel().setText(posts[j].getUser().Username);
                    if (!posts[j].getUser().Username.equals(Controller
                            .getCurrentUser().Username)) {
                        lblUsername.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
                        lblUsername.setToolTipText("View " + posts[j].getUser().Username + " Timeline");
                        lblUsername.getLabel().setFont(new Font("Calibri", Font.BOLD, 15));
                        lblUsername.getLabel().setForeground(Color.BLUE);
                        //Controller.temporaryInformation.put("User_selected", posts[j].getUser());

                        lblUsername.getLabel().setwUser(posts[j].getUser());
                        lblUsername.addMouseListener(listener);
                    } else {
                        lblUsername.getLabel().setFont(new Font("Calibri", Font.BOLD, 15));
                        lblUsername.getLabel().setForeground(Color.BLACK);
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

                    SwingUtilities.invokeLater(new Runnable() {
                        @Override
                        public void run() {
                            scrollPane1.getVerticalScrollBar().setValue(0);
                        }
                    });
                }
                                       }

            );

            ActionHomeTimeline.setLastId(posts[i].Id);

        }
    }

    public void updateTimeline(final JPanel panel) {

        if(panelDynamic.getComponentCount()==1)
        {
            posts = Controller.getProxy().GetHomeTimeline(
                    Controller.getCurrentUser().Username,
                    Controller.getCurrentUserPassword());
        }
        else
        {
            posts = Controller.getProxy().GetHomeTimeline(
                    Controller.getCurrentUser().Username,
                    Controller.getCurrentUserPassword(),panelDynamic.getComponentCount(),0);
        }
        for (WPost element : posts) {
            System.out.println("Elemento con id " + element.Id + " inviato da " + element.User.Username + " il " + element.CreateAt.getTime().toString());
        }

        //Controller.temporaryInformation.put("CurrentComposite", panelDynamic.getComponentCount()userPostMaster.getChildren()[0]);

        if(posts.length > 0 &&  posts[0].Id != panelDynamic.getComponentCount())  {
            boolean flag = true;

            for (int i = 0; i < posts.length; i++) {
                System.out.println("Numero posts nuovi  " + posts.length);

                System.out.println("post n. " + i + " valore " +  posts[i].Message + " id " + posts[i].Id);
               // System.out.println(" confronto con post n. 0 valore " +  userPostMaster.getChildren()[0].getData("IdPost").toString());

                if(posts[i].Id == panelDynamic.getComponentCount())
                {
                    flag = false;
                }

                if(flag)
                {

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
                            lblImgAvatar = new LabelClicked();
                           // lblImgAvatar.setName("lblUser");

                            if (Controller.getUsersAvatar().get(posts[j].getUser().Username) == null) {
                                Controller.getUsersAvatar().put(posts[j].getUser().Username, im.getUserImage(posts[j].getUser().Avatar));
                            }
                            lblImgAvatar.getLabel().setIcon(new ImageIcon(Controller.getUsersAvatar().get(posts[j].getUser().Username)));

                            if (!posts[j].getUser().Username.equals(Controller
                                    .getCurrentUser().Username)) {
                                lblImgAvatar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
                                lblImgAvatar.setToolTipText("View "
                                        + posts[j].getUser().Username + " Timeline");

                                lblImgAvatar.getLabel().setwUser(posts[j].getUser());
                                lblImgAvatar.addMouseListener(listener);

                            }
                            pnl.add(lblImgAvatar);

                            lblUsername = new LabelClicked();
                            //lblUsername.setName("lblUser");

                            lblUsername.getLabel().setText(posts[j].getUser().Username);
                            if (!posts[j].getUser().Username.equals(Controller
                                    .getCurrentUser().Username)) {
                                lblUsername.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
                                lblUsername.setToolTipText("View " + posts[j].getUser().Username + " Timeline");
                                lblUsername.getLabel().setFont(new Font("Calibri", Font.BOLD, 15));
                                lblUsername.getLabel().setForeground(Color.BLUE);

                                lblUsername.getLabel().setwUser(posts[j].getUser());
                                lblUsername.addMouseListener(listener);
                            } else {
                                lblUsername.getLabel().setFont(new Font("Calibri", Font.BOLD, 15));
                                lblUsername.getLabel().setForeground(Color.BLACK);
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

                            SwingUtilities.invokeLater(new Runnable() {
                                @Override
                                public void run() {
                                    scrollPane1.getVerticalScrollBar().setValue(0);
                                }
                            });
                        }
                    });


                }
            }

        }

    }
}
