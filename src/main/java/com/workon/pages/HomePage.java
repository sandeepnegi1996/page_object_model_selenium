package com.workon.pages;

import org.openqa.selenium.By;
import com.workon.base.Page;

public class HomePage extends Page {
	
	/*
	 * login details:
	 * sandeepnegi1996
	 * S@ndeep96
	 */
	

	
	public LoginPage gotoLogin() {
		driver.findElement(By.xpath("//a[@id='login2']")).click();
		return new LoginPage();
	}
	
	public void gotoSignUp() {
		
	}
	
	public ContactPage gotoContact() {
		driver.findElement(By.xpath("//a[contains(text(),'Contact')]")).click();
		return new ContactPage();
	}
	


}
