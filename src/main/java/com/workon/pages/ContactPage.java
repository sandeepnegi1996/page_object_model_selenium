package com.workon.pages;

import org.openqa.selenium.By;

import com.workon.base.Page;

public class ContactPage extends Page {
	
	
	public HomePage fillContactPage() throws InterruptedException {
		
		//enter the email
		
		driver.findElement(By.xpath("//input[@id='recipient-email']")).sendKeys("sample email test");
		
		
		
		
		//enter the name
		
		driver.findElement(By.xpath("//input[@id='recipient-name']")).sendKeys("Test name sandeep singh negi");
		
		//enter the message
		
		driver.findElement(By.xpath("//textarea[@id='message-text']")).sendKeys("this is the sample message");
		
		//press the send message button
		driver.findElement(By.xpath("//button[contains(text(),'Send message')]")).click();
		
		
		//press the alert button
		driver.switchTo().alert().accept();
		
		//Wait for some time to see the output
		Thread.sleep(3000);
		//return the object of the home page
		
		return new HomePage();
	}

}
