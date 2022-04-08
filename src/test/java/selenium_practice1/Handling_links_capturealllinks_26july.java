package selenium_practice1;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Handling_links_capturealllinks_26july {
//Handling Links-Linktext() and partial linktext(), Capture all Links
public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver","D:\\Deepak files\\Hybrid Framework Deepak\\Jars or Dependencies\\chromedriver.exe");	
WebDriver driver=new ChromeDriver();	
driver.get("https://id.atlassian.com/login");
driver.manage().window().maximize();			
System.out.println(driver.findElements(By.tagName("a")).size());	//o/p-we have 5 links in webpage
List<WebElement> alllinks = driver.findElements(By.tagName("a"));
for(int i=0;i<alllinks.size();i++) {
	//System.out.println(alllinks.get(i).getText());
	//System.out.println(alllinks.get(i).getAttribute("href"));
}
//Linktext() and partial linktext()
driver.findElement(By.linkText("Can't log in?")).click();
//driver.findElement(By.partialLinkText("Can't")).click();




//driver.close();
}
}
