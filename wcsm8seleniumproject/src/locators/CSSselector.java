package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class CSSselector {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		ChromeOptions co = new ChromeOptions();
        co.addArguments("--remote-allow-origins=*");
        
        WebDriver driver=new ChromeDriver(co);
        driver.get("https://www.instagram.com/");
        
        driver.manage().window().maximize();
        Thread.sleep(2000);
        
        driver.findElement(By.name("username")).sendKeys("admin");
        Thread.sleep(2000);
        
        driver.findElement(By.name("password")).sendKeys("12345678");
        Thread.sleep(2000);
        
        driver.findElement(By.cssSelector("button[class^='_acan _acap _acas _aj1-']")).click();
        
      //To match Starting characters using ^ symbol
        //driver.findElement(By.cssSelector("button[class^='_acan _acap']")).click();
        
      //To match Ending characters using $ symbol
        //driver.findElement(By.cssSelector("button[class$='p _acas _aj1-']")).click();
        
      //To match In-between characters using * symbol
        //driver.findElement(By.cssSelector("button[class*='p']")).click();
        
       
        
	}

}
