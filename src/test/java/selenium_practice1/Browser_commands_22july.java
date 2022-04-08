package selenium_practice1;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Browser_commands_22july {
//Browser Commands in Web Driver (1.Get, 2.Get Title, 3.Get Current URL, 4.close(), 5.quit())
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","D:\\Deepak files\\Hybrid Framework Deepak\\Jars or Dependencies\\chromedriver.exe");	
	WebDriver driver=new ChromeDriver();	
	driver.get("https://www.google.co.in");   //1.Get
	driver.manage().window().maximize();	
	System.out.println(driver.getTitle());      //2.Get Title
	System.out.println(driver.getCurrentUrl());    //3.Get Current URL
	//driver.close();         //4.close()
	driver.quit();            //5.quit()
	
	
	
	
	
	
	
	}

}
