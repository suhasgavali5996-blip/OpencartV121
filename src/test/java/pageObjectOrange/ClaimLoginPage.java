package pageObjectOrange;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ClaimLoginPage extends OrangeHRMBasePage{
  WebDriver driver;
  
  public ClaimLoginPage(WebDriver driver)
  {
	  super(driver);
  }

  
  
  //Locators
  
  @FindBy(xpath = "//a[normalize-space()='Employee Claims']")
  WebElement ConfMsg;
	
  
  
  
  
  //Actions Methods
  
  public String getConfmsg() {
		try {
			return (ConfMsg.getText());
		} catch (Exception e) {
			return (e.getMessage());
		}

 }
}


