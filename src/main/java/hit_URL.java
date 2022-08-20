import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class hit_URL
{
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        //This is the way to hit url withOut driver.get method
        JavascriptExecutor executor= (JavascriptExecutor) driver;
        executor.executeScript("window.location='http://www.yahoo.com'");
    }
}
