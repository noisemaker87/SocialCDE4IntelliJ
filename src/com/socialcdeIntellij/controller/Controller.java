package com.socialcdeIntellij.controller;

import com.intellij.ide.util.PropertiesComponent;
import com.intellij.openapi.project.Project;
import com.socialcdeIntellij.dynamicview.*;
import com.socialcdeIntellij.model.ProxyWrapper;
import com.socialcdeIntellij.object.OperationProgressBar;
import com.socialcdeIntellij.shared.library.WUser;
import com.socialcdeIntellij.staticview.*;
import org.jdesktop.swingx.VerticalLayout;
import javax.swing.*;
import java.awt.*;
import java.util.HashMap;

/**
 * Created by Teo on 02/03/2015.
 */
public class Controller {

    private static JFrame frame = null;
    private static Project project = null;

    public static Project getProject() {
        return project;
    }

    public static void setProject(Project project) {
        Controller.project = project;
    }

    private static RegistrationPanel registrationPanel = new RegistrationPanel();
    private static LoginPanel loginPanel = new LoginPanel();
    private static ProfilePanel profilePanel = new ProfilePanel();
    private static HomePanel homePanel;
    private static PeoplePanel peoplePanel;
    private static HomeTimelinePanel homeTimelinePanel;
    private static IterationTimelinePanel iterationTimelinePanel;
    private static InteractiveTimelinePanel interactiveTimelinePanel;
    private static SettingPanel settingPanel;
    private static UserTimelinePanel userTimelinePanel;

    // attributes
    private static boolean flag = false;
    private static CardLayout cardLayout = new CardLayout();
    private static CardLayout cardLayout2 = new CardLayout();
    private static JPanel window = new JPanel(cardLayout);// qui x cambiare pannello iniziale
    private static JPanel dynamicPanel = new JPanel(cardLayout2);
    private static String windowName = null;
    private static String dynamicPanelName = null;

    private static ProxyWrapper proxy = null;
    private static WUser currentUser = null;
    private static String currentUserPassword = null;
    public static HashMap<String, Object> temporaryInformation = new HashMap<String, Object>();
    private static HashMap<String,Image> usersAvatar = new HashMap<String,Image>();
    private static HashMap<String, Image> servicesImage = new HashMap<String,Image>();


    //progress bar***************************************************************************
    private static OperationProgressBar opBar = new OperationProgressBar();

    public static OperationProgressBar getOpBar() {
        return opBar;
    }

    public static void setOpBar(OperationProgressBar newOpBar) {
        opBar = newOpBar;
    }
 //***************************************************************************************

//metodi cambio pannelli*************************************************************************************
    public static JPanel getCurrentPanel() {
        if (flag == false) {
            setWindowName("Login");
            setWindow(getLoginPanel());
            //return getWindow();

            //setWindowName("Profile");
           // selectDynamicWindow(0);

            return getWindow();
        }
        else
            return getWindow();
    }

    public static JFrame getFrame() {
        return frame;
    }

    public static void setFrame(JFrame frame) {
        Controller.frame = frame;
    }

    public static JPanel getWindow() {
        return window;
    }

    public static void setWindow(JPanel newWindow) {
        flag = true;
        window.removeAll();
        window.add(newWindow);
        cardLayout.show(window,getWindowName());
    }

    public static String getWindowName() {
        return windowName;
    }

    public static void setWindowName(String newWindowName) {
        windowName = newWindowName;
    }

    public static void setDynamicPanel(JPanel newWindow) {
        dynamicPanel.removeAll();
        dynamicPanel.add(newWindow);
        cardLayout2.show(dynamicPanel,getWindowName());
    }

    public static JPanel getDynamicPanel() {
        return dynamicPanel;
    }

    public static String getDynamicPanelName() {
        return dynamicPanelName;
    }

    public static void setDynamicPanelName(String dynamicPanelName) {
        Controller.dynamicPanelName = dynamicPanelName;
    }
//*********************************************************************************************************************

//getter and setter **********************************************************************************************
    public static RegistrationPanel getRegistrationPanel() { return registrationPanel;  }

    public static void setRegistrationPanel(RegistrationPanel registrationPanel) {
        Controller.registrationPanel = registrationPanel;
    }

    public static LoginPanel getLoginPanel() { return loginPanel;  }

    public static void setLoginPanel(LoginPanel newLoginPanel) {
        Controller.loginPanel = newLoginPanel;
    }

    public static ProfilePanel getProfilePanel() { return profilePanel; }

    public static void setProfilePanel(ProfilePanel newProfilePanel) {
        Controller.profilePanel = newProfilePanel;
    }

    public static HomePanel getHomePanel(){ return homePanel;  }

    public static void setHomePanel(HomePanel newhomeWindow) {
        Controller.homePanel = newhomeWindow;
    }


    //**************************************************************


    public static PeoplePanel getPeoplePanel() {
        return peoplePanel;
    }

    public static void setPeoplePanel(PeoplePanel peoplePanel) {
        Controller.peoplePanel = peoplePanel;
    }

    public static HomeTimelinePanel getHomeTimelinePanel() {
        return homeTimelinePanel;
    }

    public static void setHomeTimelinePanel(HomeTimelinePanel homeTimelinePanel) {
        Controller.homeTimelinePanel = homeTimelinePanel;
    }

    public static IterationTimelinePanel getIterationTimelinePanel() {
        return iterationTimelinePanel;
    }

    public static void setIterationTimelinePanel(IterationTimelinePanel iterationTimelinePanel) {
        Controller.iterationTimelinePanel = iterationTimelinePanel;
    }

    public static InteractiveTimelinePanel getInteractiveTimelinePanel() {
        return interactiveTimelinePanel;
    }

    public static void setInteractiveTimelinePanel(InteractiveTimelinePanel interactiveTimelinePanel) {
        Controller.interactiveTimelinePanel = interactiveTimelinePanel;
    }

    public static SettingPanel getSettingPanel() {
        return settingPanel;
    }

    public static void setSettingPanel(SettingPanel settingPanel) {
        Controller.settingPanel = settingPanel;
    }

    public static UserTimelinePanel getUserTimelinePanel() {
        return userTimelinePanel;
    }

    public static void setUserTimelinePanel(UserTimelinePanel userTimelinePanel) {
        Controller.userTimelinePanel = userTimelinePanel;
    }




    //*******************************************************************************************

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

    public static void openConnectionLostPanel(){
        int response = JOptionPane.showConfirmDialog(Controller.getFrame(), "Connection Lost! \n You will be redirected to Login page.",
                "SocialCDE message", JOptionPane.OK_OPTION, JOptionPane.WARNING_MESSAGE);

        if(response == JOptionPane.OK_OPTION){
            Controller.setWindowName("Login");
            Controller.setWindow(Controller.getLoginPanel());
            Controller.getWindow().revalidate();
        }
    }

    public static void selectDynamicWindow(int choose) {
        JPanel container = new JPanel();
        container.setLayout(new VerticalLayout(2));

       /* Controller.temporaryInformation.put("ProgressBarThread", getOpBar());
        Controller.getOpBar().setLabelBar("Operation in progress..");
        Controller.getOpBar().start();*/

        switch (choose) {
            case 0://home profile

                setDynamicPanelName("Home");
                setHomePanel(new HomePanel());
                setDynamicPanel(getHomePanel());
                container.removeAll();
                container.add(getProfilePanel());
                container.add(getDynamicPanel());

                container.revalidate();
                setWindow(container);

                break;

            case 1://settings

                setDynamicPanelName("Settings");
                setSettingPanel(new SettingPanel());
                setDynamicPanel(getSettingPanel());
                container.removeAll();
                container.add(getProfilePanel());
                container.add(getDynamicPanel());

                container.revalidate();
                setWindow(container);

                break;

            case 2://people

                setDynamicPanelName("People");
                setPeoplePanel(new PeoplePanel());
                setDynamicPanel(getPeoplePanel());
                container.removeAll();
                container.add(getProfilePanel());
                container.add(getDynamicPanel());

                container.revalidate();
                setWindow(container);

                break;

            case 3://home timeline

                setDynamicPanelName("HomeTimeline");
                setHomeTimelinePanel(new HomeTimelinePanel());
                setDynamicPanel(getHomeTimelinePanel());
                container.removeAll();
                container.add(getProfilePanel());
                container.add(getDynamicPanel());

                container.revalidate();
                setWindow(container);

                break;

            case 4://iteration timeline

                setDynamicPanelName("IterationTimeline");
                setIterationTimelinePanel(new IterationTimelinePanel());
                setDynamicPanel(getIterationTimelinePanel());
                container.removeAll();
                container.add(getProfilePanel());
                container.add(getDynamicPanel());

                container.revalidate();
                setWindow(container);

                break;

            case 5://interactive timeline

                setDynamicPanelName("InteractiveTimeline");
                setInteractiveTimelinePanel(new InteractiveTimelinePanel());
                setDynamicPanel(getInteractiveTimelinePanel());
                container.removeAll();
                container.add(getProfilePanel());
                container.add(getDynamicPanel());

                container.revalidate();
                setWindow(container);

                break;

            case 6://user timeline

                setDynamicPanelName("UserTimeline");
                setUserTimelinePanel(new UserTimelinePanel());
                setDynamicPanel(getUserTimelinePanel());
                container.removeAll();
                container.add(getProfilePanel());
                container.add(getDynamicPanel());

                container.revalidate();
                setWindow(container);

                break;

            default:
                container.removeAll();
                container.add(getProfilePanel());
                container.revalidate();

                break;
        }

    }



}
