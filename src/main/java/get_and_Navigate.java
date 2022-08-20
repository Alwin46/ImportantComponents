import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class get_and_Navigate
{
    public static void main(String[] args)
    {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();

        driver.get("http://www.google.com");
        /*
        @The driver.get method is wait until for presenting elements in Dom of the web Application
        @But the driver.get method doesn't have ,refresh,backWord,forward etc, methods
        * */

        driver.navigate().to("http://www.google.com");
        driver.navigate().refresh();
        driver.navigate().back();
        driver.navigate().forward();
        /*
        @The driver.navigate method is doesn't wait for presenting the elements in Dom
        @But the driver.navigate method has the following methods like,refresh,backWord,forward methods
        * */

        //It is the difference between get and navigate to method

    }
}
