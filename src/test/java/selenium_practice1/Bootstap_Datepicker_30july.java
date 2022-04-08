package selenium_practice1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Bootstap_Datepicker_30july {
//Handling Bootstrap Datepicker
static WebDriver driver;
public void datepicker() {
	String monandyear="May 2020";
	String day="25";
    while(true) {
    	String daystext = driver.findElement(By.xpath("/html/body/div[3]/div[1]/table/thead/tr[2]/th[2]")).getText();
    	if(daystext.equals(monandyear)) {
    		break;
    	}
    else
    {
    	driver.findElement(By.xpath("/html/body/div[3]/div[1]/table/thead/tr[2]/th[1]")).click();	
    }
    }
    driver.findElement(By.xpath("//table/tbody/tr/td[contains(text(),"+day+")]")).click();
}
public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver","D:\\Deepak files\\Hybrid Framework Deepak\\Jars or Dependencies\\chromedriver.exe");	
driver=new ChromeDriver();	
driver.get("https://www.seleniumeasy.com/test/bootstrap-date-picker-demo.html");
driver.manage().window().maximize();	
//*****************************************************	
Bootstap_Datepicker_30july obj=new Bootstap_Datepicker_30july();
obj.datepicker();
}
}
