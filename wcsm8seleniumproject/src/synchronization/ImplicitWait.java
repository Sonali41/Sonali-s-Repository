package synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class ImplicitWait {
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.edge.driver", "./drivers/msedgedriver.exe");
		
		EdgeOptions eo = new EdgeOptions();
		eo.addArguments("--remote-allow-origins=*");
		
		WebDriver driver=new EdgeDriver(eo);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		//by using implicitly wait/dynamic wait
		
		driver.get("https://www.instagram.com/");
		
		driver.findElement(By.name("username")).sendKeys("jkdsdsfkhdkf");
			
		driver.findElement(By.name("password")).sendKeys("12345678");
		
		driver.findElement(By.xpath("//button[@class='_acan _acap _acas _aj1-']")).click();
		
		//if we try to do it with incomplete path then execution will stop for that much time to show exception also.


}
}
