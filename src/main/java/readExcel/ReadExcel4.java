package readExcel;

import java.io.IOException;

import org.apache.poi.ss.util.SheetUtil;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel4 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		//Open/Enter the workbook				
		XSSFWorkbook wb = new XSSFWorkbook("./data/ReadData4.xlsx");		
		
		//Get Sheet
		XSSFSheet Sheet = wb.getSheet("Sheet1");
		
		//get row count 
		int rowCount = Sheet.getLastRowNum();
		System.out.println(rowCount);

		//column count
		//getRow we can enter any value , it will not change any column count 
		int columnCount = Sheet.getRow(2).getLastCellNum();
		System.out.println(columnCount);
	
		for (int i = 1; i <=rowCount; i++) {
			//we will add rowCount and columnCount before getRow 
			//get row 
			XSSFRow row = Sheet.getRow(i);
			
		for (int j = 0; j <columnCount; j++) {
				//get cell
			XSSFCell cell = row.getCell(j);
			String cellValue = cell.getStringCellValue();
			System.out.println(cellValue);
		
	
	}

		}
}
}