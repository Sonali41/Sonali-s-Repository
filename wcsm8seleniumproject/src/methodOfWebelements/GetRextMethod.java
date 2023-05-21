package methodOfWebelements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetRextMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	    
	    driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	    
	    WebElement button = driver.findElement(By.xpath("//button[text()=' Login ']"));
	    
	    Rectangle rect = button.getRect();
	    
	    int x = rect.getX();
	    int y = rect.getY();
	    int h = rect.getHeight();
	    int w = rect.getWidth();
	    
	    System.out.println("xAxis:"+x+" and "+"yAxis:"+y);
	    System.out.println("Height:"+h+" and "+"Width:"+w);
	    


	}

}
