package com.socialcdeIntellij.action;

import com.socialcdeIntellij.controller.Controller;
import com.socialcdeIntellij.shared.library.WUser;

import java.util.HashMap;

/**
 * Created by Teo on 17/03/2015.
 */
public class ActionPeople {
    public ActionPeople(HashMap<String, Object> uiData) {


        String widgetName = uiData.get("ID_action").toString();

        switch (widgetName) {
            case "User_selected":
                if(Controller.getProxy().IsWebServiceRunning())
                {
                    /*Controller.temporaryInformation.put("User_selected",
                            (WUser) widget.getData("User_data"));
                    Controller.temporaryInformation.put("User_type",
                            widget.getData("User_type"));
*/
                    Controller.selectDynamicWindow(3);
                    Controller.getWindow().revalidate();
                }
                else
                {
                    Controller.openConnectionLostPanel();
                }
                break;

            default:
                break;
        }
    }

}
