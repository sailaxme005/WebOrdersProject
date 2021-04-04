package com.Delivery.testpages;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.Delivery.base.BaseClass;
import com.Delivery.pages.LoginPage;

public class DeliveryAddress extends BaseClass {
	LoginPage loginpage = new LoginPage();
	@BeforeClass
	public void Browserinit() throws InterruptedException {
		initilization();
	}
//	  @Test(priority = 1)
//  public void verify_clickOnDelivery() {
//		  loginpage.clickOnDelivery();
//		  loginpage.clickOnProceed();
//  }
//	  @Test(priority = 2)
//	  public void verify_clickOnChoose() throws InterruptedException {
//		  loginpage.clickOnChoose();
//		  loginpage.clickOnAddCart();
//		  loginpage.clickOnCheckOut();
//	  }
	  @Test(priority =1)
	  public void verify_clickOnContinueAsGuest() throws InterruptedException {
		  loginpage.clickOnContinueAsGuest();
		  loginpage.enterdetaile("sailaxmi", "sailaxmi@fininfocom.com", "8639165438");
	 
	  }
	  @Test(priority =2)

public void verify_next() {
	loginpage.clickOnNext();
}
}
