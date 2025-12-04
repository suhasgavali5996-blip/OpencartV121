package testBase;

import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.time.Duration;
import java.util.Properties;

import org.apache.commons.lang3.RandomStringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;


public class BaseClass {
	
	public WebDriver driver;
	public Logger logger;
	public Properties p;
	
	@BeforeClass
	@Parameters({"os","browser"})
	public void Setup(String os,String br) throws IOException, InterruptedException
	{
		//Loading config.properties
		FileReader file = new FileReader("./src//test//resources//config.properties");
		p=new Properties();
		p.load(file);
		
		
		logger =LogManager.getLogger(this.getClass());
		
		if (p.getProperty("execution_env").equalsIgnoreCase("remote"))
		{
			DesiredCapabilities capabilities= new DesiredCapabilities();
			//for OS
			if(os.equalsIgnoreCase("windows"))
			{
				capabilities.setPlatform(Platform.WIN11);
			}
			else if(os.equalsIgnoreCase("mac"))
			{
				capabilities.setPlatform(Platform.WIN11);
			}
		    else if (os.contains("nux") || os.contains("nix"))
			{
		    System.setProperty("webdriver.chrome.driver", "drivers/chromedriver_linux");
		
			} else 
			{
		    System.out.println("No matching OS found: " + os);
		}
			//For Browser
			switch(br.toLowerCase())
			{
			case "chrome":capabilities.setBrowserName("chrome");break;
			case "edge":capabilities.setBrowserName("MicrosoftEdge");break;
			case "firefox":capabilities.setBrowserName("firefox");break;
			default:System.out.println("Invalid browser name");return;
			}
			driver =new RemoteWebDriver(new URL(" http://192.168.1.35:4444/wd/hub"), capabilities);
			
		}
		//for Local 
		if(p.getProperty("execution_env").equalsIgnoreCase("local"))
		{
			switch(br.toLowerCase())
			{
			case "chrome":driver=new ChromeDriver(); break;
			case "edge":driver=new EdgeDriver();break;
			case "firefox":driver=new FirefoxDriver();break;
			default:System.out.println("Invalid browser name");return;
			
		}
		
		
		}
		
		
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(p.getProperty("appurl"));  //Reading url from properties file 
		driver.manage().window().maximize();
		Thread.sleep(7000);
		
	}
	@AfterClass
	public void teardown()
	{
		driver.quit();
	}
	
	public String randomString()
	{
		String generatingString=RandomStringUtils.randomAlphanumeric(5);
		return generatingString;
	}
	
	public String randomNumber()
	{
		String generatingString=RandomStringUtils.randomNumeric(5);
		return generatingString;
	}
	
	public String randomAlphanumeric()
	{
		String generatingString=RandomStringUtils.randomAlphanumeric(5);
		String generatingNumber=RandomStringUtils.randomAlphabetic(4);
		return (generatingString+"@"+generatingNumber);
	}
	

}
