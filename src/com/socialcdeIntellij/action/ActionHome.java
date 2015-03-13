package com.socialcdeIntellij.action;

import com.socialcdeIntellij.controller.Controller;
import com.socialcdeIntellij.model.ProxyWrapper;
import com.socialcdeIntellij.popup.ChangeAvatar;

import javax.swing.*;
import java.io.IOException;
import java.util.HashMap;

/**
 * Created by Teo on 13/03/2015.
 */
public class ActionHome {

    public ActionHome(HashMap<String, Object> uiData) {

        String widgetName = uiData.get("ID_action").toString();

        switch (widgetName) {

            case "lblAvatar":
                //ChangeAvatar ca = new ChangeAvatar(Controller.);
                break;
            case "lblSkills":
                ((JLabel) uiData.get("LabelNumPost")).setText(String.valueOf(50));
                //Controller.getHomePanel()
                break;

            default:
                break;
        }
    }

}
