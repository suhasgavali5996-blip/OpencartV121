package testBase;

import static org.testng.Assert.assertEquals;
import org.testng.annotations.Test;

import poEcommerce.Homepage;
import poEcommerce.LoginConfMsg;
import poEcommerce.LoginPage;

public class ETestClass extends EbaseClass {

	@Test
	public void verifylogin()
	{
		 Homepage homepage = new Homepage(driver);
	     homepage.clickloginbtn();
	     
	     LoginPage lPage=new LoginPage(driver);
	     lPage.setemail("hi@stepcampus.in");
	     lPage.setpass("Stepcampus@123");
	     lPage.clicklogin();
	     
	     LoginConfMsg msg = new LoginConfMsg(driver);
	        String actualMsg = msg.getConfMsg();

	        assertEquals(actualMsg, "Login Successful");
	    }
	}


