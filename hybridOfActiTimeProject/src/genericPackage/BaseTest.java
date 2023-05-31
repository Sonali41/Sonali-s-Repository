package genericPackage;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;

import com.google.common.io.Files;

public class BaseTest extends Flib implements IAutoConstant{
	
	static WebDriver driver;
	@BeforeMethod
	public void setUp() throws IOException
	{
		Flib flib = new Flib();
		String browserValue = flib.readPropertyData(PROP_PATH,"browser");
		
		if(browserValue.equalsIgnoreCase("chrome"))
		{
			System.setProperty(CHROME_KEY, CHROME_PATH);
			driver=new ChromeDriver();
			driver
		}
		
		
	}
	
	public void failedMethodToTakeScreenshot(String failedMethod)
	{
		try
		{
		TakesScreenshot ts = (TakesScreenshot)driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File(SCREENSHOT_PATH+failedMethod+".jpg");
		Files.copy(src, dest);
		}
		catch(Exception e)
		{
			
		}
	}
	
	public void tearDown()
	{
		driver.quit();
	}

}
