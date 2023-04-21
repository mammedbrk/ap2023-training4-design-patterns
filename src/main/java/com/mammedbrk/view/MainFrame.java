package com.mammedbrk.view;

import com.mammedbrk.config.Config;
import com.mammedbrk.view.graphicalmodel.GraphicalBoard;
import com.mammedbrk.view.graphicalmodel.GraphicalPiece;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.Properties;

public class MainFrame extends JFrame {
    private final MyPanel panel;
    private final Properties config;
    int screenWidth, screenHeight, windowWidth, windowHeight;


    public MainFrame() {
        config = Config.getConfig("frame");
        panel = MyPanel.getInstance();

        init();
    }

    private void init() {
        screenWidth = Toolkit.getDefaultToolkit().getScreenSize().width;
        screenHeight = Toolkit.getDefaultToolkit().getScreenSize().height;
        windowWidth = Integer.parseInt(config.getProperty("windowWidth"));
        windowHeight = Integer.parseInt(config.getProperty("windowHeight"));
        this.setLayout(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(new Dimension(windowWidth, windowHeight));
        this.setLocation(screenWidth / 2 - windowWidth / 2, screenHeight / 2 - windowHeight / 2);
        this.setVisible(true);

        this.setContentPane(panel);

        startGame();
    }

    public void startGame() {
        while (true) {
            try {
                Thread.sleep(1000 / 60);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            MyPanel.getInstance().setBoard(new GraphicalBoard(windowWidth, windowHeight, 8 ,8, new ArrayList<>()));
            MyPanel.getInstance().getBoard().addPiece(new GraphicalPiece(35, 20, 20, "#ffffff"));

            this.repaint();
            this.revalidate();
        }
    }
}
