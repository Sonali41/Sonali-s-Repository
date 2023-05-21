package getScreenShotAsMethod;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;


public class ScreenShotsWay1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
        System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
	    ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://www.amazon.in/");
		
		File ts = driver.getScreenshotAs(OutputType.FILE);
		
		File src = new File("./Screenshots/sst1.png");
		
		Files.copy(ts, src);
		
		
		
		

	}

}
