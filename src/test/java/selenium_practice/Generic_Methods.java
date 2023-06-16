package selenium_practice;
import java.io.File;
import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

import javax.imageio.ImageIO;

public class Generic_Methods {
    //This is Baseclass it contains common methods
    static WebDriver driver;

    //******************************************************************************
//This Method Gives element count of particular Locators in a Web Page
    public void size(String locator) {
        System.out.println(driver.findElements(By.tagName(locator)).size());
    }

    //******************************************************************************

    //This method is used to open url in specified browser
    public void browserNameandUrl(String browser, String url) throws Exception {
        driver = null;
        if (browser.equalsIgnoreCase("Chrome")) {
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("Firefox")) {
            driver = new FirefoxDriver();
        } else if (browser.equalsIgnoreCase("Edge")) {
            driver = new EdgeDriver();
        }
        driver.get(url);
        driver.manage().window().maximize();
    }

    //*********************************************************************************
// This method is used to wait till present of element
    public void waituntillelementpresent(WebElement Locator) {
        WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(30));
        w.until(ExpectedConditions.visibilityOf(Locator));
    }

    //**************************************************************************************
//This method is used to wait untill element is clickable
    public void waituntillclickable(WebElement Locator) {
        WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(30));
        w.until(ExpectedConditions.elementToBeClickable(Locator));
    }

    //******************************************************************************************
//This method is used to switch to child window by page Title
    public void navigateToNewWindow(String pagetitle) {
        Set<String> allwindows = driver.getWindowHandles();
        for (String handel : allwindows) {
            if (driver.getTitle().equals(pagetitle)) {
                break;
            }
            driver.switchTo().window(handel);
        }
    }

    //***********************************
    // is Alert present
    public boolean isALertPresent() {
        try {
            driver.switchTo().alert();
            return true;
        } catch (Exception e) {
        }
        return false;
    }

    //****************************
    // if alert found close it
    public void CloseAlert() {
        try {
            WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(20));
            w.until(ExpectedConditions.alertIsPresent());
            Alert a = driver.switchTo().alert();
            a.dismiss();
            System.out.println("Alert Canceled");
        } catch (Exception e) {
            System.out.println("Unable to cancel Alert");
        }
    }

    //*********************************
    // select dropdown by visible text
    public void selectByVisibleText(WebElement We, String visibletext) {
        try {
            Select s = new Select(We);
            s.selectByVisibleText(visibletext);
            System.out.println("selected dropdown");
        } catch (Exception e) {
            System.out.println("unable to select dropdown");
        }
    }

    //***********************************************
    // select dropdown by index
    public void selectByIndex(WebElement we, int index) {
        try {
            Select s = new Select(we);
            s.selectByIndex(index);
            System.out.println("selected dropdown");
        } catch (Exception e) {
            System.out.println("unable to select dropdown");
        }
    }

    //**********************************
    // select drop down by value
    public void selectByValue(WebElement we, String value) {
        try {
            Select s = new Select(we);
            s.selectByValue(value);
            System.out.println("selected dropdown");
        } catch (Exception e) {
            System.out.println("unable to select dropdown");
        }
    }

    //***********************************
    // first selected option from dropdown
    public void firstSelectedDropdown(WebElement we) {
        try {
            Select s = new Select(we);
            String firstselection = s.getFirstSelectedOption().getText();
            System.out.println(firstselection);
        } catch (Exception e) {
            System.out.println("unable to get first selected option from dropdown");
        }
    }

    //**************************************************
    // prints all values from a dropdown
    public void allValuesDropdown(WebElement we) {
        try {
            Select s = new Select(we);
            List<WebElement> values = s.getOptions();
            for (int i = 0; i < values.size(); i++) {
                System.out.println(values.get(i).getText());
            }
        } catch (Exception e) {
            System.out.println("unable to print Doprdown values");
        }
    }

    //*****************************
    // switch to frame by webelement
    public void switchFrameByWebelement(WebElement we) {
        try {
            driver.switchTo().frame(we);
        } catch (Exception e) {
            System.out.println("unable to switch to frame");
        }
    }

    //**************************************
    //switch to frame by idorname
    public void switchFrameIDorName(String idorName) {
        try {
            driver.switchTo().frame(idorName);
        } catch (Exception e) {
            System.out.println("unable to switch to frame");
        }
    }

    //******************************************
// Mouse action-movetoelement
    public void moveToElement(WebElement we) {
        try {
            Actions a = new Actions(driver);
            a.moveToElement(we).perform();
        } catch (Exception e) {
            System.out.println("unable to move to element");
        }
    }

    //**********************************
    //mouse action-draganddrop
    public void dragAndDrop(WebElement source, WebElement destination) {
        try {
            Actions a = new Actions(driver);
            a.dragAndDrop(source, destination).perform();
        } catch (Exception e) {
            System.out.println("unable to drag and drop");
        }
    }

    //***********************************
    // method to double click on webelement
    public void doubleClick(WebElement we) {
        try {
            Actions a = new Actions(driver);
            a.doubleClick(we).perform();
        } catch (Exception e) {
            System.out.println("unable to double click on webelement");
        }
    }

    //******************************************
    // Taking screenshot Element level or section level based webelement xpath
    public void screenshotElement(WebElement we, String path) throws Exception {
        try {
            File sourcefile = we.getScreenshotAs(OutputType.FILE);
            FileHandler.copy(sourcefile, new File(path));
        } catch (Exception e) {
            System.out.println("unable to capture Element screenshot");
        }
    }

    //*************************************
    //Taking screenshot visible page
    public void screenshotVisiblePage(String path) throws Exception {
        try {
            WebElement visiblepage = driver.findElement(By.xpath("//html"));
            File sourcefile = visiblepage.getScreenshotAs(OutputType.FILE);
            FileHandler.copy(sourcefile, new File(path));
        } catch (Exception e) {
            System.out.println("unable to capture visible page screenshot");
        }
    }

    //***********************************************
    // Taking screenshot of fullpage using Ashot()
    public void screenshotFullPage(String path) throws Exception {
        try {
            Screenshot s = new AShot().shootingStrategy(ShootingStrategies.viewportPasting(1000)).takeScreenshot(driver);
            ImageIO.write(s.getImage(), "PNG", new File(path));

        } catch (Exception e) {
            System.out.println("unable to capture full page screenshot");
        }
    }

    //***********************************************
    // Date picker with Monthly display having next/previous arrow
    public void selectDate(String dayxpath, String month, String year, String monthTextxpath, String yearTextxpath, String nextorpreviousarrorxpath) throws Exception {
        while (true) {
            String monthText = driver.findElement(By.xpath(monthTextxpath)).getText();
            String yearText = driver.findElement(By.xpath(yearTextxpath)).getText();
            if (monthText.equalsIgnoreCase(month) && yearText.equalsIgnoreCase(year)) {
                // clicking day
                driver.findElement(By.xpath(dayxpath)).click();
                break;
            } else {
                // clicking next or previous arrow
                driver.findElement(By.xpath(nextorpreviousarrorxpath)).click();
            }
        }
    }
    //***********************************************
     // Handling Date picker using Java script Executor
    public void selectDateJavaScriptExecutor(WebElement calenderelement, String fulldate){
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("arguments[0].setAttribute('value','"+fulldate+"');",calenderelement);
    }
    //***************************************
}