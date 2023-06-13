package selenium_practice;

import org.openqa.selenium.By;

public class Xpath_Axes extends Generic_Methods {
    public static void main(String[] args) throws Exception {
        Generic_Methods o = new Generic_Methods();
        o.browserNameandUrl("chrome", "https://www.hyrtutorials.com/p/add-padding-to-containers.html");

        // locating Email textbox element with Email Label element as Email textbox wont have any attributes we can use Axes Method
        // Email Textbox is following sibling for Email Label field

        driver.findElement(By.xpath("(//label[text()='Email']/following-sibling::input)[1]")).sendKeys("abcd");
        // similarly practice other Axes methods Directly in dom

// locating Email Label with Email textbox
    // Email Label is preceding sibling for Email text box element

        driver.findElement(By.xpath("((//label[text()='Email']/following-sibling::input)[1]/preceding-sibling::label)[3]"));

// locating parent of Last Name field

        driver.findElement(By.xpath("//input//parent::div[@class='container']"));


        driver.quit();




    }
}