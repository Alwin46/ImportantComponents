import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class sendKeys
{
    public static void main(String[] args)
    {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.google.com/");

        //This is the way send input into the textBox without sendKeys method
        WebElement search=driver.findElement(By.name("q"));
        JavascriptExecutor executor= (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].value='thor'",search);
        search.submit();

    }
}
