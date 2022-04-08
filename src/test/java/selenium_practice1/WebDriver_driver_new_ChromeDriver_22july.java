package selenium_practice1;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class WebDriver_driver_new_ChromeDriver_22july {
//Explain webdriver driver = new chromedriver()
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","D:\\Deepak files\\Hybrid Framework Deepak\\Jars or Dependencies\\chromedriver.exe");	
	WebDriver driver=new ChromeDriver();	
//webdriver is an interface, driver is refereance variable and chromedriver is a class which implements webdriver interface
	driver.get("https:www.google.co.in");
	driver.manage().window().maximize();
	driver.close();
	
	

	}

}
