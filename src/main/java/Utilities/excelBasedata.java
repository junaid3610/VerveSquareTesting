package Utilities;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class excelBasedata {
	
	@DataProvider(name="Rediff")
	public Object[][] getRediffExcelData() throws IOException {
		Object[][] data = excelBasedata.readFromExcelRediffData("Login");
		return data;
	}
	
	
	//Step 1 :-  create a method and pass a string sheetName parameter	
	public static FileInputStream ip;
	public static XSSFWorkbook workbook;
	public static XSSFSheet sheet;	
	
	public static Object[][] readFromExcelRediffData(String sheetname) throws IOException {				
	// Step 2 :- create the object of fileinputstream		
		ip = new FileInputStream(System.getProperty("user.dir") + "\\src\\test\\java\\ExcelDataForMultiple\\Rediff Data.xlsx");	
	// step 3 :- create object of XSSFWorkbook	
		workbook = new XSSFWorkbook(ip);
	// step 4 :- use the workbook the workbook reference to call getsheet(overloaded method)
		sheet = workbook.getSheet(sheetname); // getsheet method return XSSFsheet	
	// once you get the sheet,now you need number  of rows,and number of columns 
		int rows = sheet.getLastRowNum();
		int cols = sheet.getRow(0).getLastCellNum();	
	// step 6 :- create a 2 dimensional object array		
		Object[][] data = new Object[rows][cols];		
				// iterate on row
		for(int i =0;i<rows;i++) {
			XSSFRow row = sheet.getRow(i+1);		
				// iterate on columns
		for(int j=0; j<cols ;j++) {
			XSSFCell cell = row.getCell(j);			
		// step 7 :- determine the cell datatype				
			CellType cellType = cell.getCellType();			
			switch (cellType) {
			case STRING :
				data[i][j] = cell.getStringCellValue();
				break;				
			case NUMERIC :	
				data[i][j] = Integer.toString((int)cell.getNumericCellValue());
				break;		
			case BOOLEAN :
				data[i][j] = cell.getBooleanCellValue();
				break;									
		  }		
		 }		
		}
		return data;
		}
	
	
	
}
