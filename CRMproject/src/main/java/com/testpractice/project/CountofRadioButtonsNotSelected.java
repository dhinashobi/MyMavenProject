package com.testpractice.project;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CountofRadioButtonsNotSelected {
	
	public static WebDriver driver;
	
	
	public static void radioButtoncount(){
	int count = 0;
	List<WebElement> list = driver.findElements(By.name("radiobutton"));
	
	for(int i =0;i<list.size();i++) {
		
		Boolean radioBtnselected = list.get(i).isSelected();
		if (radioBtnselected == false) {
			
			count++;
		}
	}
	System.out.println(count);
	
	}
	
	
	
public static void main(String[] args)  {
	
	radioButtoncount();
}


}
