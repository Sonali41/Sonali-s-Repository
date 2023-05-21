package selectMethod;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetOptionsMulti {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("file:///C:/Users/VOZON/Documents/html/multiselectdropdown.html");
		
		WebElement dropdown = driver.findElement(By.name("menu"));
		
		Select sel = new Select(dropdown);
		List<WebElement> verify = sel.getOptions();
		
		//BY USING FOR LOOP
		
      for(int i=0;i<verify.size();i++)
   	{
			String option = verify.get(i).getText();
			System.out.println(option);
    }
		
		
		//BY USING FOR EACH LOOP
		//for(WebElement v:verify)
		//{
			//String text = v.getText();
			//System.out.println(text);
		//}

}
}
