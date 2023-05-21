package assignment;

import java.time.Duration;
import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EliminateDuplicateTreeset {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("file:///C:/Users/VOZON/Documents/html/singledropdown.html");
		WebElement dropdown = driver.findElement(By.name("n1"));
		
		//to handle dropdown create object of select class
		Select sel = new Select(dropdown);
		
		//to get all the options from dropdown
		List<WebElement> alloptions = sel.getOptions();
		
		//to eliminate the duplicates and maintain insertion order
		TreeSet<String> t1 = new TreeSet<String>();
		
		//To read the list by eliminating duplicates...
		for(int i=0; i<alloptions.size();i++)
		{
			//get the options and text of options
			String op = alloptions.get(i).getText();
			
			//add the text of options to treeset
		    t1.add(op);		
		}
		
		//to read options from set
		for(String options:t1)
		{
			Thread.sleep(2000);
			System.out.println(options);
		}
	}

}
