package com.github.marknote.window;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class NoteWindow {
    private JTextField fileTitleText;
    private JLabel fileTitle;
    private JButton createButton;
    private JButton clearButton;
    private JButton closeButton;
    private JTable noteInfoTable;
    private JPanel mainPanel;

    public NoteWindow() {
        createButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        clearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        closeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }

    public JComponent mainPanel() {
        return mainPanel;
    }
}
