package synchronization;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class StaticWait {
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.edge.driver", "./drivers/msedgedriver.exe");
		
		EdgeOptions eo = new EdgeOptions();
		eo.addArguments("--remote-allow-origins=*");
		
		WebDriver driver=new EdgeDriver(eo);
		driver.manage().window().maximize();
		
		driver.get("https://www.instagram.com/");
		Thread.sleep(2000);//completely stops the execution for that much time
		//and it is completely java based method/ multithreading/ not advisable for scripts
		
		driver.findElement(By.name("username")).sendKeys("jkdsdsfkhdkf");
			
		driver.findElement(By.name("password")).sendKeys("12345678");
		
		driver.findElement(By.xpath("//button[@class='_acan _acap _acas _aj1-']")).click();


}
}
