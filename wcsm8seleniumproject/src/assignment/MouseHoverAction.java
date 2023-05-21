package assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHoverAction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
       System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://www.bluestone.com/");
		
		
		driver.findElement(By.xpath("//span[text()='Not now']")).click();
		
		WebElement target = driver.findElement(By.xpath("//a[@title='Coins']"));
		
		Actions act = new Actions(driver);
		
		act.moveToElement(target).perform();
		
		//WebElement target1 = driver.findElement(By.xpath("//span[text()='1 gram']"));
		
		//act.moveToElement(target1).perform();
		
		driver.findElement(By.xpath("//span[text()='1 gram']")).click();
		
		WebElement gm = driver.findElement(By.xpath("//div[@class='mousetrap']/preceding-sibling::a"));
		
		if(gm.isDisplayed())
		{
			System.out.println("Page is displayed");
		}
		else
		{
			System.out.println("It is not displayed");
		}
		

	}

}
