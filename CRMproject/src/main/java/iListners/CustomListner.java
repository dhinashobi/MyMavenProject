package iListners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.crmpro.base.TestBase;

public class CustomListner extends TestBase implements ITestListener {

	public void onTestStart(ITestResult result) {
		
		System.out.println("TestCase Started and details are  "+result.getName());
	}

	public void onTestSuccess(ITestResult result) {
		
		System.out.println("TestCase Success and details are  "+result.getName());
		
	}

	public void onTestFailure(ITestResult result) {
		
		System.out.println("Failed Test");
		String testMethodName = result.getMethod().getMethodName();
		failedTakeaSnapshot(testMethodName);
	}

	public void onTestSkipped(ITestResult result) {
		
		System.out.println("TestCase Skipped and details are  "+result.getName());
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
		
	}

	public void onStart(ITestContext context) {
	
		
	}

	public void onFinish(ITestContext context) {
	
		
	}

}
