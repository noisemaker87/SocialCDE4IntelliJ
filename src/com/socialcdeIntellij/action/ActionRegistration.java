package com.socialcdeIntellij.action;

import com.socialcdeIntellij.controller.Controller;
import com.socialcdeIntellij.model.ProxyWrapper;
import com.socialcdeIntellij.staticview.LoginPanel;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;

/**
 * Created by Teo on 02/03/2015.
 */
public class ActionRegistration {
    private static Image IMAGE_OK;
    private static Image IMAGE_NO;

    public ActionRegistration() {}

    private BufferedImage resize(BufferedImage originalImage, int width, int height) throws IOException {
        BufferedImage resizedImage = null;
        Graphics2D g = resizedImage.createGraphics();
        g.drawImage(originalImage, 0, 0, width, height, null);
        g.dispose();
        return resizedImage;
    }//ridimensione immagine

    public Image get_ImageStream(InputStream stream) throws IOException {
        Image image = ImageIO.read(stream);
        return image;
    }//prende immagine da stream

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

    public ActionRegistration(HashMap<String, Object> uiData) {
        String widgetName = uiData.get("ID_action").toString();
        int type = (Integer) uiData.get("Event_type");
        Event event = (Event) uiData.get("Event");

        try {
            IMAGE_NO = Controller.getRegistrationPanel().get_ImageStream(
                    this.getClass().getClassLoader()
                            .getResourceAsStream("images/no_icon.png"));
            IMAGE_OK = Controller.getRegistrationPanel().get_ImageStream(
                    this.getClass().getClassLoader()
                            .getResourceAsStream("images/yes_icon.png"));

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

                            ((JLabel) uiData.get("LabelImageHostOk")).setVisible(true);
                            ((JLabel) uiData.get("LabelImageHostHidden")).setVisible(false);
                            ((JLabel) uiData.get("LabelImageHostNo")).setVisible(false);

                        } else {

                            Controller.setProxy(null);

                            ((JLabel) uiData.get("LabelAlert"))
                                    .setText("Please insert a valid proxy!");
                            ((JLabel) uiData.get("LabelAlert")).setVisible(true);

                            ((JLabel) uiData.get("LabelImageHostOk")).setVisible(false);
                            ((JLabel) uiData.get("LabelImageHostHidden")).setVisible(false);
                            ((JLabel) uiData.get("LabelImageHostNo")).setVisible(true);
                        }
                    } else {
                        Controller.setProxy(null);

                        ((JLabel) uiData.get("LabelAlert"))
                                .setText("Please insert a valid proxy!");
                        ((JLabel) uiData.get("LabelAlert")).setVisible(true);

                        ((JLabel) uiData.get("LabelImageHostOk")).setVisible(false);
                        ((JLabel) uiData.get("LabelImageHostHidden")).setVisible(false);
                        ((JLabel) uiData.get("LabelImageHostNo")).setVisible(true);

                    }
                }

                break;

            case "txtUsername":

                if (type == SWT.FocusOut) {
                    if (InterceptingFilter.verifyText(((JTextField) uiData
                            .get("Username")).getText())) {
                        if (Controller.getProxy() != null) {
                            if (!Controller.getProxy().IsAvailable(
                                    ((JTextField) uiData.get("Username")).getText())) {

                                ((Label) uiData.get("LabelAlert"))
                                        .setText("Please insert a valid username!");
                                ((Label) uiData.get("LabelAlert")).setVisible(true);

                                GridData tempGrid = (GridData) ((Label) uiData.get("LabelImageUsernameNo")).getLayoutData();
                                tempGrid.exclude = false;
                                ((Label) uiData.get("LabelImageUsernameNo")).setVisible(true);

                                tempGrid = (GridData) ((Label) uiData.get("LabelImageUsernameOk")).getLayoutData();
                                tempGrid.exclude = true;
                                ((Label) uiData.get("LabelImageUsernameOk")).setVisible(false);

                                tempGrid = (GridData) ((Label) uiData.get("LabelImageUsernameHidden")).getLayoutData();
                                tempGrid.exclude = true;
                                ((Label) uiData.get("LabelImageUsernameHidden")).setVisible(false);


                                Controller.getWindow().layout();
                            } else {

                                GridData tempGrid = (GridData)	((Label) uiData.get("LabelImageUsernameOk")).getLayoutData();
                                tempGrid.exclude = false;
                                ((Label) uiData.get("LabelImageUsernameOk")).setVisible(true);

                                tempGrid = (GridData)	((Label) uiData.get("LabelImageUsernameNo")).getLayoutData();
                                tempGrid.exclude = true;
                                ((Label) uiData.get("LabelImageUsernameNo")).setVisible(false);

                                tempGrid = (GridData)	((Label) uiData.get("LabelImageUsernameHidden")).getLayoutData();
                                tempGrid.exclude = true;
                                ((Label) uiData.get("LabelImageUsernameHidden")).setVisible(false);
                                ((Label) uiData.get("LabelAlert"))
                                        .setVisible(false);
                                Controller.getWindow().layout();
                            }
                        } else {
                            ((Label) uiData.get("LabelAlert"))
                                    .setText("Please enter a valid proxy first!");
                            ((Label) uiData.get("LabelAlert")).setVisible(true);

                            GridData tempGrid = (GridData) ((Label) uiData.get("LabelImageUsernameNo")).getLayoutData();
                            tempGrid.exclude = false;
                            ((Label) uiData.get("LabelImageUsernameNo")).setVisible(true);

                            tempGrid = (GridData) ((Label) uiData.get("LabelImageUsernameOk")).getLayoutData();
                            tempGrid.exclude = true;
                            ((Label) uiData.get("LabelImageUsernameOk")).setVisible(false);

                            tempGrid = (GridData) ((Label) uiData.get("LabelImageUsernameHidden")).getLayoutData();
                            tempGrid.exclude = true;
                            ((Label) uiData.get("LabelImageUsernameHidden")).setVisible(false);

                            tempGrid = (GridData) ((Label) uiData.get("LabelImageHostNo")).getLayoutData();
                            tempGrid.exclude = false;
                            ((Label) uiData.get("LabelImageHostNo")).setVisible(true);

                            tempGrid = (GridData) ((Label) uiData.get("LabelImageHostOk")).getLayoutData();
                            tempGrid.exclude = true;
                            ((Label) uiData.get("LabelImageHostOk")).setVisible(false);

                            tempGrid = (GridData) ((Label) uiData.get("LabelImageHostHidden")).getLayoutData();
                            tempGrid.exclude = true;
                            ((Label) uiData.get("LabelImageHostHidden")).setVisible(false);

                            Controller.getWindow().layout();

                        }
                    } else {
                        ((Label) uiData.get("LabelAlert"))
                                .setText("Please enter a valid username!");
                        ((Label) uiData.get("LabelAlert")).setVisible(true);
                        GridData tempGrid = (GridData) ((Label) uiData.get("LabelImageUsernameNo")).getLayoutData();
                        tempGrid.exclude = false;
                        ((Label) uiData.get("LabelImageUsernameNo")).setVisible(true);

                        tempGrid = (GridData) ((Label) uiData.get("LabelImageUsernameOk")).getLayoutData();
                        tempGrid.exclude = true;
                        ((Label) uiData.get("LabelImageUsernameOk")).setVisible(false);

                        tempGrid = (GridData) ((Label) uiData.get("LabelImageUsernameHidden")).getLayoutData();
                        tempGrid.exclude = true;
                        ((Label) uiData.get("LabelImageUsernameHidden")).setVisible(false);

                        Controller.getWindow().layout();
                    }
                }

                break;
            case "txtMail":
                if (type == SWT.FocusOut) {
                    if (InterceptingFilter.verifyMail(((JTextField) uiData.get("Email"))
                            .getText())) {

                        GridData tempGrid = (GridData) ((Label) uiData.get("LabelImageMailOk")).getLayoutData();
                        tempGrid.exclude = false;
                        ((Label) uiData.get("LabelImageMailOk")).setVisible(true);

                        tempGrid = (GridData) ((Label) uiData.get("LabelImageMailNo")).getLayoutData();
                        tempGrid.exclude = true;
                        ((Label) uiData.get("LabelImageMailNo")).setVisible(false);

                        tempGrid = (GridData) ((Label) uiData.get("LabelImageMailHidden")).getLayoutData();
                        tempGrid.exclude = true;
                        ((Label) uiData.get("LabelImageMailHidden")).setVisible(false);


                        ((Label) uiData.get("LabelAlert")).setVisible(false);
                        Controller.getWindow().layout();

                    } else {
                        ((Label) uiData.get("LabelAlert"))
                                .setText("Please insert a valid mail!");
                        ((Label) uiData.get("LabelAlert")).setVisible(true);

                        GridData tempGrid = (GridData) ((Label) uiData.get("LabelImageMailNo")).getLayoutData();
                        tempGrid.exclude = false;
                        ((Label) uiData.get("LabelImageMailNo")).setVisible(true);

                        tempGrid = (GridData) ((Label) uiData.get("LabelImageMailOk")).getLayoutData();
                        tempGrid.exclude = true;
                        ((Label) uiData.get("LabelImageMailOk")).setVisible(false);

                        tempGrid = (GridData) ((Label) uiData.get("LabelImageMailHidden")).getLayoutData();
                        tempGrid.exclude = true;
                        ((Label) uiData.get("LabelImageMailHidden")).setVisible(false);


                        Controller.getWindow().layout();

                    }
                }

                break;

            case "btnRegister":

                if (type == SWT.Selection) {


                    pbWindow = new ProgressBarThread();
                    Controller.temporaryInformation.put("ProgressBarThread", pbWindow);
                    pbWindow.setLabelTxt("Login in progress..");
                    pbWindow.setxCoordinate(Controller.getWindow().toDisplay(
                            Controller.getWindow().getLocation().x,
                            Controller.getWindow().getLocation().y).x);
                    pbWindow.setyCoordinate(Controller.getWindow().toDisplay(
                            Controller.getWindow().getLocation().x,
                            Controller.getWindow().getLocation().y).y);
                    Controller.setProgressBarPositionX(Controller.getWindow()
                            .toDisplay(Controller.getWindow().getLocation().x,
                                    Controller.getWindow().getLocation().y).x);
                    Controller.setProgressBarPositionY(Controller.getWindow()
                            .toDisplay(Controller.getWindow().getLocation().x,
                                    Controller.getWindow().getLocation().y).y);


                    pbWindow.start();
                    HashMap<String, String> dataExtracted = new HashMap<String, String>();
                    dataExtracted.put("Username",
                            ((JTextField) uiData.get("Username")).getText());

                    dataExtracted.put("Password1",
                            ((JTextField) uiData.get("Password1")).getText());

                    dataExtracted.put("Password2",
                            ((JTextField) uiData.get("Password2")).getText());

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

                            pbWindow.setStop(1);
                            pbWindow = null;
                            break;

                        case -2:

                            ((Label) uiData.get("LabelAlert"))
                                    .setText("Please enter a valid proxy!");
                            ((Label) uiData.get("LabelAlert")).setVisible(true);

                            pbWindow.setStop(1);
                            pbWindow = null;
                            break;

                        case -1:

                            ((Label) uiData.get("LabelAlert"))
                                    .setText("There's a problem. Check your connection and try again");

                            pbWindow.setStop(1);
                            pbWindow = null;

                            break;
                        case 0:

                            boolean password = Controller.getProxy().ChangePassword(
                                    ((JTextField) uiData.get("Username")).getText(),
                                    ((JTextField) uiData.get("InvitationCode")).getText(),
                                    ((JTextField) uiData.get("Password1")).getText());

                            if (password) {

                                Controller.setPreferences("proxyHost", ((JTextField) uiData.get("ProxyHost")).getText());

                                Controller.setPreferences("username",
                                        ((JTextField) uiData.get("Username")).getText());

                                Controller.setPreferences("proxyRoot",
                                        ((JTextField) uiData.get("ProxyHost")).getText());

                                Controller.setPreferences("password",
                                        ((JTextField) uiData.get("Password1")).getText());

                                Controller.setPreferences("email",
                                        ((JTextField) uiData.get("Email")).getText());

                            } else {
                                ((Label) uiData.get("LabelAlert"))
                                        .setText("There's a problem. Check your connection and try again");

                                ((Label) uiData.get("LabelAlert")).setVisible(true);

                                pbWindow.setStop(1);
                                pbWindow = null;

                            }

                            break;
                        case 1: // if e-mail address does not exist in the database

                            ((Label) uiData.get("LabelAlert"))
                                    .setText("Please enter the email on which you recived the invite");

                            ((Label) uiData.get("LabelAlert")).setVisible(true);

                            pbWindow.setStop(1);
                            pbWindow = null;

                            break;
                        case 2:
                            // if password does not match with the e-mail address sent

                            ((Label) uiData.get("LabelAlert"))
                                    .setText("Please enter the invitation code that you recived in the invite");

                            ((Label) uiData.get("LabelAlert")).setVisible(true);

                            pbWindow.setStop(1);
                            pbWindow = null;

                            break;
                        case 3: // if username is already used by another user

                            ((Label) uiData.get("LabelAlert"))
                                    .setText("The Username chosen is not aviable");

                            ((Label) uiData.get("LabelAlert")).setVisible(true);

                            pbWindow.setStop(1);
                            pbWindow = null;

                            break;
                        default:

                            ((Label) uiData.get("LabelAlert"))
                                    .setText("Response not valid from the server");

                            ((Label) uiData.get("LabelAlert")).setVisible(true);

                            pbWindow.setStop(1);
                            pbWindow = null;

                            break;
                    }

                    if (res == 0) {

                        Controller.getRegistrationPanel().dispose(
                                Controller.getWindow());

                        Controller.setRegistration_panel(null);

                        Controller.setWindowName("Login");

                        Controller.setLoginPanel(new LoginPanel());

                        Controller.getLoginPanel().inizialize(
                                Controller.getWindow());


                        pbWindow.setStop(1);
                        pbWindow = null;

                    }

                    Controller.getWindow().layout();


                }

                break;
            case "labelLogin":

                Controller.getRegistrationPanel().dispose(Controller.getWindow());

                Controller.setRegistration_panel(null);
                Controller.setLoginPanel(new LoginPanel());
                Controller.setWindowName("Login");
                Controller.getLoginPanel().inizialize(Controller.getWindow());
                Controller.getWindow().layout();

                break;

            default:
                break;
        }

    }
}
