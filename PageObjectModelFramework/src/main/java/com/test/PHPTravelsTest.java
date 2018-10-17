package com.test;



//import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.pages.DashboardPage;
import com.pages.loginPage;
import com.utility.DriverUtility;

public class PHPTravelsTest {
	WebDriver driver;
	loginPage lp;
	DashboardPage dp;
	
	@BeforeTest
	public void openApp()
	{
		driver = DriverUtility.initializeDriver("Chrome");
		
		
		lp= PageFactory.initElements(driver, loginPage.class);
		dp= PageFactory.initElements(driver, DashboardPage.class);
	}
	@AfterTest
	public void closeApp()
	{
		driver.close();
		lp=null;
		dp=null;
	
	}
	@Test(priority=0)
	public void validAdminTest() throws InterruptedException 
	{
		lp.get();
		lp.loginAsAdmin("admin@phptravels.com", "demoadmin");
		Thread.sleep(6000);
		Assert.assertEquals(dp.getPageTitle(),"Dashboard");
		dp.logoutAsAdmin();
		Thread.sleep(5000);
		Assert.assertEquals(dp.getPageTitle(),"Administator Login");	
	}
	
	

}
