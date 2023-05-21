package assignment;

import java.time.Duration;
import java.util.LinkedHashSet;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EliminateDuplicateLinkHashSet {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("file:///C:/Users/VOZON/Documents/html/multiselectdropdown.html");
		
		WebElement dropdown = driver.findElement(By.name("menu"));
		
		Select sel = new Select(dropdown);
		
		List<WebElement> alloptions = sel.getOptions();
		
		LinkedHashSet<String> l1 = new LinkedHashSet<String>();
		
		for(int i=0; i<alloptions.size();i++)

		{
			String value = alloptions.get(i).getText();
			
			l1.add(value);
		}
		
		for(String options:l1)
		{
			Thread.sleep(2000);
			System.out.println(options);
		}

	}

}
