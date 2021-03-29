package testPages;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import hybridWebOrders.BaseClass;
import hybridWebOrders.ContinueAsGuestPage;
import hybridWebOrders.LoginPage;
import hybridWebOrders.SignUpPage;

public class CompleteLoginPageFunctionality extends BaseClass {
	LoginPage loginpage;
	SignUpPage signup;
	ContinueAsGuestPage continuasguest;
	//LoginPageTest loginpagetest;
  public CompleteLoginPageFunctionality() throws IOException {
		super();
		
		loginpage = new LoginPage();
		signup = new SignUpPage();
	//	loginpagetest = new LoginPageTest();
		continuasguest = new ContinueAsGuestPage();
	}
  @Test(priority = 1)
  public void Verfiy_clickOnBrowse_Menu_and_Login() throws InterruptedException {
	loginpage.clickOnBrowse_Menu();
	loginpage.clickOnLogin();
  }

@Test(priority = 2)
public void verify_clickOnLogin() {
	loginpage.clickOnLogincreds(prop.getProperty("Email"), prop.getProperty("password"));
}
@Test(priority = 3)
public void verify_clickOnSignUp(){
	try{
		
	   loginpage.clickOnSignUp_login();
	
} catch(Exception e) {
	e.printStackTrace();
}
}
@Test(priority = 4)
 public void verify_fillUpSignup() {
	signup.fillUpSignup(prop.getProperty("Name"), prop.getProperty("Email_signup"), prop.getProperty("password"), prop.getProperty("confirm_password"), prop.getProperty("Phone"));
	
  }
@Test(priority = 5)
public void Verify_clickOnSignMeUp() {
	signup.clickOnSignMeUp();
}
/*@Test(priority =6)
public void verify_clickOnContinueAsGuest() {
	signup.clickOnContinueAsGuest();
}
@Test(priority = 7)
public void verify_enterDeatilsinContinueAsGuest() {
	continuasguest.enterDeatilsinContinueAsGuest(prop.getProperty("Name"), prop.getProperty("Email_signup"), prop.getProperty("Phone"));
}
/*@Test(priority = 8)
public void verify_clickOnContinueAsGuest_CAG() {
	continuasguest.clickOnContinueAsGuest_CAG();
	
}*/
@BeforeClass
public void init() {
	initlization();
}
}
