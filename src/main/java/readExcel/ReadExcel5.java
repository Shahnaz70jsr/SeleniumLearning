package readExcel;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
public class ReadExcel5 {
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub						
		XSSFWorkbook wb = new XSSFWorkbook("./data/ReadData5.xlsx");		
				XSSFSheet Sheet = wb.getSheet("Sheet1"); 
				int rowCount = Sheet.getLastRowNum();
				System.out.println(rowCount);
				int columnCount = Sheet.getRow(2).getLastCellNum();
				System.out.println(columnCount);
				for (int i = 1; i <=rowCount; i++) { 
				XSSFRow row = Sheet.getRow(i);
				for (int j = 0; j <columnCount; j++) {
				XSSFCell cell = row.getCell(j);
				String cellValue = cell.getStringCellValue();
				System.out.println(cellValue);
				
			
			}

		 }
		}
		
}
