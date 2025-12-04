package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegisterPage extends BasePage {

	public RegisterPage(WebDriver driver)
	{
		super(driver);
		
	}
	
	@FindBy(xpath ="//input[@id='input-firstname']")
	 WebElement Firstname;
	
	@FindBy(xpath ="//input[@id='input-lastname']")
	 WebElement Lastname;
	
	@FindBy(xpath ="//input[@id='input-email']")
	 WebElement Email;

	@FindBy(xpath ="//input[@id='input-telephone']")
	 WebElement Telphone;
	
	@FindBy(xpath ="//input[@id='input-password']")
	 WebElement Password;
	

	@FindBy(xpath ="//input[@id='input-confirm']")
	 WebElement ConPassword;
	
	@FindBy(xpath ="//input[@name='agree']")
	 WebElement PP;
	
	@FindBy(xpath ="//input[@value='Continue']")
	 WebElement Continue;
	
	
	@FindBy(xpath ="//h1[normalize-space()='Your Account Has Been Created!']")
	 WebElement ConfMsg;
	
	
	public void setFirstName(String FN)
	{
		Firstname.sendKeys(FN);
	}

	
	public void setLastName(String LN)
	{
		Lastname.sendKeys(LN);
	}

	public void setFEmail(String Eml)
	{
		Email.sendKeys(Eml);
	}
	
	public void setTelphone(String Tel)
	{
		Telphone.sendKeys(Tel);
	}
	
	public void setPassword(String pwd)
	{
		Password.sendKeys(pwd);
	}
	
	public void setConPassword(String pwd)
	{
		ConPassword.sendKeys(pwd);
	}

	
	

	public void setPP()
	{
		PP.click();
	}
	
	public void Continue()
	{
		Continue.click();
	}

	public String getConfmsg() {
	try {
		return (ConfMsg.getText());
	} catch (Exception e) {
		return (e.getMessage());
	}
		
	}

}

