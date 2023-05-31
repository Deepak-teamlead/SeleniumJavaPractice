package selenium_practice;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;
// RElative Locators
// 1. above()
//2. below()
//3. toLeftOf()
//4. toRightOf()
public class Selenium4_Relative_Locators {
    public static void main(String[] args) throws Exception{
        WebDriver driver = new ChromeDriver();
        driver.get("http://omayo.blogspot.com/");
        driver.manage().window().maximize();
        // 1. above()
        // scroll to html form to see script execution- entering username which is above password
        WebElement password = driver.findElement(By.xpath("//form[contains(text(),'Username:')]//input[@type='password']"));
         ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", password);
        Thread.sleep(500);
        Thread.sleep(2000);
        driver.findElement(RelativeLocator.with(By.tagName("input")).above(password)).sendKeys("Rocky-Bhai");
        //
        //4. toRightOf()
        // clicking search button which is to right of search fields text box
        WebElement serachtextbox = driver.findElement(By.xpath("//input[@name='q']"));
        Thread.sleep(2000);
        driver.findElement(RelativeLocator.with(By.tagName("input")).toRightOf(serachtextbox)).click();
        Thread.sleep(2000);

      //  driver.quit();





    }
}