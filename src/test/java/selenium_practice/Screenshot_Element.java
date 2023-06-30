package selenium_practice;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import java.io.File;

public class Screenshot_Element extends Base_Class {

public static void main(String[] args) throws Exception{
	// selenium-4 Taking screenshots
	Base_Class o=new Base_Class();
	o.browserAndUrl("chrome","http://omayo.blogspot.com/");
	// Taking screenshot at Element level- multiselection box
	WebElement multiselectdropdown = driver.findElement(By.xpath("//div[@class='column-left-outer']//div[2]//div[1]//select[1]"));
	File sourcefile = multiselectdropdown.getScreenshotAs(OutputType.FILE);
	FileHandler.copy(sourcefile,new File("F:\\Downloads\\multi.png"));

	Thread.sleep(2000);

	driver.quit();
	
	

	}

}
