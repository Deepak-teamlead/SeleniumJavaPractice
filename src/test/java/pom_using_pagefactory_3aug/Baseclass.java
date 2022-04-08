package pom_using_pagefactory_3aug;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Baseclass {
//This class contains Reusable methods like launch app, closeapp etc
	
	WebDriver driver;
	
	public void launchapp() {
		System.setProperty("webdriver.chrome.driver", "D:\\Deepak files\\Hybrid Framework Deepak\\Jars or Dependencies\\chromedriver.exe");	
		driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
	}	
	public void closeapp() {
		driver.quit();
	}
	
	
	
	
}
