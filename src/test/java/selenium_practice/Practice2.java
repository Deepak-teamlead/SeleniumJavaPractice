package selenium_practice;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;

public class Practice2 extends Generic_Methods {
    public static void main(String[] args) throws Exception{

        Generic_Methods o = new Generic_Methods();
        o.browserNameandUrl("chrome", "http://omayo.blogspot.com/");
        WebElement dropdown = driver.findElement(By.xpath("(//select[@id='drop1'])[1]"));
        o.verifyDropdownvalue(dropdown,"doc 20");

        driver.quit();






}
}

