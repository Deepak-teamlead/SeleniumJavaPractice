package pom_withTestNG_3aug;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class Loginpageclass {
	WebDriver driver;
	public Loginpageclass(WebDriver driver) {

		this.driver=driver;
	}
By logo= By.xpath("//*[@id=\"divLogo\"]/img");	
By username= By.id("txtUsername");
By password= By.id("txtPassword");
By loginbutton= By.id("btnLogin");
//**************************************************

public void verifylogo() {
	driver.findElement(logo).isDisplayed();
}
public void login(String unameval, String pwdval) throws Exception {
	driver.findElement(username).sendKeys(unameval);
	driver.findElement(password).sendKeys(pwdval);
	driver.findElement(loginbutton).click();
	Thread.sleep(3000);
}
	
	
	
	
	
	
	
	
	
}
