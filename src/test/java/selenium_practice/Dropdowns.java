package selenium_practice;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class Dropdowns {
//Drop Downs
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("https://account.magento.com/applications/customer/create/");
	driver.manage().window().maximize();		
	//Drop Down Links (Working on Country Drop Down)
	WebElement dropdown = driver.findElement(By.xpath("//select[@id='country']"));
	Select s=new Select(dropdown);
	//s.selectByVisibleText("Australia");
	//s.selectByValue("BD");    //Bangladesh	
	s.selectByIndex(1);	  //Afganistan
				
	


	}

}
