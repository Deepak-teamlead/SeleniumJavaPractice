package selenium_practice1;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Alerts_27july {
//Handling Alerts and Pop-Ups	
public static void main(String[] args) throws Exception {
	System.setProperty("webdriver.chrome.driver","D:\\Deepak files\\Hybrid Framework Qshore\\Jars or Dependencies\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();	
	driver.get("https://www.hyrtutorials.com/p/alertsdemo.html");
	driver.manage().window().maximize();	
//Simple Alert
/*driver.findElement(By.xpath("//button[@id='alertBox']")).click();   //click click me (Simple Alert)
Thread.sleep(2000);
//Import Alert interface
Alert a=driver.switchTo().alert();
System.out.println("Message in Simple Alert :" +a.getText());
a.dismiss();*/
//****************************************************
//Confirmation Alert	
/*driver.findElement(By.xpath("//button[@id='confirmBox']")).click();   //click click me (Confirmation Alert)
Thread.sleep(2000);	
Alert a1=driver.switchTo().alert();	
System.out.println("Message in Confirmation Alert :" +a1.getText());
a1.accept();
System.out.println("Action performed in Confirmation Alert :"+driver.findElement(By.xpath("//div[@id='output']")).getText() ); */	
//******************************************************
//Prompt Alert
driver.findElement(By.xpath("//button[@id='promptBox']")).click();   //click click me (Prompt Alert)
Thread.sleep(2000);
Alert a2=driver.switchTo().alert();
a2.sendKeys("Rocky");
System.out.println(a2.getText());
a2.accept();
System.out.println("Action performed in Prompt Alert :"+driver.findElement(By.xpath("//div[@id='output']")).getText() );	
	
	
	
	
	
	
	
	
	
Thread.sleep(2000);	
driver.quit();	
	}

}
