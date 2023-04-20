package excelHandlingConcepts;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DatabaseToExcel {

	public static void main(String[] args) throws SQLException, Exception {
		// TODO Auto-generated method stub
		
		//download my sql jar - https://mvnrepository.com/artifact/com.mysql/mysql-connector-j/8.0.33
		
		String connectionString = "jdbc:mysql://localhost:3306/world";
		// create connection - used to establish connection with the database
		Connection con = DriverManager.getConnection(connectionString, "root", "Testing@001a");
		
		String sql = "select * from world.city";
		// create statement - The object of statement is responsible to execute queries with the database.
		Statement stmt = con.createStatement();
		// execute query - This method returns the object of ResultSet that can be used to get all the records of a table.
		ResultSet rs = stmt.executeQuery(sql);
		
		
		XSSFWorkbook wb = new XSSFWorkbook();
		XSSFSheet sheet = wb.createSheet("DetailsNew");
		// Create headers
		XSSFRow row = sheet.createRow(0);
		
		// to set column names in 1st row of excel
		row.createCell(0).setCellValue("ID");
		row.createCell(1).setCellValue("Name");
		row.createCell(2).setCellValue("CountryCode");
		row.createCell(3).setCellValue("District");
		row.createCell(4).setCellValue("Population");

		int r=1;
		while(rs.next()) {
			// identifier should be same as column name in DB
			int id = rs.getInt("ID");
			String name = rs.getString("Name");
			String code = rs.getString("CountryCode");
			String district = rs.getString("District");
			int pop = rs.getInt("Population");
			
			XSSFRow row1 = sheet.createRow(r++);			
			
			row1.createCell(0).setCellValue(id);
			row1.createCell(1).setCellValue(name);
			row1.createCell(2).setCellValue(code);
			row1.createCell(3).setCellValue(district);
			row1.createCell(4).setCellValue(pop);
		}
		
		String path = System.getProperty("user.dir");
		System.out.println(path);
		String FilePath = path + "\\Data\\ContrydataFromDB.xlsx";
		FileOutputStream fos = new FileOutputStream(FilePath);
		wb.write(fos);
		wb.close();
		con.close();

		System.out.println("Data written successfully");

	}

}
