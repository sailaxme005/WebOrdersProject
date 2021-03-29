package com.weborder.testpages;

import org.testng.annotations.Test;

import hybridWebOrders.BaseClass;
import hybridWebOrders.LoginPage;

import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

public class LoginPageScreenTest extends  BaseClass{
	LoginPage loginpage;
  public LoginPageScreenTest() throws IOException {
		super();
		loginpage = new LoginPage();
		
	}
@Test(priority = 1)
  public void verify_clickOnBrowse_Menu() throws InterruptedException{
	loginpage.clickOnBrowse_Menu();
	
  }
@Test(priority = 2)
public void verify_clickOnLogin() {
	loginpage.clickOnLogin();
}
@Test(priority = 3)
public void verify_clickOnLogincreds() {
	loginpage.clickOnLogincreds(prop.getProperty("Email"), prop.getProperty("password"));
}
  @BeforeClass
  public void beforeSuite() {
	  initlization();
  }
  /*@AfterClass
  public void TearDown() {
	  driver.quit();
  }*/

}
