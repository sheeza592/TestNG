package TestNGPack;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class Test5 {
	
	@Parameters ({"username", "pwd"})
	@Test
	public void Test78(String un, String pwd)
	{
		System.out.println( "username is " +un);
		System.out.println( "username is " +pwd);
		System.out.println("Test 78");
	}

	@BeforeTest
	public void Beforetest()
	{
		System.out.println("BEFORE TEST");
	}
	
}
