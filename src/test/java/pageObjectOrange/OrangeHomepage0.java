package pageObjectOrange;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OrangeHomepage0 extends OrangeHRMBasePage {

	WebDriver driver;
	public OrangeHomepage0(WebDriver driver)
	{
		super(driver);
	}

	
	 //Locators
	  
	  @FindBy(xpath = "//input[@placeholder='Username']")
	  WebElement username;
	  
	  @FindBy(xpath = "//input[@placeholder='Password']")
	  WebElement password;
	  
	  @FindBy(xpath="//button[normalize-space()='Login']")
	  WebElement loginbtn;
	  
	  
	  
	  //Actions Methods
  
	  public void login(String uname, String pass) {
		  waitForElement(username);
	        username.sendKeys(uname);
	        
	        waitForElement(password);
	        password.sendKeys(pass);
	        
	        waitForElement(loginbtn);
	        loginbtn.click();

	  }
}
