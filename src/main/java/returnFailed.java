import org.testng.Assert;
import org.testng.annotations.Test;

public class returnFailed
{
    @Test
    public void method1()
    {
        Assert.assertEquals(true,false);
        System.out.println("Method one");
    }

    @Test
    public void method2()
    {
        Assert.assertEquals(true,false);
        System.out.println("Method two");
    }
}
