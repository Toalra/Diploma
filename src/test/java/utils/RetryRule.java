package utils;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;
public class RetryRule implements IRetryAnalyzer {
    private int retryCount = 1;
    private int maxCount = 3;

    public RetryRule(int retryCount) {
        this.retryCount = retryCount;
    }

    @Override
    public boolean retry(ITestResult result) {
        if(!result.isSuccess()) {
            if(retryCount < maxCount) {
                retryCount++;
                return true;
            }
        }
        return false;
    }
}
