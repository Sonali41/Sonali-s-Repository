package assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BluestoneChat {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.edge.driver", "./drivers/msedgedriver.exe");
		
	    WebDriver driver=new EdgeDriver();
	    
	   driver.manage().window().maximize();
	   
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	   
	   driver.get("https://www.bluestone.com/");
	   
	   driver.findElement(By.id("denyBtn")).click();
	   
	   driver.findElement(By.xpath("//iframe[@name='fc_widget']"));//Identified frame
	   //switch the control to frame for chatbox
	   driver.switchTo().frame("fc_widget");//Switch the control to the frame
	   
	   //driver.switchTo().frame(frameElement);//By using webElement
	   
	   WebElement chat = driver.findElement(By.id("chat-icon"));//Click on frame
	  //NoSuchElementException without frame
	   
	   WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	   wait.until(ExpectedConditions.elementToBeClickable(chat)).click();
	   //switch the controls to default webpage
	   
	   driver.switchTo().defaultContent();//switch to default window
	   
	   
	   driver.findElement(By.id("chat-fc-name")).sendKeys("Sonali123");
	   driver.findElement(By.id("chat-fc-email")).sendKeys("sonalijarad123@gmail.com");
	   driver.findElement(By.id("chat-fc-phone")).sendKeys("1234567890");
	   
	  
	  
	  
	   
	   
		
		
	}

}
