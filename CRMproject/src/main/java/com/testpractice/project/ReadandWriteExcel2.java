package com.testpractice.project;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;

public class ReadandWriteExcel2 {
	
	public static WebDriver driver;
	public static File file;
	public static FileInputStream fis;
	public static XSSFWorkbook wb;
	public static XSSFSheet sheet;
	FileOutputStream fos;
	
	public static void readWriteExcel2(String src) {
		try {
		file = new File(src);
		fis = new FileInputStream(file);
		wb = new XSSFWorkbook(fis);
		sheet = wb.getSheetAt(0);
		int rowcount = sheet.getLastRowNum();
		int cellcount = sheet.getRow(0).getLastCellNum();
		
		for(int i =1;i<rowcount;i++) {
			for(int j=0;j<cellcount;j++) {
				Row row = sheet.getRow(i);
				Cell cell = row.getCell(j);
				
				if(null!= cell && cell.getCellType()==cell.CELL_TYPE_STRING) {
					
					System.out.println("String cell values are :" + cell.getStringCellValue());
				}
				else if(cell != null && cell.getCellType()==cell.CELL_TYPE_NUMERIC) {
					
					System.out.println("Numeric cell values are :" + cell.getNumericCellValue());
				}
				else {
					
					System.out.println("Special and null cell values are :" + "Null values detected");
				}
			}
		}
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		readWriteExcel2("C:\\Users\\dgubend\\Desktop\\Dhina\\Selenium Project\\TestDataPractice1.xlsx");
	}

}
