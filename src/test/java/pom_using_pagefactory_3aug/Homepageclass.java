package pom_using_pagefactory_3aug;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Homepageclass {
	WebDriver driver;
	

	@FindBy (xpath="//*[@id=\"menu_admin_viewAdminModule\"]/b") WebElement admin;
	
	public void clickadmin() {
		admin.click();
	}
	
	
	
}
