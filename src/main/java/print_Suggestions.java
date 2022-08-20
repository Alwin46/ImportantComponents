import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class print_Suggestions
{
    public static void main(String[] args)
    {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("http://www.google.com");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        WebElement search=driver.findElement(By.name("q"));
        search.sendKeys("game of thrones");

        List<WebElement> suggestions=driver.findElements(By.xpath("//*[@role=\"listbox\"]//li"));

        for (WebElement webElement:suggestions)
        {
            //We can print the suggestions to this way and also click a particular suggestion by getIndexValue method

            String values=webElement.getText();
            System.out.println("suggestions"+values);

            if (values.contains("cast"))
            {
                webElement.click();
                break;
            }

        }
    }
}
