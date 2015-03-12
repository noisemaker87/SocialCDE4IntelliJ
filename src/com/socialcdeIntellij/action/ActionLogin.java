package com.socialcdeIntellij.action;

import com.socialcdeIntellij.controller.Controller;
import com.socialcdeIntellij.model.ProxyWrapper;
import com.socialcdeIntellij.object.ImagesMod;
import com.socialcdeIntellij.object.OperationProgressBar;
import com.socialcdeIntellij.shared.library.WUser;


import javax.swing.*;
import java.awt.*;
import java.io.IOException;
import java.util.HashMap;

/**
 * Created by Teo on 10/03/2015.
 */
public class ActionLogin {
    private static Image IMAGE_YES;
    private static Image IMAGE_NO;
    private OperationProgressBar opBar;
    private ImagesMod im = new ImagesMod();
    private WUser user;

    public ActionLogin() { }

    public ActionLogin(HashMap<String, Object> uiData) {
        // ActionEvent event = (ActionEvent) uiData.get("Event");
        //int type = (Integer) uiData.get("Event_type");
        String widgetName = uiData.get("ID_action").toString();

        try {
            IMAGE_NO = im.getNO_ICON(32, 16);
            IMAGE_YES = im.getYES_ICON(32, 16);
        } catch (IOException e) {
            e.printStackTrace();
        }

        switch (widgetName) {

            case "txtProxy":
                if (InterceptingFilter.verifyText(((JTextField) uiData
                        .get("ProxyHost")).getText())) {
                    Controller.setProxy(new ProxyWrapper());
                    Controller.getProxy().setHost(
                            ((JTextField) uiData.get("ProxyHost")).getText());
                    if (Controller.getProxy().IsWebServiceRunning()) {
                        ((JLabel) uiData.get("LabelImageProxy")).setIcon(new ImageIcon(IMAGE_YES));
                        ((JLabel) uiData.get("LabelImageProxy")).setVisible(true);

                    } else {
                        Controller.setProxy(null);
                        ((JLabel) uiData.get("LabelAlert"))
                                .setText("Please insert a valid proxy!");
                        ((JLabel) uiData.get("LabelAlert")).setVisible(true);

                        ((JLabel) uiData.get("LabelImageProxy")).setIcon(new ImageIcon(IMAGE_NO));
                        ((JLabel) uiData.get("LabelImageProxy")).setVisible(true);
                    }
                } else {
                    Controller.setProxy(null);
                    ((JLabel) uiData.get("LabelAlert"))
                            .setText("Please insert a valid proxy!");
                    ((JLabel) uiData.get("LabelAlert")).setVisible(true);

                    ((JLabel) uiData.get("LabelImageProxy")).setIcon(new ImageIcon(IMAGE_NO));
                    ((JLabel) uiData.get("LabelImageProxy")).setVisible(true);

                }
                break;

            case "txtUsername":
                if (InterceptingFilter.verifyText(((JTextField) uiData
                        .get("Username")).getText())) {
                    if (Controller.getProxy() != null) {
                        if (!Controller.getProxy().IsAvailable(
                                ((JTextField) uiData.get("Username")).getText())) {
                            ((JLabel) uiData.get("LabelImageUsername")).setIcon(new ImageIcon(IMAGE_YES));
                            ((JLabel) uiData.get("LabelImageUsername")).setVisible(true);

                            ((JLabel) uiData.get("LabelAlert")).setVisible(false);

                        } else {
                            ((JLabel) uiData.get("LabelAlert"))
                                    .setText("Please insert a valid username!");
                            ((JLabel) uiData.get("LabelAlert")).setVisible(true);

                            ((JLabel) uiData.get("LabelImageUsername")).setIcon(new ImageIcon(IMAGE_NO));
                            ((JLabel) uiData.get("LabelImageUsername")).setVisible(true);

                        }
                    } else {
                        ((JLabel) uiData.get("LabelAlert"))
                                .setText("Please enter a valid proxy first!");
                        ((JLabel) uiData.get("LabelAlert")).setVisible(true);

                        ((JLabel) uiData.get("LabelImageUsername")).setIcon(new ImageIcon(IMAGE_NO));
                        ((JLabel) uiData.get("LabelImageUsername")).setVisible(true);

                        ((JLabel) uiData.get("LabelImageProxy")).setIcon(new ImageIcon(IMAGE_NO));
                        ((JLabel) uiData.get("LabelImageProxy")).setVisible(true);

                    }
                } else {
                    ((JLabel) uiData.get("LabelAlert"))
                            .setText("Please enter a username!");
                    ((JLabel) uiData.get("LabelAlert")).setVisible(true);

                    ((JLabel) uiData.get("LabelImageUsername")).setIcon(new ImageIcon(IMAGE_NO));
                    ((JLabel) uiData.get("LabelImageUsername")).setVisible(true);
                }
                break;

            case "txtPassword":
                if (! (((JTextField)uiData.get("Password")).getText().isEmpty()) ){

                    ((JLabel) uiData.get("LabelImagePassword")).setIcon(new ImageIcon(IMAGE_YES));
                    ((JLabel) uiData.get("LabelImagePassword")).setVisible(true);

                    ((JLabel) uiData.get("LabelAlert")).setVisible(false);

                } else {
                    ((JLabel) uiData.get("LabelAlert"))
                            .setText("Please insert a password!");
                    ((JLabel) uiData.get("LabelAlert")).setVisible(true);

                    ((JLabel) uiData.get("LabelImagePassword")).setIcon(new ImageIcon(IMAGE_NO));
                    ((JLabel) uiData.get("LabelImagePassword")).setVisible(true);

                }
                break;

            case "btnLogin":
                    //start progressbar
                    Controller.setWindowName("ProgressBar");
                    Controller.setWindow(Controller.getOpBar());
                    Controller.getWindow().revalidate();
                    Controller.getOpBar().setFlag(false);
                    Controller.getOpBar().setLabelBar("Login in progress..");
                    Controller.getOpBar().start();

                    Controller.temporaryInformation.put("OperationProgressBar",  Controller.getOpBar());

                if (Controller.getProxy() == null) {
                    Controller.setProxy(new ProxyWrapper());

                    Controller.getProxy().setHost(
                            ((JTextField) uiData.get("ProxyHost")).getText());

                } else {
                    Controller.getProxy().setHost(
                            ((JTextField) uiData.get("ProxyHost")).getText());

                }

                if (Controller.getProxy().IsWebServiceRunning()) {

                    user = Controller.getProxy().GetUser(
                            ((JTextField) uiData.get("Username")).getText(),
                            ((JTextField) uiData.get("Password")).getText());

                    if (user == null) {
                        ((JLabel) uiData.get("LabelAlert"))
                                .setText("username or password not valid!");
                        ((JLabel) uiData.get("LabelAlert")).setVisible(true);

                        ((JLabel) uiData.get("LabelImageUsername")).setIcon(new ImageIcon(IMAGE_NO));
                        ((JLabel) uiData.get("LabelImageUsername")).setVisible(true);
                        ((JLabel) uiData.get("LabelImagePassword")).setIcon(new ImageIcon(IMAGE_NO));
                        ((JLabel) uiData.get("LabelImagePassword")).setVisible(true);

                        Controller.getOpBar().setStop(1);
                        reLogin();


                    } else {
                        if (((JCheckBox) uiData.get("SavePassword"))
                                .isSelected()) {
                            Controller.setPreferences("password",
                                    ((JTextField) uiData.get("Password"))
                                            .getText());
                        } else {
                            Controller.setPreferences("password", "");
                        }

                        if (((JCheckBox) uiData.get("Autologin"))
                                .isSelected()) {
                            Controller.setPreferences("autoLogin", "true");
                            Controller.setPreferences("FlagAutologin", "False");

                        } else {
                            Controller.setPreferences("autoLogin", "false");
                            Controller.setPreferences("FlagAutologin", "False");
                        }

                        Controller.setCurrentUser(user);
                        Controller.setCurrentUserPassword(((JTextField) uiData
                                .get("Password")).getText());

                        Controller.setPreferences("proxyHost", ((JTextField) uiData.get("ProxyHost")).getText());

                        Controller.setPreferences("proxyRoot",
                                ((JTextField) uiData.get("ProxyHost")).getText());

                        Controller.setPreferences("username", user.Username);


                        Controller.setWindowName("Profile");
                        Controller.setWindow(Controller.getProfilePanel());
                        Controller.getWindow().revalidate();
                        //clear(uiData);

                        Controller.getOpBar().setStop(1);
                    }
                } else {

                    ((JLabel) uiData.get("LabelAlert"))
                            .setText("The connection with the Proxy failed");
                    ((JLabel) uiData.get("LabelAlert")).setVisible(true);

                    ((JLabel) uiData.get("LabelImageProxy")).setIcon(new ImageIcon(IMAGE_NO));
                    ((JLabel) uiData.get("LabelImageProxy")).setVisible(true);

                    Controller.getOpBar().setStop(1);
                    reLogin();
                }

            break;

            case "lblChange":
                Controller.setWindowName("Registration");
                Controller.setWindow(Controller.getRegistrationPanel());
                Controller.getWindow().revalidate();
                clear(uiData);

                break;

            default:
                break;
        }
    }

    private void clear(HashMap<String, Object> uiData) {

        ((JTextField) uiData.get("ProxyHost")).setText("");
        ((JTextField) uiData.get("Username")).setText("");
        ((JTextField) uiData.get("Password")).setText("");
        ((JLabel) uiData.get("LabelImageProxy")).setIcon(null);
        ((JLabel) uiData.get("LabelImageUsername")).setIcon(null);
        ((JLabel) uiData.get("LabelImagePassword")).setIcon(null);
        ((JLabel) uiData.get("LabelImagePassword")).setIcon(null);
        ((JLabel) uiData.get("LabelAlert")).setVisible(false);

    }

    private void reLogin(){
        Controller.setWindowName("Login");
        Controller.setWindow(Controller.getLoginPanel());
        Controller.getWindow().revalidate();

    }
}
