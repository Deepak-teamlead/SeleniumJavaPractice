package pom_using_pagefactory_3aug;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
public class Mainclass extends Baseclass{
	static WebDriver driver;
	//Loginpageclass pf=PageFactory.initElements(driver, Loginpageclass.class);
	//Homepageclass pf1=PageFactory.initElements(driver, Homepageclass.class);
	@BeforeClass
	public void launch() {
		Baseclass o=new Baseclass();
		o.launchapp();
	}
	@Test
	public void logotest() {
		Loginpageclass pf=PageFactory.initElements(driver,Loginpageclass.class);
		pf.verifylogo();
	}
	@Test
	public void logintest() {
		Loginpageclass pf=PageFactory.initElements(driver,Loginpageclass.class);
		pf.verifylogin();
	}
	@Test
	public void clickadmintest() {
		Homepageclass pf=PageFactory.initElements(driver,Homepageclass.class);
		pf.clickadmin();
	}
	@AfterClass
	public void close() {
		Baseclass o=new Baseclass();
		o.closeapp();
	}	
		
	
	

}
