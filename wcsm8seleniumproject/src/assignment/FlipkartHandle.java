package assignment;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class FlipkartHandle {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		
		driver.findElement(By.name("q")).sendKeys("Samsung S23 ultra");
		
		driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
		
		String ph = driver.getWindowHandle();
		
		driver.findElement(By.xpath("(//div[@class='MIXNux'])[3]")).click();
		Thread.sleep(2000);
		
		Set<String> gwh = driver.getWindowHandles();
		
		for(String window:gwh)
		{
			if(!ph.equals(window))
			{
				//Transferring the control to child window
				driver.switchTo().window(window);
			}
			else
			{
				
			}
		}
		
		String actualtitle = driver.getTitle();
	    
    	if(actualtitle.equals("SAMSUNG Galaxy S23 Ultra 5G ( 512 GB Storage, 12 GB RAM ) Online at Best Price On Flipkart.com"))
	    {
	    	System.out.println("It's Child Window");
	    }	
	    else
	    {
	    	System.out.println("It's Parent Window");
	    }
    	
    	Thread.sleep(2000);
//    	WebElement scroll = driver.findElement(By.xpath("//span[text()='View Details']"));
//   	
//    	Point loc = scroll.getLocation();
//    	int xaxis = loc.getX();
//        int yaxis = loc.getY();
//    	Thread.sleep(2000);
//   	
//    	JavascriptExecutor jse = (JavascriptExecutor)driver;
//    	jse.executeScript("window.scrollBy("+xaxis+","+yaxis+")");
//      Thread.sleep(2000);
//    	
//    	WebElement color = driver.findElement(By.xpath("//div[@class='_2C41yO']/ancestor::li[@id='swatch-1-color']"));
//    	Point loc1 = color.getLocation();
//    	int p1 = loc1.getX();
//    	int p2 = loc1.getY();
//      Thread.sleep(4000);
//   	jse.executeScript("window.scrollBy("+p1+","+p2+")");
//    	
//    	color.click();
//    	
    	driver.findElement(By.xpath("//div[@class='_2C41yO']/ancestor::li[@id='swatch-1-color']")).click();
    	//Thread.sleep(2000);
    	
    	driver.findElement(By.id("pincodeInputId")).sendKeys("413133");
    	
    	driver.findElement(By.xpath("//span[.='Check']")).click();
    	
    	driver.findElement(By.xpath("//button[@class='_2KpZ6l _2U9uOA _3v1-ww']")).click();
    //	Thread.sleep(2000);
    	
    	driver.findElement(By.xpath("//span[.='Cart']")).click();
    	
    	//Thread.sleep(4000);
    	WebElement remove = driver.findElement(By.xpath("//div[text()='Remove']"));
    	Point loc = remove.getLocation();
     	int xaxis = loc.getX();
        int yaxis = loc.getY();
    	Thread.sleep(2000);
  	
   	    JavascriptExecutor jse = (JavascriptExecutor)driver;
    	jse.executeScript("window.scrollBy("+xaxis+","+yaxis+")");
        Thread.sleep(2000);
        remove.click();
        
        driver.findElement(By.xpath("//div[text()='Remove']")).click();
    	
    	

	}

}

