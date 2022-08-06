package com.amazon;

import org.testng.annotations.Test;

import com.pages.Amazonwebelementslocators;
import com.utility.Library;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class AmazonwebelementsPOM extends Library{

  @Test(priority=0)
  public void amazonwebelements () {
	  String titleOfAmazonOnline = driver.getTitle();
		 System.out.println("titleOfAmazonOnline:"+titleOfAmazonOnline);
		 Assert.assertEquals(titleOfAmazonOnline, objProperties.getProperty("AmazonOnlineTitle"));
  }
  @Test (priority=1)
  public void sendproductname() {
	  driver.findElement(Amazonwebelementslocators.firetvstickproduct).sendKeys("fire tv stick");
	  driver.findElement(Amazonwebelementslocators.submitthefirestick).submit();
	  driver.findElement(Amazonwebelementslocators.firetvstickgeneration3).click();
	
	

	 
  }
  @BeforeMethod
  public void beforeMethod() {
  }

  @AfterMethod
  public void afterMethod() {
  }

  @BeforeClass
  public void beforeClass() {
  }

  @AfterClass
  public void afterClass() {
  }

  @BeforeTest
  public void beforeTest() {
	Library.LaunchBrowser();
  }

 
@AfterTest
  public void afterTest() {
  }

  @BeforeSuite
  public void beforeSuite() {
	 
			ReadPropertiesFile();
			WebDriverManager.chromedriver().setup();
			driver= new ChromeDriver();
  }

 
@AfterSuite
  public void afterSuite() {
  }

}
