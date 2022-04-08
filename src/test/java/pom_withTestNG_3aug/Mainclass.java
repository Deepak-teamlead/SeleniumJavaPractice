package pom_withTestNG_3aug;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
public class Mainclass {
	WebDriver driver;
	@BeforeClass
	public void launchapp() {
		System.setProperty("webdriver.chrome.driver", "D:\\Deepak files\\Hybrid Framework Deepak\\Jars or Dependencies\\chromedriver.exe");	
		driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
	}
	 
	@Test
	public void logotest() {
		Loginpageclass o=new Loginpageclass(driver);
		o.verifylogo();
		
	}
	
	@Test
	public void logintest() throws Exception {
		Loginpageclass o1=new Loginpageclass(driver);
		o1.login("standard_user","secret_sauce");
		
		
	}
	
	@AfterClass
	public void closeapp() {
		driver.quit();
	}
	
}
