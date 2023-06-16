package selenium_practice;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class DatePicker {
    // Handling Date picker
    public static void main(String[] args) throws Exception {
        WebDriver driver = new ChromeDriver();
        driver.get("https://seleniumpractise.blogspot.com/2016/08/how-to-handle-calendar-in-selenium.html");
        driver.manage().window().maximize();
        // clicking calender field to display calender
        driver.findElement(By.xpath("//input[@id='datepicker']")).click();
        Thread.sleep(2000);
        // below loop will run till if condition is true
        while (true) {
            String monthtext = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
            String yeartext = driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
            // if condition is true day will be clicked and loop will break
            // else next arrow will keep on clicking
            // clicking next arrow
            if (monthtext.equalsIgnoreCase("february") && yeartext.equalsIgnoreCase("2025")) {
                // clicking day
                driver.findElement(By.xpath("(//a[normalize-space()='15'])[1]")).click();   // day 15 should be selected
                break;
            } else {
                driver.findElement(By.xpath("//a[@title='Next']")).click();
            }
        }
    }
}
