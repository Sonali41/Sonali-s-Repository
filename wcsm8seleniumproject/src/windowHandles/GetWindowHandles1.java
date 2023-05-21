package windowHandles;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetWindowHandles1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://omayo.blogspot.com/s");
		
		WebElement link = driver.findElement(By.linkText("Open a popup window"));
		
		Point point = link.getLocation();
		
		int xaxis = point.getX();
		int yaxis = point.getY();
		
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy("+xaxis+","+yaxis+")");//(yaxis-250)//to reduce pixels
		Thread.sleep(2000);
		link.click();
		
		Set<String> allwindows = driver.getWindowHandles();
		for(String handle:allwindows)
		{
			System.out.println("Address for Parent and Child Window : "+ handle);
		}
		

	}

}
