package com.socialcdeIntellij.action;

import com.socialcdeIntellij.controller.Controller;

import java.util.HashMap;

/**
 * Created by Teo on 12/03/2015.
 */
public class ActionProfile {
    public ActionProfile(HashMap<String, Object> uiData) {
        //int type = (Integer) uiData.get("Event_type");
        String widgetName = uiData.get("ID_action").toString();

        switch (widgetName) {

            case "lblLogout":
                //if (Controller.getProxy().IsWebServiceRunning()) { //nelle prove è null xkè nn mi loggo
                    //Controller.closeAllDynamicPanel();
                    Controller.setWindowName("Login");
                    Controller.setWindow(Controller.getLoginPanel());
                    Controller.getWindow().revalidate();

                    Controller.setCurrentUser(null);
                    Controller.setCurrentUserPassword(null);
                    Controller.setPreferences("FlagAutologin", "False");
                    Controller.getServicesImage().clear();
                    Controller.getUsersAvatar().clear();
               // }
                /*else
                {
                    Controller.openConnectionLostPanel("Connection Lost! \n You will be redirected to Login page.");
                }*/
                break;

            /*case "labelPeople":

                if (event.type == SWT.MouseDown && Controller.getProxy().IsWebServiceRunning()) {

                    Controller.selectDynamicWindow(2);
                    Controller.getWindow().layout();

                }
                else
                {
                    Controller.openConnectionLostPanel("Connection Lost! \n You will be redirected to Login page.");
                }
                break;

            case "labelAvatarProfile":
                if (event.type == SWT.MouseDown && Controller.getProxy().IsWebServiceRunning()) {
                    Controller.selectDynamicWindow(0);
                    Controller.getWindow().layout();
                }
                else
                {
                    Controller.openConnectionLostPanel("Connection Lost! \n You will be redirected to Login page.");
                }
                break;
            case "labelHomeTimeline":
                if (event.type == SWT.MouseDown && Controller.getProxy().IsWebServiceRunning()) {
                    Controller.selectDynamicWindow(4);
                    //Controller.getWindow().layout();
                }
                else
                {
                    Controller.openConnectionLostPanel("Connection Lost! \n You will be redirected to Login page.");
                }
                break;
            case "labelIterationTimeline":
                if (event.type == SWT.MouseDown && Controller.getProxy().IsWebServiceRunning()) {
                    Controller.selectDynamicWindow(5);
                    Controller.getWindow().layout();
                }
                else
                {
                    Controller.openConnectionLostPanel("Connection Lost! \n You will be redirected to Login page.");
                }
                break;
            case "labelInteractiveTimeline":
                if (event.type == SWT.MouseDown && Controller.getProxy().IsWebServiceRunning()) {
                    Controller.selectDynamicWindow(6);
                    Controller.getWindow().layout();
                }
                else
                {
                    Controller.openConnectionLostPanel("Connection Lost! \n You will be redirected to Login page.");
                }
                break;*/
            default:
                break;

        }
    }
}
