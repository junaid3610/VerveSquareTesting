package AutomationRegistrationForm;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;



public class ExcelDataCode {
	
	
	@DataProvider(name="Ragistration")
	public Object[][] getRediffExcelData() throws IOException {
		Object[][] data = ExcelDataCode.ReadRegistrationForm("RegistrationForm");
		return data;
	}
	
	
	public static FileInputStream ip;
	public static XSSFWorkbook workbook;
	public static XSSFSheet sheet;	
	
	public static Object[][] ReadRegistrationForm(String sheetname) throws IOException {				
	
		ip = new FileInputStream(System.getProperty("C:\\Users\\admin\\eclipse-workspace\\VerveSquareTesting1\\src\\test\\java\\AutomationRegistrationForm\\Rediff Data.xlsx"));	
	
		workbook = new XSSFWorkbook(ip);
	
		sheet = workbook.getSheet("RegistrationForm"); 
	 
		int rows = sheet.getLastRowNum();
		int cols = sheet.getRow(0).getLastCellNum();	
		
		Object[][] data = new Object[rows][cols];		
				// iterate on row
		for(int i =0;i<rows;i++) {
			XSSFRow row = sheet.getRow(i+1);		
				// iterate on columns
		for(int j=0; j<cols ;j++) {
			XSSFCell cell = row.getCell(j);			
						
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
