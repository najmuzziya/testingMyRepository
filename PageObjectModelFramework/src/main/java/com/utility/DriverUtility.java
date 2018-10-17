package com.utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class DriverUtility {
	static WebDriver driver;
	
	public static WebDriver initializeDriver(String browserName)
	{
		if(browserName.equalsIgnoreCase("Chrome"))
		{
			System.setProperty("webdriver.chrome.driver","C:\\Users\\a07208trng_b4a.03.28\\Downloads\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();
			
		}
		else if(browserName.equalsIgnoreCase("IE"))
		{
			System.setProperty("webdriver.ie.driver", "C:\\Users\\a07208trng_b4a.03.28\\Downloads\\IEDriverServer_x64_3.8.0\\IEDriverServer.exe");
		 	driver = new  InternetExplorerDriver();
		 	
		}
		else {
			System.out.println("browser not found");
		}
		return driver;
	}
	

}
