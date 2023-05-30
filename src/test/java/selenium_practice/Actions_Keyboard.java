package selenium_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Actions_Keyboard {
//Keyboard Actions- 1.keyUp(), 2.keyDown(), 3.sendKeys()	
public static void main(String[] args) throws Exception{
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
