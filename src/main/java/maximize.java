import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class maximize
{
    public static void main(String[] args)
    {
        WebDriverManager.chromedriver().setup();

        //These are the three ways to maximize the window
        //1.
        ChromeOptions options=new ChromeOptions();
        options.addArguments("start-maximized");

        WebDriver driver=new ChromeDriver(options);
        //2.
        driver.manage().window().maximize();

        //3.
        Dimension dimension=new Dimension(1920,1080);
        driver.manage().window().setSize(dimension);

    }
}
