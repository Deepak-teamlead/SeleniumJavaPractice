package selenium_practice1;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Bootstarp_dropdown_26july {
//Boot Strap Dropdowns...Selecting cards from product type
public static void main(String[] args) throws Exception{
	System.setProperty("webdriver.chrome.driver","D:\\Deepak files\\Hybrid Framework Qshore\\Jars or Dependencies\\chromedriver.exe");	
	WebDriver driver=new ChromeDriver();	
	driver.get("https://www.hdfcbank.com/");
	driver.manage().window().maximize();	
	driver.findElement(By.xpath("//div[@class='drp1']//div[@class='dropdown']")).click();	
// select product type element is a bootstarp dropdown it does not contain select tag but it contains ul anad li tags	
	List<WebElement> productlist = driver.findElements(By.xpath("//ul[@class='dropdown1 dropdown-menu']//li"));	
	System.out.println(productlist.size());	
	for(int i=0; i<productlist.size();i++) {
		System.out.println(productlist.get(i).getText());
		 String selectoption = productlist.get(i).getText();
		if(selectoption.equals("Cards")) {
			//selectoption.click();
			break;
		}
		}	
Thread.sleep(1000);
	driver.close();
	}
	}
	

	


