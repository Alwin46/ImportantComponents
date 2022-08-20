import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class print_urls
{
    public static void main(String[] args)
    {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("http://www.google.com");

        WebElement search=driver.findElement(By.name("q"));
        search.sendKeys("game of thrones \n");

        List<WebElement> links=driver.findElements(By.xpath("//a[1]"));
        for (WebElement webElement:links)
        {
            System.out.println("links :"+webElement.getAttribute("href"));
        }

        List<WebElement> greenLinks=driver.findElements(By.xpath("//h3[1]//following::cite"));
        for (WebElement webElement1:greenLinks)
        {
            System.out.println("greenLinks :"+webElement1.getText());
        }
    }
}
