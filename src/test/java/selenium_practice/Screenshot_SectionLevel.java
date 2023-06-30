package selenium_practice;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import java.io.File;

public class Screenshot_SectionLevel extends Base_Class{
    public static void main(String[] args) throws Exception {
        // selenium-4 Taking screenshots
        Base_Class o=new Base_Class();
        o.browserAndUrl("chrome","http://omayo.blogspot.com/");
        // Taking screenshot Element level or section level based webelement xpath
        WebElement visiblepage = driver.findElement(By.xpath("//html"));
        File sourcefile = visiblepage.getScreenshotAs(OutputType.FILE);
        FileHandler.copy(sourcefile,new File("F:\\Downloads\\visible.png"));

        Thread.sleep(2000);

        driver.quit();

    }
}
