package com.socialcdeIntellij;

import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import com.intellij.openapi.actionSystem.PlatformDataKeys;
import com.intellij.openapi.progress.ProgressIndicator;
import com.intellij.openapi.progress.ProgressManager;
import com.intellij.openapi.progress.Task;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.wm.ToolWindow;
import com.intellij.openapi.wm.WindowManager;
import com.socialcdeIntellij.controller.Controller;
import org.jetbrains.annotations.NotNull;

public class MainAction extends AnAction {

    public void actionPerformed(AnActionEvent e) {
        Project project = e.getData(PlatformDataKeys.PROJECT);
        ToolWindow tw = null;
        Tool pt = new Tool();
        pt.createToolWindowContent(project,tw);

        Controller.setFrame(WindowManager.getInstance().getFrame(project));
        Controller.setProject(project);
      /*
        String txt= Messages.showInputDialog(project, "What is your name?", "Input your name", Messages.getQuestionIcon());
        Messages.showMessageDialog(project, "Hello, " + txt + "!\n I am glad to see you.", "Information", Messages.getInformationIcon());*/

    }
}
