package selectMethod;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetAllSelectedOption {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
        System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("file:///C:/Users/VOZON/Documents/html/multiselectdropdown.html");
		
		WebElement dropdown = driver.findElement(By.name("menu"));
		
		Select sel = new Select(dropdown);
		
		for(int i=0;i<=7;i++)
		{
			sel.selectByIndex(i);
			Thread.sleep(2000);
		}

		List<WebElement> option = sel.getAllSelectedOptions();
		
		for(WebElement o:option)
		{
			String text = o.getText();
			System.out.println(text);
		}
	}

}
