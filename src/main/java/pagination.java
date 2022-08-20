import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.ArrayList;
import java.util.List;

public class pagination
{
    public static void main(String[] args)
    {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://mdbootstrap.com/docs/b4/jquery/tables/pagination/");

        List<String> list=new ArrayList<String>();
        int pageSize=driver.findElements(By.xpath("//*[@id=\"dtBasicExample_paginate\"]/ul//li")).size();
        if (pageSize>0)
        {
            do
            {
                List<WebElement> name=driver.findElements(By.xpath("//td[1]"));
                for (WebElement allNames:name)
                {
                    list.add(allNames.getText());
                }

                WebElement nextButton=driver.findElement(By.xpath("//*[@id=\"dtBasicExample_next\"]"));
                String buttonStage=nextButton.getAttribute("class");
                if (!buttonStage.contains("disabled"))
                {
                    nextButton.click();
                }
                else
                {
                    break;
                }
            }
            while (true);
        }

        else
        {
            System.out.println("no pagination is founded in this web page");
        }

        for (String printNames:list)
        {
            System.out.println("Name :"+printNames);
        }
    }
}
