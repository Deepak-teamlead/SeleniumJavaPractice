package selenium_practice;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

public class Actions_Keyboard extends Base_Class{
//Keyboard Actions
public static void main(String[] args) throws Exception{
	Base_Class o=new Base_Class();
	o.browserAndUrl("chrome","http://www.facebook.com/");

	driver.findElement(By.xpath("//input[@id='email']")).sendKeys("rock");
    // after entering email use keyboard action TAB and ENTER
	Actions a=new Actions(driver);
	a.sendKeys(Keys.TAB).sendKeys("snake").build().perform();
	a.sendKeys(Keys.ENTER).perform();

	Thread.sleep(3000);
	driver.close();
	
	}

}
