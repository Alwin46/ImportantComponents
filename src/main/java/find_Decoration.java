import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class find_Decoration
{
    public static void main(String[] args)
    {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.google.com/");

        //it is the way to verify the text decoration
        WebElement tamil=driver.findElement(By.xpath("//*[@id=\"SIvCob\"]/a[5]"));

        String beforeText=tamil.getCssValue("text-decoration");
        System.out.println("before text hover :"+beforeText);

        Actions actions=new Actions(driver);
        actions.moveToElement(tamil).build().perform();

        String afterText=tamil.getCssValue("text-decoration");
        System.out.println("after text hover :"+afterText);


    }
}
