package com.socialcdeIntellij.action;


import com.socialcdeIntellij.controller.Controller;

import java.awt.*;
import java.util.EventListener;
import java.util.HashMap;

/**
 * Created by Teo on 05/03/2015.
 */
public class ActionGeneral implements EventListener {

    Controller controller = new Controller();
    private HashMap<String, Object> uiData;

    public void handleEvent(Event event) {
        switch (Controller.getWindowName()) {
            case "Registration":
                uiData = Controller.getRegistrationPanel().getData();
                uiData.put("Event", event);
                //uiData.put("Event_type", event.type);
               // uiData.put("ID_action", widget.getData("ID_action").toString());


                new ActionRegistration(uiData);

                break;
            /*case "Login":
                uiData = Controller.getLoginPanel().getData();
                uiData.put("Event", event);
                uiData.put("Event_type", event.type);
                uiData.put("ID_action", widget.getData("ID_action").toString());


                new ActionLoginPanel(uiData);

                break;
            case "Profile":
                //System.out.println("Action profile avviata");
                new ActionProfile(widget, event);
                break;
            default:
                break;
            case "Home":
                if (widgetProfile.contains(widget.getData("ID_action").toString())) {
                    new ActionProfile(widget, event);
                } else {
                    uiData = Controller.getHomeWindow().getData();
                    uiData.put("Event", event);
                    uiData.put("Event_type", event.type);
                    uiData.put("ID_action", widget.getData("ID_action").toString());
                    uiData.put("service", (WService) widget.getData("service"));
                    new ActionHomePanel(uiData);
                }
                break;
            case "Settings":
                if (widgetProfile.contains(widget.getData("ID_action").toString())) {
                    new ActionProfile(widget, event);
                } else {
                    new ActionSettingPanel(widget, event);
                }
                break;
            case "People":
                if (widgetProfile.contains(widget.getData("ID_action").toString())) {
                    new ActionProfile(widget, event);
                } else {
                    new ActionDynamicPeople(widget, event);
                }
                break;
            case "userTimeline":
                if (widgetProfile.contains(widget.getData("ID_action").toString())) {
                    new ActionProfile(widget, event);
                } else {
                    uiData = Controller.getDynamicUserWindow().getData();
                    uiData.put("Event", event);
                    uiData.put("Event_type", event.type);
                    uiData.put("ID_action", widget.getData("ID_action").toString());

                    new ActionDynamicUserTimeline(uiData);
                }
                break;
            case "homeTimeline":
                if (widgetProfile.contains(widget.getData("ID_action").toString())) {
                    new ActionProfile(widget, event);
                } else {
                    uiData = Controller.getHomeTimelineWindow().getData();
                    uiData.put("Event", event);
                    uiData.put("Event_type", event.type);
                    uiData.put("ID_action", widget.getData("ID_action").toString());

                    if (widget.getData("ID_action").equals("labelAvatarLink")) {
                        uiData.put("User_data",
                                (WUser) event.widget.getData("User_data"));
                    }

                    if (widget.getData("ID_action").equals("usernameLink")) {
                        //System.out
                        //		.println("ottengo " + widget.getData("User_data"));
                        uiData.put("User_data", (WUser) widget.getData("User_data"));
                    }

                    new ActionHomeTimeline(uiData);
                }
                break;
            case "iterationTimeline":
                if (widgetProfile.contains(widget.getData("ID_action").toString())) {
                    new ActionProfile(widget, event);
                } else {
                    uiData = Controller.getInteractionTimelineWindow().getData();
                    uiData.put("Event", event);
                    uiData.put("Event_type", event.type);
                    uiData.put("ID_action", widget.getData("ID_action").toString());

                    if (widget.getData("ID_action").equals("labelAvatarLink")) {
                        uiData.put("User_data", (WUser) widget.getData("User_data"));
                    }

                    if (widget.getData("ID_action").equals("usernameLink")) {
                        uiData.put("User_data", (WUser) widget.getData("User_data"));
                    }

                    new ActionIterationTimeline(uiData);
                }
                break;
            case "interactiveTimeline":
                if (widgetProfile.contains(widget.getData("ID_action").toString())) {
                    new ActionProfile(widget, event);
                } else {
                    uiData = Controller.getInteractiveTimelineWindow().getData();
                    uiData.put("Event", event);
                    uiData.put("Event_type", event.type);
                    uiData.put("ID_action", widget.getData("ID_action").toString());

                    if (widget.getData("ID_action").equals("labelAvatarLink")) {
                        uiData.put("User_data", (WUser) widget.getData("User_data"));
                    }

                    if (widget.getData("ID_action").equals("usernameLink")) {
                        uiData.put("User_data", (WUser) widget.getData("User_data"));
                    }

                    new ActionInteractiveTimeline(uiData);
                }
                break;*/
        }
    }
}
