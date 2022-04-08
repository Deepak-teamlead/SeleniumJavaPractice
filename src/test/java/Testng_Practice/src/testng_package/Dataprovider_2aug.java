package testng_package;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
public class Dataprovider_2aug {
//Dataprovider
    @DataProvider (name="logintestdata")	
	public Object[][] getdata() {
		Object [] [] a= {{"standard_user","secret_sauce"},
				{"locked_out_user","secret_sauce"},
				{"problem_user","secret_sauce"},
				{"performance_glitch_user","secret_sauce"}};
		     return a;
	}
	@Test (dataProvider="logintestdata")	
	public void login(String un,String pwd) throws Exception {
		System.setProperty("webdriver.chrome.driver", "D:\\Deepak files\\Hybrid Framework Qshore\\Jars or Dependencies\\chromedriver.exe");	
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("user-name")).sendKeys(un);
		driver.findElement(By.id("password")).sendKeys(pwd);
		driver.findElement(By.id("login-button")).click();
		driver.quit();
}
}
	
	
	


