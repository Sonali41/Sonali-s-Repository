package pageObjectModel;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;

public class InvalidLoginPage extends BaseTest {

	public static void main(String[] args) throws IOException, EncryptedDocumentException, InterruptedException {
		
		BaseTest bt = new BaseTest();
		bt.setUp();
		
		Flib flib = new Flib();
		
		LoginPage lp = new LoginPage(driver);
		
		int rc = flib.rowCount(EXCEL_PATH, "InvalidData");
		for(int i=1; i<=rc; i++)
		{
		lp.invalidLogin(flib.readExcelData(EXCEL_PATH, "InvalidData", i, 0), flib.readExcelData(EXCEL_PATH, "InvalidData", i, 1));
		}
		
		bt.tearDown();
	}

}
