package com.github.marknote.window;

import com.intellij.openapi.ui.DialogWrapper;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;
import java.awt.*;

public class Dialog extends DialogWrapper {

    public Dialog() {
        super(true);
        setTitle("笔记");
        init();
    }

    @Nullable
    @Override
    protected JComponent createCenterPanel() {
        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());
        JLabel title = new JLabel();
        title.setText("标题");
        JTextField titleText = new JTextField();
        titleText.setText("标题文本");
        JLabel content = new JLabel();
        content.setText("内容");
        JTextField contentText = new JTextField();
        contentText.setText("内容文本");
        panel.add(title, BorderLayout.BEFORE_FIRST_LINE);
        panel.add(titleText, BorderLayout.AFTER_LINE_ENDS);
        panel.add(content, BorderLayout.AFTER_LINE_ENDS);
        panel.add(contentText, BorderLayout.AFTER_LINE_ENDS);
        return panel;
    }

}
