package readExcel;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {
	public static void main(String[] args) throws IOException {
	
				// Open/Enter the workbook				
				XSSFWorkbook wb = new XSSFWorkbook("./data/ReadData.xlsx");
				
				//Get Sheet			
				XSSFSheet sheet = wb.getSheet("Sheet1");
				
				//Get row
				XSSFRow row = sheet.getRow(1);
				
				//Get column
				XSSFCell cell = row.getCell(2);
				
				//Action- Read/print particular CellValue
				String cellValue = cell.getStringCellValue();
				
				System.out.println(cellValue);}

}
