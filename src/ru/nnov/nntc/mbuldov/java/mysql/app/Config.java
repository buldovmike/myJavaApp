/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.nnov.nntc.mbuldov.java.mysql.app;

import com.google.gson.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author student
 */
public class Config {

    private static Config fromDefaults() {
        Config config = new Config();
        return config;
    }
    
    public void toFile(String file) {
		toFile(new File(file));
    }

    public void toFile(File file) {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        String jsonConfig = gson.toJson(this);
        FileWriter writer;
        try {
            writer = new FileWriter(file);
            writer.write(jsonConfig);
            writer.flush();
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static Config fromFile(File configFile) {
        try {
            Gson gson = new GsonBuilder().setPrettyPrinting().create();
            BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(configFile)));
            return gson.fromJson(reader, Config.class);
        } catch (FileNotFoundException e) {
            return null;
        }
    }

    public String DB_USER;
    public String DB_PASSWORD;
    public String DB_CONN_STRING;

    public Config() {
        this.DB_USER = "student";
        this.DB_PASSWORD = "student";
        this.DB_CONN_STRING = "jdbc:mysql://localhost:3306/student?useUnicode=true&serverTimezone=UTC&useSSL=false";
    }

    private static Config instance;

    public static Config getInstance() {
        if (instance == null) {
            instance = fromDefaults();
        }
        return instance;
    }

    public static void load(String file) {
		load(new File(file));
    }
    
    public static void load(File file) {

        instance = fromFile(file);

        if (instance == null) {
            instance = fromDefaults();
        }

    }

}
