package com.socialcdeIntellij.controller;

import com.intellij.ide.util.PropertiesComponent;
import com.socialcdeIntellij.dynamicview.*;
import com.socialcdeIntellij.model.ProxyWrapper;
import com.socialcdeIntellij.object.OperationProgressBar;
import com.socialcdeIntellij.shared.library.WUser;
import com.socialcdeIntellij.staticview.*;
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
    private static DynamicHome homePanel = new DynamicHome();

    private static DynamicPeople peopleWindow = new DynamicPeople();
    private static DynamicHomeTimeline homeTimelineWindow = new DynamicHomeTimeline();
    private static DynamicIterationTimeline iterationTimelineWindow = new DynamicIterationTimeline();
    private static DynamicInteractiveTimeline interactiveTimelineWindow = new DynamicInteractiveTimeline();
    private static SettingPanel settingWindow = new SettingPanel();
    private static DynamicUserTimeline dynamicUserWindow = new DynamicUserTimeline();

    private static OperationProgressBar opBar = new OperationProgressBar();

    public static OperationProgressBar getOpBar() {
        return opBar;
    }

    public static void setOpBar(OperationProgressBar newOpBar) {
        opBar = newOpBar;
    }

    // attributes
    private static boolean flag = false;
    private static CardLayout cardLayout = new CardLayout();
    private static CardLayout cardLayout2 = new CardLayout();
    private static JPanel window = new JPanel(cardLayout);// qui x cambiare pannello iniziale
    private static JPanel dynamicPanel = new JPanel(cardLayout2);
    private static String windowName = null;

    private static ProxyWrapper proxy = null;
    private static WUser currentUser = null;
    private static String currentUserPassword = null;
    public static HashMap<String, Object> temporaryInformation = new HashMap<String, Object>();
    private static HashMap<String,Image> usersAvatar = new HashMap<String,Image>();
    private static HashMap<String, Image> servicesImage = new HashMap<String,Image>();



    public static JPanel getWindow() {
        return window;
    }

    public static void setWindow(JPanel newWindow) {
        flag = true;
        window.removeAll();
        window.add(newWindow);
        cardLayout.show(window,getWindowName());
    }

    public static void setDynamicPanel(JPanel newWindow) {
        dynamicPanel.removeAll();
        dynamicPanel.add(newWindow);
        cardLayout2.show(dynamicPanel,getWindowName());
    }

    public static JPanel getDynamicPanel() {
        return dynamicPanel;
    }

    public static String getWindowName() {
        return windowName;
    }

    public static void setWindowName(String newWindowName) {
        windowName = newWindowName;
    }

    public static void setWindowName(JPanel newWindowName) {
        windowName = newWindowName.getName();
    }

    public static JPanel getCurrentPanel() {
        if (flag == false) {
            /*setWindowName("Login");
            setWindow(getLoginPanel());
            return getWindow();*/
            setWindowName("Profile");
            setWindow(getProfilePanel());
            /*setWindowName("Home");
            setDynamicPanel(getHomePanel());
            setWindow(getDynamicPanel());*/
            return getWindow();
        }
        else
            return getWindow();
    }

    public static RegistrationPanel getRegistrationPanel() { return registrationPanel;  }

    public static void setRegistration_panel(RegistrationPanel newRegistrationPanel) {
        Controller.registrationPanel = newRegistrationPanel;
    }

    public static LoginPanel getLoginPanel() { return loginPanel;  }

    public static void setLoginPanel(LoginPanel newLoginPanel) {
        Controller.loginPanel = newLoginPanel;
    }

    public static ProfilePanel getProfilePanel() { return profilePanel; }

    public static void setProfilePanel(ProfilePanel newProfilePanel) {
        Controller.profilePanel = newProfilePanel;
    }

    public static DynamicHome getHomePanel(){ return homePanel;  }

    public static void setHomePanel(DynamicHome newhomeWindow) {
        Controller.homePanel = newhomeWindow;
    }


    //**************************************************************
    public static DynamicPeople getPeopleWindow() {
        setWindow(peopleWindow);
        //setWindowName("People");
        return peopleWindow;
    }

    public static void setPeopleWindow(DynamicPeople newpeopleWindow) {
        peopleWindow = newpeopleWindow;
    }

    public static DynamicHomeTimeline getHomeTimelineWindow() {
        setWindow(homeTimelineWindow);
        //setWindowName("HomeTimeline");
        return homeTimelineWindow;
    }

    public static void setHomeTimelineWindow(DynamicHomeTimeline homeTimelineWindow) {
        Controller.homeTimelineWindow = homeTimelineWindow;
    }

    public static DynamicIterationTimeline getIterationTimelineWindow() {
        setWindow(iterationTimelineWindow);
        //setWindowName("IterationTimeline");
        return iterationTimelineWindow;
    }

    public static void setIterationTimelineWindow(DynamicIterationTimeline newinteractionTimelineWindow) {
        iterationTimelineWindow = newinteractionTimelineWindow;
    }

    public static DynamicInteractiveTimeline getInteractiveTimelineWindow() {
        setWindow(interactiveTimelineWindow);
        //setWindowName("InteractiveTimeline");
        return interactiveTimelineWindow;
    }

    public static void setInteractiveTimelineWindow(DynamicInteractiveTimeline newinteractiveTimelineWindow) {
        interactiveTimelineWindow = newinteractiveTimelineWindow;
    }

    public static SettingPanel getSettingWindow() {
        setWindow(settingWindow);
        //setWindowName("Settings");
        return settingWindow;
    }

    public static void setSettingWindow(SettingPanel settingWindow) {
        Controller.settingWindow = settingWindow;
    }

    public static DynamicUserTimeline getUserWindow() {
        setWindow(dynamicUserWindow);
        //setWindowName("UserTimeline");
        return dynamicUserWindow;
    }

    public static void setUserWindow(DynamicUserTimeline dynamicUserWindow) {
        Controller.dynamicUserWindow = dynamicUserWindow;
    }



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

        if (homePanel != null) {
            Controller.getProfilePanel().remove(homePanel);
            homePanel = null;

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


    public static void selectDynamicWindow(int choose) {

       /* Controller.temporaryInformation.put("ProgressBarThread", getOpBar());
        Controller.getOpBar().setLabelBar("Operation in progress..");
        Controller.getOpBar().start();*/

       // closeAllDynamicPanel();

        /*if (Controller.getProfilePanel().getComposite_dinamic() != null) {
            Controller.getProfilePanel().getComposite_dinamic().dispose();
        }*/

        switch (choose) {
            case 0://home profile

               // if (Controller.getProfilePanel().getComposite_dinamic() == null) {
                System.out.println("arriva");
                    setWindowName("Home");
                System.out.println(getLoginPanel());
                   setDynamicPanel(getLoginPanel());

                System.out.println("arriva 2");
                    Controller.getProfilePanel().setDynamic(Controller.getDynamicPanel());
                System.out.println("prova: "+Controller.getProfilePanel().getDynamic().toString());
                Controller.getProfilePanel().getDynamic().revalidate();

                break;

            /*case 1://setting
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
            case 2://people

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
            case 3://user

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

            case 4://hometimeline

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

            case 5://iteration timeline

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

            case 6://interactive

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

                break;*/

            default:
                break;
        }

    }


}
