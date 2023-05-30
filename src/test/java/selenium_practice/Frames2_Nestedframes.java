package selenium_practice;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class Frames2_Nestedframes {
//Nested Frames
public static void main(String[] args) throws Exception {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.hyrtutorials.com/p/frames-practice.html");
	driver.manage().window().maximize();		
driver.findElement(By.xpath("//input[@id='name']")).sendKeys("Main Web Page");
List<WebElement> framescount = driver.findElements(By.tagName("iframe"));
System.out.println(framescount.size() );
//Swtiching to Nested Frame 3
driver.switchTo().frame(driver.findElement(By.id("frm3")));
driver.switchTo().frame(driver.findElement(By.id("frm1")));
WebElement frame1dropdown = driver.findElement(By.id("selectnav1"));
Select s=new Select(frame1dropdown);
Thread.sleep(2000);
s.selectByVisibleText("-- Selenium");
//Again switching to Parent Frame (Frame 3)
driver.switchTo().parentFrame();
//Again Switching to Main web Page
driver.switchTo().defaultContent();
Thread.sleep(2000);
driver.findElement(By.xpath("//input[@id='name']")).clear();
Thread.sleep(2000);
driver.findElement(By.xpath("//input[@id='name']")).sendKeys("Again back to Main Web Page From Nested Frame");

	
Thread.sleep(2000);	
driver.close();
	}

}
