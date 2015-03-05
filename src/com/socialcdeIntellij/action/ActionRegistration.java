package com.socialcdeIntellij.action;

import com.socialcdeIntellij.controller.Controller;
import com.socialcdeIntellij.model.ProxyWrapper;
import com.socialcdeIntellij.object.ImagesMod;
import com.socialcdeIntellij.object.OperationProgressBar;
import com.socialcdeIntellij.staticview.LoginPanel;
import javax.swing.*;
import java.awt.*;
import java.io.IOException;
import java.util.HashMap;


public class ActionRegistration {
    private static Image IMAGE_YES;
    private static Image IMAGE_NO;
    private OperationProgressBar opBar;
    private ImagesMod im = new ImagesMod();

    public ActionRegistration() {}

    public ActionRegistration(HashMap<String, Object> uiData) {
        String widgetName = uiData.get("ID_action").toString();
        //int type = (Integer) uiData.get("Event_type");
       // Event event = (Event) uiData.get("Event");

        try {
            IMAGE_NO = im.getNO_ICON(32,16);
            IMAGE_YES = im.getYES_ICON(32,16);
        } catch (IOException e) {
            e.printStackTrace();
        }

        switch (widgetName) {

            case "txtProxy":

                if (!((JTextField)uiData.get("ProxyHost")).isFocusOwner()){

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
                }
                break;

            case "txtUsername":

                if (!((JTextField)uiData.get("Username")).isFocusOwner()){
                    if (InterceptingFilter.verifyText(((JTextField) uiData
                            .get("Username")).getText())) {
                        if (Controller.getProxy() != null) {
                            if (!Controller.getProxy().IsAvailable(
                                    ((JTextField) uiData.get("Username")).getText())) {
                                ((JLabel) uiData.get("LabelAlert"))
                                        .setText("Please insert a valid username!");
                                ((JLabel) uiData.get("LabelAlert")).setVisible(true);

                                ((JLabel) uiData.get("LabelImageUsername")).setIcon(new ImageIcon(IMAGE_NO));
                                ((JLabel) uiData.get("LabelImageUsername")).setVisible(true);

                            } else {
                                ((JLabel) uiData.get("LabelImageUsername")).setIcon(new ImageIcon(IMAGE_YES));
                                ((JLabel) uiData.get("LabelImageUsername")).setVisible(true);

                                ((JLabel) uiData.get("LabelAlert")).setVisible(false);
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
                                .setText("Please enter a valid username!");
                        ((JLabel) uiData.get("LabelAlert")).setVisible(true);

                        ((JLabel) uiData.get("LabelImageUsername")).setIcon(new ImageIcon(IMAGE_NO));
                        ((JLabel) uiData.get("LabelImageUsername")).setVisible(true);
                    }
                }
                break;

            case "txtEmail":

                if (!((JTextField)uiData.get("Email")).isFocusOwner()){
                    if (InterceptingFilter.verifyMail(((JTextField) uiData.get("Email"))
                            .getText())) {

                        ((JLabel) uiData.get("LabelImageMail")).setIcon(new ImageIcon(IMAGE_YES));
                        ((JLabel) uiData.get("LabelImageMail")).setVisible(true);

                        ((JLabel) uiData.get("LabelAlert")).setVisible(false);

                    } else {
                        ((JLabel) uiData.get("LabelAlert"))
                                .setText("Please insert a valid mail!");
                        ((JLabel) uiData.get("LabelAlert")).setVisible(true);

                        ((JLabel) uiData.get("LabelImageMail")).setIcon(new ImageIcon(IMAGE_NO));
                        ((JLabel) uiData.get("LabelImageMail")).setVisible(true);

                    }
                }

                break;

            case "btnRegister":

                if (((JButton)uiData.get("ButtonRegister")).getModel().isPressed()){

                    opBar = new OperationProgressBar();
                    //pbWindow = new ProgressBarThread();
                    Controller.temporaryInformation.put("ProgressBarThread", opBar);

                    opBar.setLabelBar("Login in progress..");
                    opBar.start();

                    HashMap<String, String> dataExtracted = new HashMap<String, String>();
                    dataExtracted.put("Username",
                            ((JTextField) uiData.get("Username")).getText());

                    dataExtracted.put("Password",
                            ((JTextField) uiData.get("Password")).getText());

                    dataExtracted.put("ConfirmPassword",
                            ((JTextField) uiData.get("ConfirmPassword")).getText());

                    dataExtracted.put("InvitationCode",
                            ((JTextField) uiData.get("InvitationCode")).getText());

                    dataExtracted.put("Email",
                            ((JTextField) uiData.get("Email")).getText());

                    dataExtracted.put("ProxyHost",
                            ((JTextField) uiData.get("ProxyHost")).getText());

                    int res = actionRegister(dataExtracted);

                    dataExtracted.clear();

                    switch (res) {

                        case -3:

                            ((Label) uiData.get("LabelAlert"))
                                    .setText("Please compile all field correctly!");
                            ((Label) uiData.get("LabelAlert")).setVisible(true);

                            opBar.stop();
                            opBar = null;
                            break;

                        case -2:

                            ((Label) uiData.get("LabelAlert"))
                                    .setText("Please enter a valid proxy!");
                            ((Label) uiData.get("LabelAlert")).setVisible(true);

                            opBar.stop();
                            opBar = null;
                            break;

                        case -1:

                            ((Label) uiData.get("LabelAlert"))
                                    .setText("There's a problem. Check your connection and try again");

                            opBar.stop();
                            opBar = null;

                            break;
                        case 0:

                            boolean password = Controller.getProxy().ChangePassword(
                                    ((JTextField) uiData.get("Username")).getText(),
                                    ((JTextField) uiData.get("InvitationCode")).getText(),
                                    ((JTextField) uiData.get("Password")).getText());

                            if (password) {

                                Controller.setPreferences("proxyHost", ((JTextField) uiData.get("ProxyHost")).getText());

                                Controller.setPreferences("username",
                                        ((JTextField) uiData.get("Username")).getText());

                                Controller.setPreferences("proxyRoot",
                                        ((JTextField) uiData.get("ProxyHost")).getText());

                                Controller.setPreferences("password",
                                        ((JTextField) uiData.get("Password")).getText());

                                Controller.setPreferences("email",
                                        ((JTextField) uiData.get("Email")).getText());

                            } else {
                                ((Label) uiData.get("LabelAlert"))
                                        .setText("There's a problem. Check your connection and try again");

                                ((Label) uiData.get("LabelAlert")).setVisible(true);

                                opBar.stop();
                                opBar = null;

                            }

                            break;
                        case 1: // if e-mail address does not exist in the database

                            ((Label) uiData.get("LabelAlert"))
                                    .setText("Please enter the email on which you recived the invite");

                            ((Label) uiData.get("LabelAlert")).setVisible(true);

                            opBar.stop();
                            opBar = null;

                            break;
                        case 2:
                            // if password does not match with the e-mail address sent

                            ((Label) uiData.get("LabelAlert"))
                                    .setText("Please enter the invitation code that you recived in the invite");

                            ((Label) uiData.get("LabelAlert")).setVisible(true);

                            opBar.stop();
                            opBar = null;

                            break;
                        case 3: // if username is already used by another user

                            ((Label) uiData.get("LabelAlert"))
                                    .setText("The Username chosen is not aviable");

                            ((Label) uiData.get("LabelAlert")).setVisible(true);

                            opBar.stop();
                            opBar = null;

                            break;
                        default:

                            ((Label) uiData.get("LabelAlert"))
                                    .setText("Response not valid from the server");

                            ((Label) uiData.get("LabelAlert")).setVisible(true);

                            opBar.stop();
                            opBar = null;

                            break;
                    }

                    if (res == 0) {

                        Controller.getRegistrationPanel().remove(Controller.getRegistrationPanel());
                        Controller.setRegistration_panel(null);

                        Controller.setLoginPanel(new LoginPanel());
                        Controller.getLoginPanel().setVisible(true);

                        opBar.stop();
                        opBar = null;

                    }

                }
                break;

            case "labelLogin":

                Controller.getRegistrationPanel().remove(Controller.getRegistrationPanel());
                Controller.setRegistration_panel(null);

                Controller.setLoginPanel(new LoginPanel());
                Controller.getLoginPanel().setVisible(true);

                break;

            default:
                break;
        }

    }


    public int actionRegister(HashMap<String, String> dataExtracted) {
        int res = -4;

        if (InterceptingFilter.verifyRegistrationPanel(dataExtracted)) {

            if (Controller.getProxy() != null) {
                // register
                res = Controller.getProxy().SubscribeUser(
                        dataExtracted.get("Email"),
                        dataExtracted.get("InvitationCode"),
                        dataExtracted.get("Username"));

            } else {

                Controller.setProxy(new ProxyWrapper());
                Controller.getProxy().setHost(dataExtracted.get("ProxyHost"));

                if (Controller.getProxy().IsWebServiceRunning()) {

                    res = Controller.getProxy().SubscribeUser(
                            dataExtracted.get("Email"),
                            dataExtracted.get("InvitationCode"),
                            dataExtracted.get("Username"));

                } else {
                    res = -2;
                }

            }
        } else {
            res = -3;

        }

        return res;
    }
}
