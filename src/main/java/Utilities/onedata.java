package Utilities;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import java.io.FileInputStream;
import java.io.File;
import java.io.IOException;

public class onedata {
	public static String[] testdata() throws IOException {
	    File file = new File("C:\\Users\\admin\\Desktop\\Rediff Data.xlsx");

	    // Debug file path and size
	    System.out.println("File path: " + file.getAbsolutePath());
	    System.out.println("File exists: " + file.exists());
	    System.out.println("File size: " + file.length());

	    // Validate file existence and size
	    if (!file.exists() || file.length() == 0) {
	        throw new IOException("File does not exist or is empty: " + file.getAbsolutePath());
	    }

	    // Load the workbook
	    FileInputStream fis = new FileInputStream(file);
	    Workbook workbook = WorkbookFactory.create(fis);
	    System.out.println("Workbook created successfully.");

	    // Read data from the sheet
	    String firstname = workbook.getSheet("TesterRegistration").getRow(1).getCell(0).getStringCellValue();
	    String lastname = workbook.getSheet("TesterRegistration").getRow(1).getCell(3).getStringCellValue();
	    String email = workbook.getSheet("TesterRegistration").getRow(0).getCell(2).getStringCellValue();
	    
	    // Read the phone number (numeric or string cell)
	    String phonenumber = "";
	     Cell phoneCell = workbook.getSheet("TesterRegistration").getRow(1).getCell(5);

	    if (phoneCell != null) {
	        if (phoneCell.getCellType() == CellType.NUMERIC) {
	            // If it's numeric, convert it to a string
	            phonenumber = String.valueOf((long) phoneCell.getNumericCellValue());
	        } else if (phoneCell.getCellType() == CellType.STRING) {
	            // If it's string, fetch it directly as a string
	            phonenumber = phoneCell.getStringCellValue();
	        }
	    }

	    // Close the workbook
	    fis.close();

	    return new String[] { firstname, lastname, email, phonenumber };
	}

	
	
}
