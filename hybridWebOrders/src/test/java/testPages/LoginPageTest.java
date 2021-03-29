package testPages;

import org.testng.annotations.Test;

import hybridWebOrders.BaseClass;
import hybridWebOrders.LoginPage;
import hybridWebOrders.SignUpPage;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import java.io.IOException;

import org.testng.annotations.AfterClass;

public class LoginPageTest extends BaseClass {
	LoginPage loginpage;
	SignUpPage signup;
	//constructor
  public LoginPageTest() throws IOException {
		super();
		loginpage = new LoginPage();
		signup = new SignUpPage();
		
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
@Test(priority =6)
public void verify_clickOnContinueAsGuest() {
	signup.clickOnContinueAsGuest();
}
  @BeforeSuite
  public void beforeClass() {
	  initlization();
  }

  /*@AfterClass
  public void afterClass() {
	  driver.close();
  }*/

}
