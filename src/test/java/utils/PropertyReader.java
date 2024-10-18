package utils;

import java.io.FileInputStream;
import java.util.Properties;

public class PropertyReader {



    private static Properties properties;

    public static Properties loadPropertiesFromConfig(){
        try {
            String configFilePath = "src/config/browser.properties";
            properties = new Properties();
            FileInputStream file = new FileInputStream(configFilePath);
            properties.load(file);
            return properties;
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Properties not loading form config");
        }
        return properties;
    }
    


    
}
