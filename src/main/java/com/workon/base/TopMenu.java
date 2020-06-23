package com.workon.base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TopMenu {
	
	WebDriver driver;
	
	public TopMenu(WebDriver driver2) {

		driver=driver2;
	}

	public void gotoHome() {
		
	}
	
	public void gotoContact() {
		
	}
	
	public void gotoAboutUs() {
		
	}
	
	public void gotoCart() {
		
		driver.findElement(By.xpath("//a[@id='cartur']")).click();;
		
	}

}
