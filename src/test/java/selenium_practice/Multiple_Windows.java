package selenium_practice;
import java.util.ArrayList;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Multiple_Windows {
//Handling Multiple Windows
public static void main(String[] args) throws Exception{
	WebDriver driver=new ChromeDriver();
	driver.get("https://uidai.gov.in/");
	driver.manage().window().maximize();
	//clicking on Aadhar Seva Kendra and Aadhar Myth Busters opens 2 new tabs
	driver.findElement(By.xpath("//a[contains(text(),'Aadhaar Seva Kendra')]")).click();	//click on Aadhar Seva Kendra
	driver.findElement(By.xpath("//a[contains(text(),'Aadhaar Myth Busters')]")).click();   //click on Aadhar Myth Busters
	ArrayList a=new ArrayList(driver.getWindowHandles());
	/*int i;
	for(i=0;i<a.size();i++){
	System.out.println(driver.switchTo().window((String)a.get(i)).getTitle());
	}*/
	System.out.println(a.size());	
	Thread.sleep(2000);
	driver.switchTo().window((String)a.get(2)).findElement(By.xpath("//body/div[2]/div[3]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[3]/a[1]/span[1]")).click(); //click Enrolment Ecosystem in Aadhar Seva Kendra page
	Thread.sleep(2000);
	driver.switchTo().window((String)a.get(1)).findElement(By.xpath("//body/div[2]/div[3]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[3]/a[1]/span[1]")).click(); //click about your Aadhar in Aadhar Myth Busters
	Thread.sleep(2000);
	driver.switchTo().window((String)a.get(0)).findElement(By.xpath("//body/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/ul[1]/li[5]/a[1]/span[1]")).click();  //click Contact and Support in Parent home page
	Thread.sleep(2000);
	driver.quit();	
		
	
	
	
	

	}

}
