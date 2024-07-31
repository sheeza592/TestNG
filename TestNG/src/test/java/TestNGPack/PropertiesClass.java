package TestNGPack;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;



public class PropertiesClass {
	
	@Test
	public void propertiesTest() throws IOException
	{
		//class properties
		Properties prop=new Properties(); // properties class can read a file
		
	FileInputStream fis=new FileInputStream("/Users/sheeza/eclipse-workspace/TestNG/src/test/java/TestNGPack/data.properties");
	
	
	prop.load(fis);
	
	System.out.println(prop.getProperty("browser"));
	System.out.println(prop.getProperty("url"));
	//changing the browser from firefox to chrome
	prop.setProperty("browser", "Chrome");
	System.out.println(prop.getProperty("browser"));
	//changing the url
	prop.setProperty("url", "www.facebook.com");
	System.out.println(prop.getProperty("url"));
	
	//to write to properties document - url value is updated
	FileOutputStream fos=new FileOutputStream("/Users/sheeza/eclipse-workspace/TestNG/src/test/java/TestNGPack/data.properties");
	
	prop.store(fos, null);
	}
	

}
