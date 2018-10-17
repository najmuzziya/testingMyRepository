package com.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.LoadableComponent;
import org.testng.Assert;

public class loginPage extends LoadableComponent<loginPage> {

	WebDriver driver;
	
	@FindBy(name="email")
	private WebElement emailTxtBox;
	
	@FindBy(name="password")
	private WebElement pwdTxtBox;
	
	@FindBy(xpath="//button[@type='submit']")
	private WebElement loginButton;
	
	@FindBy(xpath="//button[@class='alert alert-danger loading wow fadeIn animated animated']")
	private WebElement message;
	
	
	public loginPage(WebDriver driver)
	{
		this.driver =driver;
		
	}
	public void loginAsAdmin(String email, String password)
	{
		emailTxtBox.sendKeys(email);
		pwdTxtBox.sendKeys(password);
		loginButton.click();
	}
	public String getMessage()
	{
		return message.getText();
		
	  	
	}
	public String getPageTitle()
	{
		return driver.getTitle();
		
	  	
	}
	@Override
	protected void load() {
		driver.get("https://www.phptravels.net/admin");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	
		
	}
	@Override
	protected void isLoaded() throws Error {
		String url=driver.getCurrentUrl();
		Assert.assertTrue(url.startsWith("https://www.phptravels.net"), "error loading");
		
		
	}

}
