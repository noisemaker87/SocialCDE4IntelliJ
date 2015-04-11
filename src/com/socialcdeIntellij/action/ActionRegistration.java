package com.socialcdeIntellij.action;

import com.socialcdeIntellij.controller.Controller;
import com.socialcdeIntellij.proxyservice.ProxyWrapper;
import com.socialcdeIntellij.object.ImagesMod;

import javax.swing.*;
import java.awt.*;
import java.io.IOException;
import java.util.HashMap;


public class ActionRegistration {
    private static Image IMAGE_YES;
    private static Image IMAGE_NO;
    //private OperationProgressBar opBar = new OperationProgressBar();
    private ImagesMod im = new ImagesMod();

    public ActionRegistration() {}

    public ActionRegistration(HashMap<String, Object> uiData) {
        // ActionEvent event = (ActionEvent) uiData.get("Event");
        //int type = (Integer) uiData.get("Event_type");
        String widgetName = uiData.get("ID_action").toString();

        try {
            IMAGE_NO = im.getNO_ICON(32,16);
            IMAGE_YES = im.getYES_ICON(32,16);
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
                break;

            case "txtEmail":
                if (InterceptingFilter.verifyMail(((JTextField) uiData.get("Email"))
                        .getText())) {

                    ((JLabel) uiData.get("LabelImageEmail")).setIcon(new ImageIcon(IMAGE_YES));
                    ((JLabel) uiData.get("LabelImageEmail")).setVisible(true);

                    ((JLabel) uiData.get("LabelAlert")).setVisible(false);

                } else {
                    ((JLabel) uiData.get("LabelAlert"))
                            .setText("Please insert a valid mail!");
                    ((JLabel) uiData.get("LabelAlert")).setVisible(true);

                    ((JLabel) uiData.get("LabelImageEmail")).setIcon(new ImageIcon(IMAGE_NO));
                    ((JLabel) uiData.get("LabelImageEmail")).setVisible(true);

                }
                break;

            case "txtPassword":
                if (InterceptingFilter.verifyText(((JTextField) uiData.get("Password"))
                        .getText())) {

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

            case "txtConfirmPassword":
                if (InterceptingFilter.verifyText(((JTextField) uiData.get("ConfirmPassword"))
                        .getText()) && ((JTextField) uiData.get("ConfirmPassword")).getText()
                        .equals(((JTextField) uiData.get("Password")).getText())) {

                    ((JLabel) uiData.get("LabelImageConfirmPassword")).setIcon(new ImageIcon(IMAGE_YES));
                    ((JLabel) uiData.get("LabelImageConfirmPassword")).setVisible(true);

                    ((JLabel) uiData.get("LabelAlert")).setVisible(false);

                } else {
                    ((JLabel) uiData.get("LabelAlert"))
                            .setText("Please confirm password!");
                    ((JLabel) uiData.get("LabelAlert")).setVisible(true);

                    ((JLabel) uiData.get("LabelImageConfirmPassword")).setIcon(new ImageIcon(IMAGE_NO));
                    ((JLabel) uiData.get("LabelImageConfirmPassword")).setVisible(true);

                }
                break;

            case "btnRegister":
                /*//opBar = new OperationProgressBar();*/

               /* Controller.setWindowName("ProgressBar");
                Controller.setWindow(Controller.getOpBar());

                Controller.getWindow().revalidate();
                Controller.getOpBar().setFlag(false);
                Controller.getOpBar().start();*/


                Controller.temporaryInformation.put("ProgressBarThread", Controller.getOpBar());

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

                /*System.out.println("ora il flag è: " + Controller.getOpBar().getFlag());
                Controller.getOpBar().setStop(1);
                System.out.println("qua il flag è: " + Controller.getOpBar().getFlag());

                if(Controller.getOpBar().getFlag()==true) {
                    Controller.setWindowName("Login");
                    Controller.setWindow(Controller.getLoginPanel());
                    Controller.getWindow().revalidate();
                    clear(uiData);
                    Controller.getOpBar().setFlag(false);
                }

                break;*/

                switch (res) {

                    case -3:

                        ((JLabel) uiData.get("LabelAlert"))
                                .setText("Please compile all field correctly!");
                        ((JLabel) uiData.get("LabelAlert")).setVisible(true);

                        reRegistration();

                        break;

                    case -2:

                        ((JLabel) uiData.get("LabelAlert"))
                                .setText("Please enter a valid proxy!");
                        ((JLabel) uiData.get("LabelAlert")).setVisible(true);

                        reRegistration();

                        break;

                    case -1:

                        ((JLabel) uiData.get("LabelAlert"))
                                .setText("There's a problem. Check your connection and try again");
                        ((JLabel) uiData.get("LabelAlert")).setVisible(true);


                        reRegistration();

                        break;
                    case 0:

                        boolean password = Controller.getProxy().ChangePassword(
                                ((JTextField) uiData.get("Username")).getText(),
                                ((JTextField) uiData.get("InvitationCode")).getText(),
                                ((JTextField) uiData.get("Password")).getText());

                        if (password) {

                            Controller.setPreferences("proxyHost", ((JTextField) uiData.get("ProxyHost")).getText());

                            Controller.setPreferences("username",  ((JTextField) uiData.get("Username")).getText());

                            Controller.setPreferences("proxyRoot", ((JTextField) uiData.get("ProxyHost")).getText());

                            Controller.setPreferences("password",  ((JTextField) uiData.get("Password")).getText());

                        } else {
                            ((JLabel) uiData.get("LabelAlert"))
                                    .setText("There's a problem. Check your connection and try again");

                            ((JLabel) uiData.get("LabelAlert")).setVisible(true);

                            reRegistration();

                        }

                        break;
                    case 1: // if e-mail address does not exist in the database

                        ((JLabel) uiData.get("LabelAlert"))
                                .setText("Please enter the email on which you recived the invite");
                        ((JLabel) uiData.get("LabelAlert")).setVisible(true);

                        reRegistration();

                        break;
                    case 2:
                        // if password does not match with the e-mail address sent

                        ((JLabel) uiData.get("LabelAlert"))
                                .setText("Please enter the invitation code that you recived in the invite");
                        ((JLabel) uiData.get("LabelAlert")).setVisible(true);

                        reRegistration();

                        break;
                    case 3: // if username is already used by another user

                        ((JLabel) uiData.get("LabelAlert"))
                                .setText("The Username chosen is not aviable");
                        ((JLabel) uiData.get("LabelAlert")).setVisible(true);

                        reRegistration();

                        break;
                    default:

                        ((JLabel) uiData.get("LabelAlert"))
                                .setText("Response not valid from the server");
                        ((JLabel) uiData.get("LabelAlert")).setVisible(true);

                        reRegistration();

                        break;
                }

                if (res == 0) {

                    Controller.setWindowName("Login");
                    Controller.setWindow(Controller.getLoginPanel());
                    Controller.getWindow().revalidate();
                    clear(uiData);

                }
                break;

            case "lblChange":
                Controller.setWindowName("Login");
                Controller.setWindow(Controller.getLoginPanel());
                Controller.getWindow().revalidate();
                clear(uiData);

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

    private void reRegistration(){
        Controller.setWindowName("Registration");
        Controller.setWindow(Controller.getRegistrationPanel());
        Controller.getWindow().revalidate();

    }

    private void clear(HashMap<String, Object> uiData) {

        ((JTextField) uiData.get("ProxyHost")).setText("");
        ((JTextField) uiData.get("Email")).setText("");
        ((JTextField) uiData.get("InvitationCode")).setText("");
        ((JTextField) uiData.get("Username")).setText("");
        ((JTextField) uiData.get("Password")).setText("");
        ((JTextField) uiData.get("ConfirmPassword")).setText("");
        ((JLabel) uiData.get("LabelImageProxy")).setIcon(null);
        ((JLabel) uiData.get("LabelImageEmail")).setIcon(null);
        ((JLabel) uiData.get("LabelImageInvitationCode")).setIcon(null);
        ((JLabel) uiData.get("LabelImageUsername")).setIcon(null);
        ((JLabel) uiData.get("LabelImagePassword")).setIcon(null);
        ((JLabel) uiData.get("LabelImageConfirmPassword")).setIcon(null);
        ((JLabel) uiData.get("LabelAlert")).setVisible(false);

    }
}
