package b38ReadingDatafromExcelfilesusingPOIAPI;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.formula.functions.Rows;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class bSecondWayOfRetrivingDataFromExcelUsingIterator {

	public static void main(String[] args) throws IOException {

		String excelPath = System.getProperty("user.dir")+"\\src\\test\\resource\\employees file.xlsx";
		
		File excelFile = new File(excelPath);
		FileInputStream fis = new FileInputStream(excelFile);
		
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		
		XSSFSheet sheet = workbook.getSheet("Sheet1");
		
		Iterator<Row> rows = sheet.iterator();
		
		while(rows.hasNext())
		{
			Row row = rows.next();
			Iterator<Cell> cells = row.iterator();
			
			while(cells.hasNext())
			{
				Cell cell = cells.next();
				CellType celltype = cell.getCellType();
				
				switch(celltype)
				{
					case STRING :
						System.out.print(cell.getStringCellValue()); // If we get String data it will retrive and break
						break;
						
					case NUMERIC :
						System.out.print((int)cell.getNumericCellValue()); // If we get Numeric data it will retrive and break
						break;
						
					case BOOLEAN :
						System.out.print(cell.getBooleanCellValue()); // If we get Boolean data it will retrive and break
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