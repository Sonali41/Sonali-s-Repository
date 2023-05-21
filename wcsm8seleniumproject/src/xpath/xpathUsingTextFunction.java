package xpath;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class xpathUsingTextFunction {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		co.addArguments("--disable-notifications");
		
	    WebDriver driver=new ChromeDriver(co);
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	    
	    driver.get("https://in.puma.com/in/en");
	    Thread.sleep(2000);
	    
	    driver.findElement(By.xpath("//span[text()='Women']")).click();
	    
	    Thread.sleep(2000);
	    
	   // driver.findElement(By.xpath("//*[@id=\"product-list-items\"]/li[2]/a/div/div[1]/div/div[1]/img")).click();
	    driver.findElement(By.xpath("//span[text()='Puma White-Ebony']")).click();
	    
	    Thread.sleep(2000);
	    
	    driver.findElement(By.xpath("//main[@id='puma-skip-here']")).click();
	    
	    
    }

}
