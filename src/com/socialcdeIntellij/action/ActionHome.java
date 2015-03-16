package com.socialcdeIntellij.action;

import com.socialcdeIntellij.controller.Controller;
import com.socialcdeIntellij.object.ImagesMod;
import com.socialcdeIntellij.popup.ChangeAvatar;
import com.socialcdeIntellij.popup.PopupService;
import com.socialcdeIntellij.popup.PopupServiceRegistered;
import com.socialcdeIntellij.popup.PopupSkill;
import com.socialcdeIntellij.shared.library.WService;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by Teo on 13/03/2015.
 */
public class ActionHome {

    public ActionHome(HashMap<String, Object> uiData) {

        String widgetName = uiData.get("ID_action").toString();

        switch (widgetName) {

            case "lblAvatar":
                ChangeAvatar changeAvatar = new ChangeAvatar(Controller.getFrame());
                changeAvatar.setVisible(true);

                break;

            case "lblSkills":
                PopupSkill popupSkill = new PopupSkill(Controller.getFrame());
                popupSkill.setVisible(true);
                break;

            case "lblSettings":
                Controller.selectDynamicWindow(1);
                Controller.getWindow().revalidate();
                break;

            case "btnService":
                if (Controller.getProxy().IsWebServiceRunning()) {

                    WService[] serviceV = (WService[]) uiData.get("service");
                    int count = 0; //uiData.get("");

                    WService service = serviceV[count];
                    System.out.println(service);
                // if (service.Registered) {

                    PopupServiceRegistered serviceSetting = new PopupServiceRegistered(Controller.getFrame());
                    serviceSetting.setVisible(true);

                    serviceSetting.setService(service);
                    serviceSetting.setServiceName(service.Name);
                    serviceSetting.setImage(Controller.getServicesImage().get(service.Name));

                    serviceSetting.getUnsubscriveButton().addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {

                            JOptionPane.showMessageDialog(Controller.getFrame(), "Are you sure you want to unsubscribe?"
                                    , "SocialCDE message", JOptionPane.NO_OPTION);
                        }
                    });
                }
                       /* serviceSetting.setBtnUnsubscriveListener(new Listener() {

                            @Override
                            public void handleEvent(Event event) {
                                MessageBox messageBox = new MessageBox(Controller
                                        .getWindow().getShell(), SWT.ICON_WARNING
                                        | SWT.YES | SWT.NO);
                                messageBox
                                        .setMessage("Are you sure you want to unsubscribe?");
                                messageBox.setText("SocialCDEforEclipse Message");
                                int response = messageBox.open();

                                switch (response) {
                                    case SWT.YES:
                                        if (!Controller
                                                .getProxy()
                                                .DeleteRegistredService(
                                                        Controller.getCurrentUser().Username,
                                                        Controller
                                                                .getCurrentUserPassword(),
                                                        serviceSetting.getService().Id)) {
                                            MessageBox messageBox2 = new MessageBox(
                                                    Controller.getWindow().getShell(),
                                                    SWT.ICON_ERROR | SWT.OK);
                                            messageBox2
                                                    .setMessage("Something was wrong, please try again.");
                                            messageBox2
                                                    .setText("SocialCDEforEclipse Message");
                                            messageBox2.open();
                                        }
                                        break;
                                    case SWT.NO:
                                    default:
                                        break;
                                }
                                serviceSetting.dispose(null);

                                SquareButtonService.yCoordinateValue = 5;
                                SquareButtonService.counterPosition = 0;

                                Controller.selectDynamicWindow(0);

                            }
                        });

                        serviceSetting.setBtnSaveListener(new Listener() {

                            @Override
                            public void handleEvent(Event event) {

                                ArrayList<Button> btnCheckbox = serviceSetting
                                        .getCheckboxCreated();

                                int counter = 0;
                                for (int i = 0; i < btnCheckbox.size(); i++) {
                                    if (btnCheckbox.get(i).getSelection()) {
                                        counter += 1;
                                    }
                                }

                                String[] strFeature = new String[counter];
                                counter = 0;
                                for (int i = 0; i < btnCheckbox.size(); i++) {
                                    if (btnCheckbox.get(i).getSelection()) {
                                        strFeature[counter] = btnCheckbox.get(i)
                                                .getData("FeatureName").toString();
                                        counter += 1;
                                    }
                                }

                                if (Controller.getProxy().UpdateChosenFeatures(
                                        Controller.getCurrentUser().Username,
                                        Controller.getCurrentUserPassword(),
                                        serviceSetting.getService().Id, strFeature)) {
                                    serviceSetting.dispose(null);
                                } else {
                                    MessageBox messageBox2 = new MessageBox(
                                            Controller.getWindow().getShell(),
                                            SWT.ICON_ERROR | SWT.OK);
                                    messageBox2
                                            .setMessage("Something was wrong, please try again.");
                                    messageBox2
                                            .setText("SocialCDEforEclipse Message");
                                    messageBox2.open();

                                }
                            }
                        });



                    } else {

                        if (service.RequireOAuth) {

                            WOAuthData oauthData = Controller.getProxy()
                                    .GetOAuthData(
                                            Controller.getCurrentUser().Username,
                                            Controller.getCurrentUserPassword(),
                                            service.Id);
						*//*System.out.println("OauthData access secret "
								+ oauthData.AccessSecret + " token "
								+ oauthData.AccessToken + " oauth link "
								+ oauthData.AuthorizationLink + " id "
								+ service.Id);*//*
                            pinWindow
                                    .setxCoordinate(Controller.getWindow()
                                            .toDisplay(
                                                    Controller.getWindow()
                                                            .getLocation().x,
                                                    Controller.getWindow()
                                                            .getLocation().y).x);
                            pinWindow
                                    .setyCoordinate(Controller.getWindow()
                                            .toDisplay(
                                                    Controller.getWindow()
                                                            .getLocation().x,
                                                    Controller.getWindow()
                                                            .getLocation().y).y);
                            pinWindow
                                    .setxCoordinateWithOffset(Controller
                                            .getWindow().toDisplay(
                                                    Controller.getWindow()
                                                            .getLocation().x,
                                                    Controller.getWindow()
                                                            .getLocation().y).x- 30);
                            pinWindow
                                    .setyCoordinateWithOffset(Controller
                                            .getWindow().toDisplay(
                                                    Controller.getWindow()
                                                            .getLocation().x,
                                                    Controller.getWindow()
                                                            .getLocation().y).y
                                            + (Controller.getWindow().getBounds().height - 200)
                                            / 2);
                            pinWindow.setService(service);
                            pinWindow.setOauthData(oauthData);

                            Controller.temporaryInformation.put("CurrentURL",
                                    oauthData.AuthorizationLink);

                            Controller.temporaryInformation.put("Service", service);

                            pinWindow.setOkListener(new Listener() {

                                @Override
                                public void handleEvent(Event event) {

                                    ServiceOkClick();

                                }
                            });
                            pinWindow.setCancelListener(new Listener() {

                                @Override
                                public void handleEvent(Event event) {
                                    // TODO Auto-generated method stub
                                    ServiceCancelClick();
                                }
                            });

                            pinWindow.inizialize(Controller.getWindow());

                            try {
                                PlatformUI
                                        .getWorkbench()
                                        .getActiveWorkbenchWindow()
                                        .getActivePage()
                                        .showView(browserViewName);

                            } catch (PartInitException e1) {

                                e1.printStackTrace();
                            }


                        } else if (service.RequireTFSAuthentication) {
                            final TFSLogin tfsPanel = new TFSLogin();
                            tfsPanel.setxCoordinate(Controller.getWindow()
                                    .toDisplay(
                                            Controller.getWindow().getLocation().x,
                                            Controller.getWindow().getLocation().y).x);
                            tfsPanel.setyCoordinate(Controller.getWindow()
                                    .toDisplay(
                                            Controller.getWindow().getLocation().x,
                                            Controller.getWindow().getLocation().y).y);
                            tfsPanel.setxCoordinateWithOffset(Controller
                                    .getWindow().toDisplay(
                                            Controller.getWindow().getLocation().x,
                                            Controller.getWindow().getLocation().y).x - 30 );
                            tfsPanel.setyCoordinateWithOffset(Controller
                                    .getWindow().toDisplay(
                                            Controller.getWindow().getLocation().x,
                                            Controller.getWindow().getLocation().y).y
                                    + (Controller.getWindow().getBounds().height - 200)
                                    / 2);
                            tfsPanel.setService(service);
                            tfsPanel.setOkListener(new Listener() {

                                @Override
                                public void handleEvent(Event event) {
                                    // TODO Auto-generated method stub
                                    HashMap<String, Object> tfsData = tfsPanel
                                            .getData();
								*//*System.out.println("Domain "
										+ tfsData.get("textDomain").toString());
								System.out.println("Username "
										+ ((Text) tfsData.get("textUsername"))
												.getText());
								System.out.println("Password "
										+ ((Text) tfsData.get("textPassword"))
												.getText());*//*

                                    if (Controller.getProxy().RecordService(
                                            Controller.getCurrentUser().Username,
                                            Controller.getCurrentUserPassword(),
                                            tfsPanel.getService().Id,
                                            ((Text) tfsData.get("textUsername"))
                                                    .getText(),
                                            ((Text) tfsData.get("textPassword"))
                                                    .getText(),
                                            tfsData.get("textDomain").toString())) {
                                        tfsPanel.dispose(null);
                                        Controller.selectDynamicWindow(0);

                                        final SettingServicePanel serviceSetting = new SettingServicePanel();
                                        serviceSetting
                                                .setxCoordinate(Controller
                                                        .getWindow()
                                                        .toDisplay(
                                                                Controller
                                                                        .getWindow()
                                                                        .getLocation().x,
                                                                Controller
                                                                        .getWindow()
                                                                        .getLocation().y).x);
                                        serviceSetting
                                                .setyCoordinate(Controller
                                                        .getWindow()
                                                        .toDisplay(
                                                                Controller
                                                                        .getWindow()
                                                                        .getLocation().x,
                                                                Controller
                                                                        .getWindow()
                                                                        .getLocation().y).y);
                                        serviceSetting
                                                .setxCoordinateWithOffset(Controller
                                                        .getWindow()
                                                        .toDisplay(
                                                                Controller
                                                                        .getWindow()
                                                                        .getLocation().x,
                                                                Controller
                                                                        .getWindow()
                                                                        .getLocation().y).x - 30);
                                        serviceSetting
                                                .setyCoordinateWithOffset(Controller
                                                        .getWindow()
                                                        .toDisplay(
                                                                Controller
                                                                        .getWindow()
                                                                        .getLocation().x,
                                                                Controller
                                                                        .getWindow()
                                                                        .getLocation().y).y
                                                        + (Controller.getWindow()
                                                        .getBounds().height - 200)
                                                        / 2);
                                        serviceSetting.setSelectAllItems(true);
                                        serviceSetting.setService(tfsPanel
                                                .getService());
                                        serviceSetting
                                                .setBtnUnsubscriveListener(new Listener() {

                                                    @Override
                                                    public void handleEvent(
                                                            Event event) {
                                                        MessageBox messageBox = new MessageBox(
                                                                Controller
                                                                        .getWindow()
                                                                        .getShell(),
                                                                SWT.ICON_WARNING
                                                                        | SWT.YES
                                                                        | SWT.NO);
                                                        messageBox
                                                                .setMessage("Are you sure you want to unsubscribe?");
                                                        messageBox
                                                                .setText("SocialCDEforEclipse Message");
                                                        int response = messageBox
                                                                .open();

                                                        switch (response) {
                                                            case SWT.YES:
                                                                if (!Controller
                                                                        .getProxy()
                                                                        .DeleteRegistredService(
                                                                                Controller
                                                                                        .getCurrentUser().Username,
                                                                                Controller
                                                                                        .getCurrentUserPassword(),
                                                                                serviceSetting
                                                                                        .getService().Id)) {
                                                                    MessageBox messageBox2 = new MessageBox(
                                                                            Controller
                                                                                    .getWindow()
                                                                                    .getShell(),
                                                                            SWT.ICON_ERROR
                                                                                    | SWT.OK);
                                                                    messageBox2
                                                                            .setMessage("Something was wrong, please try again.");
                                                                    messageBox2
                                                                            .setText("SocialCDEforEclipse Message");
                                                                    messageBox2.open();
                                                                }
                                                                break;
                                                            case SWT.NO:
                                                            default:
                                                                break;
                                                        }
                                                        serviceSetting
                                                                .dispose(null);

                                                        SquareButtonService.yCoordinateValue = 5;
                                                        SquareButtonService.counterPosition = 0;

                                                        Controller
                                                                .selectDynamicWindow(0);

                                                    }
                                                });

                                        serviceSetting
                                                .setBtnSaveListener(new Listener() {

                                                    @Override
                                                    public void handleEvent(
                                                            Event event) {

                                                        ArrayList<Button> btnCheckbox = serviceSetting
                                                                .getCheckboxCreated();

                                                        int counter = 0;
                                                        for (int i = 0; i < btnCheckbox
                                                                .size(); i++) {
                                                            if (btnCheckbox.get(i)
                                                                    .getSelection()) {
                                                                counter += 1;
                                                            }
                                                        }

                                                        String[] strFeature = new String[counter];
                                                        counter = 0;
                                                        for (int i = 0; i < btnCheckbox
                                                                .size(); i++) {
                                                            if (btnCheckbox.get(i)
                                                                    .getSelection()) {
                                                                strFeature[counter] = btnCheckbox
                                                                        .get(i)
                                                                        .getData(
                                                                                "FeatureName")
                                                                        .toString();
                                                                counter += 1;
                                                            }
                                                        }

                                                        if (Controller
                                                                .getProxy()
                                                                .UpdateChosenFeatures(
                                                                        Controller
                                                                                .getCurrentUser().Username,
                                                                        Controller
                                                                                .getCurrentUserPassword(),
                                                                        serviceSetting
                                                                                .getService().Id,
                                                                        strFeature)) {
                                                            serviceSetting
                                                                    .dispose(null);
                                                        } else {
                                                            MessageBox messageBox2 = new MessageBox(
                                                                    Controller
                                                                            .getWindow()
                                                                            .getShell(),
                                                                    SWT.ICON_ERROR
                                                                            | SWT.OK);
                                                            messageBox2
                                                                    .setMessage("Something was wrong, please try again.");
                                                            messageBox2
                                                                    .setText("SocialCDEforEclipse Message");
                                                            messageBox2.open();

                                                        }
                                                    }
                                                });

                                        serviceSetting.inizialize(Controller
                                                .getWindow());
                                    } else {
                                        MessageBox messageBox2 = new MessageBox(
                                                Controller.getWindow().getShell(),
                                                SWT.ICON_ERROR | SWT.OK);
                                        messageBox2
                                                .setMessage("Something was wrong, please try again.");
                                        messageBox2
                                                .setText("SocialCDEforEclipse Message");
                                        messageBox2.open();

                                    }

                                }
                            });
                            tfsPanel.setCancelListener(new Listener() {

                                @Override
                                public void handleEvent(Event event) {
                                    tfsPanel.dispose(null);
                                }
                            });
                            tfsPanel.inizialize(Controller.getWindow());
                        }
                    }

                }
                else
                {
                    Controller.openConnectionLostPanel("Connection Lost! \n You will be redirected to Login page.");
                }*/



               // }
                break;
            default:
                break;
        }
    }



}
