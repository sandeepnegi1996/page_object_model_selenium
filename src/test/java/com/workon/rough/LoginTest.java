package com.workon.rough;

import com.workon.base.Page;
import com.workon.pages.ContactPage;
import com.workon.pages.HomePage;
import com.workon.pages.LoginPage;

public class LoginTest {

	public static void main(String[] args) throws InterruptedException {
		
		
		HomePage hp=new HomePage();
		LoginPage login= hp.gotoLogin();
		hp=login.doLogin();
		ContactPage cp= hp.gotoContact();
		hp=cp.fillContactPage();
		Thread.sleep(4000);
		
		//after login go to the card page
		
		Page.menu.gotoCart();
		Page.tearDown();
		
		Thread.sleep(4000);	
		
	}

}