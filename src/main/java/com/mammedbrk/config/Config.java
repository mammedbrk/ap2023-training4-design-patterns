package com.mammedbrk.config;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class Config {
    public static Properties getConfig() {
        Properties properties = new Properties();
        try {
            properties.load(new FileReader("src/main/resources/com.mammedbrk/config/board.properties"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return properties;
    }
}
