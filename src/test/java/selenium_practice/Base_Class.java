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
import org.testng.Assert;
import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;
import javax.imageio.ImageIO;

public class Base_Class {
    //Baseclass contains common methods
    protected static WebDriver driver;

    //******************************************************************************
//This Method Gives element count of particular Locators in a Web Page
    public void size(String locator) {
        System.out.println(driver.findElements(By.tagName(locator)).size());
    }

    //******************************************************************************
    //This method is used to open url in specified browser
    public void browserAndUrl(String browser, String url) throws Exception {
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
        } catch (Exception e) {
        }
        return true;
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
    public static void selectByValue(WebElement we, String value) {
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
    // verify value in a dropdown
    public void verifyDropdownvalue(WebElement we, String value) {
        Select s = new Select(we);
        List<WebElement> dropdownoptions = s.getOptions();
        for (int i = 0; i < dropdownoptions.size(); i++) {
            if (dropdownoptions.get(i).getText().equalsIgnoreCase(value)) {
                System.out.println("value is present in dropdown");
                break;
            }
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
    public void selectDateJavaScriptExecutor(WebElement calenderelement, String fulldate) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].setAttribute('value','" + fulldate + "');", calenderelement);
    }
    //***************************************
    // prints Text of complete table
    public void tableText(String tableXpath) {
        List<WebElement> cols = driver.findElements(By.xpath(tableXpath + "//th"));
        for (WebElement col : cols) {
            System.out.println(col.getText());
            //********************************************************
            List<WebElement> rows = driver.findElements(By.xpath(tableXpath + "//td"));
            for (WebElement row : rows) {
                System.out.println(row.getText());
            }
        }
    }
    //***************************************
    // verify text in a table
    public void verifyTableText(String tablexpath, String columnname, String rowname) throws Exception {
        List<WebElement> cols = driver.findElements(By.xpath(tablexpath + "//th"));
        for (WebElement col : cols) {
            col.getText();
            if (col.getText().equalsIgnoreCase(columnname)) {
                System.out.println("column name is present in table");
                break;
            }
        }
        List<WebElement> rows = driver.findElements(By.xpath(tablexpath + "//td"));
        for (WebElement row : rows) {
            row.getText();
            if (row.getText().equalsIgnoreCase(rowname)) {
                System.out.println("row name is present in table");
                break;
            }
        }
    }
    //***********************************************
    // verify column and row size of table
    public void verifyTableColumnRowSize(String tablexpath, int columnsize, int rowssize) throws Exception {
        List<WebElement> cols = driver.findElements(By.xpath(tablexpath + "//th"));
        try {
            Assert.assertEquals(cols.size(), columnsize);
        } catch (Exception e) {
            System.out.println("column size is not correct");
        }
        List<WebElement> rows = driver.findElements(By.xpath(tablexpath + "//tr"));
        try {
            Assert.assertEquals(rows.size(), rowssize);
        } catch (Exception e) {
            System.out.println("row size is not correct");
        }
    }
    //***********************************
    // click on Webelement using Javascript executor
    public void jsClick(WebElement we) {
        try {
            JavascriptExecutor jse = (JavascriptExecutor) driver;
            jse.executeScript("arguments[0].click();", we);
        } catch (Exception e) {
            System.out.println("unable to click Webelement");
        }
    }
    //*************************************
    // scroll page down to webelement using Javascript executor
    public void scrollPageDownJs(WebElement we) {
        try {
            JavascriptExecutor jse = (JavascriptExecutor) driver;
            jse.executeScript("arguments[0].scrollIntoView(true)", we);

        } catch (Exception e) {
            System.out.println("unable to scroll to webelement");
        }
    }
    //*************************************
    // scroll page vertically by pixel
    public void scrollPageVerticalJs(int verticalpixel) {
        try {
            JavascriptExecutor jse = (JavascriptExecutor) driver;
            jse.executeScript("window.scrollBy(0," + verticalpixel + ")");

        } catch (Exception e) {
            System.out.println("unable to scroll page by horizontal pixel");
        }
    }
    //*************************************
// scroll page horizontally by pixel
    public void scrollPageHorizontalJs(int horizontalpixel) {
        try {
            JavascriptExecutor jse = (JavascriptExecutor) driver;
            jse.executeScript("window.scrollBy(" + horizontalpixel + "+," + 0);

        } catch (Exception e) {
            System.out.println("unable to scroll page by horizontal pixel");
        }
    }
    //*************************************


}




