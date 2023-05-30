package selenium_practice;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Dynamic_Webtable {
//Handling Dynamic Web Table	
public static void main(String[] args) throws Exception{
	WebDriver driver=new ChromeDriver();
	driver.get("http://demo.guru99.com/test/web-table-element.php");
	driver.manage().window().maximize();
//Number of Columns	
List<WebElement> cols = driver.findElements(By.xpath("//*[@id=\"leftcontainer\"]/table/thead/tr/th"));
System.out.println("Number of Columns are: "+ cols.size());	//o/p- 5
//Number of Rows
List<WebElement> rows = driver.findElements(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr"));
System.out.println("Number of Rows are: "+ rows.size());	  //o/p- 26
//******************************************************
for(int i=0; i<cols.size(); i++) {
	String colsdata = cols.get(i).getText();
	if(colsdata.contains("Group"))
	{
		System.out.println("Cols Data exits");
		break;
	}
//********************************************************
	for(int j=1; j<rows.size(); j++) {
		String rowsdata = rows.get(j).getText();
		if(rowsdata.contains("Hero MotoCorp"))
		{
			System.out.println("Row Data exits");
			break;

		}	
}
}
driver.close();
}

}
