package selenium_practice;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import java.io.File;

public class Screenshot_SectionLevel extends Generic_Methods{
    public static void main(String[] args) throws Exception {
        // selenium-4 Taking screenshots
        Generic_Methods o=new Generic_Methods();
        o.browserNameandUrl("chrome","http://omayo.blogspot.com/");
        // Taking screenshot Element level or section level based webelement xpath
        WebElement visiblepage = driver.findElement(By.xpath("//html"));
        File sourcefile = visiblepage.getScreenshotAs(OutputType.FILE);
        FileHandler.copy(sourcefile,new File("F:\\Downloads\\visible.png"));

        Thread.sleep(2000);

        driver.quit();

    }
}
