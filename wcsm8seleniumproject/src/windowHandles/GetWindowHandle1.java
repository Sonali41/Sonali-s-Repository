package windowHandles;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetWindowHandle1 {

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
		Thread.sleep(2000);
		
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy("+xaxis+","+yaxis+")");//(yaxis-250)//to reduce pixels
		link.click();
		
		//Handle or Address of current window or parent window
		String parentHandle = driver.getWindowHandle();
		System.out.println("Handle of Parent Window : "+parentHandle);
		
		

	}

}
