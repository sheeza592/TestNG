package TestNGPack;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Test4 {
	
	
	@Test
	public void test31()
	{
		System.out.println("Test 31");
	}
	
	@Test
	public void test32()
	{
		System.out.println("Test 32");
	}
	

	@BeforeClass
	public void Beforeclass()
	{
		System.out.println("before class");
	}
	
	@Test(groups={"Smoke"})
	public void test33()
	{
		System.out.println("Test 33");
	}
	
	
	@Test
	public void test34()
	{
		System.out.println("Test 34");
	}
	
	@AfterSuite
	public void aftersuite()
	{
		System.out.println("AFTER SUITE");
	}

}
