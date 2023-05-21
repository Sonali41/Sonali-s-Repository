package webBasedPopup;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HanledaAlertPopup {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("file:///C:/Users/VOZON/Documents/html/AlertPopup.html");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//button[.='Click me!']")).click();
		
		
		//Method chaining
		//driver.switchTo().alert().accept();
		
		
		Alert ale = driver.switchTo().alert();
		
		//ale.accept();
		System.out.println(ale.getText());
		ale.dismiss();
		
		

	}

}
