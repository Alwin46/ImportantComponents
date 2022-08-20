import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class retryAnalyzer implements IRetryAnalyzer

{
    int start=0;
    int limit=3;
    public boolean retry(ITestResult iTestResult)
    {
        while (start<limit)
        {
            start++;
            return true;
        }
        return false;
    }
}
