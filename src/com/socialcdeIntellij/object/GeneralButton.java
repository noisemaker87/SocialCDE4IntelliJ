package com.socialcdeIntellij.object;

import com.socialcdeIntellij.shared.library.WService;

import javax.swing.*;

/**
 * Created by Teo on 17/03/2015.
 */
public class GeneralButton extends JButton {

    private WService service = null;

    public WService getService() {
        return service;
    }

    public void setService(WService service) {
        this.service = service;
    }

    public GeneralButton() {
    }

    public GeneralButton(Icon icon) {
        super(icon);
    }

    public GeneralButton(String text) {
        super(text);
    }

    public GeneralButton(Action a) {
        super(a);
    }

    public GeneralButton(String text, Icon icon) {
        super(text, icon);
    }
}
