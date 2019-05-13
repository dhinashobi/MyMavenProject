package com.crmpro.testcases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.crmpro.base.TestBase;
import com.crmpro.pages.HomePage;
import com.crmpro.pages.LoginPage;

public class LoginPageTestCase extends TestBase{

	
	 public static LoginPage loginpage; 
	
	/* public static LoginPage loginpage1; */
	
	HomePage homePage;
	
	
	  public LoginPageTestCase() {
	  
	  super(); }
	 
	

	@BeforeMethod
	public void setUp() {
		
		initialization();
		 loginpage = new LoginPage(); 	
		
	}
	
	@Test(priority = 1)
	public void loginpageTitleTest() {
		
		String title = loginpage.vaildateLoginpageTitle();
		Assert.assertEquals(title, "CRMPRO - CRM software for customer relationship management, sales, and support.");
		}
	
	@Test(priority =2)
	public void crmLogoImageTest() {
		
		boolean flag = loginpage.validateCRMImage();
		Assert.assertTrue(false);
		
	}
	
	@Test(priority =3)
	public void loginTest() {
		
		homePage = loginpage.validLogin(prop.getProperty("username"), prop.getProperty("password"));
		Assert.assertTrue(false);
	}
	
	
	@AfterMethod
	public void tearDown(){
		driver.quit();
	}
		
		
	}
