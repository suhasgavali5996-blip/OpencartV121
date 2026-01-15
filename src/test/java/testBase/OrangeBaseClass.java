package testBase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

public class OrangeBaseClass {
	
	protected WebDriver driver;

	    @BeforeClass
	    @Parameters({"browser"})
	    public void setup(@Optional("chrome") String br) {

	        switch (br.toLowerCase()) {
	            case "chrome":
	                driver = new ChromeDriver();
	                break;

	            case "edge":
	                driver = new EdgeDriver();
	                break;

	            case "firefox":
	                driver = new FirefoxDriver();
	                break;

	            default:
	                System.out.println("Invalid browser name");
	                return;
	        }

	        driver.manage().window().maximize();
	        driver.get("https://opensource-demo.orangehrmlive.com/");
	    }

	    @AfterClass
	    public void teardown() {
	        if (driver != null) {
	            driver.quit();
	        }
	    }
	}
