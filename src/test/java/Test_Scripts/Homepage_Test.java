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
	
	@Test(priority=0)
	public void getTitle()
	{
		String Title = driver.getTitle();
		log.info("Homepage Title is Displayed");
	}
	
	@Test(priority=2)
	public void getLogin()
	{
		Homepage hp = new Homepage(driver);
		hp.hitLogin().click();
	}
	
	@Test(priority=1)
	public void acceptcookie()
	{
		Homepage hp = new Homepage(driver);
		hp.acceptCookie().click();
		
	}
	
	@Test
	public void hoverMarketActivity()
	{
		Homepage hp = new Homepage(driver);
		hp.hoverMarketCity().click().build().perform();
		log.debug("Hovered Successfully");

	}
	
	
	
}
