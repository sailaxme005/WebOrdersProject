package com.weborder.testpages;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import hybridWebOrders.BaseClass;
import hybridWebOrders.LoginPage;
import hybridWebOrders.SignUpPage;

public class ForgotPasswordScreenTest extends BaseClass{
	LoginPage loginpage;
	SignUpPage signuppage;
  public ForgotPasswordScreenTest() throws IOException {
		super();
		loginpage = new LoginPage();
		signuppage = new SignUpPage();
	}

@Test(priority= 1)
  public void verify_clickOnForgotPassword(){
 loginpage.clickOnForgotPassword();

  }
@Test(priority= 2)
public void verify_enterDetailsInEmail() {
	loginpage.enterDetailsInEmail(prop.getProperty("Email_signup"));
}
@Test(priority = 3)
public void verify_clickOnSubmit() {
	loginpage.clickOnSubmit();
}
@Test(priority = 4)
public void verify_clickOnLogInFp() {
	loginpage.clickOnLogInFp();
}
@BeforeClass
public void initilizationDriver() throws InterruptedException {
	initlization();
	loginpage.clickOnBrowse_Menu();
	loginpage.clickOnLogin();
}
}
