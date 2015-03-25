package com.socialcdeIntellij.action;

import com.socialcdeIntellij.controller.Controller;

import java.util.HashMap;

/**
 * Created by Teo on 12/03/2015.
 */
public class ActionProfile {
    public ActionProfile(HashMap<String, Object> uiData) {

        String widgetName = uiData.get("ID_action").toString();

        switch (widgetName) {
            case "lblProfile":
                if (Controller.getProxy().IsWebServiceRunning()) {
                    Controller.selectDynamicWindow(0);
                    Controller.getWindow().revalidate();
                }
                else{
                    Controller.openConnectionLostPanel();
                }
                break;

            case "lblPeople":
                if (Controller.getProxy().IsWebServiceRunning()) {
                    Controller.selectDynamicWindow(2);
                    Controller.getWindow().revalidate();
                }
                else{
                    Controller.openConnectionLostPanel();
                }
                break;

            case "lblHomeTimeline":
                if (Controller.getProxy().IsWebServiceRunning()){
                    Controller.selectDynamicWindow(3);
                    Controller.getWindow().revalidate();
                }
                else{
                    Controller.openConnectionLostPanel();
                }
                break;

            case "lblIterationTimeline":
                if (Controller.getProxy().IsWebServiceRunning()) {
                    Controller.selectDynamicWindow(4);
                    Controller.getWindow().revalidate();
                }
                else{
                    Controller.openConnectionLostPanel();
                }
                break;

            case "lblInteractiveTimeline":
                if (Controller.getProxy().IsWebServiceRunning()) {
                    Controller.selectDynamicWindow(5);
                    Controller.getWindow().revalidate();
                }
                else{
                    Controller.openConnectionLostPanel();
                }
                break;

            case "lblLogout":
                if (Controller.getProxy().IsWebServiceRunning()) {
                    Controller.setWindowName("Login");
                    Controller.setWindow(Controller.getLoginPanel());
                    Controller.getWindow().revalidate();

                    Controller.setCurrentUser(null);
                    Controller.setCurrentUserPassword(null);
                    Controller.setPreferences("autologin", "false");
                    Controller.getServicesImage().clear();
                    Controller.getUsersAvatar().clear();
                }
                else{
                    Controller.openConnectionLostPanel();
                }
                break;

            default:
                break;

        }
    }
}
