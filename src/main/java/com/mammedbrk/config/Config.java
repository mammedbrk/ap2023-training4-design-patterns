package com.mammedbrk.config;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class Config {
    public static final String CONFIG_ADDRESS = "src/main/resources/com.mammedbrk/config/";

    public static Properties getConfig(String name) {
        Properties properties = new Properties();
        try {
            properties.load(new FileReader(CONFIG_ADDRESS + name + ".properties"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return properties;
    }
}
