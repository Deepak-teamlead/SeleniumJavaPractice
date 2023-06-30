package selenium_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class DatePicker_JavaScriptExecutor extends Base_Class{
    // Handling Date picker using Java script Executer
    public static void main(String[] args) throws Exception {
        Base_Class o=new Base_Class();
        o.browserAndUrl("chrome","https://www.hyrtutorials.com/p/calendar-practice.html");
        WebElement calenderField = driver.findElement(By.xpath("//input[@id='first_date_picker']"));
        o.selectDateJavaScriptExecutor(calenderField,"05/20/2026");





    }
}
