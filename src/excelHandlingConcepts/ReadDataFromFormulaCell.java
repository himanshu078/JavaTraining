package excelHandlingConcepts;

import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFFormulaEvaluator;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadDataFromFormulaCell {

	public static void main(String[] args) throws Exception {

		String path = System.getProperty("user.dir");
		System.out.println(path);

		File excelFile = new File(path + "\\Data\\ExcelData.xlsx");

		FileInputStream fis = new FileInputStream(excelFile);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet = wb.getSheet("Credentials");

		int rows = sheet.getLastRowNum();
		System.out.println(rows);
		int cols = sheet.getRow(0).getLastCellNum();
		System.out.println(cols);
		
		XSSFFormulaEvaluator evaluator = wb.getCreationHelper().createFormulaEvaluator();

		for (int i = 0; i <= rows; i++) {

			XSSFRow row = sheet.getRow(i); // getting the rows

			for (int j = 0; j < cols; j++) { // reading cells in a particular row

				XSSFCell cell = row.getCell(j);
				
				// to evaluate formula cell to get cell type
		        CellType cellType = evaluator.evaluateFormulaCell(cell);
				
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
					
					if (cellType == CellType.NUMERIC) {
						System.out.print(cell.getNumericCellValue() + "\t");
					}
					else if (cellType == CellType.STRING) {
					//System.out.print(cell.getCellFormula() + "\t"); - to print the formula
					System.out.print(cell.getStringCellValue() + "\t");
					} else System.out.print(cell.getBooleanCellValue() + "\t");
					break;
					
				}
				// System.out.print(cell.toString() + "\t");
			}
			System.out.println();
		}

	}

}
