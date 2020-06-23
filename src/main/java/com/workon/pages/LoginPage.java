package com.workon.pages;

import org.openqa.selenium.By;
import com.workon.base.Page;

public class LoginPage  extends Page{
	


	public HomePage doLogin() throws InterruptedException 
	{
		
		driver.findElement(By.xpath("//div[@id='logInModal']//input[@id='loginusername']")).sendKeys("sandeepnegi1996");
		driver.findElement(By.xpath("//div[@id='logInModal']//input[@type='password']")).sendKeys("S@ndeep96");
		driver.findElement(By.xpath("//button[contains(text(),'Log in')]")).click();
		
		Thread.sleep(4000);	
		
		return new HomePage();
		
		
		
	}
	


}
