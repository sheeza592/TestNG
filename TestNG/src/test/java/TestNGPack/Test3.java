package TestNGPack;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class Test3 {

	@Test
	public void test42()
	{
	System.out.println("My class is in the morning");
	}
	
	@AfterClass
	public void Afterclass()
	{
		System.out.println("After class");
	}
	
	@Test(groups={"Smoke"})
	public void test43()
	{
	System.out.println("It is hard");
	}
	
	@Test
	public void test44()
	{
	System.out.println("to focus");
	}
	
	
}
