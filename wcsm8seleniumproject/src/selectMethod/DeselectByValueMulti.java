package selectMethod;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DeselectByValueMulti {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("file:///C:/Users/VOZON/Documents/html/multiselectdropdown.html");
		
		WebElement dropdown = driver.findElement(By.name("menu"));
		Select sel = new Select(dropdown);
		Thread.sleep(2000);
		sel.selectByValue("v4");
		Thread.sleep(2000);
		sel.selectByValue("v6");
		Thread.sleep(2000);
		sel.selectByValue("v1");
		Thread.sleep(2000);
		sel.deselectByValue("v1");
		Thread.sleep(2000);
		sel.deselectByValue("v6");
		Thread.sleep(2000);
		sel.deselectByValue("v4");

	}

}
