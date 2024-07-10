package selenium_practice;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Selenium4_SeleniumManager {

    public static void main(String[] args) throws Exception{
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.google.co.in/");
        driver.manage().window().maximize();
        Thread.sleep(3000);
        driver.close();
    }
}
