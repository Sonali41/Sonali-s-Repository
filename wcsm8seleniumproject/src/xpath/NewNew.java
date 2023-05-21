package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class NewNew {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		co.addArguments("--disable-notifications");
		
	   WebDriver driver=new ChromeDriver(co);
	   driver.manage().window().maximize();
	   
	   driver.get("https://www.airasia.co.in/home");
	   
	   driver.findElement(By.xpath("//div[.='BLR']")).click();
	   Thread.sleep(5000);
	   driver.findElement(By.xpath("//div[contains(text(),'Fly to')]")).click();
	   Thread.sleep(5000);
	   //driver.findElement(By.xpath("//div[contains(text(),'Fly to')]")).sendKeys("Kolkata");
	   //driver.findElement(By.xpath("//*[@id=\"flight-search-widget-super-div\"]/div/div[1]/div[2]/div/div/div[1]/div")).click();
	   //driver.findElement(By.id("basic-url")).click();
	   
	   
	   //span[text()='PUMA.com']/ancestor::a/following-sibling::button/descendant::span[text()='Menu']
	   //---->to traverse from puma tag to menu bar by using xpath using axes

	}

}
