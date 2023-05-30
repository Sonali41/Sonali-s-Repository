package assertions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ActitimeDataProvider {
  
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
	
	@DataProvider(name="testActiTime")
	public Object[][] dataprovider()//[][]2D array
	{
		Object[][] dataprovider = new Object[5][2];
		
		dataprovider[0][0]="adm5in";
		dataprovider[1][0]="m4anager";
		
		dataprovider[1][0]="admin123";
		dataprovider[1][1]="manager123";
		
		dataprovider[2][0]="ad@min";
		dataprovider[2][1]="man@ager";
		
		dataprovider[4][0]="a_dmin";
		dataprovider[4][1]="man_ager";
		
		return dataprovider;
		
	}
	
	@Test(dataProvider = "testActiTime")
	public void loginValid(String usn, String pass) throws InterruptedException
	{
		driver.findElement(By.name("username")).sendKeys(usn);
		Thread.sleep(2000);
		driver.findElement(By.name("pwd")).sendKeys(pass);
		driver.findElement(By.id("loginButton")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("username")).clear();
	}
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
	
}
