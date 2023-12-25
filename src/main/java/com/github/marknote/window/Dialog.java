package com.github.marknote.window;

import com.intellij.openapi.ui.DialogWrapper;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;

public class Dialog extends DialogWrapper {

    protected Dialog() {
        super(false);
    }

    @Override
    protected @Nullable JComponent createCenterPanel() {
        return null;
    }

}
