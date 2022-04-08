package selenium_practice1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class Actions_mouse_27july {
//Actions class is used to handle mouse and keyboard operations like Mouse Actions- 1.doubleClick(), 2.contextClick(), 3.clickAndHold(), 
//4.dragAndDrop(), 5.moveToElement()) 
	public static void main(String[] args) throws Exception{
	System.setProperty("webdriver.chrome.driver","D:\\Deepak files\\Hybrid Framework Deepak\\Jars or Dependencies\\chromedriver.exe");	
	WebDriver driver=new ChromeDriver();	
	driver.get("https://www.edureka.co/");
	driver.manage().window().maximize();
	//1.doubleClick() , 5.moveToElement()	
/*Actions a=new Actions(driver);	
WebElement doubleclick = driver.findElement(By.xpath("//body/nav[1]/div[2]/ul[1]/li[8]/a[1]/i[1]"));	
Thread.sleep(2000);	
a.moveToElement(doubleclick).build().perform();
Thread.sleep(2000);	
a.doubleClick(doubleclick).build().perform();;	
//***************************************************************	
   //2.contextClick()
WebElement datascience = driver.findElement(By.xpath("//body/nav[1]/div[2]/ul[1]/li[4]/a[1]"));	
Thread.sleep(2000);	
a.contextClick(datascience).build().perform();	*/
//*********************************************************	
//3.clickAndHold()
Actions a1=new Actions(driver);	
driver.navigate().to("https://demoqa.com/sortable");	
driver.findElement(By.xpath("//a[@id='demo-tab-grid']")).click();
WebElement clickandholdone = driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]"));
a1.clickAndHold(clickandholdone).build().perform();
//	4.dragAndDrop()
/*Actions a2=new Actions(driver);	
driver.navigate().to("https://demoqa.com/droppable");
WebElement drag = driver.findElement(By.xpath("//div[@id='draggable']"));	
WebElement drop = driver.findElement(By.xpath("//div[@id='simpleDropContainer']//div[@id='droppable']"));	
a2.dragAndDrop(drag,drop).build().perform();	
	*/
	
	
Thread.sleep(2000);	
driver.close();	

	}

}
