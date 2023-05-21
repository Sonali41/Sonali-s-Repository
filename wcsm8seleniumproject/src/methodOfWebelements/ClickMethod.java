package methodOfWebelements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickMethod {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
        System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
	    WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
	    
	    driver.get("http://sonali41:8/login.do");
	    
	    driver.findElement(By.id("username")).sendKeys("manager123");
	    
	    driver.findElement(By.id("pwd")).sendKeys("12");
	    Thread.sleep(2000);
	    
	    driver.findElement(By.id("loginButton")).click();
	    

	}

}
