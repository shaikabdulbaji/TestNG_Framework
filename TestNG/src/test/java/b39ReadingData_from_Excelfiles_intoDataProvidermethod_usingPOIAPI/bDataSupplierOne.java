package b39ReadingData_from_Excelfiles_intoDataProvidermethod_usingPOIAPI;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class bDataSupplierOne {
	

	FileInputStream fis;
	XSSFWorkbook workbook;
	
	@DataProvider(name="supplier")
	public Object[][] dataSupplier() {

		String excelPath = System.getProperty("user.dir")+"\\src\\test\\resource\\employees logins.xlsx";
		
		File excelFile = new File(excelPath);
		
		try {
			fis = new FileInputStream(excelFile);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		try {
			workbook = new XSSFWorkbook(fis);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		XSSFSheet sheet = workbook.getSheet("Sheet1");
		
		Iterator<Row> rows = sheet.iterator();
		
		int rowscount = sheet.getPhysicalNumberOfRows();
		int columncount = sheet.getRow(0).getLastCellNum();
		
		Object[][] data = new Object[rowscount-1][columncount];
		
		for(int r=0; r<rowscount-1; r++)
		{
			XSSFRow row = sheet.getRow(r+1);  
			
			for(int c=0; c<columncount; c++)
			{
				XSSFCell cell = row.getCell(c);  
				
				CellType celltype = cell.getCellType();  
		
				switch(celltype)
				{
					case STRING :
						data[r][c] = cell.getStringCellValue();
						break;
						
					case NUMERIC :
						data[r][c] = (int)cell.getNumericCellValue();
						break;
						
					case BOOLEAN :
						data[r][c] = cell.getBooleanCellValue();
						break;
				}
				
			}
			
		}
		return data;
		
	}
}
