package TestPackage;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import PagesPackage.AmazonHomePage;
import PagesPackage.ClickOnMobile;
import PagesPackage.LoginPageUserId;
import PagesPackage.LoginUserPassword;
import UtilityClass.BaseClass;
import UtilityClass.UtilityClass;

public class LoginAmazonTest extends BaseClass{
	LoginPageUserId login1;
	LoginUserPassword login2;
	AmazonHomePage homePage;
	ClickOnMobile clickMobile;
	UtilityClass backpage;
	
	
	
	
	
	
	
	@BeforeClass
	public void openBrowser() throws EncryptedDocumentException, IOException{
		initializeBrowser();
		homePage= new AmazonHomePage(driver);
		login1 = new LoginPageUserId(driver);
		login2 = new LoginUserPassword(driver);
		clickMobile = new ClickOnMobile(driver);
		backpage = new UtilityClass();	
	}
	
	
	
	
	
	@Test (priority = 0)
	public void clickButtun() {
		clickMobile.clickOnMobileButtun();	
	}
	@Test (priority = 1)
	public void onePlus() {
		clickMobile.orderMobileOnePlus();
	    clickMobile.verifyOnePlusName();
	    
	}
	
	@Test (priority = 2)
	public void displayOneplus() {
		clickMobile.verifyDisplayOneplus();
		
	}
	@Test (priority = 3)
	public void onePlusBuyButtonVerify() {
		clickMobile.checkBuyButton();
		
	}
	
	@Test (priority = 4)
	public void onePlusAddToCartButtonVerify() {
		clickMobile.checkAddtoCartButtun();
		backpage.backButton();
	}
	
	@Test (priority = 5)
	public void samsung() {
		clickMobile.orderMobileSamsung();
		clickMobile.verifySamsungName();
		
	}
	@Test (priority = 6)
	
	public void displaySamsung() {
		clickMobile.verifyDisplaySamsung();
		
	}
	@Test (priority = 7)
	public void samsungBuyButtonVerify() {
		clickMobile.checkBuyButton();
		
	}
	
	@Test (priority = 8)
	public void samsungAddToCartButtonVerify() {
		clickMobile.checkAddtoCartButtun();
		backpage.backButton();
	}
	
	
	
   @Test (priority = 9)
	
	public void realme() {
		clickMobile.orderRealme();
		clickMobile.verifyRealmeName();
		
	}
	@Test (priority = 10)
	public void displayRealme() {
		clickMobile.verifyDisplayRealme();
		
	}
	
	@Test (priority = 11)
	public void realmeBuyButtonVerify() {
		clickMobile.checkBuyButton();
		
	}
	
	@Test (priority = 12)
	public void realmeAddToCartButtonVerify() {
		clickMobile.checkAddtoCartButtun();
		backpage.backButton();
	}
	
	
	@Test (priority = 13)
	public void onePlus13s() {
		clickMobile.orderOnePlus13s();
		clickMobile.verifyOneplus13s();
		//clickMobile.buyNowMobile();
		
	}
	
	@Test (priority = 14)
	public void displayOneplus13s() {
		clickMobile.verifyOneplus13s();
		
	}
	
	@Test (priority = 15)
	public void onePlus13sBuyButtonVerify() {
		clickMobile.checkBuyButton();
		
		
	}
	
	@Test (priority = 16)
	public void onePlus13sAddToCartButtonVerify() {
		clickMobile.checkAddtoCartButtun();
		backpage.backButton();
	}
	
	
	
	
/*	@Test
	public void LoginAmazon() throws EncryptedDocumentException, IOException{
		//homePage.clickSignInButton();
		login1.inUserId(UtilityClass.getTD(0, 1));
		login1.clickContinueButton();
		login2.inUserPass(UtilityClass.getTD(1, 1));
		login2.clickSignButtun();
		
	}*/
	
	
	@AfterClass
	public void closeBrowser() {
		driver.close();
	}


} 
