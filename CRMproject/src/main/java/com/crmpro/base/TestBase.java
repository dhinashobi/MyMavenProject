package com.crmpro.base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.remote.server.FirefoxDriverProvider;

import com.crmpro.utils.Testutils;

public class TestBase {

	public static WebDriver driver;
	public static Properties prop;
	static FileInputStream fis;
	
	
	
	public TestBase() {
		
		
		prop = new Properties();		
		File file = new File("C:\\Users\\dgubend\\Desktop\\Dhina\\Selenium Project\\New folder\\CRMproject\\src\\main\\java\\com\\crmpro\\config\\config.properties");
		try {
		fis = new FileInputStream(file);
		}
		catch(FileNotFoundException e) {e.printStackTrace();}
		
		try {		
		prop.load(fis);
		}		
		catch(IOException e) {e.printStackTrace();
		}
		}
	public static WebDriver initialization() {
		
		
		String browserName = prop.getProperty("browser");
		
		if(browserName.equals("Chrome")) {
			System.setProperty("webdriver.chrome.driver","C:\\Users\\dgubend\\Desktop\\Dhina\\Selenium Project\\chromedriver_win32\\chromedriver.exe");
			
			driver = new ChromeDriver();
			}
		
		else if (browserName.equals("FF")) {
					
			driver = new FirefoxDriver();
			}
		
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Testutils.IMPLICIT_WAIT, TimeUnit.SECONDS);
		
		driver.manage().timeouts().pageLoadTimeout(Testutils.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		
		driver.get(prop.getProperty("url"));
		
		driver.manage().window().maximize();
		return driver;
		
		}
	
	public void failedTakeaSnapshot(String testMethodName) {
		
		TakesScreenshot scrshot = ((TakesScreenshot)driver);
		File srcfile = scrshot.getScreenshotAs(OutputType.FILE);
		File dstfile = new File("C:\\Users\\dgubend\\Desktop\\Dhina\\Selenium Project\\New folder\\CRMproject\\Screenshot\\"+testMethodName+".jpg");
		try {
			FileHandler.copy(srcfile, dstfile);
		} catch (IOException e) {
			e.printStackTrace();
		}		
		
		
	}
		
	}
	

