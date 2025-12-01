package PagesPackage;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import UtilityClass.UtilityClass;

public class ClickOnMobile {

	@FindBy(xpath = "//*[@id=\"nav-xshop\"]/ul/li[6]/div/a")
	WebElement mobileButtn;
	@FindBy(xpath = "//*[@id=\"sobe_d_b_ms_9_1\"]/div/div[1]/div/div[5]/a")
	WebElement clickMobileOnePlus;
	@FindBy(xpath="//*[@id=\"sobe_d_b_ms_9_1\"]/div/div[1]/div/div[6]/a")
	WebElement clickMobileSamsung;
	@FindBy(xpath = "//*[@id=\"buy-now-button\"]")
	WebElement buyNowMobile;
	@FindBy(xpath="//*[@id='sobe_d_b_ms_9_1']/div/div[1]/div/div[7]/a")
	WebElement clickMobileRealme;
	@FindBy(xpath = "//*[@id='sobe_d_b_ms_9_1']/div/div[1]/div/div[8]/a")
	WebElement clickOneplus13S;
	@FindBy(xpath = "//*[@id='landingImage']")
	WebElement displayallMobile;
	@FindBy(xpath = "//input[@id='buy-now-button']")
	WebElement checkBuyButton;
	@FindBy(xpath = "//input[@id='add-to-cart-button']")
	WebElement checkAddtoCartButton;
	
	
	
	
	@FindBy(xpath="//span[@id='productTitle']")
	WebElement allMobileText;
	
	
	
	

	public ClickOnMobile(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void clickOnMobileButtun() {
		mobileButtn.click();
	}

	

	public void orderMobileOnePlus() {
		clickMobileOnePlus.click();

	}
	
	
	public void verifyOnePlusName() {
		UtilityClass.verifyName(allMobileText, "OnePlus Nord 5");
	}
	
	public void orderMobileSamsung() {
		clickMobileSamsung.click();
	}
	
	
	public void verifySamsungName() {
		UtilityClass.verifyName(allMobileText, "Samsung Galaxy M06 5G (Sage Green, 4GB RAM, 64GB Storage)");
	}
	
	public void orderRealme() {
		clickMobileRealme.click();
	}
	
	
	public void verifyRealmeName() {
		UtilityClass.verifyName(allMobileText, "realme NARZO 80 Lite 4G (Obsidian Black, 4GB+64GB)");
	}
	
	public void orderOnePlus13s() {
		clickOneplus13S.click();
	}
	public void verifyOneplus13s() {
		UtilityClass.verifyName(allMobileText, "OnePlus 13s");
	}
	
	public void verifyDisplayOneplus() {
		boolean mobile = displayallMobile.isDisplayed();
		if(mobile) {
			System.out.println("one plus Mobile is displayed");
		}else {
			System.out.println("one plus Mobile image is not showing");
		}
		Assert.assertTrue(mobile);
	}
	
	public void verifyDisplaySamsung() {
		boolean mobile =displayallMobile.isDisplayed();
		if(mobile) {
			System.out.println("Samsung Mobile is displayed");
		}
		else {
			System.out.println("Samsung Mobile image is not showing");
		}
		Assert.assertTrue(mobile);
		
	}
	
	public void verifyDisplayRealme() {
		boolean mobile =displayallMobile.isDisplayed();
		if(mobile) {
			System.out.println("Realme Mobile is displayed");
		}
		else {
			System.out.println("Realme Mobile image is not showing");
		}
		Assert.assertTrue(mobile);
		
	}
	
	public void verifyDisplayOneplus13s() {
		boolean mobile =displayallMobile.isDisplayed();
		if(mobile) {
			System.out.println("OnePlus 13s Mobile is displayed");
		}
		else {
			System.out.println("Oneplus 13s Mobile image is not showing");
		}
		Assert.assertTrue(mobile);
	}
	
	
	// Verify The Buy Button Is Enabled or Not
	public void checkBuyButton() {
		boolean buyButton = checkBuyButton.isEnabled();
			
		if (buyButton==true) {
			System.out.println("Buy Button Is Enabled");
		}
		else {
			System.out.println("Buy Buttun Is Disabled");
			
		}
		Assert.assertTrue(buyButton);
	}
	
	
	// Verify The AddToCart Button Is Enabled or Not
	public void checkAddtoCartButtun() {
		boolean addToCartButton = checkAddtoCartButton.isEnabled();
		if(addToCartButton==true) {
			System.out.println("Add to Cart Buttun is Enabled");
		}
		else {
			System.out.println("Add to Cart Button is Disabled");
		}
		Assert.assertTrue(addToCartButton);
	}
	
	


	
	
	
	
	


	public void buyNowMobile() {
		buyNowMobile.click();

	}

}
