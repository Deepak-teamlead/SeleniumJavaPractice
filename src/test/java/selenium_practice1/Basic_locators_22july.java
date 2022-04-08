package selenium_practice1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Basic_locators_22july {
public static void main(String[] args) throws Exception{
System.setProperty("webdriver.chrome.driver","D:\\Deepak files\\Hybrid Framework Deepak\\Jars or Dependencies\\chromedriver.exe");	
WebDriver driver=new ChromeDriver();	
driver.get("https://id.atlassian.com/login");
driver.manage().window().maximize();
Thread.sleep(1000);
driver.findElement(By.name("username")).sendKeys("name");  //name
Thread.sleep(1000);
driver.findElement(By.name("username")).clear();
Thread.sleep(1000);
//*****************************
driver.findElement(By.id("username")).sendKeys("id");   //id
Thread.sleep(1000);
driver.findElement(By.id("username")).clear();
Thread.sleep(1000);
//*****************************
driver.findElement(By.className("css-1yzx7dv")).sendKeys("classname");   //classname
Thread.sleep(1000);
driver.findElement(By.className("css-1yzx7dv")).clear();
//*****************************
Thread.sleep(1000);
driver.findElement(By.tagName("input")).sendKeys("inputname");   //tagname
Thread.sleep(1000);
driver.findElement(By.tagName("input")).clear();	
//**********************************************
Thread.sleep(1000);
driver.findElement(By.linkText("Sign up for an account")).click();    //link text for links
Thread.sleep(1000);
driver.findElement(By.linkText("Already have an Atlassian account? Log in")).click();	
//******************************************
Thread.sleep(2000);
driver.findElement(By.partialLinkText("Sign up")).click();    //partial link text
Thread.sleep(1000);
driver.findElement(By.partialLinkText("Already")).click();
//********************************************
driver.findElement(By.xpath("//input[@id='username']")).sendKeys("xpath");   //xpath
Thread.sleep(1000);
driver.findElement(By.xpath("//input[@id='username']")).clear();
//**********************************************
Thread.sleep(1000);
driver.findElement(By.cssSelector("#username")).sendKeys("css selector");
Thread.sleep(1000);
driver.findElement(By.cssSelector("#username")).clear();
	
Thread.sleep(1000);	
driver.close();
	}

}
