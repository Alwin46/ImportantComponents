import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.awt.*;
import java.awt.event.KeyEvent;

public class scroll
{
    public static void main(String[] args) throws InterruptedException, AWTException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("https://itera-qa.azurewebsites.net/home/automation");

        //we have four different ways to scroll the web page

        //1.
        JavascriptExecutor executor= (JavascriptExecutor) driver;

        executor.executeScript("window.scroll(0,450)");
        Thread.sleep(2000);
        executor.executeScript("window.scroll(0,-450)");

        //2.
        executor.executeScript("window.scrollTo(0,document.body.scrollHeight)");
        Thread.sleep(2000);
        executor.executeScript("window.scroll(0,0)");

        //3.
        executor.executeScript("arguments[0].scrollIntoView(true);",driver.findElement(By.linkText(("ozkan.murat@itera.no"))));
        Thread.sleep(2000);
        executor.executeScript("window.scroll(0,0)");

        //4.
        Robot robot=new Robot();
        robot.keyPress(KeyEvent.VK_PAGE_DOWN);
        robot.keyRelease(KeyEvent.VK_PAGE_DOWN);
        Thread.sleep(2000);
        robot.keyPress(KeyEvent.VK_PAGE_UP);
        robot.keyRelease(KeyEvent.VK_PAGE_UP);


    }
}
