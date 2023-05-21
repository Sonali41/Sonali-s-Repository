package readExcelDataDDF;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FetchDataFromExcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException{
		
		FileInputStream fis = new FileInputStream("./datafiles/TestData.xlsx");//provide the path of excel sheet
		
		Workbook wb = WorkbookFactory.create(fis);//make the file ready for read
		
		Sheet sheet = wb.getSheet("Sheet1");//get into the sheet
		
		Row row = sheet.getRow(2);//get into the desired row
		
		Cell cell = row.getCell(1);//get into the desired cell/col
		
		String data = cell.getStringCellValue();//read the value from cell
		
		System.out.println(data);

	}

}
