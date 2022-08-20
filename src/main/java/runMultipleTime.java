import org.testng.annotations.Test;

public class runMultipleTime
{
    //This is the way to run the test case multiple times
    @Test(invocationCount = 3)
    public void test1()
    {
        System.out.println("test one");
    }
}
