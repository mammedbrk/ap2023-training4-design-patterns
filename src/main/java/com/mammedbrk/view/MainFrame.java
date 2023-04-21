package com.mammedbrk.view;

import com.mammedbrk.config.Config;

import javax.swing.*;
import java.awt.*;
import java.util.Properties;

public class MainFrame extends JFrame {
    private final MyPanel panel;
    private final Properties config;

    public MainFrame() {
        config = Config.getConfig("frame");
        panel = MyPanel.getInstance();

        init();
    }

    private void init() {
        int screenWidth, screenHeight, windowWidth, windowHeight;
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
    }
}
