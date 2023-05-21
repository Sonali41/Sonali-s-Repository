package javaScripExecutorInterface;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class ScrollTillPArticularWebelement {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
ChromeOptions co = new ChromeOptions();
co.addArguments("--disable-notifications");
		
		WebDriver driver=new ChromeDriver(co);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://in.puma.com/in/en/mens");
		Thread.sleep(2000);
		
		WebElement shoes = driver.findElement(By.xpath("//h3[text()='PUMAx1DER Backcourt Mid Unisex Sneakers']/descendant::span[text()='PUMA White-PUMA Black-Royal Sapphire']"));
	    Point point = shoes.getLocation();
	    int xaxis = point.getX();
	    int yaxis = point.getY();
	    Thread.sleep(2000);
	    
	    JavascriptExecutor jse = (JavascriptExecutor)driver;
	    jse.executeScript("window.scrollBy("+xaxis+","+yaxis+")");
	    Thread.sleep(2000);
	    
	    Actions act = new Actions(driver);
	    act.doubleClick(shoes);

	}

}
