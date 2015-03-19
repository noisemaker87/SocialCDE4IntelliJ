package com.socialcdeIntellij.action;

import com.socialcdeIntellij.controller.Controller;
import com.socialcdeIntellij.object.CustomTextArea;
import com.socialcdeIntellij.object.GeneralLabel;
import com.socialcdeIntellij.object.ImagesMod;
import com.socialcdeIntellij.shared.library.WPost;
import com.socialcdeIntellij.shared.library.WUser;
import org.jdesktop.swingx.HorizontalLayout;
import org.jdesktop.swingx.VerticalLayout;

import javax.swing.*;
import javax.swing.event.HyperlinkEvent;
import javax.swing.event.HyperlinkListener;
import java.awt.*;
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Calendar;
import java.util.HashMap;

/**
 * Created by Teo on 18/03/2015.
 */
public class ActionHomeTimeline {

    private static long lastId;
    private WUser userSelected;
    private WUser[] userCategory;
    ImagesMod im = new ImagesMod();


    public ActionHomeTimeline(final HashMap<String, Object> uiData) {
        String widgetName = uiData.get("ID_action").toString();
        int type = (int) uiData.get("Event_type");
       // Event event = (Event) uiData.get("Event");
        final ActionGeneral listener = new ActionGeneral();

        switch (widgetName) {

            case "btnSendMessage":
                if(Controller.getProxy().IsWebServiceRunning())
                {
                    String userMessage = null;

                    if (!InterceptingFilter.verifyText(((CustomTextArea) uiData.get("TextMessage")).getText())) {
                        JOptionPane.showMessageDialog(Controller.getFrame(), "The message is empty, please try again.",
                                "SocialCDE message", JOptionPane.INFORMATION_MESSAGE);
                    } else {
                        userMessage = ((CustomTextArea) uiData.get("TextMessage")).getText();
                        ((CustomTextArea) uiData.get("TextMessage")).setText("");
                        if (!Controller.getProxy().Post(
                                Controller.getCurrentUser().Username,
                                Controller.getCurrentUserPassword(), userMessage)) {
                            JOptionPane.showMessageDialog(Controller.getFrame(), "Something was wrong, please try again.",
                                    "SocialCDE message", JOptionPane.ERROR_MESSAGE);
                        } else {
                            uiData.put("alert", "");

                            WPost[]	homeTimelinePost = Controller.getProxy().
                                    GetUserTimeline(Controller.getCurrentUser().Username,
                                            Controller.getCurrentUserPassword(), Controller.getCurrentUser().Username);

                            final JPanel panel = new JPanel(new HorizontalLayout(10));
                            panel.setBorder(BorderFactory.createEmptyBorder(5, 10, 5, 0));
                            panel.setBackground(Color.WHITE);
                            JPanel pnl2 = new JPanel(new VerticalLayout(10));
                            pnl2.setBackground(Color.WHITE);

                            if(Controller.getUsersAvatar().get(Controller.getCurrentUser().Username) == null)
                            {
                                Controller.getUsersAvatar().put(Controller.getCurrentUser().Username, im.getUserImage(Controller.getCurrentUser().Avatar));
                            }

                            JLabel labelUserAvatar = new JLabel();
                            try {
                                labelUserAvatar.setIcon(new ImageIcon(im.resize((BufferedImage) Controller.getUsersAvatar().get(Controller.getCurrentUser().Username),75,75)));
                            } catch (IOException e) {
                                e.printStackTrace();
                            }
                            panel.add(labelUserAvatar);

                            JLabel username = new JLabel();
                            username.setText(Controller.getCurrentUser().Username);
                            username.setFont(new Font("Calibri", Font.BOLD, 15));
                            pnl2.add(username);

                            JTextPane message = new JTextPane();
                            message.setContentType("text/html");
                            message.setEditable(false);
                            message.setBackground(Color.WHITE);
                            message.setText(userMessage);

                            pnl2.add(message);

                            JLabel messageDate = new JLabel();
                            messageDate.setText("About one minutes ago from SocialTFS");
                            messageDate.setFont(new Font("Calibri", Font.ITALIC, 8));
                            pnl2.add(messageDate);

                            panel.add(pnl2);

                            Controller.selectDynamicWindow(3);
                            Controller.getWindow().revalidate();
                        }
                    }
                }
                /*else
                {
                    Controller.openConnectionLostPanel("Connection Lost!  \n You will be redirected to Login page.");
                }*/
                break;

            case "lblImgAvatar":
                if(Controller.getProxy().IsWebServiceRunning())
                {
                    userSelected = (WUser) uiData.get("User_data");

                    userCategory = Controller.getProxy().GetSuggestedFriends(
                            Controller.getCurrentUser().Username,
                            Controller.getCurrentUserPassword());

                    for (int i = 0; i < userCategory.length; i++) {
                        if (userCategory[i].equals(userSelected)) {
                            Controller.temporaryInformation.put("User_type",
                                    "Suggested");
                        }
                    }

                    userCategory = null;

                    userCategory = Controller.getProxy().GetFollowings(
                            Controller.getCurrentUser().Username,
                            Controller.getCurrentUserPassword());

                    for (int i = 0; i < userCategory.length; i++) {
                        if (userCategory[i].equals(userSelected)) {
                            Controller.temporaryInformation.put("User_type",
                                    "Following");
                        }
                    }

                    userCategory = null;

                    userCategory = Controller.getProxy().GetFollowers(
                            Controller.getCurrentUser().Username,
                            Controller.getCurrentUserPassword());

                    for (int i = 0; i < userCategory.length; i++) {
                        if (userCategory[i].equals(userSelected)) {
                            Controller.temporaryInformation.put("User_type",
                                    "Followers");
                        }
                    }

                    userCategory = null;

                    userCategory = Controller.getProxy().GetHiddenUsers(
                            Controller.getCurrentUser().Username,
                            Controller.getCurrentUserPassword());

                    for (int i = 0; i < userCategory.length; i++) {
                        if (userCategory[i].equals(userSelected)) {
                            Controller.temporaryInformation.put("User_type", "Hidden");
                        }
                    }

                    userCategory = null;

                    Controller.temporaryInformation.put("User_selected", userSelected);
                    Controller.selectDynamicWindow(3);
                    Controller.getWindow().revalidate();
                }
                /*else
                {
                    Controller.openConnectionLostPanel("Connection Lost! \n You will be redirected to Login page.");
                }*/
                break;

            case "lblUsername":
                if(Controller.getProxy().IsWebServiceRunning())
                {
                    userSelected = (WUser) uiData.get("User_data");

                    userCategory = Controller.getProxy().GetSuggestedFriends(
                            Controller.getCurrentUser().Username,
                            Controller.getCurrentUserPassword());

                    for (int i = 0; i < userCategory.length; i++) {
                        if (userCategory[i].equals(userSelected)) {
                            Controller.temporaryInformation.put("User_type",
                                    "Suggested");
                        }
                    }

                    userCategory = null;

                    userCategory = Controller.getProxy().GetFollowings(
                            Controller.getCurrentUser().Username,
                            Controller.getCurrentUserPassword());

                    for (int i = 0; i < userCategory.length; i++) {
                        if (userCategory[i].equals(userSelected)) {
                            Controller.temporaryInformation.put("User_type",
                                    "Following");
                        }
                    }

                    userCategory = null;

                    userCategory = Controller.getProxy().GetFollowers(
                            Controller.getCurrentUser().Username,
                            Controller.getCurrentUserPassword());

                    for (int i = 0; i < userCategory.length; i++) {
                        if (userCategory[i].equals(userSelected)) {
                            Controller.temporaryInformation.put("User_type",
                                    "Followers");
                        }
                    }

                    userCategory = null;

                    userCategory = Controller.getProxy().GetHiddenUsers(
                            Controller.getCurrentUser().Username,
                            Controller.getCurrentUserPassword());

                    for (int i = 0; i < userCategory.length; i++) {
                        if (userCategory[i].equals(userSelected)) {
                            Controller.temporaryInformation.put("User_type", "Hidden");
                        }
                    }

                    userCategory = null;

                    Controller.temporaryInformation.put("User_selected", userSelected);
                    Controller.selectDynamicWindow(3);
                }
                /*else
                {
                    Controller.openConnectionLostPanel("Connection Lost! \n  You will be redirected to Login page.");
                }*/
                break;

            case "otherPostAvaible":
                if(Controller.getProxy().IsWebServiceRunning()) {

                    final WPost[] posts = Controller.getProxy().GetHomeTimeline(
                            Controller.getCurrentUser().Username,
                            Controller.getCurrentUserPassword(), 0, getLastId());

                    if (posts.length > 0) {

                        final int max = 100;

                        for (int i = 0; i < posts.length; i++) {
                            final int j = i;

                            JPanel pnl = new JPanel(new HorizontalLayout(10));
                            pnl.setBorder(BorderFactory.createEmptyBorder(5, 10, 5, 0));
                            pnl.setBackground(Color.WHITE);
                            JPanel pnl2 = new JPanel(new VerticalLayout(10));
                            pnl2.setBackground(Color.WHITE);

                            //userPostComposite.setData("IdPost", posts[j].Id);
                            GeneralLabel lblImgAvatar = new GeneralLabel();
                            lblImgAvatar.setName("lblImgAvatar");


                            if (Controller.getUsersAvatar().get(posts[j].getUser().Username) == null) {
                                Controller.getUsersAvatar().put(posts[j].getUser().Username, im.getUserImage(posts[j].getUser().Avatar));
                            }
                            lblImgAvatar.setIcon(new ImageIcon(Controller.getUsersAvatar().get(posts[j].getUser().Username)));

                            if (!posts[j].getUser().Username.equals(Controller
                                    .getCurrentUser().Username)) {
                                lblImgAvatar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
                                lblImgAvatar.setToolTipText("View "
                                        + posts[j].getUser().Username + " Timeline");

                                lblImgAvatar.setwUser(posts[j].getUser());
                                lblImgAvatar.addMouseListener(listener);

                            }
                            pnl.add(lblImgAvatar);

                            GeneralLabel lblUsername = new GeneralLabel();
                            lblUsername.setName("lblUsername");

                            lblUsername.setText(posts[j].getUser().Username);
                            if (!posts[j].getUser().Username.equals(Controller
                                    .getCurrentUser().Username)) {
                                lblUsername.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
                                lblUsername.setToolTipText("View " + posts[j].getUser().Username + " Timeline");
                                lblUsername.setFont(new Font("Calibri", Font.BOLD, 15));

                                lblUsername.setwUser(posts[j].getUser());
                                lblUsername.addMouseListener(listener);
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

                            ((JPanel)uiData.get("panelDynamic")).remove(((JLabel)uiData.get("LabelOtherPost")));
                           // ((JPanel)uiData.get("panelDynamic")).remove(((JLabel)uiData.get("LabelNoPost")));


                            ((JPanel)uiData.get("panelDynamic")).add(pnl);



                            SwingUtilities.invokeLater(new Runnable() {
                                @Override
                                public void run() {
                                    ((JScrollPane)uiData.get("scroll")).getVerticalScrollBar().setValue(0);
                                }
                            });
                        }

                    }
                }

                WPost[] newPosts = Controller.getProxy().GetHomeTimeline(
                        Controller.getCurrentUser().Username,
                        Controller.getCurrentUserPassword(), 0, getLastId());

                if (newPosts == null || newPosts.length == 2) {
                    newPosts = new WPost[0];
                }

                if (newPosts.length > 0) {
                    JPanel jp = new JPanel(new FlowLayout());
                    jp.add(((JLabel) uiData.get("LabelOtherPost")));
                    ((JPanel)uiData.get("panelDynamic")).add(jp);

                } else {
                    JPanel jp = new JPanel(new FlowLayout());
                    jp.add(((JLabel) uiData.get("LabelNoPost")));
                    ((JPanel)uiData.get("panelDynamic")).add(jp);

                }
               /* else
                {
                    Controller.openConnectionLostPanel("Connection Lost! \n You will be redirected to Login page.");
                }*/
                    break;

            default:
                break;
        }
    }


    public static long getLastId() {
        return lastId;
    }

    public static void setLastId(long lastId) {
        ActionHomeTimeline.lastId = lastId;
    }

    private String findLink(String message){
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
}
