package com.github.marknote.model;

public class NoteInfo {

    private String title;

    private String content;

    private String exegesis;

    private String fileName;

    public String title() {
        return title;
    }

    public NoteInfo setTitle(String title) {
        this.title = title;
        return this;
    }

    public String content() {
        return content;
    }

    public NoteInfo setContent(String content) {
        this.content = content;
        return this;
    }

    public String exegesis() {
        return exegesis;
    }

    public NoteInfo setExegesis(String exegesis) {
        this.exegesis = exegesis;
        return this;
    }

    public String fileName() {
        return fileName;
    }

    public NoteInfo setFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }
}
