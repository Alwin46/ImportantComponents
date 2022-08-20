import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class assert_and_Verify
{

    @Test
    public void test1()
    {
        //
        //* if Assert condition is failed then the no any other code can execute.It is a hard assertion
        System.out.println("before assertion");
        Assert.fail();
        System.out.println("after assertion");

        //* but the soft assertion is also execute after lines
        System.out.println("before assertion");
        SoftAssert softAssert=new SoftAssert();
        softAssert.fail();
        System.out.println("after assertion");
    }

}
