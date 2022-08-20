import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import java.time.Duration;
import java.util.function.Function;


public class fluent_Wait
{
    public static void main(String[] args)
    {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.phptravels.net/login");

        WebElement username=driver.findElement(By.xpath("//*[@id=\"fadein\"]/div[3]/div/div[2]/div[2]/div/form/div[1]/div/input"));
        username.sendKeys("user@phptravels.com");

        WebElement password=driver.findElement(By.xpath("//*[@id=\"fadein\"]/div[3]/div/div[2]/div[2]/div/form/div[2]/div[1]/input"));
        password.sendKeys("demouser");

        WebElement login=driver.findElement(By.xpath("//*[@id=\"fadein\"]/div[3]/div/div[2]/div[2]/div/form/div[3]/button/span[1]"));
        login.click();

        Wait<WebDriver> wait=new FluentWait<>(driver)
                .pollingEvery(Duration.ofSeconds(2))
                .withTimeout(Duration.ofSeconds(20))
                .ignoring(NoSuchElementException.class);

        WebElement profile=wait.until(new Function<WebDriver, WebElement>()
        {
            public WebElement apply(WebDriver driver)
            {
                return driver.findElement(By.xpath("//*[@id=\"fadein\"]/div[3]/div/div[3]/ul/li[4]/a"));
            }
        }
        );

        profile.click();

    }
}
