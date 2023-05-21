package dataDrivenPackage;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ValidLoginData {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("http://127.0.0.1:8/login.do;jsessionid=df8qae9027f84");
		
		Flib flib = new Flib();
		
		driver.findElement( By.name("username")).sendKeys(flib.readExcelData("./datafiles/ActiTimeTestData.xlsx", "ValidData", 1, 0));
		Thread.sleep(2000);
		driver.findElement(By.name("pwd")).sendKeys(flib.readExcelData("./datafiles/ActiTimeTestData.xlsx", "ValidData", 1, 1));
		Thread.sleep(2000);
		driver.findElement(By.id("loginButton")).click();
		Thread.sleep(2000);
		driver.quit();
		
		

	}

}
