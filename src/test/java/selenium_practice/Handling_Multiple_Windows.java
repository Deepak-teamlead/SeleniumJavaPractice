package selenium_practice;
import org.openqa.selenium.By;
import org.openqa.selenium.WindowType;
public class Handling_Multiple_Windows extends Generic_Methods {
      // Handlig Multiple windows
    public static void main(String[] args) throws Exception{
        Generic_Methods obj=new Generic_Methods();
        obj.browserNameandUrl("chrome","http://omayo.blogspot.com/");
        String parentwindow = driver.getWindowHandle();
        // clicking link opens child window
        driver.findElement(By.xpath("//a[normalize-space()='Open a popup window']")).click();
        System.out.println("parent window :" + driver.getTitle());
        // switching focus to new window
        obj.navigateToNewWindow("Basic Web Page Title");
        System.out.println("first child window :"+driver.getTitle());
        System.out.println(driver.findElement(By.xpath("//p[@class='main']")).getText());
        // switching to parent window
        driver.switchTo().window(parentwindow);
        System.out.println("switching back to parent window :"+driver.getTitle());
        // clicking link opens child window
        driver.findElement(By.xpath("//a[normalize-space()='Blogger']")).click();
        obj.navigateToNewWindow("Blogger.com - Create a unique and beautiful blog easily.");
        System.out.println("Second new Tab :"+driver.getTitle());
        // operations on child window
        driver.findElement(By.xpath("//span[normalize-space()='Sign in']")).click();
        // below command is selenium -4 it open a new tab (empty tab wiyhout any url)
        Thread.sleep(2000);
        driver.switchTo().newWindow(WindowType.TAB);
        driver.quit();

    }
}
