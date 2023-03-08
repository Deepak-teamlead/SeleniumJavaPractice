package selenium_practice1;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice2 {
    static WebDriver driver;
public static void main(String[] args) throws Exception {

    System.setProperty("webdriver.chrome.driver","D:\\Deepak files\\Hybrid Framework Qshore\\Jars or Dependencies\\chromedriver.exe");
    WebDriver driver=new ChromeDriver();
    driver.get("https://account.magento.com/applications/customer/create/");
    driver.manage().window().maximize();











}

}
