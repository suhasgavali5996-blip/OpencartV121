package poEcommerce;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Homepage extends Basepage{
	WebDriver driver;
	
	public Homepage (WebDriver driver)
	{
		super(driver);
	}
	
	@FindBy(xpath="//a[normalize-space()='Login']")
    WebElement loginbtn;
	
	
	public void clickloginbtn()
	{
		loginbtn.click();
	}
}
