package com.socialcdeIntellij.object;


import javax.swing.JOptionPane;
import javax.swing.JProgressBar;
import javax.swing.SwingUtilities;

public class OperationProgressBarThread extends Thread {

    private final int DELAY = 100;
    private JProgressBar progressBar;

    public OperationProgressBarThread(JProgressBar bar) {
        progressBar = bar;
    }

    @Override
    public void run() {
        int minimum = progressBar.getMinimum();
        int maximum = progressBar.getMaximum();
        Runnable runner = new Runnable() {
            @Override
            public void run() {
                int value = progressBar.getValue();
                progressBar.setValue(value + 1);
            }
        };
        for (int i = minimum; i < maximum; i++) {
            try {
                SwingUtilities.invokeLater(runner);
                Thread.sleep(DELAY);
            } catch (InterruptedException ex) {
                JOptionPane.showMessageDialog(null, ex.getMessage());
            }
        }
    }
}

