package com.testpractice.project;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadWriteFromExcelFile {
	public static WebDriver driver;
	public static File file;
	public static FileInputStream fis;
	public static XSSFWorkbook xwb;
	public static XSSFSheet sheet;
	public static FileOutputStream fos;
	
	public static void launchBrowserAndopenURL() throws InterruptedException {
		
		 String src = "C:\\Users\\dgubend\\Desktop\\Dhina\\Selenium Project\\TestDataPractice1.xlsx";
		/*
		 * System.setProperty(
		 * "webdriver.chrome.driver","C:\\Users\\dgubend\\Desktop\\Dhina\\Selenium Project\\chromedriver_win32\\chromedriver.exe"
		 * ); driver = new ChromeDriver(); driver.get("https://www.facebook.com/");
		 * driver.manage().window().maximize();
		 */	
		 try {
		file = new File(src);
		 fis = new FileInputStream(file);
		  xwb= new XSSFWorkbook(fis);
		  sheet = xwb.getSheetAt(0);
		  int rowcount = sheet.getLastRowNum();
		  int colcount = sheet.getRow(1).getLastCellNum();
		 
			/*
			 * WebElement firstname = driver.findElement(By.id("u_0_j")); WebElement surname
			 * = driver.findElement(By.id("u_0_l")); WebElement mobilenum =
			 * driver.findElement(By.id("u_0_o")); WebElement password =
			 * driver.findElement(By.id("u_0_v")); WebElement signupbtn =
			 * driver.findElement(By.id("u_0_11"));
			 */
	
		  
		  
			 for(int i =1;i<=rowcount;i++) {
				
				 
				 for(int j=0;j<colcount;j++) {					 
					 Row row = sheet.getRow(i);
					 Cell cell = row.getCell(j);
					 if((null != cell && cell.getCellType()==cell.CELL_TYPE_STRING)) {
						 
						 System.out.println("String Cell values are : " + cell.getStringCellValue());	
						 				 
					 }
					 else if (cell!=null && cell.getCellType()==cell.CELL_TYPE_NUMERIC) {
						 
						 System.out.println("Numeric cell Values are: "+cell.getNumericCellValue());
					 }
					 
					 else {
						 
						 System.out.println("Null values are : " + "1 Null value detected");
					 }
				 }
				 
			 }
		  	 
		} catch (IOException e) {
		
			e.printStackTrace();
		}
	
		/* driver.quit(); */
	}
	
	

	public static void main(String[] args) throws InterruptedException {
		
		

		launchBrowserAndopenURL();
		
	}

}
