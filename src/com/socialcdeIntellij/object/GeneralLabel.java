package com.socialcdeIntellij.object;

import com.socialcdeIntellij.shared.library.WPost;
import com.socialcdeIntellij.shared.library.WUser;

import javax.swing.*;

/**
 * Created by Teo on 19/03/2015.
 */
public class GeneralLabel extends JLabel{
    WPost wPost = null;
    WUser wUser = null;

    public WUser getwUser() {
        return wUser;
    }

    public void setwUser(WUser wUser) {
        this.wUser = wUser;
    }

    public WPost getwPost() {
        return wPost;
    }

    public void setwPost(WPost wPost) {
        this.wPost = wPost;
    }

    public GeneralLabel(String text, Icon icon, int horizontalAlignment) {
        super(text, icon, horizontalAlignment);
    }

    public GeneralLabel(String text, int horizontalAlignment) {
        super(text, horizontalAlignment);
    }

    public GeneralLabel(String text) {
        super(text);
    }

    public GeneralLabel(Icon image, int horizontalAlignment) {
        super(image, horizontalAlignment);
    }

    public GeneralLabel(Icon image) {
        super(image);
    }

    public GeneralLabel() {
    }
}
