package readExcel;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		//Open/Enter the workbook				
		XSSFWorkbook wb = new XSSFWorkbook("./data/ReadHair.xlsx");
				
		
		//Get Sheet	
		XSSFSheet sheet  = wb.getSheet("Sheet2");
					
		//Get row
		//XSSFRow row = HairCut.getRow(4);
		XSSFRow row = sheet.getRow(3);
					
		//Get column
		  XSSFCell cell = row.getCell(2);
		
		//Action- Read/print particular CellValue
		 String cellValue = cell.getStringCellValue();
		System.out.println(cellValue);

	
	
	
	
	
	
	}

}
