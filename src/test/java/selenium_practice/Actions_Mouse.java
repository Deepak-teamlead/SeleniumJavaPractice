package selenium_practice;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class Actions_Mouse extends Generic_Methods{
//
	public static void main(String[] args) throws Exception{
		Generic_Methods o=new Generic_Methods();
        o.browserNameandUrl("chrome","http://omayo.blogspot.com/");
        // moveToElement()
        // move to Blogs and then SeleniumByArun and click on SeleniumByArun
        WebElement Blogs = driver.findElement(By.xpath("//span[@id='blogsmenu']"));
        WebElement SeleniumByArun = driver.findElement(By.xpath("//span[normalize-space()='SeleniumByArun']"));
        Actions a=new Actions(driver);
        a.moveToElement(Blogs).perform();
        a.click(SeleniumByArun).perform();
        Thread.sleep(2000);
        driver.quit();
		// dragAndDrop()
		//o.browserNameandUrl("chrome","https://demoqa.com/droppable");
		//WebElement drag = driver.findElement(By.xpath("//div[@id='draggable']"));
		//WebElement drop = driver.findElement(By.xpath("//div[@id='simpleDropContainer']//div[@id='droppable']"));
		//Actions a1=new Actions(driver);
		//a1.dragAndDrop(drag,drop).perform();

	}

}
