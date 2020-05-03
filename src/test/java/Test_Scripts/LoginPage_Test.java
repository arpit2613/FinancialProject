package Test_Scripts;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

import object_repositories.LoginPage;
import resources.Base;

public class LoginPage_Test extends Base {
	

	public static Logger log = LogManager.getLogger(Base.class.getName());
	
	@Test
	public void getLoginpagetitle() throws InterruptedException
	{
		driver.getTitle();
		log.info("Login Title is Displayed");
		
	}
	
	
	@Test(enabled = false)
	public void create_newAccount() throws InterruptedException
	{
		log.error("This method is not running");
		LoginPage lp = new LoginPage(driver);
		lp.Createaccount().click();
	}	
	
	@Test(enabled = true)
	public void forgot_Password() throws InterruptedException
	{
		log.debug("Running Forgot Password Link Script");
		LoginPage lp = new LoginPage(driver);
		lp.ForgotPassword().click();
	}	

	
	
	@AfterTest(enabled = true)
	public void closebrowser()
	{
		
		driver.close();
		driver= null;
		log.debug("Browser Closed XXXXX");
		
	}

	
}
