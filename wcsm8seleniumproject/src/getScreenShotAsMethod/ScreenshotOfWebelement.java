package getScreenShotAsMethod;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class ScreenshotOfWebelement {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://www.instagram.com/");
		
		WebElement button = driver.findElement(By.xpath("//button[@class='_acan _acap _acas _aj1-']"));
		
		if(button.isEnabled())
	    {
			System.out.println("We can do the login!");
	    }
		else
		{
			System.out.println("We cannot do the login! SS is taken.");
			File src = button.getScreenshotAs(OutputType.FILE);//completely responsible to take ss
			File dest = new File("./Screenshots/webelement1.png");
			
			Files.copy(src, dest);
			
		}

	}

}
