package methodOfWebelements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsDisplayedMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	    
	    driver.get("https://www.netflix.com/in/Login");
	    
	    WebElement usn = driver.findElement(By.name("userLoginId"));
	    
	    WebElement pwd = driver.findElement(By.name("password"));
	    
	    WebElement button = driver.findElement(By.xpath("//button[text()='Sign In']"));
	    
	    if(usn.isDisplayed())
	    {
	    	usn.sendKeys("abc@gmail.com");
	    }
	    else
	    {
	    	System.out.println("Will get exception");
	    }
	    if(pwd.isDisplayed())
	    {
	    	pwd.sendKeys("1234");
	    }
	    else
	    {
	    	System.out.println("Will get exception");
	    	
	    }
	    if(button.isDisplayed())
	    {
	    	button.click();
	    }
	    else
	    {
	    	System.out.println("Will get exception");
	    }
	    


	}

}
