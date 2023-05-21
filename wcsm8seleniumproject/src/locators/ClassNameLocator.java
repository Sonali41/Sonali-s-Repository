package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ClassNameLocator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		
		WebDriver driver=new ChromeDriver(co);
	    driver.manage().window().maximize();
	    
	    driver.get("https://www.google.com");
	    
	    driver.switchTo().activeElement().sendKeys("Chandler Bing",Keys.ENTER);
	    
	    driver.findElement(By.className("lNPNe")).click();


	}

}
