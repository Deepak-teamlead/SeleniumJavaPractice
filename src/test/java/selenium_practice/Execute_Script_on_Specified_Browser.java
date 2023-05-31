package selenium_practice;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class Execute_Script_on_Specified_Browser {
    public static void browserNameandUrl(String browser,String url)throws Exception{
        WebDriver driver = null;
        if (browser.equalsIgnoreCase("Chrome")) {
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("Firefox")) {
            driver = new FirefoxDriver();
        } else if (browser.equalsIgnoreCase("Edge")) {
            driver = new EdgeDriver();
        }
        driver.get(url);
        driver.manage().window().maximize();
        Thread.sleep(2000);
        driver.quit();

    }
    public static void main(String[] args) throws Exception{
     browserNameandUrl("Chrome","https://www.google.co.in/");

    }

}


