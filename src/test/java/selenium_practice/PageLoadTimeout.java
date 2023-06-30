package selenium_practice;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;
public class PageLoadTimeout {
    // page load timeout
    public static void main(String[] args) throws Exception {
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        // Given url wont load in 2 seconds
        // setting page load time to 2 seconds to see how pageLoadTimeout() works
       driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(2));
        driver.get("https://selenium143.blogspot.com/");
        driver.quit();




    }
}
