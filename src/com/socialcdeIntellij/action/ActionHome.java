package com.socialcdeIntellij.action;

import com.socialcdeIntellij.controller.Controller;
import com.socialcdeIntellij.popup.ChangeAvatar;
import com.socialcdeIntellij.popup.PopupSkill;


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

            default:
                break;
        }
    }

}
