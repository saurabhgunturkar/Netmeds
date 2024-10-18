package utils;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Screenshot {

    
    public static String captureScreenshot(WebDriver driver, String filename){
        
        String screenshotfilePath = PropertyReader.loadPropertiesFromConfig().getProperty("screenshotfilePath");

        TakesScreenshot ts = ((TakesScreenshot)driver);
        File source = ts.getScreenshotAs(OutputType.FILE);
        String fileformat = new SimpleDateFormat("yyyy-MM-dd_HH-mm-ss").format(new Date());
        String destination = screenshotfilePath + filename + "_" + fileformat + ".png";
        File finalDestination = new File(destination);
        try {
            FileUtils.copyFile(source, finalDestination);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return destination;
    }
    
    
}
