package Utilities;
import org.apache.poi.ss.usermodel.*;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

import com.google.common.collect.Table.Cell;


public class Datafetchcode1 {
	
	
	  public static String[] getLoginData(String filePath, String sheetName, int rowIndex) {
	        String[] loginData = new String[2]; // Assuming username and password are in two columns

	        try (FileInputStream fis = new FileInputStream(filePath);
	             Workbook workbook = new XSSFWorkbook(fis)) {

	            Sheet sheet = (Sheet) workbook.getSheet(sheetName);
	            Row row = ((XSSFSheet) sheet).getRow(rowIndex);
  
	            if (row != null) {
	                loginData[0] = row.getCell(0).toString(); // Username (first column)
	                loginData[1] = row.getCell(1).toString(); // Password (second column)
	            }

	        } catch (Exception e) {
	            e.printStackTrace();
	        }

	        return loginData; // Return username and password
	    }

	
	
	
	

}
