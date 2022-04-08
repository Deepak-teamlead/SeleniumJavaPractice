package selenium_practice1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class Explicit_wait_23july {
//Explicit Wait	
public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver","D:\\Deepak files\\Hybrid Framework Deepak\\Jars or Dependencies\\chromedriver.exe");	
WebDriver driver=new ChromeDriver();	
driver.get("https://chercher.tech/practice/explicit-wait-sample-selenium-webdriver");
driver.manage().window().maximize();		
//*****************************************************
driver.findElement(By.xpath("//button[@id='display-other-button']")).click();     //click display button
WebDriverWait w=new WebDriverWait(driver,20);
w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@id='hidden']")));     //clicks display button after 10 seconds and Waits For Enabled button
driver.findElement(By.xpath("//button[@id='hidden']")).click();                                 //clicks Enabled button    
System.out.println(driver.getTitle());	
System.out.println("Explicit Wait Succesfull");	
driver.close();
	}

}
