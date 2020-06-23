package com.workon.rough;

import com.workon.base.Page;
import com.workon.pages.ContactPage;
import com.workon.pages.HomePage;

public class ContactPageTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		HomePage hp=new HomePage();
		ContactPage cp=hp.gotoContact();
		hp=cp.fillContactPage();
		Thread.sleep(3000);
		Page.tearDown();
		
	}

}
