package selenium_practice;
import java.time.Duration;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Implicit_Wait {
//Implicit wait Selenium 4
public static void main(String[] args) throws Exception{
	WebDriver driver= new ChromeDriver();
   driver.get("http://omayo.blogspot.com/");
   driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	// clicking Dropdown button
        driver.findElement(By.xpath("//button[@class='dropbtn']")).click();

	// clicking Facebook link which comes after 3 seconds

   driver.findElement(By.xpath("//a[text()='Facebook']")).click();

   System.out.println("Implict Wait Succesfull");
	
driver.close();	
	
}

}
