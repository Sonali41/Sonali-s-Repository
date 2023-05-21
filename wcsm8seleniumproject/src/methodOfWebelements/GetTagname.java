package methodOfWebelements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class GetTagname {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	    
	    driver.get("https://www.selenium.dev/");
	    
	    WebElement button = driver.findElement(By.xpath("//h2[text()='News']"));
	    
	    String name = button.getTagName();
	    System.out.println(name);

	}

}
