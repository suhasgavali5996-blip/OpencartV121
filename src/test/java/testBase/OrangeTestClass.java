package testBase;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import pageObjectOrange.ClaimLoginPage;
import pageObjectOrange.OrangeHomePage;
import pageObjectOrange.OrangeHomepage0;

public class OrangeTestClass extends OrangeBaseClass {
	
	@Test
	public void verifylogin() throws InterruptedException {
		
		  OrangeHomepage0 loginPage = new OrangeHomepage0(driver);
	        loginPage.login("Admin", "admin123");
		
	        OrangeHomePage homePage = new OrangeHomePage(driver);
	        homePage.clickClaim();

	        ClaimLoginPage claimLogin = new ClaimLoginPage(driver);
	        String confmsg=claimLogin.getConfmsg();
			
			if(confmsg.equals("Employee Claims"))
			{
				assertTrue(true);
	}
	

	}
}
