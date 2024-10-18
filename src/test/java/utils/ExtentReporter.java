package utils;


import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReporter {
        
    public static ExtentReports extent;
    public static ExtentTest eTest;

    public static ExtentReports extentReportsFromBase64(String reportName){
        String reportFilePath = PropertyReader.loadPropertiesFromConfig().getProperty("reportFilePath");
        extent = new ExtentReports();

        String dateFormat = new SimpleDateFormat("yyyy-MM-dd_HH-mm-ss").format(new Date());
        String finalreportfilepath = reportFilePath + reportName + "_" + dateFormat + ".html";
        ExtentSparkReporter esr = new ExtentSparkReporter(finalreportfilepath);
        extent.attachReporter(esr);
        return extent;

    }

    public static void createTest(String testName, String description){
        eTest = extent.createTest(testName, description);
    }

    public static void pass(String msg){
        eTest.log(Status.PASS, msg);
    }

    public static void info(String msg){
        eTest.log(Status.INFO, msg);
    }

    public static void fail(WebDriver driver, String msg){
        String base64Screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BASE64);
        try {
            eTest.log(Status.FAIL, msg, MediaEntityBuilder.createScreenCaptureFromBase64String(base64Screenshot).build());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void flushReports(){
        if(extent!=null){
            extent.flush();
        }
    }
}
