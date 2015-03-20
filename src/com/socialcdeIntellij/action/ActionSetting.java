package com.socialcdeIntellij.action;

import com.socialcdeIntellij.controller.Controller;

import javax.swing.*;
import java.util.HashMap;

/**
 * Created by Teo on 20/03/2015.
 */
public class ActionSetting {

    public ActionSetting(HashMap<String, Object> uiData) {

        String widgetName = uiData.get("ID_action").toString();

        switch (widgetName) {

            case "btnOk":
                if (Controller.getProxy().IsWebServiceRunning()) {

                    if (!Controller.getCurrentUserPassword().equals(
                            ((JTextField) uiData.get("TextOldPassword")).getText())) {
                        ((JLabel) uiData.get("LabelAlert")).setText("Old passord not match with current password");
                        ((JLabel) uiData.get("LabelAlert")).setVisible(true);

                    }
                    else if(((JTextField) uiData.get("TextOldPassword")).getText().isEmpty() ||
                            ((JTextField) uiData.get("TextNewPassword")).getText().isEmpty()){
                        ((JLabel) uiData.get("LabelAlert")).setText("Please insert all fields");
                        ((JLabel) uiData.get("LabelAlert")).setVisible(true);
                    }
                    else {
                        ((JLabel) uiData.get("LabelAlert")).setVisible(false);

                        int response = JOptionPane.showConfirmDialog(Controller.getFrame(), "Are you sure to change user password?",
                                "SocialCDE message", JOptionPane.OK_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE);
                        if (response == JOptionPane.OK_OPTION) {
                            if (Controller.getProxy().ChangePassword(
                                    Controller.getCurrentUser().Username,
                                    Controller.getCurrentUserPassword(),
                                    ((JTextField) uiData.get("TextNewPassword")).getText())) {
                                JOptionPane.showMessageDialog(Controller.getFrame(), "The new password is set up!",
                                        "SocialCDE message", JOptionPane.INFORMATION_MESSAGE);
                                ((JTextField) uiData.get("TextOldPassword")).setText("");
                                ((JTextField) uiData.get("TextNewPassword")).setText("");
                            } else {
                                Controller.openConnectionLostPanel();
                            }
                        } else {
                            JOptionPane.showMessageDialog(Controller.getFrame(), "Operation aborted!",
                                    "SocialCDE message", JOptionPane.INFORMATION_MESSAGE);
                        }
                    }


                }
                break;

            case "btnCancel":
                if (Controller.getProxy().IsWebServiceRunning()) {
                    Controller.selectDynamicWindow(0);
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