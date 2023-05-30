package dataDrivenPackage;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class readData {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub
		
		FileInputStream fis = new FileInputStream("./datafiles/TestData.xlsx");//excelpath
        Workbook wb = WorkbookFactory.create(fis);//ready to read
        Sheet sh = wb.getSheet("Sheet1");
        Row rw = sh.getRow(0);
        Cell cell = rw.getCell(0);
        String data = cell.getStringCellValue();
        System.out.println(data);
        
        
	}

}
