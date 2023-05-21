package readExcelDataDDF;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FecthForActiTime {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("http://127.0.0.1:8/login.do;jsessionid=16cr2vgpiba8f");
		
		FileInputStream fis = new FileInputStream("./datafiles/ActiTimeTestData.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh1 = wb.getSheet("ValidData");
		Row r1 = sh1.getRow(1);
		Cell c1 = r1.getCell(0);
		String validusername = c1.getStringCellValue();
		
		FileInputStream fis2 = new FileInputStream("./datafiles/ActiTimeTestData.xlsx");
		Workbook wb2 = WorkbookFactory.create(fis2);
		Sheet sh2 = wb2.getSheet("ValidData");
		Row r2 = sh2.getRow(1);
		Cell c2 = r2.getCell(1);
	    String validpassword = c2.getStringCellValue();
	    
	    Thread.sleep(2000);
	    driver.findElement(By.name("username")).sendKeys(validusername);
	    Thread.sleep(2000);
	    driver.findElement(By.name("pwd")).sendKeys(validpassword);
	    Thread.sleep(2000);
	    driver.findElement(By.id("loginButton")).click();
		

	}

}
