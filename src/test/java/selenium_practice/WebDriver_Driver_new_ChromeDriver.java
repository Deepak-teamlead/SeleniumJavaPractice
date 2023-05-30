package selenium_practice;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class WebDriver_Driver_new_ChromeDriver {
//Explain webdriver driver = new chromedriver()
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
//webdriver is an interface, driver is refereance variable and chromedriver is a class which implements webdriver interface
	driver.get("https:www.google.co.in");
	driver.manage().window().maximize();
	driver.close();
	
	

	}

}
