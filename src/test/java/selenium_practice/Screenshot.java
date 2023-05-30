package selenium_practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Screenshot {
//How to Take Screenshot	
public static void main(String[] args) throws Exception{
	WebDriver driver=new ChromeDriver();
	driver.get("http://www.facebook.com");
	driver.manage().window().maximize();	
//code to take screen shot and save as .png to system........

driver.close();
	
	
	

	}

}
