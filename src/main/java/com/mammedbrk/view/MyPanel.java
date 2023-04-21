package com.mammedbrk.view;

import com.mammedbrk.config.Config;
import com.mammedbrk.view.graphicalmodel.GraphicalBoard;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Properties;

public class MyPanel extends JPanel {
    private static MyPanel instance;
    private final Properties config;
    private GraphicalBoard board;

    public static MyPanel getInstance() {
        if (instance == null) {
            instance = new MyPanel();
        }
        return instance;
    }

    private MyPanel() {
        config = Config.getConfig("panel");

        init();

        this.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {

            }
        });
    }

    private void init() {
        this.setLayout(null);
        this.setBackground(Color.decode(config.getProperty("color")));
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (board != null)
            board.paint((Graphics2D) g);
    }

    public GraphicalBoard getBoard() {
        return board;
    }

    public void setBoard(GraphicalBoard board) {
        this.board = board;
    }
}
