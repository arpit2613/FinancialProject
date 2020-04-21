package object_repositories;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Homepage {

	public WebDriver driver;
	
	By Login = By.xpath("//a[@class='primary-nav__login']");
	By CookieButton = By.id("_evidon-decline-button");
	By marketcity = By.xpath("//a[@href='/market-activity']");
	By stocks = By.xpath("//a[@href='/market-activity/stocks']");
	
	
	public Homepage(WebDriver driver)
	{
		this.driver = driver;
	}

	public WebElement hitLogin()
	{
		return driver.findElement(Login);
	}
	
	public WebElement acceptCookie()
	{
		return driver.findElement(CookieButton);
	}

	public Actions hoverMarketCity()
	{
		
		WebElement market = driver.findElement(marketcity);
		WebElement stock = driver.findElement(stocks);
		Actions ac = new Actions(driver);

		return ac.moveToElement(market).moveToElement(stock);
		
	}


	
}
