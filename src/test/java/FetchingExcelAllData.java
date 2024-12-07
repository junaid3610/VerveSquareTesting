import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FetchingExcelAllData {

	public static void main(String[] args) throws Exception {
			//	to retrieve specific or single data	
		
//		FileInputStream file= new FileInputStream("C:\\Users\\admin\\Desktop\\Mobile Apps Testcases.xlsx");
//		String data = WorkbookFactory.create(file).getSheet("Test").getRow(1).getCell(0).getStringCellValue();
//		System.out.println(data);
//		
//	}
		
		// to retrieve all data from excel
		 String filePath = "C:\\Users\\admin\\Desktop\\Mobile Apps Testcases.xlsx";
	        
	        try (FileInputStream file = new FileInputStream(filePath)) {
	            Workbook workbook = WorkbookFactory.create(file);
	            Sheet sheet = workbook.getSheet("Test");

	            // Loop through all rows and cells
	            for (Row row : sheet) {
	                for (Cell cell : row) {
	                    System.out.print(cell.toString() + " | "); // Print each cell value
	                }
	                System.out.println(); // Move to the next row
	            }
	            workbook.close();
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
      
	 
	
	
	}
}
