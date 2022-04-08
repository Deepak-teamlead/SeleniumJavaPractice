package selenium_practice1;
import java.io.FileInputStream;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import jxl.Sheet;
import jxl.Workbook;
public class Keyword_drivern_framework_6aug {
//keyword driven framework
//In this webpage we are testing until mobile number
public static void main(String[] args) throws Exception{
System.setProperty("webdriver.chrome.driver", "D:\\Deepak files\\Hybrid Framework Deepak\\Jars or Dependencies\\chromedriver.exe");	
WebDriver driver=new ChromeDriver();
//******************************		
FileInputStream fs=new FileInputStream("D:\\Deepak files\\Hybrid Framework Deepak\\Test Data\\TestData(W3 softech-Reading).xls");
Workbook wb=Workbook.getWorkbook(fs);
Sheet s=wb.getSheet("Sheet6");
int cc = s.getColumns();
int rc = s.getRows();
int i; int j;
for(i=0;i<cc;i++) {
for(j=1;j<rc;j++) {
System.out.println(s.getCell(i,j).getContents());
//*************************
String keyword = s.getCell(0,j).getContents();
String locator = s.getCell(1,j).getContents();
String input = s.getCell(2,j).getContents();
switch(keyword) {
case "open" : driver.get("https://demoqa.com/automation-practice-form");
driver.manage().window().maximize();
break;
case "enter" : driver.findElement(By.xpath(locator)).sendKeys(input);
break;
case "select" : driver.findElement(By.xpath(locator)).click();
}
}
driver.close();
}
}	
}	
	
	
	
	
	
	
	
