package testBase;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.Homepage;
import pageObjects.RegisterPage;

public class TC001_RegistrationTest extends BaseClass {
	
	@Test
	public void verifyRegisterAccount() throws InterruptedException
	{
		logger.info("*** Execution Started******");
		try
		{
		Homepage hp=new Homepage(driver);
		hp.ClickMyAccount();
		logger.info("Clicked on MyAccount");
		hp.ClickRegister();
		logger.info("Clicked on Register");
		logger.info("Navigated on Register page");
		Thread.sleep(5000);
		
		RegisterPage rp= new RegisterPage(driver);
		logger.info("Providing costomer Details");
		rp.setFirstName(randomString().toUpperCase());
		rp.setLastName(randomString().toUpperCase());
		rp.setFEmail(randomString()+"@gmail.com");
		rp.setTelphone(randomNumber());
		
		String password =randomAlphanumeric();
		
		rp.setPassword(password);
		rp.setConPassword(password);
		rp.setPP();
		logger.info("Entered all costomer Details");
		rp.Continue();
		String confmsg=rp.getConfmsg();
		
		if(confmsg.equals("Your Account Has Been Created!"))
		{
			assertTrue(true);
		}
		else 
		{
			logger.error("Test Failed:");
		    logger.debug("Debug logs");  // full stack trace
			assertTrue(false);
		}
		
		assertEquals(confmsg, "Your Account Has Been Created!");
		logger.info("Execution Complted ");
		}
		catch (Exception e)
		{
		    Assert.fail();
		    
		}
	}
	
}

	
	
	

	


