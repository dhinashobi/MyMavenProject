package com.crmpro.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.crmpro.base.TestBase;

public class HomePage extends TestBase {


	@FindBy(xpath = "//td[contains(text(), 'User: Dhinakaran G')]")
	WebElement userNameLabel;
	
	@FindBy(xpath = "//a[contains(text(), 'Contacts')]")
	WebElement contacts;
	
	@FindBy(xpath = "//a[contains(text(), 'Deals')]")
	WebElement deals;
	
	@FindBy(xpath = "//a[contains(text(), 'Tasks')]")
	WebElement tasks;
	
	@FindBy(xpath = "//a[contains(text(), 'Cases')]")
	WebElement cases;
	
	@FindBy(xpath = "//a[contains(text(), 'Call')]")
	WebElement call;
	
	
}
