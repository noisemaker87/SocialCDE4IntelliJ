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
               // if (Controller.getProxy().IsWebServiceRunning()) { //nelle prove è null xkè nn mi loggo
                    Controller.selectDynamicWindow(0);
                    Controller.getWindow().revalidate();
               /* }
                else{
                    System.out.println("non è in funzione");
                    //Controller.openConnectionLostPanel("Connection Lost! \n You will be redirected to Login page.");
                }*/
                break;

            case "lblPeople":
                //if (Controller.getProxy().IsWebServiceRunning()) {
                    Controller.selectDynamicWindow(2);
                    Controller.getWindow().revalidate();
               // }
              //  else{

                    //Controller.openConnectionLostPanel("Connection Lost! \n You will be redirected to Login page.");
               // }
                break;

            case "lblHomeTimeline":
                //if (Controller.getProxy().IsWebServiceRunning()) {
                    Controller.selectDynamicWindow(3);
                    Controller.getWindow().revalidate();
               /* }
                else{
                    System.out.println("neanche ora è in funzione");
                    //Controller.openConnectionLostPanel("Connection Lost! \n You will be redirected to Login page.");
                }*/
                break;

            case "lblIterationTimeline":
                //  if (Controller.getProxy().IsWebServiceRunning()) {

                Controller.selectDynamicWindow(4);
                Controller.getWindow().revalidate();

               /* }
                else
                {
                    Controller.openConnectionLostPanel("Connection Lost! \n You will be redirected to Login page.");
                }*/
                break;

            case "lblInteractiveTimeline":
                //  if (Controller.getProxy().IsWebServiceRunning()) {

                Controller.selectDynamicWindow(5);
                Controller.getWindow().revalidate();

               /* }
                else
                {
                    Controller.openConnectionLostPanel("Connection Lost! \n You will be redirected to Login page.");
                }*/
                break;

            case "lblLogout":
                //if (Controller.getProxy().IsWebServiceRunning()) {

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

            default:
                break;

        }
    }
}
