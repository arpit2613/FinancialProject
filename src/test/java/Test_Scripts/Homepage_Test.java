package Test_Scripts;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import object_repositories.Homepage;
import resources.Base;


public class Homepage_Test extends Base{
	
	public static Logger log = LogManager.getLogger(Base.class.getName());

	
	@BeforeTest
	public void startbrowser() throws IOException
	{
		driver = browserInitialize();
		log.debug("Browser Initialized....");

	}
	
	@Test
	public void getTitle()
	{
		String Title = driver.getTitle();
		log.info("Homepage Title is Displayed");
	}
	
	@Test
	public void getLogin()
	{
		Homepage hp = new Homepage(driver);
		hp.hitLogin().click();
		log.debug("Login Button Clicked");

	}
	
	@Test
	public void acceptcookie()
	{
		Homepage hp = new Homepage(driver);
		hp.acceptCookie().click();
		log.debug("Cookie Accepted");
		
	}
	
	@Test
	public void hoverMarketActivity()
	{
		Homepage hp = new Homepage(driver);
		hp.hoverMarketCity().click().build().perform();
		log.debug("Hovered Successfully");

	}
	
	
	
}
