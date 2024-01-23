package com.github.marknote.model;

import com.google.common.collect.Lists;

import java.util.List;

public class Note {

    private String title;

    private List<NoteInfo> noteInfos = Lists.newLinkedList();

    public String title() {
        return title;
    }

    public Note setTitle(String title) {
        this.title = title;
        return this;
    }

    public List<NoteInfo> noteInfos() {
        return noteInfos;
    }

    public Note setNoteInfos(List<NoteInfo> noteInfos) {
        this.noteInfos = noteInfos;
        return this;
    }
}
