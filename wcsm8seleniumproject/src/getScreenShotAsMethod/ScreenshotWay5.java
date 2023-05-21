package getScreenShotAsMethod;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class ScreenshotWay5 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		 System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			
		    WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
;			
			driver.get("https://www.flipkart.com/");
			
			TakesScreenshot ts = (TakesScreenshot) driver;
			File src = ts.getScreenshotAs(OutputType.FILE);
			
			File dest = new File("./Screenshots/sst5.png");
			
			Files.copy(src, dest);
			

	}

}
