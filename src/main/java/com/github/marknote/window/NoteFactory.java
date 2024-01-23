package com.github.marknote.window;

import com.intellij.openapi.project.Project;
import com.intellij.openapi.wm.ToolWindow;
import com.intellij.openapi.wm.ToolWindowFactory;
import com.intellij.ui.content.Content;
import com.intellij.ui.content.ContentFactory;
import com.vladsch.flexmark.formatter.MarkdownWriter;
import org.jetbrains.annotations.NotNull;

public class NoteFactory implements ToolWindowFactory {

    @Override
    public void createToolWindowContent(@NotNull Project project, @NotNull ToolWindow toolWindow) {
        ContentFactory contentFactory = ContentFactory.getInstance();
        NoteWindow noteWindow = new NoteWindow();
        Content content = contentFactory.createContent(noteWindow.mainPanel(), "", false);
        toolWindow.getContentManager().addContent(content);
    }
}
