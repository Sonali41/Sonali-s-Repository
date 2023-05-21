package pageObjectModel;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Stale {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	    driver.get("http://127.0.0.1:8/login.do;jsessionid=x4dgwdnqfijf");
	    
//	    WebElement un = driver.findElement(By.name("username"));
//	    un.sendKeys("admin");
//	    WebElement pw = driver.findElement(By.name("pwd"));
//	    pw.sendKeys("manage");
//	    WebElement button = driver.findElement(By.id("loginButton"));
//	    button.click();
//	    Thread.sleep(2000);
//	    un.clear();
//	    un.sendKeys("admin");
//	    
	    
	    WebElement un = driver.findElement(By.name("username"));
	    un.sendKeys("admin");
	    WebElement pw = driver.findElement(By.name("pwd"));
	    pw.sendKeys("manager");
	    driver.navigate().refresh();
	    WebElement button = driver.findElement(By.id("loginButton"));
	    button.click();
	    Thread.sleep(2000);
	    un.clear();	    
	    //we can refresh the page by using navigate().refresh() and comment below clear method
	    //we can change pw and use clear method

	}

}
