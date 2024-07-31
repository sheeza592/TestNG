package TestNGPack;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderClass {
	
	@Test(dataProvider="getdata")
	public void carloan(String un, String pw)
	{
		
		System.out.println("USER NAME = " +un);
		System.out.println("PWD = " +pw);
	}
	
	
	
	@DataProvider
	public Object[][] getdata()
	{
		
		Object[][] data=new Object[5][2]; //5 rows and 2 column in array
		
		//1st
		data[0][0]="UN1"; //0 row and 0 column 
		data[0][1]="PW1";
		//data[0][2]= "SA"; for 3rd column
		
		//2nd
		data[1][0]="UN2";
		data[1][1]="PW2";
		
		//3rd
		data[2][0]="UN3";
		data[2][1]="PW3";
		
		//4th
		data[3][0]="UN4";
		data[3][1]="PW4";
				
		//5th
		data[4][0]="UN5";
		data[4][1]="PW5";
	
	return data;
	}
	

}
