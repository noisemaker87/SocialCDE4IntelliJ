package com.socialcdeIntellij.action;

import com.socialcdeIntellij.controller.Controller;
import com.socialcdeIntellij.object.GeneralButton;
import com.socialcdeIntellij.popup.*;
import com.socialcdeIntellij.shared.library.WOAuthData;
import com.socialcdeIntellij.shared.library.WService;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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

                    GeneralButton gb = (GeneralButton) uiData.get("Object");
                    WService service = gb.getService();

                    if (service.Registered) {

                        final PopupServiceRegistered popupServiceRegistered = new PopupServiceRegistered(Controller.getFrame());
                        popupServiceRegistered.setVisible(true);

                        popupServiceRegistered.setService(service);
                        popupServiceRegistered.setServiceName(service.Name);
                        popupServiceRegistered.setImage(Controller.getServicesImage().get(service.Name));

                        popupServiceRegistered.getUnsubscriveButton().addActionListener(new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent e) {

                                int response = JOptionPane.showConfirmDialog(Controller.getFrame(), "Are you sure you want to unsubscribe?",
                                        "SocialCDE message", JOptionPane.OK_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE);

                                if(response == JOptionPane.OK_OPTION){
                                    if (!Controller.getProxy().DeleteRegistredService(Controller.getCurrentUser().Username,
                                            Controller.getCurrentUserPassword(),
                                            popupServiceRegistered.getService().Id)){
                                        JOptionPane.showMessageDialog(Controller.getFrame(),"Something was wrong, please try again.",
                                                "SocialCDE message",JOptionPane.ERROR_MESSAGE);
                                        popupServiceRegistered.dispose();
                                    }
                                    else {
                                        popupServiceRegistered.dispose();
                                        Controller.selectDynamicWindow(0);
                                        Controller.getWindow().revalidate();
                                    }
                                }


                            }
                        });

                        popupServiceRegistered.getSaveButton().addActionListener(new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent e) {
                                ArrayList<JCheckBox> btnCheckbox = popupServiceRegistered.getCheckboxCreated();

                                int counter = 0;
                                for (int i = 0; i < btnCheckbox.size(); i++) {
                                    if (btnCheckbox.get(i).isSelected()) {
                                        counter += 1;
                                    }
                                }

                                String[] strFeature = new String[counter];
                                counter = 0;
                                for (int i = 0; i < btnCheckbox.size(); i++) {
                                    if (btnCheckbox.get(i).isSelected()) {
                                        strFeature[counter] = btnCheckbox.get(i).getName();
                                        counter += 1;
                                    }
                                }

                                if (Controller.getProxy().UpdateChosenFeatures(
                                        Controller.getCurrentUser().Username,
                                        Controller.getCurrentUserPassword(),
                                        popupServiceRegistered.getService().Id, strFeature)) {
                                    popupServiceRegistered.dispose();
                                } else {
                                    JOptionPane.showMessageDialog(Controller.getFrame(), "Something was wrong, please try again.",
                                            "SocialCDE message", JOptionPane.ERROR_MESSAGE);
                                    popupServiceRegistered.dispose();

                                }
                            }
                        });
                    }
                    else {
                        if (service.RequireOAuth) {
                            final PinWindow pinWindow = new PinWindow(Controller.getFrame());
                            WOAuthData oauthData = Controller.getProxy()
                                    .GetOAuthData(
                                            Controller.getCurrentUser().Username,
                                            Controller.getCurrentUserPassword(),
                                            service.Id);

                            pinWindow.setService(service);
                            pinWindow.setOauthData(oauthData);

                            Controller.temporaryInformation.put("CurrentURL",
                                    oauthData.AuthorizationLink);

                            Controller.temporaryInformation.put("Service", service);

                            pinWindow.getBtnOk().addActionListener(new ActionListener() {
                                @Override
                                public void actionPerformed(ActionEvent e) {
                                   // ServiceOkClick();
                                }
                            });

                            pinWindow.getBtnCancel().addActionListener(new ActionListener() {
                                @Override
                                public void actionPerformed(ActionEvent e) {
                                    //ServiceCancelClick();
                                }
                            });


                            /*try {
                                PlatformUI
                                        .getWorkbench()
                                        .getActiveWorkbenchWindow()
                                        .getActivePage()
                                        .showView(browserViewName);

                            } catch (PartInitException e1) {

                                e1.printStackTrace();
                            }*/
                        }
                        else if(service.RequireTFSAuthentication) {

                            final TFSLogin tfsPanel = new TFSLogin(Controller.getFrame());
                            tfsPanel.setService(service);

                            tfsPanel.getOkButton().addActionListener(new ActionListener() {
                                @Override
                                public void actionPerformed(ActionEvent e) {
                                    HashMap<String, Object> tfsData = tfsPanel.getData();

                                    if (Controller.getProxy().RecordService(
                                            Controller.getCurrentUser().Username,
                                            Controller.getCurrentUserPassword(),
                                            tfsPanel.getService().Id,
                                            ((JTextField) tfsData.get("textUsername"))
                                                    .getText(),
                                            ((JTextField) tfsData.get("textPassword"))
                                                    .getText(),
                                            tfsData.get("textDomain").toString())) {
                                        tfsPanel.dispose();
                                        Controller.selectDynamicWindow(0);

                                    } else {
                                        JOptionPane.showMessageDialog(Controller.getFrame(), "Something was wrong, please try again.",
                                                "SocialCDE message", JOptionPane.ERROR_MESSAGE);
                                        tfsPanel.dispose();

                                    }

                                }


                            });

                        }


                    }
                }
               /* else {
                    Controller.openConnectionLostPanel("Connection Lost! \n You will be redirected to Login page.");
                }*/

                break;
            default:
                break;
        }
    }



}
