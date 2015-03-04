package com.socialcdeIntellij;

import com.intellij.openapi.project.Project;
import com.intellij.openapi.wm.ToolWindow;
import com.intellij.openapi.wm.ToolWindowAnchor;
import com.intellij.openapi.wm.ToolWindowFactory;
import com.intellij.openapi.wm.ToolWindowManager;
import com.intellij.ui.content.Content;
import com.intellij.ui.content.ContentFactory;
import com.socialcdeIntellij.staticview.RegistrationPanel;

import java.io.IOException;

/**
 * Created by noisemaker on 11/02/2015.
 */
public class ProvaTool implements ToolWindowFactory {

    @Override
    public void createToolWindowContent(Project project, ToolWindow toolWindow) {

        try {
            System.out.println("qui si **********   ***********");
            RegistrationPanel r = new RegistrationPanel();
            r.setVisible(true);
            ToolWindowManager twm= ToolWindowManager.getInstance(project);
            toolWindow = twm.registerToolWindow("SocialCDE",true, ToolWindowAnchor.RIGHT);

            Content content=ContentFactory.SERVICE.getInstance().createContent(r,"",true);
            toolWindow.getContentManager().addContent(content);//aggiunge il content (la view di eclipse)
            System.out.println("arriva!!*************************");
        } catch (IOException e) {
            e.printStackTrace();
        }




    }
}
