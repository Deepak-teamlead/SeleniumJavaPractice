package selenium_practice1;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
public class Actions_keyboard_27july {
//Keyboard Actions- 1.keyUp(), 2.keyDown(), 3.sendKeys()	
public static void main(String[] args) throws Exception{
	System.setProperty("webdriver.chrome.driver","D:\\Deepak files\\Hybrid Framework Deepak\\Jars or Dependencies\\chromedriver.exe");	
	WebDriver driver=new ChromeDriver();	
	driver.get("http://www.facebook.com/");
	driver.manage().window().maximize();	
	WebElement email = driver.findElement(By.id("email"));

	Actions a = new Actions(driver);
	Action seriesOfActions = a
		.moveToElement(email)
		.click()
		.keyDown(email, Keys.SHIFT)
		.sendKeys(email, "rocky")
		.keyUp(email, Keys.SHIFT)
		.doubleClick(email)
		.contextClick()
		.build();
		
	seriesOfActions.perform() ;
	
	
	Thread.sleep(3000);
	driver.close();
	
	}

}
