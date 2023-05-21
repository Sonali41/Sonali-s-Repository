package keywordDrivenPackage;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseTest extends Flib implements IAutoConstant {
	
	static WebDriver driver;
	
	public void openBrowser() throws IOException
	{
		//Fetching the data from property file 
		Flib flib = new Flib();
		String browser = flib.readPropertyData(PROP_PATH, "browser");
		String url = flib.readPropertyData(PROP_PATH, "url");
		
		//generic reusable methods to open and close the browser
		if (browser.equalsIgnoreCase("chrome"))
		{
			System.setProperty(CHROME_KEY, CHROME_PATH);
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.get(url);
		}
		else if(browser.equalsIgnoreCase("firefox"))
		{
			System.setProperty(GECKO_KEY,GECKO_PATH);
			driver=new FirefoxDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.get(url);
		}
		else if(browser.equalsIgnoreCase("Edge"))
		{
			System.setProperty(EDGE_KEY, EDGE_PATH);
			driver=new EdgeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.get(url);
		}
		else
		{
			System.out.println("Invalid Browser Value");
		}
	}
		
		public void closeBrowser()
		{
			driver.quit();
		}
		
}
