package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AirIndiaLoginPage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		
		WebDriver driver=new ChromeDriver(co);
		driver.manage().window().maximize();
		
	    driver.get("https://www.airindia.in/");
	    
	    driver.findElement(By.name("from")).sendKeys("Pune");
	    
	    driver.findElement(By.xpath("//a[text()='Pune, Lohegaon Airport, PNQ, India, IN']")).click();
	    
	    driver.findElement(By.name("to")).sendKeys("Singapore");
	    
	    driver.findElement(By.id("ui-id-601")).click();
		
		

	}

}
