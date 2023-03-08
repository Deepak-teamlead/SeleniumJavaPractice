package selenium_practice1;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Implicit_wait_23july {
//Implicit wait	
public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver","D:\\Deepak files\\Hybrid Framework Qshore\\Jars or Dependencies\\chromedriver.exe");
WebDriver driver=new ChromeDriver();	
driver.get("https://chercher.tech/practice/implicit-wait-example");
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
driver.findElement(By.xpath("//body/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/input[2]")).click(); //Click 2nd checkbox it appears after 10 seconds after loading page  


System.out.println("Implict Wait Succesfull");	
	
driver.close();	
	
	
	
	
	
	
	
	
	

	}

}
