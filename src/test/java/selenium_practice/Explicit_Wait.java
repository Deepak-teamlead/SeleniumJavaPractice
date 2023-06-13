package selenium_practice;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Explicit_Wait {
//Explicit Wait	- webdriver wait

public static void main(String[] args) throws Exception{

	WebDriver driver= new ChromeDriver();
	driver.get("http://omayo.blogspot.com/");
	driver.manage().window().maximize();

	// clicking Dropdown button
	driver.findElement(By.xpath("//button[@class='dropbtn']")).click();

	// clicking Facebook link which comes after 3 seconds
	WebElement facebooklink = driver.findElement(By.xpath("//a[text()='Facebook']"));
	WebDriverWait w=new WebDriverWait(driver, Duration.ofSeconds(30));
	w.until(ExpectedConditions.elementToBeClickable(facebooklink)).click();

	System.out.println("Explicit Wait Succesfull");
	driver.quit();




	}

}
