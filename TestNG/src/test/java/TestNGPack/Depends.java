package TestNGPack;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class Depends {
	
	
	
	@Test
	public void credentials()
	{
	System.out.println("Enter the credentials");
		
	}
	
	@Test(dependsOnMethods={"credentials"})
	public void carLoan()
	{
		System.out.println("Details of the Candidates");
		
	}
	
	@Test(enabled=false) //if we want to hide the result
	public void carLoan2()
	{
		System.out.println("Details of the Candidates2");
		
	}

	@Test(timeOut=4000)
	public void carLoan3()
	{
		System.out.println("Details of the Candidates3");
		
	}
}
