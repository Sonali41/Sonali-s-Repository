package methodOfWebelements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendKeysMethod {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
	    WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	    
	    driver.get("http://sonali41:8/login.do");
	//Method Chaining
	    
	   //driver.findElement(By.name("username")).sendKeys("manager123");
	    
	   //driver.findElement(By.name("pwd")).sendKeys("12");
	    
   //Store in reference variable
	    
	   WebElement usn = driver.findElement(By.name("username"));
	   
	   WebElement pw = driver.findElement(By.name("pwd"));
	   
	   usn.sendKeys("admin");
	   
	   pw.sendKeys("manager");
	   Thread.sleep(2000);
	   
	   driver.navigate().refresh();
	   
	   usn.sendKeys("manager123");
	   
	   pw.sendKeys("12");
	   

	}

}
