package object_repositories;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {

	public WebDriver driver;
	
	By createaccount = By.cssSelector("//a[contains(text(),'create an account.')]");
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public WebElement Createaccount() throws InterruptedException
	{
		return driver.findElement(createaccount);
	}
	
	
}
