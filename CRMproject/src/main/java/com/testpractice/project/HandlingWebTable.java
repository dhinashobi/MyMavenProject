package com.testpractice.project;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingWebTable {
	
	public static WebDriver driver;
	
	public static void handleWebTable() {
		
		  System.setProperty("webdriver.chrome.driver","C:\\Users\\dgubend\\Desktop\\Dhina\\Selenium Project\\chromedriver_win32\\chromedriver.exe");
		  driver = new ChromeDriver(); 
		  driver.get("http://demo.guru99.com/test/web-table-element.php");
		  driver.manage().window().maximize();
		  
		  //No of Columns
		  List<WebElement> col = driver.findElements(By.xpath("//*[@id=\"leftcontainer\"]/table/thead/tr/th"));
		  System.out.println("No of Columns are: "+ col.size());
		  List<WebElement> row = driver.findElements(By.xpath("//*[@id='leftcontainer']/table/tbody/tr/td[1]"));
		  System.out.println("No of Columns are: "+ row.size());
		  
		  driver.quit();
		
		
	}
	public static void main(String[] args) {
		handleWebTable();

	}

}
