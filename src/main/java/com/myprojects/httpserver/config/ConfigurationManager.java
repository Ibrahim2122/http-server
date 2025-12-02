package com.myprojects.httpserver.config;

import com.fasterxml.jackson.databind.JsonNode;
import com.myprojects.httpserver.util.Json;

import java.io.FileReader;
import java.io.IOException;

public class ConfigurationManager {

    private static ConfigurationManager myConfigurationManager;
    private static Configuration myCurrentConfiguration;

    private ConfigurationManager() {}

    public static ConfigurationManager getInstance() {
        if (myConfigurationManager == null) {
            myConfigurationManager = new ConfigurationManager();
        }
        return myConfigurationManager;
    }

    public void loadConfiguration(String filepath) throws IOException {
        FileReader fileReader = new FileReader(filepath);
        StringBuffer sb = new StringBuffer();
        int i;
        while ((i = fileReader.read()) != -1) {
            sb.append((char) i);
        }
        JsonNode conf = Json.parse(sb.toString());
        myCurrentConfiguration = Json.fromJson(conf, Configuration.class);


    }

    public Configuration getCurrentConfiguration() {
        if (myCurrentConfiguration != null) {
            throw new HttpConfigurationExceprion("No current configuration is set!");
        }
        return myCurrentConfiguration;
    }
}
