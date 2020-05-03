package object_repositories;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	public WebDriver driver;
		
	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(linkText = "create an account.")
	WebElement createAccount;
	
	@FindBy(linkText = "Forgot Password")
	WebElement forgotPassword;

	
	
	
	public WebElement Createaccount() throws InterruptedException
	{
		return createAccount;
	}
	
	public WebElement ForgotPassword() throws InterruptedException
	{
		return forgotPassword;
	}
	
}
