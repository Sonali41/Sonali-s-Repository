package dataDrivenPackage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Flib {
	
	public String readExcelData(String excelpath, String sheetname, int rownum, int cellnum) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis = new FileInputStream(excelpath);
	    Workbook wb = WorkbookFactory.create(fis);
	    Sheet sheet = wb.getSheet(sheetname);
	    Row row = sheet.getRow(rownum);
	    Cell cell = row.getCell(cellnum);
	    String data = cell.getStringCellValue();
	    return data;
	}
	
	
	public int rowCount(String excelpath, String sheetname) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis = new FileInputStream(excelpath);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sheet = wb.getSheet(sheetname);
		int lrn = sheet.getLastRowNum();
		return lrn;
	}
	
	public void writeExcelData(String excelpath, String sheetname, int rownum, int cellnum, String cellvalue) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis = new FileInputStream(excelpath);
	    Workbook wb = WorkbookFactory.create(fis);
	    Sheet sheet = wb.getSheet(sheetname);
	    Row row = sheet.getRow(rownum);
	    Cell cell = row.createCell(cellnum);
	    cell.setCellValue(cellvalue);
	    FileOutputStream fos = new FileOutputStream(excelpath); 
	    wb.write(fos);
	}
	

}
