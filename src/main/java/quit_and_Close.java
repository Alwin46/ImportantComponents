import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class quit_and_Close
{
    public static void main(String[] args)
    {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("https://nxtgenaiacademy.com/multiplewindows/");

        WebElement window=driver.findElement(By.xpath("//*[@id=\"button1\"]"));
        window.click();

       //1. driver.close();

       //2. driver.quit();

        /*
        If I close the browse by use the driver.close method,then it is closes the current accessed window with driver

        And if I quit the browser with driver.quit method,then it is close the overall window

       it is the difference between close & quit

    */
    }
}
