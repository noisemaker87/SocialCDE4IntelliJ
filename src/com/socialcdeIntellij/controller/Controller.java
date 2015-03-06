package com.socialcdeIntellij.controller;

import com.intellij.ide.util.PropertiesComponent;
import com.socialcdeIntellij.dynamic.view.*;
import com.socialcdeIntellij.model.ProxyWrapper;
import com.socialcdeIntellij.shared.library.WUser;
import com.socialcdeIntellij.staticview.LoginPanel;
import com.socialcdeIntellij.staticview.ProfilePanel;
import com.socialcdeIntellij.staticview.RegistrationPanel;

import javax.swing.*;
import java.awt.*;
import java.util.HashMap;

/**
 * Created by Teo on 02/03/2015.
 */
public class Controller {

    private static RegistrationPanel registrationPanel = new RegistrationPanel();
    private static LoginPanel loginPanel = new LoginPanel();
    private static ProfilePanel profilePanel = new ProfilePanel();
    private static DynamicPeople peopleWindow = new DynamicPeople();
    private static DynamicHome homeWindow = new DynamicHome();
    private static DynamicHomeTimeline homeTimelineWindow = new DynamicHomeTimeline();
    private static DynamicIterationTimeline iterationTimelineWindow = new DynamicIterationTimeline();
    private static DynamicInteractiveTimeline interactiveTimelineWindow = new DynamicInteractiveTimeline();
    private static SettingPanel settingWindow = new SettingPanel();
    private static DynamicUserTimeline dynamicUserWindow = new DynamicUserTimeline();

    // attributes
    private static JPanel window = null;
    private static String windowName = null;
    private static ProxyWrapper proxy = null;
    private static WUser currentUser = null;
    private static String currentUserPassword = null;
    public static HashMap<String, Object> temporaryInformation = new HashMap<String, Object>();
    private static HashMap<String,Image> usersAvatar = new HashMap<String,Image>();
    private static HashMap<String, Image> servicesImage = new HashMap<String,Image>();


    public static RegistrationPanel getRegistrationPanel() {
        setWindow(registrationPanel);
        setWindowName("Registration");
        return registrationPanel;
    }

    public static void setRegistration_panel(RegistrationPanel newRegistrationPanel) {
        Controller.registrationPanel = newRegistrationPanel;
    }

    public static LoginPanel getLoginPanel() {
        setWindow(loginPanel);
        setWindowName("Login");
        return loginPanel;
    }

    public static void setLoginPanel(LoginPanel newLoginPanel) {
        Controller.loginPanel = newLoginPanel;
    }

    public static ProfilePanel getProfilePanel() {
        setWindow(profilePanel);
        setWindowName("Profile");
        return profilePanel;
    }

    public static void setProfilePanel(ProfilePanel newProfilePanel) {
        profilePanel = newProfilePanel;
    }

    public static DynamicPeople getPeopleWindow() {
        setWindow(peopleWindow);
        setWindowName("People");
        return peopleWindow;
    }

    public static void setPeopleWindow(DynamicPeople newpeopleWindow) {
        peopleWindow = newpeopleWindow;
    }

    public static DynamicHome getHomeWindow() {
        setWindow(homeWindow);
        setWindowName("Home");
        return homeWindow;
    }

    public static void setHomeWindow(DynamicHome newhomeWindow) {
        homeWindow = newhomeWindow;
    }

    public static DynamicHomeTimeline getHomeTimelineWindow() {
        setWindow(homeTimelineWindow);
        setWindowName("HomeTimeline");
        return homeTimelineWindow;
    }

    public static void setHomeTimelineWindow(DynamicHomeTimeline homeTimelineWindow) {
        Controller.homeTimelineWindow = homeTimelineWindow;
    }

    public static DynamicIterationTimeline getIterationTimelineWindow() {
        setWindow(iterationTimelineWindow);
        setWindowName("IterationTimeline");
        return iterationTimelineWindow;
    }

    public static void setIterationTimelineWindow(DynamicIterationTimeline newinteractionTimelineWindow) {
        iterationTimelineWindow = newinteractionTimelineWindow;
    }

    public static DynamicInteractiveTimeline getInteractiveTimelineWindow() {
        setWindow(interactiveTimelineWindow);
        setWindowName("InteractiveTimeline");
        return interactiveTimelineWindow;
    }

    public static void setInteractiveTimelineWindow(DynamicInteractiveTimeline newinteractiveTimelineWindow) {
        interactiveTimelineWindow = newinteractiveTimelineWindow;
    }

    public static SettingPanel getSettingWindow() {
        setWindow(settingWindow);
        setWindowName("Settings");
        return settingWindow;
    }

    public static void setSettingWindow(SettingPanel settingWindow) {
        Controller.settingWindow = settingWindow;
    }

    public static DynamicUserTimeline getUserWindow() {
        setWindow(dynamicUserWindow);
        setWindowName("UserTimeline");
        return dynamicUserWindow;
    }

    public static void setUserWindow(DynamicUserTimeline dynamicUserWindow) {
        Controller.dynamicUserWindow = dynamicUserWindow;
    }


    public static JPanel getWindow() {
        return window;
    }

    public static void setWindow(JPanel newWindow) {
        window = newWindow;
    }

    public static String getWindowName() {
        return windowName;
    }

    public static void setWindowName(String newWindowName) {
        windowName = newWindowName;
    }







    public HashMap<String, JPanel> getPanel(){
        HashMap<String, JPanel> dataPanel = new HashMap<>();
        dataPanel.put("RegistrationPanel", registrationPanel);
        dataPanel.put("LoginPanel", loginPanel);
        dataPanel.put("ProfilePanel", profilePanel);
        dataPanel.put("Home", homeWindow);
        dataPanel.put("HomeTimeline",homeTimelineWindow);
        dataPanel.put("InteractiveTimeline", interactiveTimelineWindow);
        dataPanel.put("IterationTimeline", iterationTimelineWindow);
        dataPanel.put("People", peopleWindow);
        dataPanel.put("UserTimeline", dynamicUserWindow);
        dataPanel.put("SettingPanel", settingWindow);

        return dataPanel;
    }// mia****



    public static HashMap<String, Image> getUsersAvatar() {
        return usersAvatar;
    }

    public static HashMap<String, Image> getServicesImage() {
        return servicesImage;
    }









    public static String getCurrentUserPassword() {
        return currentUserPassword;
    }

    public static void setCurrentUserPassword(String currentUserPassword) {
        Controller.currentUserPassword = currentUserPassword;
    }











    public static WUser getCurrentUser() {
        return currentUser;
    }

    public static void setCurrentUser(WUser newCurrentUser) {
        currentUser = newCurrentUser;
    }



    public static ProxyWrapper getProxy() {
        return proxy;
    }

    public static void setProxy(ProxyWrapper newProxy) {
        proxy = newProxy;
    }



    // other methods
    public static void closeAllDynamicPanel() {
        if (dynamicUserWindow != null) {
            Controller.getProfilePanel().remove(dynamicUserWindow);
            dynamicUserWindow = null;
        }

        if (homeTimelineWindow != null) {
            Controller.getProfilePanel().remove(homeTimelineWindow);
            homeTimelineWindow = null;
        }

        if (homeWindow != null) {
            Controller.getProfilePanel().remove(homeWindow);
            homeWindow = null;

        }

        if (iterationTimelineWindow != null) {
            Controller.getProfilePanel().remove(iterationTimelineWindow);
            iterationTimelineWindow = null;
        }

        if (interactiveTimelineWindow != null) {
            Controller.getProfilePanel().remove(interactiveTimelineWindow);
            interactiveTimelineWindow = null;
        }

        if (peopleWindow != null) {
            Controller.getProfilePanel().remove(peopleWindow);
            peopleWindow = null;
        }

        if (settingWindow != null) {
            Controller.getProfilePanel().remove(settingWindow);
            settingWindow = null;
        }

    }

    /*public static void selectDynamicWindow(int choose) {
        Composite dynamicComposite;
        GridData gridData;
        ProgressBarWindow pbNewW = null;
        ProgressBarThread pbWindow = null;

        if(Controller.OSisWindows())
        {
            pbWindow = new ProgressBarThread();
            Controller.temporaryInformation.put("ProgressBarThread", pbWindow);
            pbWindow.setLabelTxt("Operation in progress..");
            pbWindow.setxCoordinate(Controller.getWindow().toDisplay(
                    Controller.getWindow().getParent().getParent().getParent()
                            .getLocation()).x);
            pbWindow.setyCoordinate(Controller.getWindow().toDisplay(
                    Controller.getWindow().getParent().getParent().getParent()
                            .getLocation()).y);
            pbWindow.start();
        }
        else if(Controller.OSisUnix())
        {
            pbNewW = new ProgressBarWindow();
            pbNewW.setLabelTxt("Operation in progress..");
            pbNewW.setxCoordinate(Controller.getWindow().toDisplay(
                    Controller.getWindow().getParent().getParent().getParent()
                            .getLocation()).x);
            pbNewW.setyCoordinate(Controller.getWindow().toDisplay(
                    Controller.getWindow().getParent().getParent().getParent()
                            .getLocation()).y);

            pbNewW.inizialize(getWindow());

        }

        closeAllDynamicPanel();
        if (Controller.getProfilePanel().getComposite_dinamic() != null) {
            Controller.getProfilePanel().getComposite_dinamic().dispose();
        }

        switch (choose) {
            case 0:

                homeWindow = new DynamicHome();

                if(Controller.OSisUnix())
                {
                    pbNewW.updateProgressBar();
                }

                if (Controller.getProfilePanel().getComposite_dinamic() == null) {
                    dynamicComposite = new Composite(getWindow(), SWT.None);

                    gridData = new GridData();
                    if(Controller.OSisUnix())
                    {
                        pbNewW.updateProgressBar();
                    }

                    gridData.widthHint = Controller.getWindowWidth() - 10;
                    if(Controller.OSisUnix())
                    {
                        pbNewW.updateProgressBar();
                    }
                    gridData.grabExcessVerticalSpace = true;

                    gridData.verticalAlignment = GridData.FILL;
                    dynamicComposite.setLayoutData(gridData);
                    if(Controller.OSisUnix())
                    {
                        pbNewW.updateProgressBar();
                    }
                    Controller.getProfilePanel().setComposite_dinamic(
                            dynamicComposite);

                    Controller.getProfilePanel().getComposite_dinamic().layout();
                } else {
                    Controller.getProfilePanel().getComposite_dinamic().dispose();
                    if(Controller.OSisUnix())
                    {
                        pbNewW.updateProgressBar();
                    }
                    dynamicComposite = new Composite(getWindow(), SWT.None);
                    if(Controller.OSisUnix())
                    {
                        pbNewW.updateProgressBar();
                    }
                    gridData = new GridData();

                    gridData.widthHint = Controller.getWindowWidth() - 10;
                    if(Controller.OSisUnix())
                    {
                        pbNewW.updateProgressBar();
                    }
                    gridData.grabExcessVerticalSpace = true;
                    gridData.verticalAlignment = GridData.FILL;
                    dynamicComposite.setLayoutData(gridData);
                    Controller.getProfilePanel().setComposite_dinamic(
                            dynamicComposite);
                    if(Controller.OSisUnix())
                    {
                        pbNewW.updateProgressBar();
                    }
                    Controller.getProfilePanel().getComposite_dinamic().redraw();
                }


                SquareButtonService.yCoordinateValue = 5;
                SquareButtonService.counterPosition = 0;
                if(Controller.OSisUnix())
                {
                    pbNewW.updateProgressBar();
                    Controller.temporaryInformation.put("LinuxProgressBar", pbNewW);
                }

                homeWindow.inizialize(Controller.getProfilePanel()
                        .getComposite_dinamic());

                if(Controller.OSisWindows())
                {
                    pbWindow.setStop(1);
                    pbWindow = null;
                }
                else if(Controller.OSisUnix())
                {
                    pbNewW.dispose(null);
                    pbNewW = null;
                }
                Controller.getWindow().layout();
                break;
            case 1:
                settingWindow = new SettingPanel();
                if (Controller.getProfilePanel().getComposite_dinamic() == null) {
                    if(Controller.OSisUnix())
                    {
                        pbNewW.updateProgressBar();
                    }
                    dynamicComposite = new Composite(getWindow(), SWT.NONE);
                    gridData = new GridData();

                    gridData.widthHint = Controller.getWindowWidth() - 10;
                    gridData.grabExcessVerticalSpace = true;
                    gridData.verticalAlignment = gridData.FILL;
                    if(Controller.OSisUnix())
                    {
                        pbNewW.updateProgressBar();
                    }
                    dynamicComposite.setLayoutData(gridData);
                    if(Controller.OSisUnix())
                    {
                        pbNewW.updateProgressBar();
                    }
                    Controller.getProfilePanel().setComposite_dinamic(
                            dynamicComposite);

                } else {
                    Controller.getProfilePanel().getComposite_dinamic().dispose();
                    if(Controller.OSisUnix())
                    {
                        pbNewW.updateProgressBar();
                    }
                    dynamicComposite = new Composite(getWindow(), SWT.NONE);
                    if(Controller.OSisUnix())
                    {
                        pbNewW.updateProgressBar();
                    }
                    gridData = new GridData();
                    gridData.widthHint = Controller.getWindowWidth() - 10;
                    gridData.grabExcessVerticalSpace = true;
                    gridData.verticalAlignment = gridData.FILL;
                    dynamicComposite.setLayoutData(gridData);
                    if(Controller.OSisUnix())
                    {
                        pbNewW.updateProgressBar();
                    }
                    Controller.getProfilePanel().setComposite_dinamic(
                            dynamicComposite);

                    Controller.getProfilePanel().getComposite_dinamic().redraw();
                    if(Controller.OSisUnix())
                    {
                        pbNewW.updateProgressBar();
                    }
                }
                if(Controller.OSisUnix())
                {
                    pbNewW.updateProgressBar();
                    Controller.temporaryInformation.put("LinuxProgressBar", pbNewW);
                }
                settingWindow.inizialize(Controller.getProfilePanel()
                        .getComposite_dinamic());


                if(Controller.OSisWindows())
                {
                    pbWindow.setStop(1);
                    pbWindow = null;
                }
                else if(Controller.OSisUnix())
                {
                    pbNewW.dispose(null);
                    pbNewW = null;
                }
                Controller.getWindow().layout();

                break;
            case 2:

                peopleWindow = new DynamicPeople();
                if (Controller.getProfilePanel().getComposite_dinamic() == null) {
                    if(Controller.OSisUnix())
                    {
                        pbNewW.updateProgressBar();
                    }
                    dynamicComposite = new Composite(getWindow(), SWT.NONE);

                    gridData = new GridData();
                    if(Controller.OSisUnix())
                    {
                        pbNewW.updateProgressBar();
                    }
                    gridData.widthHint = Controller.getWindowWidth() - 10;
                    gridData.grabExcessVerticalSpace = true;
                    gridData.verticalAlignment = GridData.FILL;
                    dynamicComposite.setLayoutData(gridData);

                    Controller.getProfilePanel().setComposite_dinamic(
                            dynamicComposite);
                    if(Controller.OSisUnix())
                    {
                        pbNewW.updateProgressBar();
                    }
                } else {
                    Controller.getProfilePanel().getComposite_dinamic().dispose();
                    if(Controller.OSisUnix())
                    {
                        pbNewW.updateProgressBar();
                    }
                    dynamicComposite = new Composite(getWindow(), SWT.None);

                    gridData = new GridData();
                    gridData.widthHint = Controller.getWindowWidth() - 10;
                    if(Controller.OSisUnix())
                    {
                        pbNewW.updateProgressBar();
                    }
                    gridData.grabExcessVerticalSpace = true;
                    gridData.verticalAlignment = GridData.FILL;
                    dynamicComposite.setLayoutData(gridData);

                    Controller.getProfilePanel().setComposite_dinamic(
                            dynamicComposite);
                    if(Controller.OSisUnix())
                    {
                        pbNewW.updateProgressBar();
                    }
                    Controller.getProfilePanel().getComposite_dinamic().redraw();

                }
                if(Controller.OSisUnix())
                {
                    pbNewW.updateProgressBar();
                    Controller.temporaryInformation.put("LinuxProgressBar", pbNewW);
                }
                peopleWindow.inizialize(Controller.getProfilePanel()
                        .getComposite_dinamic());

                if(Controller.OSisWindows())
                {
                    pbWindow.setStop(1);
                    pbWindow = null;
                }
                else if(Controller.OSisUnix())
                {
                    pbNewW.dispose(null);
                    pbNewW = null;
                }


                Controller.getWindow().layout();
                break;
            case 3:

                dynamicUserWindow = new DynamicUserTimeline();

                if (Controller.getProfilePanel().getComposite_dinamic() == null) {
                    dynamicComposite = new Composite(getWindow(), SWT.NONE);
                    if(Controller.OSisUnix())
                    {
                        pbNewW.updateProgressBar();
                    }
                    gridData = new GridData();
                    gridData.grabExcessHorizontalSpace = true;
                    gridData.horizontalAlignment = gridData.FILL;
                    gridData.grabExcessVerticalSpace = true;
                    gridData.verticalAlignment = gridData.FILL;
                    dynamicComposite.setLayoutData(gridData);
                    if(Controller.OSisUnix())
                    {
                        pbNewW.updateProgressBar();
                    }
                    Controller.getProfilePanel().setComposite_dinamic(
                            dynamicComposite);

                } else {
                    Controller.getProfilePanel().getComposite_dinamic().dispose();

                    dynamicComposite = new Composite(getWindow(), SWT.NONE);
                    if(Controller.OSisUnix())
                    {
                        pbNewW.updateProgressBar();
                    }
                    gridData = new GridData();
                    gridData.grabExcessHorizontalSpace = true;
                    gridData.horizontalAlignment = gridData.FILL;
                    gridData.grabExcessVerticalSpace = true;
                    gridData.verticalAlignment = gridData.FILL;
                    if(Controller.OSisUnix())
                    {
                        pbNewW.updateProgressBar();
                    }
                    dynamicComposite.setLayoutData(gridData);
                    if(Controller.OSisUnix())
                    {
                        pbNewW.updateProgressBar();
                    }
                    Controller.getProfilePanel().setComposite_dinamic(
                            dynamicComposite);
                    if(Controller.OSisUnix())
                    {
                        pbNewW.updateProgressBar();
                    }
                    Controller.getProfilePanel().getComposite_dinamic().redraw();

                }

                dynamicUserWindow.setUser((WUser) Controller.temporaryInformation
                        .get("User_selected"));

                dynamicUserWindow
                        .setUserType((String) Controller.temporaryInformation
                                .get("User_type"));

                if(Controller.OSisUnix())
                {
                    pbNewW.updateProgressBar();
                    Controller.temporaryInformation.put("LinuxProgressBar", pbNewW);
                }

                dynamicUserWindow.inizialize(Controller.getProfilePanel()
                        .getComposite_dinamic());


                if(Controller.OSisWindows())
                {
                    pbWindow.setStop(1);
                    pbWindow = null;
                }
                else if(Controller.OSisUnix())
                {
                    pbNewW.dispose(null);
                    pbNewW = null;
                }


                Controller.getWindow().layout();

                break;

            case 4:

                homeTimelineWindow = new DynamicHomeTimeline();

                if (Controller.getProfilePanel().getComposite_dinamic() == null) {
                    dynamicComposite = new Composite(getWindow(), SWT.None);
                    if(Controller.OSisUnix())
                    {
                        pbNewW.updateProgressBar();
                    }
                    gridData = new GridData();
                    gridData.widthHint = Controller.getWindowWidth() - 10;
                    if(Controller.OSisUnix())
                    {
                        pbNewW.updateProgressBar();
                    }
                    gridData.grabExcessVerticalSpace = true;
                    gridData.verticalAlignment = GridData.FILL_VERTICAL;
                    dynamicComposite.setLayoutData(gridData);

                    Controller.getProfilePanel().setComposite_dinamic(
                            dynamicComposite);

                } else {
                    Controller.getProfilePanel().getComposite_dinamic().dispose();
                    dynamicComposite = new Composite(getWindow(), SWT.None);
                    if(Controller.OSisUnix())
                    {
                        pbNewW.updateProgressBar();
                    }
                    gridData = new GridData();
                    gridData.widthHint = Controller.getWindowWidth() - 10;

                    gridData.grabExcessVerticalSpace = true;
                    gridData.verticalAlignment = GridData.FILL_VERTICAL;
                    dynamicComposite.setLayoutData(gridData);
                    if(Controller.OSisUnix())
                    {
                        pbNewW.updateProgressBar();
                    }
                    Controller.getProfilePanel().setComposite_dinamic(
                            dynamicComposite);
                    Controller.getProfilePanel().getComposite_dinamic().redraw();

                }
                if(Controller.OSisUnix())
                {
                    Controller.temporaryInformation.put("LinuxProgressBar", pbNewW);
                }
                long windowStartTime = System.currentTimeMillis();
                homeTimelineWindow.inizialize(Controller.getProfilePanel()
                        .getComposite_dinamic());
                long windowEndTime = System.currentTimeMillis();

                System.out.println("chiamata window " + (windowEndTime - windowStartTime) + " milliseconds");

                if(Controller.OSisWindows())
                {
                    pbWindow.setStop(1);
                    pbWindow = null;
                }
                else if(Controller.OSisUnix())
                {
                    pbNewW.dispose(null);
                    pbNewW = null;
                }

                //Controller.getWindow().layout();
                //Controller.getWindow().redraw();
                //Display.getCurrent().update();

                break;

            case 5:

                iterationTimelineWindow = new DynamicIterationTimeline();

                if (Controller.getProfilePanel().getComposite_dinamic() == null) {
                    dynamicComposite = new Composite(getWindow(), SWT.None);
                    if(Controller.OSisUnix())
                    {
                        pbNewW.updateProgressBar();
                    }
                    gridData = new GridData();
                    gridData.widthHint = Controller.getWindowWidth() - 10;

                    gridData.grabExcessVerticalSpace = true;
                    gridData.verticalAlignment = GridData.FILL;
                    if(Controller.OSisUnix())
                    {
                        pbNewW.updateProgressBar();
                    }
                    dynamicComposite.setLayoutData(gridData);

                    Controller.getProfilePanel().setComposite_dinamic(
                            dynamicComposite);

                } else {
                    Controller.getProfilePanel().getComposite_dinamic().dispose();
                    dynamicComposite = new Composite(getWindow(), SWT.None);
                    if(Controller.OSisUnix())
                    {
                        pbNewW.updateProgressBar();
                    }
                    gridData = new GridData();
                    gridData.widthHint = Controller.getWindowWidth() - 10;
                    if(Controller.OSisUnix())
                    {
                        pbNewW.updateProgressBar();
                    }
                    gridData.grabExcessVerticalSpace = true;
                    gridData.verticalAlignment = GridData.FILL;
                    dynamicComposite.setLayoutData(gridData);
                    if(Controller.OSisUnix())
                    {
                        pbNewW.updateProgressBar();
                    }
                    Controller.getProfilePanel().setComposite_dinamic(
                            dynamicComposite);

                    Controller.getProfilePanel().getComposite_dinamic().redraw();

                }

                if(Controller.OSisUnix())
                {
                    pbNewW.updateProgressBar();
                    Controller.temporaryInformation.put("LinuxProgressBar", pbNewW);
                }
                long secondCallpostStartTime = System.currentTimeMillis();

                iterationTimelineWindow.inizialize(Controller.getProfilePanel()
                        .getComposite_dinamic());
                long secondCallpostEndTime = System.currentTimeMillis();

                System.out.println("window chiamata " + (secondCallpostEndTime - secondCallpostStartTime) + " milliseconds");

                if(Controller.OSisWindows())
                {
                    pbWindow.setStop(1);
                    pbWindow = null;
                }
                else if(Controller.OSisUnix())
                {
                    pbNewW.dispose(null);
                    pbNewW = null;
                }

                break;

            case 6:

                interactiveTimelineWindow = new DynamicInteractiveTimeline();

                if (Controller.getProfilePanel().getComposite_dinamic() == null) {
                    dynamicComposite = new Composite(getWindow(), SWT.None);
                    if(Controller.OSisUnix())
                    {
                        pbNewW.updateProgressBar();
                    }
                    gridData = new GridData();
                    gridData.widthHint = Controller.getWindowWidth() - 10;

                    gridData.grabExcessVerticalSpace = true;
                    gridData.verticalAlignment = GridData.FILL;
                    if(Controller.OSisUnix())
                    {
                        pbNewW.updateProgressBar();
                    }
                    dynamicComposite.setLayoutData(gridData);

                    Controller.getProfilePanel().setComposite_dinamic(
                            dynamicComposite);

                } else {
                    Controller.getProfilePanel().getComposite_dinamic().dispose();
                    dynamicComposite = new Composite(getWindow(), SWT.None);
                    if(Controller.OSisUnix())
                    {
                        pbNewW.updateProgressBar();
                    }
                    gridData = new GridData();
                    gridData.widthHint = Controller.getWindowWidth() - 10;

                    gridData.grabExcessVerticalSpace = true;
                    gridData.verticalAlignment = GridData.FILL;
                    dynamicComposite.setLayoutData(gridData);
                    if(Controller.OSisUnix())
                    {
                        pbNewW.updateProgressBar();
                    }
                    Controller.getProfilePanel().setComposite_dinamic(
                            dynamicComposite);

                    Controller.getProfilePanel().getComposite_dinamic().redraw();

                }

                if(Controller.OSisUnix())
                {
                    pbNewW.updateProgressBar();
                    Controller.temporaryInformation.put("LinuxProgressBar", pbNewW);
                }

                interactiveTimelineWindow.inizialize(Controller.getProfilePanel()
                        .getComposite_dinamic());

                if(Controller.OSisWindows())
                {
                    pbWindow.setStop(1);
                    pbWindow = null;
                }
                else if(Controller.OSisUnix())
                {
                    pbNewW.dispose(null);
                    pbNewW = null;
                }

                break;

            default:
                break;
        }

    }*/


    public static String getPreferences(String node) {
        String value;
        final String prefix = "SocialCDE";
        try {
            value = PropertiesComponent.getInstance().getValue(prefix + node);
            //value = Activator.getDefault().getPreferenceStore().getString(prefix + node);
        } catch (Exception e) {
            value = null;
        }
        return value;
    }//prende le preferenze memorizzate - cambiato

    public static boolean setPreferences(String node, String value) {
        boolean flag = false;
        final String prefix = "SocialCDE";
        try {
            PropertiesComponent.getInstance().setValue(prefix + node,value);
            //Activator.getDefault().getPreferenceStore().setValue(prefix + node, value);
            flag = true;
        } catch (Exception e) {
            flag = false;
        }
        return flag;
    }//memorizza le preferenze - cambiato

    public static boolean isRegistered() {

        if ((!getPreferences("username").equals(""))
                && (!getPreferences("proxyHost").equals(""))) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean isUsernameAvailable(String username) {
        return getProxy().IsAvailable(username);
    }

    public static boolean OSisWindows() {
        String OS = System.getProperty("os.name").toLowerCase();
        return (OS.indexOf("win") >= 0);

    }

    public static boolean OSisMac() {
        String OS = System.getProperty("os.name").toLowerCase();
        return (OS.indexOf("mac") >= 0);

    }

    public static boolean OSisUnix() {
        String OS = System.getProperty("os.name").toLowerCase();
        return (OS.indexOf("nix") >= 0 || OS.indexOf("nux") >= 0 || OS.indexOf("aix") > 0 );

    }

    public static boolean OSisSolaris() {
        String OS = System.getProperty("os.name").toLowerCase();
        return (OS.indexOf("sunos") >= 0);

    }

    /*public  static void openConnectionLostPanel(String message)
    {
        final ConnLostPanel panel1 = new ConnLostPanel();

        panel1
                .setxCoordinate(Controller.getWindow()
                        .toDisplay(
                                Controller.getWindow()
                                        .getLocation().x,
                                Controller.getWindow()
                                        .getLocation().y).x);
        panel1
                .setyCoordinate(Controller.getWindow()
                        .toDisplay(
                                Controller.getWindow()
                                        .getLocation().x,
                                Controller.getWindow()
                                        .getLocation().y).y);
        panel1
                .setxCoordinateWithOffset(Controller
                        .getWindow().toDisplay(
                                Controller.getWindow()
                                        .getLocation().x,
                                Controller.getWindow()
                                        .getLocation().y).x- 30);
        panel1
                .setyCoordinateWithOffset(Controller
                        .getWindow().toDisplay(
                                Controller.getWindow()
                                        .getLocation().x,
                                Controller.getWindow()
                                        .getLocation().y).y
                        + (Controller.getWindow().getBounds().height - 200)
                        / 2);

        panel1.setMessage(message);

        panel1.setOkListener(new Listener() {

            @Override
            public void handleEvent(Event event) {


                panel1.dispose(null);
                Controller.closeAllDynamicPanel();
                Controller.setCurrentUser(null);
                Controller.setCurrentUserPassword(null);
                Controller.setWindowName("Login");
                Controller.getProfilePanel().dispose(Controller.getWindow());
                Controller.setProfilePanel(null);
                Controller.setLoginPanel(new LoginPanel());
                Controller.getLoginPanel().inizialize(Controller.getWindow());
                Controller.getWindow().layout();


            }
        });

        panel1.inizialize(Controller.getWindow());
    }*/
}
