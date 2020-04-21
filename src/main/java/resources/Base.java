package resources;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Base {

	public static WebDriver driver;

	
	public WebDriver browserInitialize() throws IOException {
		
		FileInputStream fis = new FileInputStream("/Users/arpit/Eclipse/eclipse-workspace3/FinanceSite_Project/src/main/java/resources/config.properties");
		Properties prop = new Properties();
		prop.load(fis);
		String browser = prop.getProperty("browser");
		
		if(browser.equalsIgnoreCase("Chrome"))//Chrome Driver Initialization 
		{
		
		System.setProperty("webdriver.chrome.driver", "/Users/arpit/Eclipse/eclipse-workspace3/FinanceSite_Project/chromedriver");
		driver = new ChromeDriver();
		driver.get(prop.getProperty("Url"));
		}
		else if(browser.equalsIgnoreCase("Firefox"))// Firefox Driver Initialization
		{
		
		//System.setProperty("webdriver.chrome.driver", "/Users/arpit/Eclipse/eclipse workspace3/FinanceSite_Project/chromedriver");
		driver = new FirefoxDriver();
		driver.get(prop.getProperty("Url"));
		}
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		return driver;
		
	}
	
	
	

}