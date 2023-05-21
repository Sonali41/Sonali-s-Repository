package qsp;

import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchFirefoxBrowser {

	public static void main(String[] args) throws InterruptedException {
  		// TODO Auto-generated method stub
    System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
		
	FirefoxDriver driver = new FirefoxDriver();
    Thread.sleep(2);
    //stop the execution of script for 2secs
    driver.close();
	}

}
