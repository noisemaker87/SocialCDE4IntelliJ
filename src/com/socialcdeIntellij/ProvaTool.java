package com.socialcdeIntellij;

import com.intellij.openapi.project.Project;
import com.intellij.openapi.wm.ToolWindow;
import com.intellij.openapi.wm.ToolWindowAnchor;
import com.intellij.openapi.wm.ToolWindowFactory;
import com.intellij.openapi.wm.ToolWindowManager;
import com.intellij.ui.content.Content;
import com.intellij.ui.content.ContentFactory;
import com.socialcdeIntellij.controller.Controller;
import com.socialcdeIntellij.staticview.RegistrationPanel;

import javax.swing.*;
import java.io.IOException;

/**
 * Created by noisemaker on 11/02/2015.
 */
public class ProvaTool implements ToolWindowFactory {
    Controller controller = new Controller();

    @Override
    public void createToolWindowContent(Project project, ToolWindow toolWindow) {

       /* Controller controller = new Controller();
        JPanel panel = controller.getRegistrationPanel();
        panel.setVisible(true);*/

        ToolWindowManager twm= ToolWindowManager.getInstance(project);
        toolWindow = twm.registerToolWindow("SocialCDE",true, ToolWindowAnchor.RIGHT);

        Content content=ContentFactory.SERVICE.getInstance().createContent(getPanel(),"",true);
        toolWindow.getContentManager().addContent(content);//aggiunge il content (la view di eclipse)

    }

    public JPanel getPanel(){

        JPanel panel = new JPanel();
        panel.add(controller.getCurrentPanel());

        panel.setVisible(true);

        return panel;
    }
}
