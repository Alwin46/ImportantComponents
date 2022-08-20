import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class explicit_Wait
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

        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement profile=wait.until(ExpectedConditions.elementToBeClickable
                (By.xpath("//*[@id=\"fadein\"]/div[3]/div/div[3]/ul/li[4]/a")));

        profile.click();
    }
}
