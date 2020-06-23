package com.workon.base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

/*
 * 
 * Demo site I will be using to create a complete framework will be 
 * https://www.demoblaze.com/
 * 
 */

public class Page {
	
	public static WebDriver driver;
	public static TopMenu menu;
	
	
	public Page() {
		
		if(driver==null) {
			
			ChromeOptions options=new ChromeOptions();
			options.addArguments("--diable-infobars");
			
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver(options);
			driver.get("https://www.demoblaze.com/");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
			menu=new TopMenu(driver);
			
		}
	}
	
	
	public static void tearDown() {
		if(driver!=null) 
			driver.quit();
	}

}
