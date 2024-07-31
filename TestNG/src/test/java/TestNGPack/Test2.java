package TestNGPack;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class Test2 {
	
	@Test(groups={"Smoke"})
	public void Test21()
	{
		System.out.println("It's difficult");
	}

	@BeforeSuite
	public void beforesuite()
	{
		System.out.println("Before suite annotation");
	}
	@Test
	public void Test22()
	{
		System.out.println("class");
	}
	
	@Parameters({"username", "pwd"})
	@Test
	public void Test23(String un, String pwd)
	{
		System.out.println( "username is " +un);
		System.out.println( "Password is " +pwd);
		System.out.println("need to practice");
	}
	
	@BeforeMethod
	public void beforemethod ()
	{
		System.out.println("Before Method");	
		
	}
}
