package selenium_practice;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import java.io.File;

public class Screenshot_Element extends Generic_Methods {

public static void main(String[] args) throws Exception{
	// selenium-4 Taking screenshots
	Generic_Methods o=new Generic_Methods();
	o.browserNameandUrl("chrome","http://omayo.blogspot.com/");
	// Taking screenshot at Element level- multiselection box
	WebElement multiselectdropdown = driver.findElement(By.xpath("//div[@class='column-left-outer']//div[2]//div[1]//select[1]"));
	File sourcefile = multiselectdropdown.getScreenshotAs(OutputType.FILE);
	FileHandler.copy(sourcefile,new File("F:\\Downloads\\multi.png"));

	Thread.sleep(2000);

	driver.quit();
	
	

	}

}
