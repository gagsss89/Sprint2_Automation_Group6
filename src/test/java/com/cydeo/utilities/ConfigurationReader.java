package com.cydeo.utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
// here we will create re-usable logic to read from configuration.properties file
public class ConfigurationReader {



        // Create object



        //private to have limited access to object
        // static to make sure its created and loaded before anything else
        private static Properties properties = new Properties();

        static {

            try{


                // Open file using FileInputStream
                FileInputStream file = new FileInputStream("configuration.properties");

                // Load the file to properties
                properties.load(file);
                file.close();
            } catch (IOException e) {
                System.out.println("FILE NOT FOUND WITH GIVEN PATH");
                e.printStackTrace();
            }
        }
// Pass the value into the object

        public static String getProperty (String keyword) {
            return properties.getProperty(keyword);
        }

    }
