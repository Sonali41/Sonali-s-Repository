package getScreenShotAsMethod;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.google.common.io.Files;

public class ScreenshotsWay5 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
	    WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://www.bluestone.com/");
		EventFiringWebDriver efd = new EventFiringWebDriver(driver);
		
		File src = efd.getScreenshotAs(OutputType.FILE);
		
		File dest = new File("./Screenshots/sst4.png");
		
		Files.copy(src, dest);
		
		

	}

}
