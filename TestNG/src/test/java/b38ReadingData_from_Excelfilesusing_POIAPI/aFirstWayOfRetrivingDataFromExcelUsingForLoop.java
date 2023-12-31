package b38ReadingData_from_Excelfilesusing_POIAPI;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class aFirstWayOfRetrivingDataFromExcelUsingForLoop {

	public static void main(String[] args) throws IOException {

		String excelPath = System.getProperty("user.dir")+"\\src\\test\\resource\\employees file.xlsx";
		
		File excelFile = new File(excelPath);
		FileInputStream fis = new FileInputStream(excelFile);
		
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		
		XSSFSheet sheet = workbook.getSheet("Sheet1");
		
		/*
		System.out.println(sheet.getLastRowNum());  //3
		System.out.println(sheet.getPhysicalNumberOfRows());  //4
		
		* Difference between the above lines is 1st line print from index 0 and 2nd line print 
	      from index 1.
		*/
		
		int rows = sheet.getPhysicalNumberOfRows();   //It gives no.of rows
		int cell = sheet.getRow(0).getLastCellNum();  //It gives no.of columns
		
		// To get the data from the excel out we use for loop
		
		for(int r=0; r<rows; r++)
		{
			XSSFRow row = sheet.getRow(r);  // The control will stay on particular row
			
			for(int c=0; c<cell; c++)
			{
				XSSFCell cols = row.getCell(c);   // The control will stay on particular column
				
				CellType celltype = cols.getCellType();  
				// This cellType will give which type of data is there in excel wheather string, boolean, numeric
				
				switch(celltype)
				{
					case STRING :
						System.out.print(cols.getStringCellValue()); // If we get String data it will retrive and break
						break;
						
					case NUMERIC :
						System.out.print(cols.getNumericCellValue()); // If we get Numeric data it will retrive and break
						break;
						
					case BOOLEAN :
						System.out.print(cols.getBooleanCellValue()); // If we get Boolean data it will retrive and break
						break;
				}
				
				System.out.print(" | "); 
				// After every value retrieve from cell it use this lines, this line belong to switch case
			
			}
			
			System.out.println();
			// After every "colounm" it use this lines, this line belong to 2nd for loop
			
		}
		
		workbook.close(); // After executing retriving all data it will "close" the "workbook"
	
	}

}
