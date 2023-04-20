package excelHandlingConcepts;

import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadDataFromExcel {

	static FileInputStream fis;
	static XSSFWorkbook wb;
	static XSSFSheet sheet;

	public static void main(String[] args) throws Exception {

		ArrayList<String> col1 = new ArrayList<String>();
		ArrayList<String> col2 = new ArrayList<String>();
		String path = System.getProperty("user.dir");
		System.out.println(path);

		File excelFile = new File(path + "\\Data\\ExcelData.xlsx");
		// File excelFile = new File("C:\\Users\\Swati\\Desktop\\ExcelData.xlsx");

		fis = new FileInputStream(excelFile);
		wb = new XSSFWorkbook(fis);
		sheet = wb.getSheet("Credentials");

		// using Iterator method

		int rows = sheet.getLastRowNum();
		// System.out.println(rows);
		int cols = sheet.getRow(0).getLastCellNum();
		// System.out.println(cols);

		String data = sheet.getRow(0).getCell(0).getStringCellValue();
		System.out.println(data);

		for (int i = 0; i <= rows; i++) {
			XSSFRow row = sheet.getRow(i); // getting the rows
			for (int j = 0; j < cols; j++) { // reading cells in a particular row

				XSSFCell cell = row.getCell(j);
				switch (cell.getCellType()) {
				case STRING:
					System.out.print(cell.getStringCellValue() + "\t");
					break;
				case NUMERIC:
					System.out.print(cell.getNumericCellValue() + "\t");
					break;
				case BOOLEAN:
					System.out.print(cell.getBooleanCellValue() + "\t");
					break;
				case FORMULA:
					System.out.print(cell.getCellFormula() + "\t");
					break;
				}

				// System.out.print(cell.toString() + "\t");
			}
			System.out.println();
		}

		// using Iterator method

		Iterator ir = sheet.iterator();

		while (ir.hasNext()) {

			XSSFRow row1 = (XSSFRow) ir.next(); // return the first row
			Iterator cellIterator = row1.cellIterator(); // iterate all the cells and store them

			while (cellIterator.hasNext()) {
					
				XSSFCell cell1 = (XSSFCell) cellIterator.next();
				switch (cell1.getCellType()) {
				case STRING:
					System.out.print(cell1.getStringCellValue() + "\t");
					break;
				case NUMERIC:
					System.out.print(cell1.getNumericCellValue() + "\t");
					break;
				case BOOLEAN:
					System.out.print(cell1.getBooleanCellValue() + "\t");
					break;
				case FORMULA:
					System.out.print(cell1.getCellFormula() + "\t");
					break;
				}
				
			}
			System.out.println();
		}

		// openExcel("\\Data\\ExcelData.xlsx","Credentials");
		// col1 = getColumndata("UserName");
		// System.out.println(col1);
		// col2 = getColumndata("Password");
		// System.out.println(col2);

		wb.close();

	}

	public static void openExcel(String Excelpath, String sheetName) throws Exception {

		String path = System.getProperty("user.dir");
		System.out.println(path);
		File excelFile = new File(path + Excelpath);
		fis = new FileInputStream(excelFile);
		wb = new XSSFWorkbook(fis);
		sheet = wb.getSheet(sheetName);

	}

	public static ArrayList<String> getColumndata(String columnName) throws Exception {

		ArrayList<String> columnData = new ArrayList<String>();
		// to get no. of rows
		int rows = sheet.getLastRowNum();
		// to get no. of columns
		int cols = sheet.getRow(0).getLastCellNum();

		int col_num = -1;
		// get the first row details
		XSSFRow row1 = sheet.getRow(0);

		// iterating in columns of 1st row to get the column number of specified column
		for (int i = 0; i < cols; i++) {
			if (row1.getCell(i).getStringCellValue().trim().equalsIgnoreCase(columnName))
				col_num = i;
		}

		// once we have the column number iterate it through all the rows
		for (int i = 0; i <= rows; i++) {

			String data = sheet.getRow(i).getCell(col_num).getStringCellValue();
			// System.out.println(data);
			// storing the data in an array
			columnData.add(data);

		}
		return columnData;
	}
}
