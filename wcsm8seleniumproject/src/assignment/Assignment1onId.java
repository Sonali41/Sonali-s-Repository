package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Assignment1onId {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		
		WebDriver driver=new ChromeDriver(co);
		
		driver.manage().window().maximize();
		
		driver.get("https://www.netflix.com/in/login");
		
		Thread.sleep(2000);
	    driver.findElement(By.id("id_userLoginId")).sendKeys("abcd@123");
		Thread.sleep(2000);
		driver.findElement(By.id("id_password")).sendKeys("ABCD@123");
		

	}

}
