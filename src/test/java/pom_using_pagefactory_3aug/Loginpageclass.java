package pom_using_pagefactory_3aug;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
public class Loginpageclass {
//webelements of loginpage
	
	   WebDriver driver;
		@FindBy (xpath="//*[@id=\"divLogo\"]/img") WebElement logo;
		@FindBy (id="txtUsername") WebElement username;
		@FindBy (id="txtPassword") WebElement password;
		@FindBy (id="btnLogin") WebElement loginbutton;

	public void verifylogo() {
		logo.isDisplayed();
	}
	 public void verifylogin() {
		 username.sendKeys("Admin" );
		 password.sendKeys("admin123");
		 loginbutton.click();
	 }
		
		
		
}
