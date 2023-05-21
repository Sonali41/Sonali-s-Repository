package javaScripExecutorInterface;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollDown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://www.instagram.com");
		
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		Thread.sleep(2000);
		
		jse.executeScript("window.scrollBy(0,350)");
		Thread.sleep(2000);
		
		jse.executeScript("window.scrollBy(0,-350)");
		
		//https://dashboards.handmadeinteractive.com/jasonlove/

	}

}
