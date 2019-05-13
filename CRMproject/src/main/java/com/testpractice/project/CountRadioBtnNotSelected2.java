package com.testpractice.project;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CountRadioBtnNotSelected2 {
	static int count;
	
	public static WebDriver driver;
	
	public static void countRadiobtnNotselect2() {
		
		
		List<WebElement> radiobuttons = driver.findElements(By.xpath(""));
		
		for(int i=0;i<radiobuttons.size();i++) {
			
			boolean radiobtnsselected = radiobuttons.get(i).isSelected(); 
			
			if(radiobtnsselected==false) {
				
				count++;
				
			}
						
		}
		System.out.println(count);
		
		
	}
	
	
	public static void main(String[] args) {
		

	}

}
