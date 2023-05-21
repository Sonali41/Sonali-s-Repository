package dataDrivenPackage;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class InvalidLoginData {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	    
	    driver.get("http://127.0.0.1:8/login.do;jsessionid=df8qae9027f84");
	    
	    Flib flib = new Flib();
	    int rc = flib.rowCount("./datafiles/ActiTimeTestData.xlsx", "InvalidData");
	    for(int i=1; i<=rc; i++)
	    {
	    	
	    	String getusername = flib.readExcelData("./datafiles/ActiTimeTestData.xlsx", "InvalidData", i, 0);
	    	String getpassword = flib.readExcelData("./datafiles/ActiTimeTestData.xlsx", "InvalidData", i, 1);
	    	driver.findElement(By.name("username")).sendKeys(getusername);
	        driver.findElement(By.name("pwd")).sendKeys(getpassword);
	        driver.findElement(By.id("loginButton")).click();
	        
	        Thread.sleep(2000);
	        driver.findElement(By.name("username")).clear();
	        //driver.findElement(By.name("pwd")).clear();
	    }

	}

}
