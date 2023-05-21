package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LinkTextLocator {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.firefox.driver", "./drivers/geckodriver.exe");
		
		WebDriver driver=new FirefoxDriver();
	    driver.get("file:///C:/Users/VOZON/Documents/html/flipkartlogin.html");
	    
	    driver.manage().window().maximize();
	    Thread.sleep(2000);
	    driver.findElement(By.linkText("FlipkartLink")).click();

	}

}
