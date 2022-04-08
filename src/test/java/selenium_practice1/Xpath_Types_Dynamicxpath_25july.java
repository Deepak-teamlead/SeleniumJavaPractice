package selenium_practice1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//Xpath and Its Types and Dynamic Xpath
 public class Xpath_Types_Dynamicxpath_25july {
public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver","D:\\Deepak files\\Hybrid Framework Deepak\\Jars or Dependencies\\chromedriver.exe");	
WebDriver driver=new ChromeDriver();	
driver.get("http://automationpractice.com/index.php");
driver.manage().window().maximize();	
//Absolute xpath of search bar and search button
//driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/header[1]/div[3]/div[1]/div[1]/div[2]/form[1]/input[4]")).sendKeys("T-shirts");
//driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/header[1]/div[3]/div[1]/div[1]/div[2]/form[1]/button[1]")).click();	
//*********************************************************************
//Relative Xpath of search bar and search button
//driver.findElement(By.xpath("//input[@id='search_query_top']")).sendKeys("T-shirts");
//driver.findElement(By.xpath("//header/div[3]/div[1]/div[1]/div[2]/form[1]/button[1]")).click();
//*********************************************************************
//xpath with or
//driver.findElement(By.xpath("//input[@id='search_query_top'or @ name=\"balayya\"]")).sendKeys("T-shirts");
//xpath with and 
//driver.findElement(By.xpath("//input[@id='search_query_top'and @ name=\"search_query\"]")).sendKeys("T-shirts");
//******************************************************
//xpath with contains()
driver.findElement(By.xpath("//input[contains(@name,'search')]")).sendKeys("T-shirts");

}
}
