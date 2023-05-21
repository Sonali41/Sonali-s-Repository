package frame;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class HandleFrame {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
	   WebDriver driver=new ChromeDriver();
	    
	   driver.manage().window().maximize();
	   
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	   
	   driver.get("file:///C:/Users/VOZON/Documents/html/frame.html");
	   
	  
	   WebElement id = driver.findElement(By.id("i2"));
	   id.sendKeys("admin");
	   
	   Thread.sleep(2000);
	   driver.findElement(By.xpath("//iframe[@name='frame']"));
		   
	   driver.switchTo().frame(0);
	   Thread.sleep(2000);
	   WebElement name = driver.findElement(By.name("n1"));
	   name.sendKeys("Manager");
	   
	   Thread.sleep(2000);
	   name.clear();
	   
	   driver.switchTo().defaultContent();
	   Thread.sleep(2000);
	   id.clear();
	   
	   
	  

	}

}
