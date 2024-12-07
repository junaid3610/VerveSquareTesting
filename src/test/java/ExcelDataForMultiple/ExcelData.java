package ExcelDataForMultiple;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class ExcelData {
	
	// Step 1 :- create excel sheet which has data
	// step 2 :- copy the excel sheet into your eclipse
	// Step 3 :- if you edit the excel sheet in local it will not make no difference to the excel sheet
	// which is copied here. so delete the excel sheet from eclipse and copy and paste the updated excel sheet here.
	
	// Step 8 :- creating data provider
	
	@DataProvider(name="Rediff")
	public Object[][] getRediffExcelData() throws IOException {
		Object[][] data = ExcelData.readFromExcelRediffData("Login");
		return data;
	
	}
	
	
	
	//Step 1 :-  create a method and pass a string sheetName parameter
	
	public static FileInputStream ip;
	public static XSSFWorkbook workbook;
	public static XSSFSheet sheet;
	
	
	public static Object[][] readFromExcelRediffData(String sheetname) throws IOException {		
		
	// Step 2 :- create the object of filinputstreame
		
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
