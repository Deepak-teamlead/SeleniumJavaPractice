package selenium_practice;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Multiple_Similar_Elements {
//Working With Multiple Similar Elements
	static WebDriver driver;
	public void size(String locator) {
		System.out.println(driver.findElements(By.tagName(locator)).size());
	}
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","D:\\Deepak files\\Hybrid Framework Deepak\\Jars or Dependencies\\chromedriver.exe");	
	driver=new ChromeDriver();	
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();	
//User Defined Method to Find no. of particular Locators in a Web Page
	Multiple_Similar_Elements obj=new Multiple_Similar_Elements();
	obj.size("input");
	obj.size("a");
	
	
	
driver.close();
}

	

}
