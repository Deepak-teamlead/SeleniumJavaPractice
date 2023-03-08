package testng_package;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
public class Assertios_hardassert_2aug {
//Assertions
//we are comparing actual title with expected title
@Test
public void titiletest() throws Exception {
System.setProperty("webdriver.chrome.driver","D:\\Deepak files\\Hybrid Framework Deepak\\Jars or Dependencies\\chromedriver.exe");	
WebDriver driver=new ChromeDriver();	
driver.get("https://www.linkedin.com/login");
driver.manage().window().maximize();
String actualtitle = driver.getTitle();	
String expectedtitle = "LinkedIn Login, Sign in | LinkedIn";
Assert.assertEquals(actualtitle,expectedtitle);

Thread.sleep(2000);
driver.close();
}
}
