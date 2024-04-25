package utils;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils {
	static FileOutputStream file;
	static XSSFWorkbook workbook;
	public static List<String> readExcel() throws IOException {
		FileInputStream file=new FileInputStream(System.getProperty("user.dir")+"\\excelsheet\\inputExcel.xlsx");
		XSSFWorkbook workbook=new XSSFWorkbook(file);
		XSSFSheet sheet=workbook.getSheet("Sheet1");
		XSSFRow row1=sheet.getRow(0);
		XSSFRow row2=sheet.getRow(1);
		XSSFRow row3=sheet.getRow(2);
		XSSFRow row4=sheet.getRow(3);
		
		String name=row1.getCell(0).toString();
		String email=row2.getCell(0).toString();
		String password=row3.getCell(0).toString();
		String confirm_password=row4.getCell(0).toString();
		
		List<String> excelInputs=new ArrayList<String>();
		excelInputs.add(name);
		excelInputs.add(email);
		excelInputs.add(password);
		excelInputs.add(confirm_password);
		
		
		workbook.close();
		file.close();
		return excelInputs;
	}
	
   public static void writeExcelServices(List<String> ServicesStrings) throws IOException 
   {
	   file = new FileOutputStream(System.getProperty("user.dir") + "\\excelsheet\\outputExcel.xlsx");
		
		
		workbook=new XSSFWorkbook();
		XSSFSheet sheet = workbook.createSheet("Services");

		XSSFRow row1 = sheet.createRow(0);
		row1.createCell(0).setCellValue("Services");
		for (int i = 1; i <= ServicesStrings.size(); i++) {
			XSSFRow row2 = sheet.createRow(i);
			row2.createCell(0).setCellValue(ServicesStrings.get(i - 1));
			
		}
		// Writing into Excel
		
		workbook.write(file);
		
	}

	public static void writeExcel1(String message) throws IOException {
		file=new FileOutputStream(System.getProperty("user.dir")+"\\excelsheet\\outputExcel.xlsx");
		//workbook=new XSSFWorkbook();
		XSSFSheet sheet=workbook.createSheet("ErrorMessage");
		XSSFRow row1=sheet.createRow(0);
		row1.createCell(0).setCellValue("Error Message While Entering Wrong Email ID");
		XSSFRow row2=sheet.createRow(1);
		row2.createCell(0).setCellValue(message);
		workbook.write(file);
//		file.close();
	}
	
	public static void writeExcelCenter(List<String> jammuServices) throws IOException {
		file = new FileOutputStream(System.getProperty("user.dir") + "\\excelsheet\\outputExcel.xlsx");
	
//		workbook=new XSSFWorkbook();
		XSSFSheet sheet = workbook.createSheet("Our Centers");

		XSSFRow row1 = sheet.createRow(0);
		row1.createCell(0).setCellValue("Centers");
		for (int i = 1; i <= jammuServices.size(); i++) {
			XSSFRow row2 = sheet.createRow(i);
			row2.createCell(0).setCellValue(jammuServices.get(i - 1));
			
		}
		workbook.write(file);
		workbook.close();

			
		}	
	}
  
	
	

