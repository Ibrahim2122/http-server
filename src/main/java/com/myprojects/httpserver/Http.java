package com.myprojects.httpserver;

import com.myprojects.httpserver.config.Configuration;
import com.myprojects.httpserver.config.ConfigurationManager;
import com.myprojects.httpserver.core.ServerListenerThread;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Http {

    public static void  main(String[] args) throws IOException {
        System.out.println("Starting HTTP server...");

        ConfigurationManager.getInstance().loadConfiguration("src/main/resources/config.json");
        Configuration conf = ConfigurationManager.getInstance().getCurrentConfiguration();

        System.out.println("Server starting on port " + conf.getPort() + " with webroot: " + conf.getWebRoot());

        ServerListenerThread serverListenerThread = new ServerListenerThread(conf.getPort(), conf.getWebRoot());
        serverListenerThread.start();
    }
}
