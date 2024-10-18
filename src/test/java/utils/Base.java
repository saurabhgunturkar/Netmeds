package utils;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class Base {

    
    private static ThreadLocal<WebDriver> driver = new ThreadLocal<>();

    public static WebDriver getDriver() {
        return driver.get();
    }

    public static void setDriver(WebDriver driverInstance) {
        driver.set(driverInstance);
    }

    public static void openBrowser() {
        String browserName = PropertyReader.loadPropertiesFromConfig().getProperty("browserName");

        switch (browserName.toLowerCase()) {
            case "chrome":
            // Headless Testing code---->>>
//                ChromeOptions options = new ChromeOptions();
//                options.addArguments("headless");
//                setDriver(new ChromeDriver(options));
                setDriver(new ChromeDriver());
                break;
            case "edge":
                setDriver(new EdgeDriver());
                break;
            case "firefox":
                setDriver(new FirefoxDriver());
                break;
            case "safari":
                setDriver(new SafariDriver());
                break;
            default:
                System.out.println("Invalid Browser. Please check browser configuration");
        }

        WebDriver driverInstance = getDriver();
        if (driverInstance != null) {
            driverInstance.manage().window().maximize();
            driverInstance.manage().deleteAllCookies();
            driverInstance.get(PropertyReader.loadPropertiesFromConfig().getProperty("url"));
            driverInstance.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
            driverInstance.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
        }
    }

    public static void closeBrowser() {
        WebDriver driverInstance = getDriver();
        if (driverInstance != null) {
            driverInstance.quit();
            driver.remove();
        }
    }
    
}
