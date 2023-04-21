package com.mammedbrk.view;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MyPanel extends JPanel {
    private static MyPanel instance;

    public static MyPanel getInstance() {
        if (instance == null) {
            instance = new MyPanel();
        }
        return instance;
    }

    private MyPanel() {
        this.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
            }
        });
    }
}
