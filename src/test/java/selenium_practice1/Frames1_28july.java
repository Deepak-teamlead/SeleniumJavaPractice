package selenium_practice1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class Frames1_28july {
//Handling Frames	
public static void main(String[] args) throws Exception {
	System.setProperty("webdriver.chrome.driver","D:\\Deepak files\\Hybrid Framework Deepak\\Jars or Dependencies\\chromedriver.exe");	
	WebDriver driver=new ChromeDriver();	
	driver.get("https://www.hyrtutorials.com/p/frames-practice.html");
	driver.manage().window().maximize();
	driver.findElement(By.xpath("//input[@id='name']")).sendKeys("Main Web Page");
//Switching to Frame 1
driver.switchTo().frame(driver.findElement(By.id("frm1")));
WebElement frame1dropdown = driver.findElement(By.id("selectnav1"));
Thread.sleep(2000);
Select s=new Select(frame1dropdown);
s.selectByVisibleText("- Java");
//Again switching to main Web Page
driver.switchTo().defaultContent();
Thread.sleep(2000);
driver.findElement(By.xpath("//input[@id='name']")).clear();
Thread.sleep(2000);
driver.findElement(By.xpath("//input[@id='name']")).sendKeys("Again Main Web Page from Frame 1");
	
Thread.sleep(2000);
driver.close();
	}

}
