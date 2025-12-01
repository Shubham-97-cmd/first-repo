package PagesPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageUserId {
	@FindBy(xpath = "//input[@id='ap_email_login']")
	private WebElement userId;
	@FindBy(xpath = "//input[@class='a-button-input']")
	public WebElement continueButtn;

	public LoginPageUserId(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void inUserId(String username) {
		userId.sendKeys(username);
	}

	public void clickContinueButton() {
		continueButtn.click();
	}

	/*
	 * public String getLoginPageUserId() { String actUserId = userId.getText();
	 * return actUserId;
	 * 
	 * }
	 * 
	 * public void verifyUserId(String exposureId) { String actUserId
	 * =userId.getText(); if(actUserId.equals(exposureId)) {
	 * System.out.println("Pass");
	 * 
	 * } else { System.out.println("Fail"); } }
	 */

}