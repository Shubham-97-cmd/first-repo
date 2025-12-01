package PagesPackage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OrderMackBook {
	
	@FindBy(xpath="//input[@id='twotabsearchtextbox']")
	WebElement typeSearchOnAmazon;
	
	@FindBy(xpath="//input[@id='nav-search-submit-button']")
	WebElement clickSearchButtun;

}
