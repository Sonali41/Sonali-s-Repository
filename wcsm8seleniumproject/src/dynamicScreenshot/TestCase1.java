package dynamicScreenshot;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import testNG.CustomListners;
@Listeners(CustomListners.class)
public class TestCase1 extends BaseTest {
	
	//failed method is listened by listeners annotation
@Test
  public void login() 
  {
	  driver.findElement(By.name("username")).sendKeys("admin");
	  driver.findElement(By.name("pwd")).sendKeys("manager");
	  Assert.fail();
	  driver.findElement(By.id("loginButton")).click();
  }
}
