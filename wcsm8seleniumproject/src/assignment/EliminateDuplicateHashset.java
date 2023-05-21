package assignment;

import java.time.Duration;
import java.util.HashSet;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EliminateDuplicateHashset {

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
		
		HashSet<String> h1 = new HashSet<String>();
		
		for(int i=0; i<alloptions.size();i++)
		{
			String values = alloptions.get(i).getText();
			
			h1.add(values);
		}
		
		for(String options:h1)
		{
			Thread.sleep(2000);
			System.out.println(options);
		}
		

	}

}
