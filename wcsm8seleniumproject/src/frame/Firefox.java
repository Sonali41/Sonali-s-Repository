package frame;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import keywordDrivenPackage.IAutoConstant;

public class Firefox implements IAutoConstant {
  @Test
  public void firefox() {
	  
	  //System.setProperty(EDGE_KEY, EDGE_PATH);
	  
	  WebDriver driver=new EdgeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	  
	  driver.get("https://www.selenium.dev/");
	
	  
	 
	  
  }
}
