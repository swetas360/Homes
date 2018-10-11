package com.homes.spec;

import org.testng.annotations.Test;

import com.homes.conf.BasePage;
import com.homes.conf.BaseTest;
import com.homes.po.HomePage;

public class TC_001_Signin_with_Email extends BaseTest  {
	
		HomePage HomePage = new HomePage();
		BasePage basePage = new BasePage();

		
		@Test
		public void ClickOnSignIn() throws InterruptedException{
			HomePage.waitForPageToLoad();
			HomePage.SigninWithEMailOption();
			Thread.sleep(5000);
		}

}
