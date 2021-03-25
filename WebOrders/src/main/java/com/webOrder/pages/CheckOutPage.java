package com.webOrder.pages;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.util.TimeUtils;

import com.webOrders.base.BaseClass;
import com.webOrders.resources.TestUtils;

public class CheckOutPage extends BaseClass {
 By ContinueAsGuest = By.id("guest_tabb");
 By name = By.id("guest_name");
 By email = By.id("guest_email");
 By phone = By.id("guest_phone");
 By next = By.xpath("//*[@id=\"guest-in\"]/div[3]/div/div/div/button");
 By AddIDM2 = By.xpath("(//img[@src='https://www.food-order.net//assets/web_orders_v2/images/inc.svg'])[1]");
 By Pay_By_Cash = By.xpath("//*[@id=\"poc\"]");
 By Pay_By_Cards = By.id("1");
 By Final_Payment = By.xpath("//*[@id=\"final_pay\"]/div/span");
	public CheckOutPage() throws IOException {
		super();
		PageFactory.initElements(driver, this);
		
	}
	public void clickOnContinueAsGuest() {
		driver.findElement(ContinueAsGuest).click();
	}
	public void enterDetails(String un, String mail, String ph ) {
		driver.findElement(name).sendKeys(un);
		driver.findElement(email).sendKeys(mail);
		driver.findElement(phone).sendKeys(ph);
	}
	public void clickOnNext() throws IOException {
		driver.findElement(next).click();
		
	}
	public void clickOnAddItem() {
		driver.findElement(AddIDM2).click();
		
		driver.manage().timeouts().pageLoadTimeout(TestUtils.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtils.IMPLICITY_WAIT, TimeUnit.SECONDS);
		
	}
	public void POD() {
		
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.elementToBeClickable(Pay_By_Cash));
		System.out.println("Page load1 completed..");
		driver.get(driver.getCurrentUrl());
		driver.findElement(Pay_By_Cash).click();
		
		
		
	}
public void paymentment(){
		String expected ="�13.00";
		String actual = driver.findElement(Final_Payment).getText();
		System.out.println(actual);
		Assert.assertEquals(expected, actual);
		driver.findElement(Final_Payment).click();	
	}

}
