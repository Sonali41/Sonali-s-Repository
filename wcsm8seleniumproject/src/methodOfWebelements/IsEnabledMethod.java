package methodOfWebelements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsEnabledMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	    
	    driver.get("https://www.instagram.com/");
	    
	    WebElement button = driver.findElement(By.xpath("//button[@class='_acan _acao _acas _aj1-']"));
	    
	    boolean element = button.isEnabled();
	    System.out.println(element);
	    
	    driver.findElement(By.name("username")).sendKeys("abcdefgh");
	    driver.findElement(By.name("password")).sendKeys("12345678");
	    
	    boolean verify = button.isEnabled();
	    System.out.println(verify);
	    

	}

}
