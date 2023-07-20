package selenium_practice;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
public class Headless_Testing_With_Selenium {
    public static void main(String[] args) throws Exception {
        ChromeOptions options=new ChromeOptions();
        options.addArguments("--headless");
        WebDriver driver=new ChromeDriver(options);
        driver.get("https://www.google.co.in/");
        System.out.println(driver.getTitle());
    }
}
