package poEcommerce;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginConfMsg extends Basepage {
	
	 public LoginConfMsg(WebDriver driver) {
	        super(driver);
	    }

	    @FindBy(xpath = "//h1[normalize-space()='Login Successful']")
	    WebElement confmsg;

	    public String getConfMsg() {
	        waitForElement(confmsg);
	        return confmsg.getText();
	    }
	}
