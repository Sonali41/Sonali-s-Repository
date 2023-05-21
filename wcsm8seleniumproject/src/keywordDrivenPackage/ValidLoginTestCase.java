package keywordDrivenPackage;

import java.io.IOException;

import org.openqa.selenium.By;

public class ValidLoginTestCase extends BaseTest {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		//To open the browser create object of BaseTest
		BaseTest bt = new BaseTest();
		Flib flib = new Flib();
		bt.openBrowser();
	    Thread.sleep(2000);
	    driver.findElement(By.name("username")).sendKeys(flib.readPropertyData(PROP_PATH, "username"));
	    Thread.sleep(2000);
	    driver.findElement(By.name("pwd")).sendKeys(flib.readPropertyData(PROP_PATH, "password"));
	    Thread.sleep(2000);
	    driver.findElement(By.id("loginButton")).click();
	    Thread.sleep(2000);
	    driver.quit();

	}

}
