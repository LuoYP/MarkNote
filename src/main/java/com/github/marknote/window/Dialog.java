package com.github.marknote.window;

import com.intellij.openapi.ui.DialogWrapper;
import com.intellij.openapi.util.NlsContexts;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;

public class Dialog extends DialogWrapper {

    protected Dialog() {
        super(false);
    }

    @Override
    public void setTitle(@NlsContexts.DialogTitle String title) {
        super.setTitle(title);
    }

    @Override
    protected @Nullable JComponent createCenterPanel() {
        JLabel title = new JLabel();
        JTextField titleText = new JTextField();
        return null;
    }

}
