import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.awt.*;
import java.awt.event.KeyEvent;

public class refresh
{
    public static void main(String[] args) throws AWTException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();

        //These are the four ways to refresh the web page
        //1.
        driver.get("http://www.google.com");
        driver.get(driver.getCurrentUrl());

        //2.
        driver.navigate().to("http://www.google.com");
        driver.navigate().refresh();

        //3.
        Robot robot=new Robot();
        robot.keyPress(KeyEvent.VK_F5);
        robot.keyRelease(KeyEvent.VK_F5);

        //4.
        JavascriptExecutor executor= (JavascriptExecutor) driver;
        executor.executeScript("location.reload()");

    }
}
