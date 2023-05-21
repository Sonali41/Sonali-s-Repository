package qsp;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LaunchChromeBrowser {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		//to avoid IllegalStateException
		
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		//to avoid ConnectionFailedException
		
		ChromeDriver driver = new ChromeDriver(co);
		driver.manage().window().maximize();
		//to maximize chrome window
		Thread.sleep(2000);
		//stop the execution of script for 2secs
		driver.close();
		//to close the chrome browser
		

	}

}
