package com.homes.po;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.testng.Assert;
import com.homes.conf.BasePage;
import com.homes.util.reporter.Reporter;

public class HomePage extends BasePage {
	
	//private static final Object title = null;
	//HomePage Locators
/*
 * 1. Nav Locators
 * 1.1 Signin prompt Locators
 * 1.2 Signup prompt Locators
 * 2. SentenceSearch Locators
 * 3. Find a Home Locators
 * 4. Snap and Search Locators
 * 5. Just Listed Locators
 * 6. More Near Me Locators
 * 7. Footer Locators
 */
	
	// 1. Nav Locators
	String UserIcon = "(//span[@class='navigation__label'])[7]"; 
    String SignInSubMenu ="(//span[text()='Sign In'])[1]";
    String CreateAccount="(//a[text()='Create Account'])[1]";
    String HomesForSale= "(//a[contains(text(), 'Homes For Sale')])[1]";
    String HomesForRent=  "(//a[contains(text(), 'Homes For Rent')])[1]";
    String HomeValues= "(//a[contains(text(), 'Home Values')])[1]";
    
   // 1.1 Signin prompt Locators
    String SignInUsingEmail = "//span[contains(text(), 'Sign In with Email')]";
    String SignInUsingGoogle = "//span[contains(text(), 'Sign In with Google')]";
    String SignInUsingFacebook = "//span[contains(text(), 'Sign In with Facebook')]";
    String EmailfieldOnSIgninWithEmail = "//input[@id='login-email']";
    String PassfieldOnSigninWithEmail = "//input[@id='login-password']";
    String SigninButtonOnSigninForm = "//*[@id=\"HPCTA\"]";
    String EmailfieldOnSIgninWithGoogle = "(//input[@class='whsOnd zHQkBf'])[1]";
    String SigninButton_Google= "(//div[@class='Vwe4Vb MbhUzd'])[2]";
    String PassfieldOnSigninWithGoogle= "(//input[@class='whsOnd zHQkBf'])[1]";
    String GoToMyHomesAfterLogin= "//a[@id=\"HPCTALin\"]/span[2]";
    
    // 1.2 Signup prompt Locators
    String SignUpUsingEmail = "//span[contains(text(),'Sign Up with Email')]";
    String SignUpUsingGoogle = "//span[contains(text(),'Sign Up with Google')]";
    String SignUpUsingFacebook = "//span[contains(text(),'Sign Up with Facebook')]";
   
    // 2. SentenceSearch Locators
    String BuyFilter = "//div[contains(text(),'Buy')]";
    String Buy= "//ul//li[contains(text(),'Buy')]";
    String Bedroom = "//div[contains(text(),'3 Bedroom')]";
    String BedroomCount = "//ul//li[contains(text(),'2 Bedroom')]";
    String Type = "//div[contains(text(),'Home')]";
    String homeType = "//ul//li[contains(text(),'Condo')]";
    String Location = "//span[@class='location-options']";
    String Around = "//div[contains(text(),'Around')]";
    String A_Below ="//ul//li[contains(text(),'Below')]";
    String CTAButton ="//div[@class='button-cta button-cta--icon-arrow-forward-long icon--arrow-forward-long button-cta--animate-icon button-cta--icon-right button-cta--transparent search__button-cta']"; 
    
       
      public void waitForPageToLoad() {
    	Reporter.log("Waiting `About` page to load");
        waitForElementPresent(UserIcon);
        Reporter.log("User Icon Loaded");
        waitForElementPresent(HomesForSale);
        Reporter.log("Homes for sale Loaded");
        waitForElementPresent(HomesForRent);
        Reporter.log("Homes for Rent Loaded");
        waitForElementPresent(HomeValues);
        Reporter.log("Home Values Loaded");
    }
    
       //This Function demonstrate the SigninUsingEmail
    public void SigninWithEMailOption() throws InterruptedException{
    	//Assert.assertTrue(isElementPresent(UserIcon),"User icon present"); 	
    	HoverOverUserIconUsingAction(UserIcon);
    	 	 waitForElementPresent(SignInSubMenu);
    	        Reporter.log("Signin Submenu Present");
    	        click(SignInSubMenu);
    	 	 	wait(4);
    	 	 	 waitForElementPresent(SignInUsingEmail);
     	        Reporter.log("Signin using Email Present");
    	 	 	click(SignInUsingEmail);
    	wait(4);
    	typeUsingAction(EmailfieldOnSIgninWithEmail, "swetas@360logica.com");
    	
    	waitForElementPresent(PassfieldOnSigninWithEmail);
    	
    	 Reporter.log("Password field Present");
    	 wait(8);
    	//typeUsingAction(PassfieldOnSigninWithEmail, "Keys.ARROW_TAB");
    	typeUsingAction(PassfieldOnSigninWithEmail, "123456");
    	wait(4);
    	waitForElementVisibility(SigninButtonOnSigninForm);
    	click(SigninButtonOnSigninForm);
    	wait(6);
    	waitForElementVisibility(GoToMyHomesAfterLogin);
    	click(GoToMyHomesAfterLogin);
    	
    	try {
			Thread.sleep(20000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
    }
    
    ////This Function demonstrate the SigninUsingGmail
    public void SigninWithGoogleOption() throws InterruptedException, AWTException{
    	HoverOverUserIconUsingAction(UserIcon);
    	click(SignInSubMenu);
    	 Thread.sleep(5000);
       click (SignInUsingGoogle);
       Thread.sleep(5000);
         //create robot for keyboard operations
       Thread.sleep(1000);
         Robot rb = new Robot();
         wait(5);
         StringSelection username = new StringSelection("swetas@360logica.com");
         Toolkit.getDefaultToolkit().getSystemClipboard().setContents(username, null);            
         rb.keyPress(KeyEvent.VK_CONTROL);
         Thread.sleep(1000);
         rb.keyPress(KeyEvent.VK_V);
         Thread.sleep(1000);
         rb.keyRelease(KeyEvent.VK_V);
         Thread.sleep(1000);
         rb.keyRelease(KeyEvent.VK_CONTROL);
         Thread.sleep(1000);
         rb.keyPress(KeyEvent.VK_ENTER);
         Thread.sleep(1000);
         rb.keyRelease(KeyEvent.VK_ENTER);
             wait(5);
         Robot rb1 = new Robot();
         wait(5);
         StringSelection pwd = new StringSelection("123456");
         Toolkit.getDefaultToolkit().getSystemClipboard().setContents(pwd, null);
         rb1.keyPress(KeyEvent.VK_CONTROL);
         Thread.sleep(1000);
         rb1.keyPress(KeyEvent.VK_V);
         Thread.sleep(1000);
         rb1.keyRelease(KeyEvent.VK_V);
         Thread.sleep(1000);
         rb1.keyRelease(KeyEvent.VK_CONTROL);
         Thread.sleep(1000);
         rb1.keyPress(KeyEvent.VK_ENTER);
         Thread.sleep(1000);
         rb1.keyRelease(KeyEvent.VK_ENTER);
         Thread.sleep(5000);
    }
  
    //This Function demonstrate the SigninUsingFacebook
    public void signinWithFacebookOption() throws InterruptedException, AWTException{
    	HoverOverUserIconUsingAction(UserIcon);
    	click(SignInSubMenu);
    	 Thread.sleep(5000);
       click (SignInUsingFacebook);
       Thread.sleep(5000);
         //create robot for keyboard operations
         Robot rb = new Robot();
         //Enter user name by ctrl-v
          wait(5);
         StringSelection username = new StringSelection("7985753146");
         Toolkit.getDefaultToolkit().getSystemClipboard().setContents(username, null);            
         rb.keyPress(KeyEvent.VK_CONTROL);
         Thread.sleep(1000);
         rb.keyPress(KeyEvent.VK_V);
         Thread.sleep(1000);
         rb.keyRelease(KeyEvent.VK_V);
         Thread.sleep(1000);
         rb.keyRelease(KeyEvent.VK_CONTROL);
        
         Thread.sleep(1000);
         rb.keyPress(KeyEvent.VK_TAB);
         Thread.sleep(1000);
         rb.keyRelease(KeyEvent.VK_TAB);
         Thread.sleep(5000);
         Robot rb1 = new Robot();
         wait(5);
         StringSelection pwd = new StringSelection("ghh@124");
         Toolkit.getDefaultToolkit().getSystemClipboard().setContents(pwd, null);
         rb1.keyPress(KeyEvent.VK_CONTROL);
         Thread.sleep(1000);
         rb1.keyPress(KeyEvent.VK_V);
         Thread.sleep(1000);
         rb1.keyRelease(KeyEvent.VK_V);
         Thread.sleep(1000);
         rb1.keyRelease(KeyEvent.VK_CONTROL);
         Thread.sleep(1000);
         //press enter
         rb1.keyPress(KeyEvent.VK_ENTER);
         Thread.sleep(1000);
         rb1.keyRelease(KeyEvent.VK_ENTER);
         //wait
         Thread.sleep(5000);
    }
    
  //This Function demonstrate the SignupUsingGoogle
    public void SignupWithGoogleOption() throws InterruptedException, AWTException{
    	HoverOverUserIconUsingAction(UserIcon);
    	click(CreateAccount);
    	 Thread.sleep(5000);
       click (SignUpUsingGoogle);
       Thread.sleep(5000);
      // click (EmailfieldOnSIgninWithGoogle); 
         //create robot for keyboard operations
       Thread.sleep(1000);
         Robot rb = new Robot();
                  
         //Enter user name by ctrl-v
          wait(5);
         StringSelection username = new StringSelection("swetas@360logica.com");
         Toolkit.getDefaultToolkit().getSystemClipboard().setContents(username, null);            
         rb.keyPress(KeyEvent.VK_CONTROL);
         Thread.sleep(1000);
         rb.keyPress(KeyEvent.VK_V);
         Thread.sleep(1000);
         rb.keyRelease(KeyEvent.VK_V);
         Thread.sleep(1000);
         rb.keyRelease(KeyEvent.VK_CONTROL);
        
         Thread.sleep(1000);
         //tab to password entry field
         rb.keyPress(KeyEvent.VK_ENTER);
         Thread.sleep(1000);
         rb.keyRelease(KeyEvent.VK_ENTER);
             //click(SigninButton_Google);
             wait(5);
         //Enter password by ctrl-v
         Robot rb1 = new Robot();
         wait(5);
         StringSelection pwd = new StringSelection("123456");
         Toolkit.getDefaultToolkit().getSystemClipboard().setContents(pwd, null);
         rb1.keyPress(KeyEvent.VK_CONTROL);
         Thread.sleep(1000);
         rb1.keyPress(KeyEvent.VK_V);
         Thread.sleep(1000);
         rb1.keyRelease(KeyEvent.VK_V);
         Thread.sleep(1000);
         rb1.keyRelease(KeyEvent.VK_CONTROL);
         Thread.sleep(1000);
         
         //press enter
         rb1.keyPress(KeyEvent.VK_ENTER);
         Thread.sleep(1000);
         rb1.keyRelease(KeyEvent.VK_ENTER);

       
         //wait
         Thread.sleep(5000);
    }
    
  //This Function demonstrate the SignupUsingFacebook
    public void signupWithFacebookOption() throws InterruptedException, AWTException{
    	HoverOverUserIconUsingAction(UserIcon);
    	click(SignInSubMenu);
    	 Thread.sleep(5000);
       click (SignInUsingFacebook);
       Thread.sleep(5000);
      // click (EmailfieldOnSIgninWithGoogle); 
         //create robot for keyboard operations
         Robot rb = new Robot();
         //Enter user name by ctrl-v
          wait(5);
         StringSelection username = new StringSelection("7985753146");
         Toolkit.getDefaultToolkit().getSystemClipboard().setContents(username, null);            
         rb.keyPress(KeyEvent.VK_CONTROL);
         Thread.sleep(1000);
         rb.keyPress(KeyEvent.VK_V);
         Thread.sleep(1000);
         rb.keyRelease(KeyEvent.VK_V);
         Thread.sleep(1000);
         rb.keyRelease(KeyEvent.VK_CONTROL);
        
         Thread.sleep(1000);
         rb.keyPress(KeyEvent.VK_TAB);
         Thread.sleep(1000);
         rb.keyRelease(KeyEvent.VK_TAB);
         Thread.sleep(5000);
         Robot rb1 = new Robot();
         wait(5);
         StringSelection pwd = new StringSelection("ghh@124");
         Toolkit.getDefaultToolkit().getSystemClipboard().setContents(pwd, null);
         rb1.keyPress(KeyEvent.VK_CONTROL);
         Thread.sleep(1000);
         rb1.keyPress(KeyEvent.VK_V);
         Thread.sleep(1000);
         rb1.keyRelease(KeyEvent.VK_V);
         Thread.sleep(1000);
         rb1.keyRelease(KeyEvent.VK_CONTROL);
         Thread.sleep(1000);
         //press enter
         rb1.keyPress(KeyEvent.VK_ENTER);
         Thread.sleep(1000);
         rb1.keyRelease(KeyEvent.VK_ENTER);
         //wait
         Thread.sleep(5000);
    }
  
    //This function demonstrate the Click on CTA button with default search
    public void clickCTA() throws InterruptedException{
    	waitForElementVisibility(CTAButton);
    	click(CTAButton);
    	
    }
    
    //This function demonstrate the Sentence search Feature
    public void sentenceSearchFun() throws InterruptedException{
    	waitForElementVisibility(BuyFilter);
    	wait(5);
    	verifyingIfBuyAlreadySelected(BuyFilter);
    	/*waitForElementVisibility(BuyFilter);
    	verifyingIfBuyAlreadySelected(BuyFilter);
    	waitForElementVisibility(Buy);
    	click(Buy);
    	waitForElementVisibility(Bedroom);
    	click(Bedroom);
    	waitForElementVisibility(BedroomCount);
    	click(BedroomCount);
    	waitForElementVisibility(Type);
    	click(Type);
    	waitForElementVisibility(homeType);
    	click(homeType);
    	waitForElementVisibility(Location);
        selectAutoSuggestionList(Location);
    	click(A_Below);
    	waitForElementVisibility(CTAButton);
    	click(CTAButton);*/
    }
  
}
