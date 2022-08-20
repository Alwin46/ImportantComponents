import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.awt.*;
import java.awt.event.KeyEvent;

public class enter_Key
{
    public static void main(String[] args) throws AWTException
    {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("http://www.google.com");

        WebElement search=driver.findElement(By.name("q"));

        //These are the four ways to submit the enter key
        search.sendKeys("game of thrones"+ KeyEvent.VK_ENTER);

        search.sendKeys("game of thrones \n");

        search.submit();

        Robot robot=new Robot();
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);

    }
}
