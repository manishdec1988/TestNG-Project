package ITestListenerDemo;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ITestListenerTest implements ITestListener{

	public void onTestStart(ITestResult result) {
	
		System.out.println("TestStart and details are :"+result.getName());
	}

	public void onTestSuccess(ITestResult result) {
		System.out.println("TestSuccess and details are :"+result.getName());
		
	}

	public void onTestFailure(ITestResult result) {

		System.out.println("TestFailure and details are :"+result.getName());
	}

	public void onTestSkipped(ITestResult result) {
	
		System.out.println("TestSkipped and details are :"+result.getName());
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

}
