package com.github.marknote.action;

import cn.hutool.core.io.file.FileNameUtil;
import com.github.marknote.model.NoteInfo;
import com.github.marknote.window.EditorDialog;
import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import com.intellij.openapi.actionSystem.CommonDataKeys;
import com.intellij.openapi.editor.Editor;

public class EditorPopupAction extends AnAction {

    @Override
    public void actionPerformed(AnActionEvent e) {
        NoteInfo noteInfo = new NoteInfo();
        Editor editor = e.getRequiredData(CommonDataKeys.EDITOR);
        String fileName = e.getRequiredData(CommonDataKeys.PSI_FILE).getViewProvider().getVirtualFile().getName();
        noteInfo.setContent(editor.getSelectionModel().getSelectedText())
                .setFileName(fileName);
        EditorDialog dialog = new EditorDialog(noteInfo);
        dialog.show();
    }
}
