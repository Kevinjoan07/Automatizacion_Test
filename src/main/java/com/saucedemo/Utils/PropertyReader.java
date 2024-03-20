package com.saucedemo.Utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertyReader {
//Esta clase es para que lea  las variables del automation.properties

    private static Properties properties =  new Properties();

    private PropertyReader() {
    }

    public static void addPropertySource(String path) throws IOException {
        try{
            properties.load(new FileInputStream(new File(path)));

        }catch (IOException e){
            throw new IOException("It was not possible access ti the spcified file" + path, e );

        }
    }

    public static String getProperty(String key){
        return  properties.getProperty(key);
    }
}
