package selectMethod;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetFirstSelectedOptionMethod {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("file:///C:/Users/VOZON/Documents/html/multiselectdropdown.html");
		
		WebElement dropdown = driver.findElement(By.name("menu"));
		
		Select sel = new Select(dropdown);
		
		 for(int i=3; i<7; i++)
		 {
			 Thread.sleep(2000);
			sel.selectByIndex(i); 
		 }
		 
		 Thread.sleep(2000);
		 WebElement option = sel.getFirstSelectedOption();
		 
		 String value = option.getText();
		 System.out.println(value);
		 

	}

}
