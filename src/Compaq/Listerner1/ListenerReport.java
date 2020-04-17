package Compaq.Listerner1;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class ListenerReport implements ITestListener
{

	@Override
	public void onTestStart(ITestResult result) 
	{
		Reporter.log(result.getName()+"---Test script is stated");
		
	}

	@Override
	public void onTestSuccess(ITestResult result) 
	{
		Reporter.log(result.getName()+"---Test script is passed");
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		Reporter.log(result.getName()+"---Test script is failed");
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		Reporter.log(result.getMethod().getMethodName()+"---Test script is skippeed:");
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		Reporter.log(result.getName()+"---Test script is failed but with sucess percentage");
		
	}

	@Override
	public void onStart(ITestContext context) {
		Reporter.log(context.getName()+"---Test script is stated");
		
	}

	@Override
	public void onFinish(ITestContext context) {
		
		Reporter.log(context.getName()+"---Test script is context");
	}

}
