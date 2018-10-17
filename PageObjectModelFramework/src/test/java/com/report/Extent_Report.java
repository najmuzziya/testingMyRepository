package com.report;

import java.io.File;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.SkipException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class Extent_Report {
	ExtentReports extent;
	ExtentTest logger;
	
	@BeforeTest
	public void startReport()
	{
		extent = new ExtentReports(System.getProperty("user.dir")+ "/target/surefire-report/ExtentReportResults.html",true);
		extent.addSystemInfo("Host Name","Selenium Test").addSystemInfo("Environment", "Automation Testing").addSystemInfo("User Name", "");
		extent.loadConfig(new File(System.getProperty("user.dir")+"\\extent-config.xml"));
	}
	
	@AfterTest
	public void endReport()
	{
		extent.flush();
		extent.close();
	}
	@AfterMethod
	public void genrateresults(ITestResult result)
	{
		if(result.getStatus() == ITestResult.FAILURE)

		{

		logger.log(LogStatus.FAIL,"Test case failed is:"+result.getName());

		logger.log(LogStatus.FAIL,"Test case failed is:"+result.getThrowable());

		}

		else if(result.getStatus() == ITestResult.SKIP)

		{

		logger.log(LogStatus.SKIP,"Test case skipped is:"+result.getName());

		logger.log(LogStatus.SKIP,"Test case skipped is:"+result.getThrowable());

		}

		extent.endTest(logger);

		}
	
	@Test
	public void register()
	{
		logger = extent.startTest("register");
		Assert.assertTrue(true);
		logger.log(LogStatus.PASS," passed");
		
	}
	@Test
	public void login()
	{
		logger = extent.startTest("Login");
		Assert.assertTrue(false);
		
		
	}
	@Test
	public void mobileRecharge()
	{
		logger = extent.startTest("Mobile Reachare");
		throw new SkipException("not ready");
		
	}
	

}
