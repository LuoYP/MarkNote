package com.github.marknote.window;

import com.github.marknote.model.NoteInfo;
import com.intellij.openapi.ui.DialogWrapper;
import com.intellij.ui.EditorTextField;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;
import java.awt.*;

/**
 * 添加笔记使用的对话框
 */
public class EditorDialog extends DialogWrapper {

    private EditorTextField titleTextField;

    private EditorTextField contentTextField;

    private final NoteInfo noteInfo;

    public EditorDialog(NoteInfo noteInfo) {
        super(true);
        setTitle("笔记注释");
        this.noteInfo = noteInfo;
        init();
    }

    @Nullable
    @Override
    protected JComponent createCenterPanel() {
        JPanel panel = new JPanel(new BorderLayout());
        titleTextField = new EditorTextField("笔记标题");
        contentTextField = new EditorTextField("笔记内容");
        contentTextField.setPreferredSize(new Dimension(300, 200));
        panel.add(titleTextField, BorderLayout.NORTH);
        panel.add(contentTextField, BorderLayout.CENTER);
        return panel;
    }

    @Override
    protected JComponent createSouthPanel() {
        JPanel jPanel = new JPanel();
        JButton button = new JButton("添加到列表");
        button.addActionListener(e -> {
            noteInfo.setTitle(titleTextField.getText())
                    .setExegesis(contentTextField.getText());
            System.out.println(noteInfo.fileName());
        });
        jPanel.add(button);
        return jPanel;
    }
}
