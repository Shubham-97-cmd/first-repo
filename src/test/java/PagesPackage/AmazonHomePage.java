package PagesPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonHomePage {
	
	@FindBy(xpath="//a[@data-nav-ref='nav_ya_signin']")
	WebElement signIn;
	
	public AmazonHomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void clickSignInButton() {
		signIn.click();
		
	}

}
