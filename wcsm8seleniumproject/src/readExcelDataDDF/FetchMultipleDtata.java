package readExcelDataDDF;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FetchMultipleDtata {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		// TODO Auto-generated method stub
		
		FileInputStream fis = new FileInputStream("./datafiles/TestData.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
	    Sheet sh = wb.getSheet("Sheet1");
		int lr = sh.getLastRowNum();
		
		for(int i=1; i<=lr; i++)//row
		{
		  for(int j=0; j<=1; j++)//cell
		  {
			FileInputStream fis2 = new FileInputStream("./datafiles/TestData.xlsx");
			Workbook wb2 = new WorkbookFactory().create(fis2);
			Sheet sh2 = wb2.getSheet("Sheet1");
			Row row = sh2.getRow(i);
			Cell cell = row.getCell(j);
			String data = cell.getStringCellValue();
			Thread.sleep(2000);
			System.out.println(data);
		  }

	   }
	}
	

}
