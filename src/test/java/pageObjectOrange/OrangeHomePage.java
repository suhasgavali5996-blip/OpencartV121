package pageObjectOrange;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OrangeHomePage extends OrangeHRMBasePage {
	WebDriver driver;
	
	public OrangeHomePage(WebDriver driver)
	{
		super(driver);
	}

	
	//locators
	
	@FindBy(xpath = "//span[normalize-space()='Claim']")
	WebElement claim;
	
	
	//Action Methods 
	
	 public void clickClaim() {
		 waitForElement(claim);
	        claim.click();
	
}
}