package keywordDrivenPackage;

import java.io.IOException;

import org.openqa.selenium.By;

public class InvalidLoginTestCase extends BaseTest{

	public static void main(String[] args) throws IOException, InterruptedException {
		
		BaseTest bt = new BaseTest();
		bt.openBrowser();
		
		Flib flib = new Flib();
		int rc = flib.rowCount(EXCEL_PATH, "InvalidData");
		
		for(int i=1; i<=rc; i++)
		{
		String invalidun = flib.readExcelData(EXCEL_PATH, "InvalidData", i, 0);
		String invalidpw = flib.readExcelData(EXCEL_PATH, "InvalidData", i, 1);
		
		driver.findElement(By.name("username")).sendKeys(invalidun);
		driver.findElement(By.name("pwd")).sendKeys(invalidpw);
		driver.findElement(By.id("loginButton")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.name("username")).clear();
		}
		
		bt.closeBrowser();
		

	}

}
