package com.weborder.testpages;

import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import hybridWebOrders.BaseClass;
import hybridWebOrders.LoginPage;
import hybridWebOrders.SignUpPage;

public class SignUpScreenPageTest extends BaseClass {
	LoginPage loginpage;
	SignUpPage signuppage;
	public SignUpScreenPageTest() throws IOException {
		super();
		loginpage = new LoginPage();
		signuppage = new SignUpPage();
		
	}
  @Test(priority = 1)
  public void verify_clickOnSignUp_login() throws IOException {
	  loginpage.clickOnSignUp_login();
  }
  @Test(priority = 2)
  public void verify_fillUpSignup() {
	  signuppage.fillUpSignup(prop.getProperty("Name"), prop.getProperty("Email_signup"), prop.getProperty("password"), prop.getProperty("confirm_password"), prop.getProperty("Phone"));
  }
  @Test(priority = 3)
  public void verify_clickOnSignMeUp() {
	  signuppage.clickOnSignMeUp();
  }
  @Test(priority = 4)
  public void verify_clickOnContinueAsGuest() {
	  signuppage.clickOnContinueAsGuest();
  }
  @BeforeClass
  public void Initilizationdriver() throws InterruptedException {
	  initlization();
	  loginpage.clickOnBrowse_Menu();
	  loginpage.clickOnLogin();
	  
  }
  /*@AfterClass
  public void tearDown() {
	  driver.quit();
  }*/
}
