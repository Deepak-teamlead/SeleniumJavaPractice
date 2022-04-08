package selenium_practice1;
import java.io.FileInputStream;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import jxl.Sheet;
import jxl.Workbook;
public class Data_driven_framework_5aug {
//Data Driven Framework	
public static void main(String[] args) throws Exception{
System.setProperty("webdriver.chrome.driver", "D:\\Deepak files\\Hybrid Framework Deepak\\Jars or Dependencies\\chromedriver.exe");	
WebDriver driver=new ChromeDriver();
driver.get("http://adactinhotelapp.com/");
driver.manage().window().maximize();
/*FileInputStream fs=new FileInputStream("D:\\Deepak files\\Hybrid Framework Deepak\\Test Data\\TestData(W3 softech-Reading).xls");
Workbook wb=Workbook.getWorkbook(fs);
Sheet s=wb.getSheet("Sheet1");
String username = s.getCell(0,1).getContents();
String password = s.getCell(1,2).getContents();	
Thread.sleep(2000);
driver.findElement(By.id("username")).sendKeys(username);
Thread.sleep(2000);
driver.findElement(By.id("password")).sendKeys(password);
Thread.sleep(2000);
driver.findElement(By.id("login")).click();
Thread.sleep(2000);*/
//************************************************************
FileInputStream fs=new FileInputStream("D:\\Deepak files\\Hybrid Framework Deepak\\Test Data\\TestData(W3 softech-Reading).xls");
Workbook wb=Workbook.getWorkbook(fs);
Sheet s=wb.getSheet("Sheet1");
int cc = s.getColumns();
System.out.println("Number of colums : "+ cc);
int rc = s.getRows();
System.out.println("Number of rows : "+ rc);
int i; int j;
for(i=0; i<cc; i++) {
	for(j=1;j<rc; j++) {
		System.out.println(s.getCell(i,j).getContents());
	}
}

driver.close();
}
}