import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class ScreenShot
{
    public static void main(String[] args) throws IOException, AWTException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("http://www.google.com");

        //This is the way to get the screenshot with the TakeScreenShot interface
        TakesScreenshot takesScreenshot= (TakesScreenshot) driver;
        File screenshot=takesScreenshot.getScreenshotAs(OutputType.FILE);
        File file=new File("screenshot.png");
        FileHandler.copy(screenshot,file);

        //This is the way to get the screenShot with the robot class
        Dimension dimension=Toolkit.getDefaultToolkit().getScreenSize().getSize();
        Robot robot=new Robot();
        Rectangle rectangle=new Rectangle(dimension);
        BufferedImage image=robot.createScreenCapture(rectangle);
        File file1=new File("screenCapture.png");
        ImageIO.write(image,"png",file);

    }
}
