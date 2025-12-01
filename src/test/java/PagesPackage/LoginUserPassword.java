package PagesPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginUserPassword {
	
	@FindBy(xpath="//input[@class='a-input-text a-span12 auth-autofocus auth-required-field']")
	private WebElement userPass;
	@FindBy(xpath="//input[@id='signInSubmit']")
	public WebElement signButtun;
	
	public LoginUserPassword(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}
	public void inUserPass(String password) {
		userPass.sendKeys(password);
	}
	public void clickSignButtun() {
		signButtun.click();
		
	}
	
	

}
