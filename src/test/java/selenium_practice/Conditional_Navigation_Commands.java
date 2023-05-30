package selenium_practice;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Conditional_Navigation_Commands {
//Conditional Commands (isDisplayed(), isEnabled(), isSelected()), Navigation Commands (1.Navigate to URL, 2.Navigate back, 3.Navigate Forward, 4.Refresh), Validation and Types of Validations	
public static void main(String[] args) throws Exception{
	WebDriver driver=new ChromeDriver();
	driver.get("https://demoqa.com/radio-button");
	driver.manage().window().maximize();	
	//****************************
System.out.println(driver.findElement(By.xpath("//label[contains(text(),'Impressive')]")).isDisplayed());    //isdisplayed()
//************************
boolean yesstatus = driver.findElement(By.xpath("//label[contains(text(),'Yes')]")).isEnabled();       //isEnabled()
if(yesstatus==true)
	System.out.println("yes is displayed");
else
	System.out.println("yes is not displayed");
//*************************	
System.out.println(driver.findElement(By.xpath("//label[contains(text(),'Impressive')]")).isSelected());    //isSelected()	
//************************************************
//Navigation Commands (1.Navigate to URL, 2.Navigate back, 3.Navigate Forward, 4.Refresh)
driver.navigate().to("https://in.indeed.com/");    //1.Navigate to URL
driver.findElement(By.xpath("//a[contains(text(),'Sign in')]")).click(); //click on signin
Thread.sleep(1000);
driver.navigate().back();         //2.Navigate back
Thread.sleep(1000);
driver.navigate().forward();     //3.Navigate Forward
Thread.sleep(1000);
driver.navigate().refresh();      //4.Refresh
Thread.sleep(2000);
driver.close();	
	}

}
