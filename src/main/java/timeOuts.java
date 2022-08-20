import org.testng.annotations.Test;

public class timeOuts
{
    //This is the way to set the timeOuts for test cases by externally
    @Test(timeOut = 2000)
    public void test() throws InterruptedException
    {
        Thread.sleep(3000);
        System.out.println("test one");
    }
}
