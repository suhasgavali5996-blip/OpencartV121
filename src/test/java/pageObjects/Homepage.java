package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Homepage extends BasePage {
	WebDriver driver;
	//Constructor 
	public Homepage(WebDriver driver)
	{
		super(driver);
	}
	
	//Locators
	@FindBy(xpath = "//span[normalize-space()='My Account']")
	WebElement lnkMyaccount;
	
	@FindBy(xpath = "//a[normalize-space()='Register']")
	WebElement lnkRegister;
	
	
	
	//Action Methods
	
	public void ClickMyAccount()
	{
		lnkMyaccount.click();
	}

	
	public void ClickRegister()
	{
		lnkRegister.click();
	}
}
