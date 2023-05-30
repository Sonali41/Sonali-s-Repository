package testNgAnnotation;

import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class TestCase extends BaseTest {
  @Test(description = "Search for Java!")
  public void Search1() 
  {
	  driver.switchTo().activeElement().sendKeys("Java", Keys.ENTER);
  }
  
  @Test(description = "Search for SQL!")
  public void Search2() 
  {
	  driver.switchTo().activeElement().sendKeys("Sql", Keys.ENTER);
  }
  
  @Test(description = "Search for Selenium!")
  public void Search3() 
  {
	  driver.switchTo().activeElement().sendKeys("Selenium", Keys.ENTER);
  }

  
  
}
