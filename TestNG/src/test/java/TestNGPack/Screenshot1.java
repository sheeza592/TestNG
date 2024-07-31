package TestNGPack;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Screenshot1 {
	
	@Test
	public void scrnshottest() throws IOException
	{
		
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.facebook.com");
		
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("/Users/sheeza/Desktop/screenshot/fbimage.png"));		
				
				
				
		
	}

}
