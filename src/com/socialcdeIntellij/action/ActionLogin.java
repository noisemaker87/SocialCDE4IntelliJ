package com.socialcdeIntellij.action;

import com.socialcdeIntellij.controller.Controller;
import com.socialcdeIntellij.model.ProxyWrapper;
import com.socialcdeIntellij.object.ImagesMod;
import com.socialcdeIntellij.object.OperationProgressBar;
import com.socialcdeIntellij.shared.library.WUser;
import com.socialcdeIntellij.staticview.RegistrationPanel;

import javax.swing.*;
import java.awt.*;
import java.io.IOException;
import java.util.HashMap;

/**
 * Created by Teo on 10/03/2015.
 */
public class ActionLogin {
    private static Image IMAGE_YES;
    private static Image IMAGE_NO;
    private OperationProgressBar opBar;
    private ImagesMod im = new ImagesMod();
    private WUser user;

    public ActionLogin() { }

    public ActionLogin(HashMap<String, Object> uiData) {
        // ActionEvent event = (ActionEvent) uiData.get("Event");
        //int type = (Integer) uiData.get("Event_type");
        String widgetName = uiData.get("ID_action").toString();

        try {
            IMAGE_NO = im.getNO_ICON(32, 16);
            IMAGE_YES = im.getYES_ICON(32, 16);
        } catch (IOException e) {
            e.printStackTrace();
        }

        switch (widgetName) {
            case "txtProxy":
                if (InterceptingFilter.verifyText(((JTextField) uiData
                        .get("ProxyHost")).getText())) {
                    Controller.setProxy(new ProxyWrapper());
                    Controller.getProxy().setHost(
                            ((JTextField) uiData.get("ProxyHost")).getText());
                    if (Controller.getProxy().IsWebServiceRunning()) {
                        ((JLabel) uiData.get("LabelImageProxy")).setIcon(new ImageIcon(IMAGE_YES));
                        ((JLabel) uiData.get("LabelImageProxy")).setVisible(true);

                    } else {
                        Controller.setProxy(null);
                        ((JLabel) uiData.get("LabelAlert"))
                                .setText("Please insert a valid proxy!");
                        ((JLabel) uiData.get("LabelAlert")).setVisible(true);

                        ((JLabel) uiData.get("LabelImageProxy")).setIcon(new ImageIcon(IMAGE_NO));
                        ((JLabel) uiData.get("LabelImageProxy")).setVisible(true);
                    }
                } else {
                    Controller.setProxy(null);
                    ((JLabel) uiData.get("LabelAlert"))
                            .setText("Please insert a valid proxy!");
                    ((JLabel) uiData.get("LabelAlert")).setVisible(true);

                    ((JLabel) uiData.get("LabelImageProxy")).setIcon(new ImageIcon(IMAGE_NO));
                    ((JLabel) uiData.get("LabelImageProxy")).setVisible(true);

                }
                break;

            case "txtUsername":
                if (InterceptingFilter.verifyText(((JTextField) uiData
                        .get("Username")).getText())) {
                    if (Controller.getProxy() != null) {
                        if (!Controller.getProxy().IsAvailable(
                                ((JTextField) uiData.get("Username")).getText())) {
                            ((JLabel) uiData.get("LabelAlert"))
                                    .setText("Please insert a valid username!");
                            ((JLabel) uiData.get("LabelAlert")).setVisible(true);

                            ((JLabel) uiData.get("LabelImageUsername")).setIcon(new ImageIcon(IMAGE_NO));
                            ((JLabel) uiData.get("LabelImageUsername")).setVisible(true);

                        } else {
                            ((JLabel) uiData.get("LabelImageUsername")).setIcon(new ImageIcon(IMAGE_YES));
                            ((JLabel) uiData.get("LabelImageUsername")).setVisible(true);

                            ((JLabel) uiData.get("LabelAlert")).setVisible(false);
                        }
                    } else {
                        ((JLabel) uiData.get("LabelAlert"))
                                .setText("Please enter a valid proxy first!");
                        ((JLabel) uiData.get("LabelAlert")).setVisible(true);

                        ((JLabel) uiData.get("LabelImageUsername")).setIcon(new ImageIcon(IMAGE_NO));
                        ((JLabel) uiData.get("LabelImageUsername")).setVisible(true);

                        ((JLabel) uiData.get("LabelImageProxy")).setIcon(new ImageIcon(IMAGE_NO));
                        ((JLabel) uiData.get("LabelImageProxy")).setVisible(true);

                    }
                } else {
                    ((JLabel) uiData.get("LabelAlert"))
                            .setText("Please enter a valid username!");
                    ((JLabel) uiData.get("LabelAlert")).setVisible(true);

                    ((JLabel) uiData.get("LabelImageUsername")).setIcon(new ImageIcon(IMAGE_NO));
                    ((JLabel) uiData.get("LabelImageUsername")).setVisible(true);
                }
                break;

            case "btnLogin":
                if (Controller.OSisWindows()) {
                    opBar = new OperationProgressBar();
                    opBar.setLabelBar("Login in progress..");
                    opBar.start();
                    Controller.temporaryInformation.put("OperationProgressBar", opBar);

                } else if (Controller.OSisUnix()) {
                    opBar = new OperationProgressBar();
                    opBar.setLabelBar("Login in progress..");
                    //pbNewW.inizialize(Controller.getWindow());

                }


                if (Controller.getProxy() == null) {
                    Controller.setProxy(new ProxyWrapper());
                    if (Controller.OSisUnix()) {
                        //opBar.updateProgressBar();
                    }
                    Controller.getProxy().setHost(
                            ((JTextField) uiData.get("txtProxy")).getText());
                    if (Controller.OSisUnix()) {
                        //pbNewW.updateProgressBar();
                    }
                } else {
                    Controller.getProxy().setHost(
                            ((JTextField) uiData.get("txtProxy")).getText());
                    if (Controller.OSisUnix()) {
                        //pbNewW.updateProgressBar();
                    }
                }
                if (Controller.OSisUnix()) {
                    //pbNewW.updateProgressBar();
                }

                if (Controller.getProxy().IsWebServiceRunning()) {

                    if (Controller.OSisUnix()) {
                        //pbNewW.updateProgressBar();
                    }

                    user = Controller.getProxy().GetUser(
                            ((JTextField) uiData.get("txtUsername")).getText(),
                            ((JTextField) uiData.get("txtPassword")).getText());

                    if (Controller.OSisUnix()) {
                        //pbNewW.updateProgressBar();
                    }

                    if (user == null) {

                        if (Controller.OSisUnix()) {
                            //pbNewW.updateProgressBar();
                        }

                        ((JLabel) uiData.get("labelAlert"))
                                .setText("username or password not valid!");
                        ((JLabel) uiData.get("labelAlert")).setVisible(true);
                        if (Controller.OSisUnix()) {
                            //pbNewW.updateProgressBar();
                        }

                        ((JLabel) uiData.get("LabelImageUsername")).setIcon(new ImageIcon(IMAGE_NO));
                        ((JLabel) uiData.get("LabelImageUsername")).setVisible(true);

                        if (Controller.OSisUnix()) {
                            // pbNewW.updateProgressBar();
                        }

                        ((JLabel) uiData.get("LabelImagePassword")).setIcon(new ImageIcon(IMAGE_NO));
                        ((JLabel) uiData.get("LabelImagePassword")).setVisible(true);

                            /*if (Controller.OSisUnix()) {
                                pbNewW.updateProgressBar();
                            }
                            if (Controller.OSisUnix()) {
                                pbNewW.updateProgressBar();
                            }
                            if (Controller.OSisUnix()) {
                                pbNewW.updateProgressBar();
                            }
                            if (Controller.OSisUnix()) {
                                pbNewW.updateProgressBar();
                            }
                            if (Controller.OSisUnix()) {
                                pbNewW.updateProgressBar();
                            }
                            if (Controller.OSisUnix()) {
                                pbNewW.updateProgressBar();
                            }
                            */

                        if (Controller.OSisWindows()) {
                            //opBar.stop();
                            opBar = null;
                        } else if (Controller.OSisUnix()) {
                            //opBar.stop();
                            opBar = null;
                        }

                        // Controller.getWindow().layout();

                    } else {
                        if (Controller.OSisUnix()) {
                            //opBar.updateProgressBar();
                        }

                        if (((JCheckBox) uiData.get("ckBxSave_psw"))
                                .isSelected()) {

                            if (Controller.OSisUnix()) {
                                //opBar.updateProgressBar();
                            }

                            Controller.setPreferences("password",
                                    ((JTextField) uiData.get("txtPassword"))
                                            .getText());
                        } else {

                            if (Controller.OSisUnix()) {
                                //opBar.updateProgressBar();
                            }

                            Controller.setPreferences("password", "");
                        }

                        if (Controller.OSisUnix()) {
                            //opBar.updateProgressBar();
                        }

                        if (((JCheckBox) uiData.get("ckBxAuto_login"))
                                .isSelected()) {
                            Controller.setPreferences("autoLogin", "true");

                            if (Controller.OSisUnix()) {
                                //opBar.updateProgressBar();
                            }

                            Controller.setPreferences("FlagAutologin", "False");
                            if (Controller.OSisUnix()) {
                                // opBar.updateProgressBar();
                            }
                        } else {
                            Controller.setPreferences("autoLogin", "false");
                            if (Controller.OSisUnix()) {
                                //opBar.updateProgressBar();
                            }
                            Controller.setPreferences("FlagAutologin", "False");
                            if (Controller.OSisUnix()) {
                                // opBar.updateProgressBar();
                            }
                        }

                        Controller.setCurrentUser(user);
                        if (Controller.OSisUnix()) {
                            //opBar.updateProgressBar();
                        }
                        Controller.setCurrentUserPassword(((JTextField) uiData
                                .get("txtPassword")).getText());
                        if (Controller.OSisUnix()) {
                            // opBar.updateProgressBar();
                        }
                        Controller.setPreferences("proxyHost", ((JTextField) uiData.get("txtProxy")).getText());
                        if (Controller.OSisUnix()) {
                            // opBar.updateProgressBar();
                        }
                        Controller.setPreferences("proxyRoot",
                                ((JTextField) uiData.get("txtProxy")).getText());
                        if (Controller.OSisUnix()) {
                            //opBar.updateProgressBar();
                        }
                        Controller.setPreferences("username", user.Username);
                        if (Controller.OSisUnix()) {
                            // opBar.updateProgressBar();
                        }

                        //************************ cambio pannello ********************************************
                            /*Controller.setWindowName("Profile");
                            if (Controller.OSisUnix()) {
                                //opBar.updateProgressBar();
                            }
                            Controller.getLoginPanel().dispose(null);
                            if (Controller.OSisUnix()) {
                                opBar.updateProgressBar();
                            }
                            Controller.setLoginPanel(null);
                            if (Controller.OSisUnix()) {
                                opBar.updateProgressBar();
                            }
                            SquareButtonService.yCoordinateValue = 5;
                            SquareButtonService.counterPosition = 0;
                            Controller.setProfilePanel(new ProfilePanel());
                            if (Controller.OSisUnix()) {
                                opBar.updateProgressBar();
                            }
                            Controller.getProfilePanel().inizialize(
                                    Controller.getWindow());

                            if (Controller.OSisWindows()) {
                                opBar.setStop(1);
                                opBar = null;
                            } else if (Controller.OSisUnix()) {
                                opBar.dispose(null);
                                opBar = null;
                            }*/


                    }
                } else {
                    if (Controller.OSisUnix()) {
                        //opBar.updateProgressBar();
                    }
                    ((JLabel) uiData.get("labelAlert"))
                            .setText("The connection with the Proxy failed");
                    ((JLabel) uiData.get("labelAlert")).setVisible(true);

                    ((JLabel) uiData.get("LabelImageProxy")).setIcon(new ImageIcon(IMAGE_NO));
                    ((JLabel) uiData.get("LabelImageProxy")).setVisible(true);


                    if (Controller.OSisWindows()) {
                        //opBar.stop();
                        opBar = null;
                    } else if (Controller.OSisUnix()) {
                       // opBar.stop();
                        opBar = null;
                    }

                    // Controller.getWindow().layout();
                }

            break;

            case "lblChange":
                Controller.setWindowName("Registration");
                Controller.setWindow(Controller.getRegistrationPanel());
                Controller.getWindow().revalidate();
                clear(uiData);

                break;

            default:
                break;
        }
    }

    private void clear(HashMap<String, Object> uiData) {

        ((JTextField) uiData.get("ProxyHost")).setText("");
        ((JTextField) uiData.get("Username")).setText("");
        ((JTextField) uiData.get("Password")).setText("");
        ((JLabel) uiData.get("LabelImageProxy")).setIcon(null);
        ((JLabel) uiData.get("LabelImageUsername")).setIcon(null);
        ((JLabel) uiData.get("LabelImagePassword")).setIcon(null);
        ((JLabel) uiData.get("LabelImagePassword")).setIcon(null);
        ((JLabel) uiData.get("LabelAlert")).setVisible(false);

    }
}
