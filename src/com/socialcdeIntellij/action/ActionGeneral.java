package com.socialcdeIntellij.action;


import com.socialcdeIntellij.controller.Controller;

import javax.swing.event.EventListenerList;
import java.awt.*;
import java.awt.event.*;
import java.util.EventListener;
import java.util.HashMap;

/**
 * Created by Teo on 05/03/2015.
 */
public class ActionGeneral implements ActionListener, FocusListener , MouseListener{

    private HashMap<String, Object> uiData;

    public void actionPerformed(ActionEvent event) {
        switch (Controller.getWindowName()) {

            case "Registration":
                uiData = Controller.getRegistrationPanel().getData();
                uiData.put("Event", event);
                uiData.put("Event_type", event.getID());
                uiData.put("ID_action",event.getActionCommand());

                new ActionRegistration(uiData);

                break;

            case "Login":
                uiData = Controller.getLoginPanel().getData();
                uiData.put("Event", event);
                uiData.put("Event_type", event.getID());
                uiData.put("ID_action", event.getActionCommand());

                new ActionLogin(uiData);

                break;

            case "Profile":
                uiData = Controller.getProfilePanel().getData();
                uiData.put("Event", event);
                uiData.put("Event_type", event.getID());
                uiData.put("ID_action", event.getActionCommand());

                new ActionProfile(uiData);

                switch (Controller.getDynamicPanelName()){

                    case "Home":
                        uiData = Controller.getHomePanel().getData();
                        uiData.put("Event", event);
                        uiData.put("Event_type", event.getID());
                        uiData.put("ID_action", event.getActionCommand());

                        new ActionHome(uiData);
                        break;

                    case "People":
                        uiData = Controller.getHomePanel().getData();
                        uiData.put("Event", event);
                        uiData.put("Event_type", event.getID());
                        uiData.put("ID_action", event.getActionCommand());

                        //new ActionPeople(uiData);
                        break;

                }

                break;

        }
    }

    @Override
    public void focusGained(FocusEvent e) {

    }

    @Override
    public void focusLost(FocusEvent event) {
            switch (Controller.getWindowName()) {

                case "Registration":
                    uiData = Controller.getRegistrationPanel().getData();
                    uiData.put("Event", event);
                    uiData.put("Event_type", event.getID());
                    uiData.put("ID_action",event.getComponent().getName());//cambiare

                    new ActionRegistration(uiData);

                    break;

                case "Login":
                    uiData = Controller.getLoginPanel().getData();
                    uiData.put("Event", event);
                    uiData.put("Event_type", event.getID());
                    uiData.put("ID_action", event.getComponent().getName());

                    new ActionLogin(uiData);

                    break;

                case "Profile":
                    uiData = Controller.getProfilePanel().getData();
                    uiData.put("Event", event);
                    uiData.put("Event_type", event.getID());
                    uiData.put("ID_action", event.getComponent().getName());

                    new ActionProfile(uiData);

                    switch (Controller.getDynamicPanelName()){

                        case "Home":
                            uiData = Controller.getHomePanel().getData();
                            uiData.put("Event", event);
                            uiData.put("Event_type", event.getID());
                            uiData.put("ID_action", event.getComponent().getName());

                            new ActionHome(uiData);
                            break;

                        case "People":
                            uiData = Controller.getHomePanel().getData();
                            uiData.put("Event", event);
                            uiData.put("Event_type", event.getID());
                            uiData.put("ID_action", event.getComponent().getName());

                            //new ActionPeople(uiData);
                            break;

                    }
                    break;


        }

    }

    @Override
    public void mouseClicked(MouseEvent event) {
        switch (Controller.getWindowName()) {

            case "Registration":
                uiData = Controller.getRegistrationPanel().getData();
                uiData.put("Event", event);
                uiData.put("Event_type", event.getID());
                uiData.put("ID_action", event.getComponent().getName());

                new ActionRegistration(uiData);

                break;

            case "Login":
                uiData = Controller.getLoginPanel().getData();
                uiData.put("Event", event);
                uiData.put("Event_type", event.getID());
                uiData.put("ID_action", event.getComponent().getName());

                new ActionLogin(uiData);

                break;

            case "Profile":
                uiData = Controller.getProfilePanel().getData();
                uiData.put("Event", event);
                uiData.put("Event_type", event.getID());
                uiData.put("ID_action", event.getComponent().getName());

                new ActionProfile(uiData);

                switch (Controller.getDynamicPanelName()){

                    case "Home":
                        uiData = Controller.getHomePanel().getData();
                        uiData.put("Event", event);
                        uiData.put("Event_type", event.getID());
                        uiData.put("ID_action", event.getComponent().getName());

                        new ActionHome(uiData);
                        break;

                    case "People":
                        uiData = Controller.getHomePanel().getData();
                        uiData.put("Event", event);
                        uiData.put("Event_type", event.getID());
                        uiData.put("ID_action", event.getComponent().getName());

                        //new ActionPeople(uiData);
                        break;

                }
                break;

        }

    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}
