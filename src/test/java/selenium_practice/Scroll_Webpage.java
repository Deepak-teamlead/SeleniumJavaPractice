package selenium_practice;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Scroll_Webpage {
//Scroll Webpage
public static void main(String[] args) throws Exception {
	WebDriver driver=new ChromeDriver();
	driver.get("http://demo.guru99.com/test/guru99home/");
	driver.manage().window().maximize();
//Scroll until visibility of element email and enter text in email field
JavascriptExecutor js = (JavascriptExecutor) driver;	
WebElement email = driver.findElement(By.xpath("//input[@id='philadelphia-field-email']"));
Thread.sleep(2000);
js.executeAsyncScript("arguments[0].scrollIntoView();",email);
Thread.sleep(2000);
driver.close();
	
}
}
