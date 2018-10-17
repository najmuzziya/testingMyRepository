package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DashboardPage {

	WebDriver driver;
	
	@FindBy(xpath="//a[contains(text(),'Log Out')]")
	private WebElement logoutclick;
	
	
	public DashboardPage(WebDriver driver)
	{
		this.driver =driver;
		
	}
	public void logoutAsAdmin()
	{
		logoutclick.click();
	}
	
	public String getPageTitle()
	{
		return driver.getTitle();
		
	  	
	}
}