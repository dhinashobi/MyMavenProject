package com.crmpro.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crmpro.base.TestBase;

public class LoginPage extends TestBase {

	@FindBy(name = "username")
	WebElement username;

	@FindBy(name = "password")
	WebElement password;

	@FindBy(xpath = "//*[@id=\'navbar-collapse\']/ul/li[2]/a")
	WebElement signupbtn;

	@FindBy(xpath = "//*[@id=\'loginForm\']/div/div/input")
	WebElement loginbtn;

	@FindBy(xpath = "/html/body/div[2]/div/div[1]/a")
	WebElement crmlogo;

	  public LoginPage() {
	  PageFactory.initElements(driver, this); 
	  }
	  
	public String vaildateLoginpageTitle() {
		return driver.getTitle();
	}
	
	public boolean validateCRMImage() {
		return crmlogo.isDisplayed();
	}
	public HomePage validLogin(String un, String pwd) {
		username.sendKeys(un);
		password.sendKeys(pwd);
		loginbtn.click();
		return new HomePage();
	}
}
