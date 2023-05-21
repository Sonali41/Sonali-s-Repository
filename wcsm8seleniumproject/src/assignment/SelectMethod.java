package assignment;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectMethod {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("file:///C:/Users/VOZON/Documents/html/singledropdown.html");
		WebElement dropdown = driver.findElement(By.name("n1"));
		Select sel = new Select(dropdown);
		
		List<WebElement> alloptions = sel.getOptions();
		
		for(WebElement op:alloptions)
		{
			if(op.getText().equals("Vadapav"))
			{
				Thread.sleep(2000);
				op.click();
			}
		}


	}

}
