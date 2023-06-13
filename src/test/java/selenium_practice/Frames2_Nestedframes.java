package selenium_practice;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class Frames2_Nestedframes extends Generic_Methods {
//Nested Frames
public static void main(String[] args) throws Exception {
	// Nested frames
	Generic_Methods o=new Generic_Methods();
	o.browserNameandUrl("chrome","https://letcode.in/frame");
	// switching to parent frame
	o.switchFrameIDorName("firstFr");
	// enter first name and last name
	driver.findElement(By.xpath("//input[@placeholder='Enter name']")).sendKeys("pathri");
	driver.findElement(By.xpath("//input[@placeholder='Enter email']")).sendKeys("deepak");
	// switching to Nester frame with webelement
	WebElement childframe = driver.findElement(By.xpath("//iframe[@class='has-background-white']"));
	o.switchFrameByWebelement(childframe);
	// entering email in Nested frame
	driver.findElement(By.xpath("//input[@placeholder='Enter email']")).sendKeys("pathri.deepak@gmail.com");
	// switching ack to parent frame and clearing first name
	driver.switchTo().parentFrame();
	driver.findElement(By.xpath("//input[@placeholder='Enter name']")).clear();
	// switching to page level coming out of all frames
	driver.switchTo().defaultContent();
	System.out.println(driver.findElement(By.xpath("//h1[normalize-space()='Frame']")).getText());

	Thread.sleep(3000);
	driver.quit();
	}

}
