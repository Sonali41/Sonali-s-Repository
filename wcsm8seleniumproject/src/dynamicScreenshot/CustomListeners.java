package dynamicScreenshot;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class CustomListeners extends BaseTest implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
		Reporter.log("Test Case Is Started!", true);
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		Reporter.log("Test Case Is Executed Successfully!", true);
	}

	@Override
	public void onTestFailure(ITestResult result) {
		String fMethod = result.getMethod().getMethodName();
		Reporter.log("Test Case Is Failed due to the:"+fMethod, true);
		failedMethodSs(fMethod);
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		Reporter.log("Test Case Is Skipped!", true);
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		
	}

	@Override
	public void onStart(ITestContext context) {
		Reporter.log("Test Case Is Started!", true);
	}

	@Override
	public void onFinish(ITestContext context) {
		Reporter.log("Test Case Is Finished!", true);
	}
	
	

}
