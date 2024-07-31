package TestNGPack;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenerClass implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("Test case Stated");
	
	}

	@Override
	public void onTestFailure(ITestResult result) {
		
		System.out.println("Test case failed");
	}

	

	
	

}
