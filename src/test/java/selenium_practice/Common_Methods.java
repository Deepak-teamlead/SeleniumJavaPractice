package selenium_practice;
import java.util.ArrayList;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Common_Methods {
//This is Baseclass it contains common methods
	static WebDriver driver;
//windowhadle method gives pagetitle by taking index number..by index numbers we can switch to a window	
	public void windowhandle(int index) {
		ArrayList a =new  ArrayList(driver.getWindowHandles());
		System.out.println(driver.switchTo().window((String)a.get(index)).getTitle());	
	}	
//******************************************************************************
//This Method Gives element count of particular Locators in a Web Page
public void size(String locator) {
	System.out.println(driver.findElements(By.tagName(locator)).size());
}
//******************************************************************************	
//This method is used to handle bootstrap datepicker
public void datepicker() {
	String monandyear="May 2020";
	String day="25";
    while(true) {
    	String daystext = driver.findElement(By.xpath("/html/body/div[3]/div[1]/table/thead/tr[2]/th[2]")).getText();
    	if(daystext.equals(monandyear)) {
    		break;
    	}
    else
    {
    	driver.findElement(By.xpath("/html/body/div[3]/div[1]/table/thead/tr[2]/th[1]")).click();	
    }
    }
    driver.findElement(By.xpath("//table/tbody/tr/td[contains(text(),"+day+")]")).click();
}
//*********************************************************************************
//This method is used to open url in specified browser

public void browserNameandUrl(String browser,String url)throws Exception{
	WebDriver driver = null;
	if (browser.equalsIgnoreCase("Chrome")) {
		driver = new ChromeDriver();
	} else if (browser.equalsIgnoreCase("Firefox")) {
		driver = new FirefoxDriver();
	} else if (browser.equalsIgnoreCase("Edge")) {
		driver = new EdgeDriver();
	}
	driver.get(url);
	driver.manage().window().maximize();
	}

//*********************************************************************************

}
