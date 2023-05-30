package selenium_practice;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Explicit_Wait {
//Explicit Wait	
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
driver.get("https://chercher.tech/practice/explicit-wait-sample-selenium-webdriver");
driver.manage().window().maximize();		
//*****************************************************
driver.findElement(By.xpath("//button[@id='display-other-button']")).click();     //click display button
//WebDriverWait w=new WebDriverWait(driver,20);
//w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@id='hidden']")));     //clicks display button after 10 seconds and Waits For Enabled button
driver.findElement(By.xpath("//button[@id='hidden']")).click();                                 //clicks Enabled button    
System.out.println(driver.getTitle());	
System.out.println("Explicit Wait Succesfull");	
driver.close();
	}

}
