package utils;

import java.time.Duration;
import java.util.Random;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.aventstack.extentreports.ExtentTest;

public class WebDriverHelper {

    

     WebDriver driver;
     ExtentTest test;
     WebElement webElement;

    public WebDriverHelper(WebDriver driver, ExtentTest test, WebElement webElement){
        this.driver=driver;
        this.test = test;
        this.webElement = webElement;

    }

    public void clickOnElement(By locator, String msg){
        try {
            webElement = driver.findElement(locator);
            webElement.click();
            // ExtentReporter.pass(msg);
            // LoggerHandler.info(msg);
        } catch (Exception e) {
            e.printStackTrace();
            // ExtentReporter.fail(driver, msg);
            // LoggerHandler.error(msg);
        }
    }

    public void sendKeys(By locator, String value, String msg){
        try {
            webElement = driver.findElement(locator);
            webElement.sendKeys(value);
            // ExtentReporter.pass(msg);
            // LoggerHandler.info(msg);
        } catch (Exception e) {
            e.printStackTrace();
            // ExtentReporter.fail(driver, msg);
            // LoggerHandler.error(msg);
        }
    }

    public void getText(By locator, String msg){
        try {
            webElement = driver.findElement(locator);
            webElement.getText();
            // ExtentReporter.pass(msg);
            // LoggerHandler.info(msg);
        } catch (Exception e) {
            e.printStackTrace();
            // ExtentReporter.fail(driver, msg);
            // LoggerHandler.error(msg);
        }
    }

    public void hoverAnElement(By locator, String msg){
        try {
            webElement = driver.findElement(locator);
            Actions actions = new Actions(driver);
            actions.moveToElement(webElement).build().perform();
            // ExtentReporter.pass(msg);
            // LoggerHandler.info(msg);
        } catch (Exception e) {
            e.printStackTrace();
            // ExtentReporter.fail(driver, msg);
            // LoggerHandler.error(msg);
        }
    }

    public void switchToNewWindow(String windowName){
        try {
            Set<String> windowHandles = driver.getWindowHandles();
            for(String windowHandle: windowHandles){
                if(!windowHandle.isEmpty()){
                    driver.switchTo().window(windowHandle);
                    // ExtentReporter.pass("Switch to "+ windowName + " window");
                    // LoggerHandler.info("Switch to "+ windowName + " window");
                }else{
                    // ExtentReporter.fail(driver, "Not switch to the "+ windowName + " window");
                    // LoggerHandler.error( "Not switch to the "+ windowName + " window");
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            // ExtentReporter.fail(driver, "Not switch to the "+ windowName + " window");
            // LoggerHandler.error( "Not switch to the "+ windowName + " window");
        }
    }

    public void switchToPreviousWindow() {
        try {
            // Switch back to the previous window
            String mainWindowHandle = driver.getWindowHandles().iterator().next();
            driver.switchTo().window(mainWindowHandle);
            // ExtentReporter.pass("Switched back to the previous window: " + previousWindowHandle);
            // LoggerHandler.info("Switched back to the previous window: " + previousWindowHandle);
        } catch (Exception e) {
            e.printStackTrace();
            // ExtentReporter.fail(driver, "Failed to switch back to the previous window: " + previousWindowHandle);
            // LoggerHandler.error("Failed to switch back to the previous window: " + previousWindowHandle);
        }
    }
    
    

    public void PressEnter(By locator, String msg){
        try {
            webElement = driver.findElement(locator);
            webElement.sendKeys(Keys.ENTER);
            // ExtentReporter.pass(msg);
            // LoggerHandler.info(msg);
        } catch (Exception e) {
            e.printStackTrace();
            // ExtentReporter.fail(driver, msg);
            // LoggerHandler.error(msg);
        }
    }

    public void waitForVisibilityofElement(By locator, int timesec, String msg){
        try {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timesec));
            wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
            // ExtentReporter.pass(msg);
            // LoggerHandler.info(msg);
        } catch (Exception e) {
            e.printStackTrace();
            // ExtentReporter.fail(driver, msg);
            // LoggerHandler.error(msg);
        }
    }

    public void refreshPage(String pageName){
        try {
            driver.navigate().refresh();
            // ExtentReporter.pass("refresh the"+ pageName);
            // LoggerHandler.info("refreshe the "+pageName);
        } catch (Exception e) {
            e.printStackTrace();
            // ExtentReporter.fail(driver, "Can't refresh "+ pageName);
            // LoggerHandler.error("Can't refresh "+ pageName);
        }
    }

    public void forwardPage(String pageName){
        try {
            driver.navigate().forward();
            // ExtentReporter.pass("move to the"+ pageName);
            // LoggerHandler.info("move to the "+pageName);
        } catch (Exception e) {
            e.printStackTrace();
            // ExtentReporter.fail(driver, "not move to the "+ pageName);
            // LoggerHandler.error("not move to the "+ pageName);
        }
    }

    public void backwardPage(String pageName){
        try {
            driver.navigate().back();
            // ExtentReporter.pass("move to the"+ pageName);
            // LoggerHandler.info("move to the "+pageName);
        } catch (Exception e) {
            e.printStackTrace();
            // ExtentReporter.fail(driver, "not move to the "+ pageName);
            // LoggerHandler.error("not move to the "+ pageName);
        }
    }

    public void verifyURL(String expectedURL, String msg){
        try {
            String actualURL = driver.getCurrentUrl();
            Assert.assertEquals(actualURL, expectedURL);
            // ExtentReporter.pass(msg);
            // LoggerHandler.info(msg);
        } catch (Exception e) {
            e.printStackTrace();
            // ExtentReporter.fail(driver, msg);
            // LoggerHandler.error(msg);
        }
    }

    public void verifyURL_Contains_Keyword(String containsKeywords, String msg){
        try {
            String actualURL = driver.getCurrentUrl();
            Assert.assertTrue(actualURL.contains(containsKeywords));
            // ExtentReporter.pass(msg);
            // LoggerHandler.info(msg);
        } catch (Exception e) {
            e.printStackTrace();
            // ExtentReporter.fail(driver, msg);
            // LoggerHandler.error(msg);
        }
    }

    public void verifyText(By locator, String msg){
        try {
            webElement = driver.findElement(locator);
            String actualText = webElement.getText();
            Assert.assertEquals(actualText, actualText);
            // ExtentReporter.pass(msg);
            // LoggerHandler.info(msg);
        } catch (Exception e) {
            e.printStackTrace();
            // ExtentReporter.fail(driver, msg);
            // LoggerHandler.error(msg);
        }
    }

    public void verifyText_Contains_Keyword(By locator, String containskeyword, String msg){
        try {
            webElement = driver.findElement(locator);
            String actualText = webElement.getText();
            Assert.assertTrue(actualText.contains(containskeyword));
            // ExtentReporter.pass(msg);
            // LoggerHandler.info(msg);
        } catch (Exception e) {
            e.printStackTrace();
            // ExtentReporter.fail(driver, msg);
            // LoggerHandler.error(msg);
        }
    }

    public void acceptAlert(String msg){
        try {
            Alert alert = driver.switchTo().alert();
            alert.accept();
            // ExtentReporter.pass(msg);
            // LoggerHandler.info(msg);
        } catch (Exception e) {
            e.printStackTrace();
            // ExtentReporter.fail(driver, msg);
            // LoggerHandler.error(msg);
        }

    }

    public void getCssProperty(By locator, String property, String msg){
        try {
            webElement = driver.findElement(locator);
            String cssValue = webElement.getCssValue(property);
            System.out.println("CSS Value:"+ cssValue);
            // ExtentReporter.pass("{"+ cssValue + "} = "+ msg);
            // LoggerHandler.info(msg);
        } catch (Exception e) {
            e.printStackTrace();
            // ExtentReporter.fail(driver, msg);
            // LoggerHandler.error(msg);
        }
    }

    public String emailGenerator(){
        final String characters = "QWERTYUIOPASDFGHJKLZXCVBNM0987654321qwertyuioplllkjhgfdsazxcvbnm";

        int length = 12;
        String domain = "@gmail.com";
        String email = "";
        Random random = new Random();

        for(int i=0; i<=length; i++){
            email = email + characters.charAt(random.nextInt(characters.length()));
        }
        return email+domain;
    }

    public void jsScrollByElement(By element){
        try {
            webElement = driver.findElement(element);
            JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", webElement);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void jsScrollByIndex(int pixels){
        try {
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("window.scrollBy(0,"+ pixels + ")");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    

    public void captureScreenshotCurrentWindow(String fileName, String msg){
        try {
            Screenshot.captureScreenshot(driver, fileName);
            // ExtentReporter.pass(msg);
            // LoggerHandler.info(msg);
        } catch (Exception e) {
            e.printStackTrace();
            // ExtentReporter.fail(driver, msg);
            // LoggerHandler.error(msg);
        }
    }

    public void selectByIndex(By locator, int index, String msg){
        try {
                webElement = driver.findElement(locator);
                Select objSelect = new Select(webElement);
                objSelect.selectByIndex(index);
                // ExtentReporter.pass(msg);
                // LoggerHandler.info(msg);
        } catch (Exception e) {
                e.printStackTrace();
                // ExtentReporter.fail(driver, msg);
                // LoggerHandler.error(msg);
        }
    }

    public void selectByValue(By locator, String value, String msg){
        try {
                webElement = driver.findElement(locator);
                Select objSelect = new Select(webElement);
                objSelect.selectByValue(value);;
                // ExtentReporter.pass(msg);
                // LoggerHandler.info(msg);
        } catch (Exception e) {
                e.printStackTrace();
                // ExtentReporter.fail(driver, msg);
                // LoggerHandler.error(msg);
        }
    }

    public void mouseCursorOffsetPosition(int x, int y){
        try {
            Actions actions = new Actions(driver);
            actions.moveByOffset(x, y).perform();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Cursor is failed to offset position");
        }
    }


    public void jsScrollByCompletePage() {
        try {
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("window.scrollTo(0, document.body.scrollHeight);");
            try {
                Thread.sleep(3000);
            } catch (Exception e) {
                e.printStackTrace();
            }
            js.executeScript("window.scrollTo(0, 0);");
            try {
                Thread.sleep(3000);
            } catch (Exception e) {
                e.printStackTrace();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void jsScrollAtTheTop(){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0, 0);");
    }

    public void jsScrollAtTheBottom(){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0, document.body.scrollHeight);");
    }

    public void getLocationOfWebElement(By locator){
        try {
            webElement = driver.findElement(locator);
            Point point = webElement.getLocation();
            System.out.println("X: "+ point.getX()+" and Y: "+ point.getY());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void jsclickOnElement(By locator){
        try {
            webElement = driver.findElement(locator);
            JavascriptExecutor js = (JavascriptExecutor)driver;
            js.executeScript("arguments[0].click();", webElement);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    

    
}
