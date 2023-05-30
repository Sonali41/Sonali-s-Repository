package assertions;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Assertion1 {
	
	static WebDriver driver;
  
	@BeforeTest
  public void property() 
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
  }
	
	@BeforeMethod
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://127.0.0.1:8/login.do;jsessionid=x4dgwdnqfijf");
		
	}
	
	@Test
	public void login()	
	{
		String actualTitle = driver.getTitle();
		//Apply soft assert
		SoftAssert sa = new SoftAssert();
		sa.assertEquals(actualTitle, "IDon'tKnow");
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		WebElement loginButton = driver.findElement(By.id("loginButton"));
		
//		if(loginButton.isDisplayed())
//		{
//			loginButton.click();
//		}
		
		//apply hard assert
		if(loginButton.isDisplayed())
		{
			Assert.assertEquals(true, true);
			loginButton.click();
		}
		else
		{
			Reporter.log("Exception!", true);
		}
		
		String actualHomepageTitle = driver.getTitle();
		Assert.assertEquals(actualHomepageTitle, "actiTIME - Enter Time-Track");
		driver.findElement(By.linkText("Logout")).click();
		sa.assertAll();
		
	}
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
}
