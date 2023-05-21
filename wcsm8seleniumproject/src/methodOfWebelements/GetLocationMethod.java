package methodOfWebelements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetLocationMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	    
	    driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	    
	    WebElement button = driver.findElement(By.xpath("//button[text()=' Login ']"));
	    
	    Point loc = button.getLocation();
	    
	    int xAxis = loc.getX();
	    int yAxis = loc.getY();
	    System.out.println("xaxis :" + xAxis + "  and  "+ "yaxis :" + yAxis);

	}

}
