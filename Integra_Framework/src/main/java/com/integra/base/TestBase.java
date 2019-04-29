package com.integra.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.integra.util.TestUtill;
import com.integra.util.WebEventListener;

public class TestBase 

{
	public static WebDriver driver;
	public static FileInputStream fileinput;
	public static Properties prop;
	public static EventFiringWebDriver e_driver;
	public static WebEventListener eventListener;

	//creating TestBase class constructor
	public TestBase()
	{
		try {
			fileinput = new FileInputStream("../Integra_Framework/src/main/java/com/integra/config/config.properties");
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
		prop = new Properties();
		try {
			prop.load(fileinput);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	public static void initilization()
	{
		String BrowserName = prop.getProperty("browser");
		if (BrowserName.equalsIgnoreCase("chrome")) 
		{
			System.setProperty("webdriver.chrome.driver", "/Integra_Framework/src/main/java/com/integra/labsetup/chromedriver.exe");
			driver = new ChromeDriver();
		}
		else if (BrowserName.equalsIgnoreCase("firefox")) 
		{
			driver = new FirefoxDriver();
			e_driver=new EventFiringWebDriver(driver);
			eventListener=new WebEventListener();
			e_driver.register(eventListener);
			driver=e_driver;
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(TestUtill.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtill.IMPLICIT_WAIT, TimeUnit.SECONDS);
		
		driver.get(prop.getProperty("URL"));
	}
	
	}
	}
