package poEcommerce;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Basepage {
	protected WebDriver driver;
	protected WebDriverWait wait;

	public Basepage (WebDriver driver)
	{
		this.driver=driver;
		wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		PageFactory.initElements(driver, this);
	}
	
	protected void waitForElement(WebElement element)
	{
		wait.until(ExpectedConditions.visibilityOf(element));
	}
	protected void waitForclick(WebElement element)
	{
		wait.until(ExpectedConditions.elementToBeClickable(element));
	}

}
