package com.testpractice.project;

import static org.testng.Assert.assertEquals;

import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import javax.imageio.ImageIO;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class WindowHandle {
	
	
	public static WebDriver driver;
	
	@BeforeTest
public static void browserLaunch() {
		
		String arg0 = "webdriver.chrome.driver";
		String arg1 = "C:\\\\\\\\Users\\\\\\\\dgubend\\\\\\\\Desktop\\\\\\\\Dhina\\\\\\\\Selenium Project\\\\\\\\chromedriver_win32\\\\\\\\chromedriver.exe";
		System.setProperty(arg0, arg1);
		driver = new ChromeDriver();
		driver.get("https://www.monsterindia.com/");
		
		driver.manage().window().maximize();
		
	}
	
	
	@Test
	public static void alertHandles() throws Exception {
		
		
		WebElement elem1 =  driver.findElement(By.xpath("//*[@id=\"themeDefault\"]/section[1]/div/div/div/div[2]/div[1]/div[2]/div/div[1]/div/div[1]/a"));
		elem1.click();
		Alert alert = driver.switchTo().alert();
		
		Thread.sleep(4000);
		WebElement elem2 = driver.findElement(By.id("file-upload"));
		elem2.click();
		
		
		
		
		
		
		/*
		 * WebElement alert = driver.findElement(By.id("alert")); alert.click();
		 * 
		 * String alertText = driver.switchTo().alert().getText(); BufferedImage image =
		 * new Robot().createScreenCapture(new
		 * Rectangle(Toolkit.getDefaultToolkit().getScreenSize())); ImageIO.write(image,
		 * "png", new
		 * File("C:\\Users\\dgubend\\Desktop\\Dhina\\Selenium Project\\CurrentScreenshot.jpeg"
		 * ));
		 * 
		 * 
		 * System.out.println("popup message:"+alertText); Thread.sleep(6000);
		 * driver.switchTo().alert().accept();
		 */
		 
			 
	}
	
	
		
	@AfterTest
	public static void tearDown() {
		
		driver.quit();
	}
	
	
	

}
