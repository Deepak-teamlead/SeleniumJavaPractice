package selenium_practice1;
import java.io.File;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Screnshot_30july {
//How to Take Screenshot	
public static void main(String[] args) throws Exception{
	System.setProperty("webdriver.chrome.driver","D:\\Deepak files\\Hybrid Framework Qshore\\Jars or Dependencies\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("http://www.facebook.com");
	driver.manage().window().maximize();	
//code to take screen shot and save as .png to system........
File f=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
FileUtils.copyFile(f,new File("D:\\Deepak files\\Hybrid Framework Qshore\\Test Results\\fb.png"));

driver.close();
	
	
	

	}

}
