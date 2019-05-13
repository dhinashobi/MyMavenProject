package com.testpractice.project;

import java.io.File;
import java.io.IOException;
import java.util.Calendar;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class DatePickerHandle {

	public static WebDriver driver;
	
	public static void datepickHandle() throws IOException {
		  System.setProperty("webdriver.chrome.driver","C:\\Users\\dgubend\\Desktop\\Dhina\\Selenium Project\\chromedriver_win32\\chromedriver.exe");
		  driver = new ChromeDriver(); 
		  driver.get("http://demo.guru99.com/test/");
		  driver.manage().window().maximize();
		  
		  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		  
		  WebElement dateandTime = driver.findElement(By.name("bdaytime"));
		  
		  dateandTime.sendKeys("09042019"+Keys.TAB);
		  
		  dateandTime.sendKeys("0245PM");
		  takeasnapshot(driver, "C:\\Users\\dgubend\\Desktop\\Dhina\\Selenium Project\\datepicker.jpeg");
		  
		  driver.quit();
		 
	}
	
	public static void datePickerFormat2() {
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\dgubend\\Desktop\\Dhina\\Selenium Project\\chromedriver_win32\\chromedriver.exe");
		  driver = new ChromeDriver(); 
		  driver.get("https://demos.telerik.com/kendo-ui/datetimepicker/index");
		  driver.manage().window().maximize();
		  
		  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		  
		  String dateTime = "12/04/2019 2:00 PM";
		
		WebElement datepicker = driver.findElement(By.xpath("//span[@class='k-icon k-i-calendar']"));
		WebElement nextDateNavArrow = driver.findElement(By.xpath("//span[@class='k-icon k-i-arrow-60-right']"));
		WebElement previousDateNavArrow = driver.findElement(By.xpath("//span[@class='k-icon k-i-arrow-60-left']"));
		WebElement midlink = driver.findElement(By.xpath("//a[@class='k-link k-nav-fast']"));
		WebElement timepicker = driver.findElement(By.xpath("//span[@class='k-icon k-i-clock']"));
		
		
		datepicker.click();
		
		String date_dd_mm_yyyy[] = (dateTime.split(" ")[0]).split("/");
		
		int yearDiff = Integer.parseInt(date_dd_mm_yyyy[2])-Calendar.getInstance().get(Calendar.YEAR);
		
		midlink.click();
		
		if(yearDiff!=0) {
			
			
			if(yearDiff>0) {
				
				for(int i=0;i<yearDiff;i++) {
					
					System.out.println("year Diff ->"+i);
					nextDateNavArrow.click();
				}
			}
			else if(yearDiff<0) {
				
				for(int i=0; i< (yearDiff*(-1));i++);
				previousDateNavArrow.click();
							
			}
		}
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		List<WebElement> list_AllMonthToBook = driver.findElements(By.xpath("//div[@id='datetimepicker_dateview']//table//tbody//td[not(contains(@class,'k-other-month'))]"));
		
		list_AllMonthToBook.get(Integer.parseInt(date_dd_mm_yyyy[0])-1).click();
		
		WebElement selectTime = driver.findElement(By.xpath("//span[@aria-controls='datetimepicker_timeview']"));
		
		selectTime.click();
		
		 List<WebElement> allTime = driver.findElements(By.xpath("//div[@data-role='popup'][contains(@style,'display: block')]//ul//li[@role='option']"));
		 dateTime = dateTime.split(" ")[1]+" "+dateTime.split(" ")[2];
		 for (WebElement webElement : allTime) {

	            if(webElement.getText().equalsIgnoreCase(dateTime))

	            {

	                webElement.click();

	            }

	        }

		  driver.quit();
	}
	
	
	
	
public static  void takeasnapshot(WebDriver driver, String filepath) throws IOException {
	
	TakesScreenshot scrsht = ((TakesScreenshot)driver);
	File srcfile = scrsht.getScreenshotAs(OutputType.FILE);
	File destfile = new File(filepath);
	FileHandler.copy(srcfile, destfile);
}
	public static void main(String[] args) throws IOException {
		datePickerFormat2();

	}

}
