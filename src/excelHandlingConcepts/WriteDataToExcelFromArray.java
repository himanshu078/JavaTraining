package excelHandlingConcepts;

import java.io.*;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

// Workbook -> Sheet -> Row -> Cell
public class WriteDataToExcelFromArray {

	public static void main(String[] args) throws Exception {

		// create empty workbook
		XSSFWorkbook wb = new XSSFWorkbook();
		//create new sheet
		XSSFSheet sheet = wb.createSheet("Details");

		Object data[][] = {{"ID", "Name", "Title"},
				{101, "John", "PA"},
				{102, "Scott", "M"},
				{103, "Mike", "Director"},
		};
		

		//using for loop
//		int rows = data.length; //4
//		int col = data[0].length; //3
//
//		System.out.println(rows + "  " + col);
//
//		for (int i=0; i<rows; i++) {
//
//			XSSFRow row = sheet.createRow(i);
//
//			for(int j=0; j<col;j++){
//
//				XSSFCell cell = row.createCell(j);
//				Object value = data[i][j];
//				
//				if (value instanceof String)
//					cell.setCellValue((String)value);
//				if (value instanceof Integer)
//					cell.setCellValue((Integer)value);
//				if (value instanceof Boolean)
//					cell.setCellValue((Boolean)value);	
//			}
//		}
//		
//		String path = System.getProperty("user.dir");
//		System.out.println(path);
//
//		String FilePath = path + "\\Data\\EmpData.xlsx";
//		FileOutputStream fos = new FileOutputStream(FilePath);
//		wb.write(fos);
//		wb.close();
//		
//		System.out.println("Data written successfully");
		
		// using for-eachloop
		System.out.println("=========================================================");
		
		int rowCount =0;
		
		for (Object emp[] : data) {
			
			XSSFRow row = sheet.createRow(rowCount++);
			int colCount =0;
			
			for(Object value:emp) {
				XSSFCell cell = row.createCell(colCount++);
				
				if (value instanceof String)
					cell.setCellValue((String)value);
				if (value instanceof Integer)
					cell.setCellValue((Integer)value);
				if (value instanceof Boolean)
					cell.setCellValue((Boolean)value);	
				
				
			}
		}
		
		String path = System.getProperty("user.dir");
		System.out.println(path);

		String FilePath = path + "\\Data\\EmpData12.xlsx";
		FileOutputStream fos = new FileOutputStream(FilePath);
		wb.write(fos);
		wb.close();
		
		System.out.println("Data written successfully");

	}


}
