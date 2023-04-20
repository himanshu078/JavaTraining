package excelHandlingConcepts;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.FillPatternType;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.ss.usermodel.Font;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFCellStyle;

public class WriteDataToExcel {
		    public static void main(String[] args) {
		    	
		    	String path = System.getProperty("user.dir");
				System.out.println(path);
		    	
		        String fileName = path + "\\Data\\Testing.xlsx";
		        String sheetName = "Sheet1";
		        try (FileOutputStream fos = new FileOutputStream(new File(fileName))) {
		            Workbook workbook = WorkbookFactory.create(true);
		            Sheet sheet = workbook.createSheet(sheetName);
		            
		            CellStyle style = workbook.createCellStyle();
		            
		            style.setFillForegroundColor(IndexedColors.GREEN.getIndex());
		            style.setFillPattern(FillPatternType.SOLID_FOREGROUND);
		            
		            Font font = workbook.createFont();
		            font.setColor(IndexedColors.WHITE.getIndex());
		            style.setFont(font);
		           

		            Row headerRow = sheet.createRow(0);
		            Cell cell = headerRow.createCell(0);
		            cell.setCellValue("Name");
		            cell.setCellStyle(style);
		            cell = headerRow.createCell(1);
		            cell.setCellValue("Age");
		            cell.setCellStyle(style);
		            

		            Row dataRow = sheet.createRow(1);
		            cell = dataRow.createCell(0);
		            cell.setCellValue("John");
		            cell = dataRow.createCell(1);
		            cell.setCellValue(25);

		            dataRow = sheet.createRow(2);
		            cell = dataRow.createCell(0);
		            cell.setCellValue("Jane");
		            cell = dataRow.createCell(1);
		            cell.setCellValue(30);

		            workbook.write(fos);
		            System.out.println("Data has been written to " + fileName);
		            System.out.println(fos);
		        } catch (IOException e) {
		            System.out.println("Error writing to file: " + e.getMessage());
		        }
		    }
		

}


