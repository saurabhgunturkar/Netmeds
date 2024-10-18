package utils;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader {

    
	public static String excelfilepathfromConfig = PropertyReader.loadPropertiesFromConfig().getProperty("excelfilepath");

	public static String readdata(String sheetName, int rowNo, int cellNo) {
		try {
			FileInputStream file = new FileInputStream(excelfilepathfromConfig);
			@SuppressWarnings("resource")
			XSSFWorkbook workbook = new XSSFWorkbook(file);
			XSSFSheet sheet = workbook.getSheet(sheetName);
			XSSFRow row = sheet.getRow(rowNo);
			XSSFCell cell = row.getCell(cellNo);
			DataFormatter dataformatter = new DataFormatter();
			String value = dataformatter.formatCellValue(cell);
			workbook.close();
			file.close();
			return value;

		} catch (Exception e) {
			e.printStackTrace();
			return "";
		}
	}

    
}
