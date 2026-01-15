package poEcommerce;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends Basepage{
	
     
	
	public LoginPage (WebDriver driver)
	{
		super(driver);
	}

	
	
	@FindBy(xpath="//input[@id='«r0»-form-item']")
	WebElement email;
	
	@FindBy(xpath="//input[@id='«r1»-form-item']")
	WebElement pass;
	
	@FindBy(xpath="//button[normalize-space()='Login']")
	WebElement loginbtn;
	
	
	public void setemail(String uname)
	{ 
		waitForElement(email);
		email.sendKeys(uname);
	}
	
	public void setpass(String pas)
	{
		waitForElement(pass);
		pass.sendKeys(pas);
	}
	
	public void clicklogin()
	{  
		waitForElement(loginbtn);
		loginbtn.click();
	}
}
