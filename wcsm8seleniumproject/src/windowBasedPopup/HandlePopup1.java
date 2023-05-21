package windowBasedPopup;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HandlePopup1 {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		
System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("http://127.0.0.1:8/login.do;jsessionid=52hdjsiamhvff");
		
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
		
		driver.findElement(By.xpath("//div[text()='Settings']/following-sibling::img")).click();
		driver.findElement(By.xpath("//a[text()='Logo & Color Scheme']")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("uploadNewLogoOption")).click();
		
		WebElement target = driver.findElement(By.name("formCustomInterfaceLogo.logo"));
		
		Actions act = new Actions(driver);
		act.doubleClick(target).perform();
		Thread.sleep(2000);
	
//		File fi = new File("./autoIT/Window1.exe");//relative path
//		String abp1 = fi.getAbsolutePath();//absolute path
		Runtime.getRuntime().exec("C:\\Users\\VOZON\\Documents\\Editor\\Window1.exe");//executable file 
		Thread.sleep(4000);
	    Runtime.getRuntime().exec("C:\\Users\\VOZON\\Documents\\Editor\\Window1.exe");//executable file 
		
		//Using getRuntime method double will cancel the window based popup without using quit method
		//By using quit method we can cancel it by using getRuntime method only for once
	
	   // driver.quit();
       
	}

}
