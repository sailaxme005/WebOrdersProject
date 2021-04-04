package com.Delivery.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.Delivery.base.BaseClass;

public class LoginPage extends BaseClass {
By Delivery = By.id("delivery_btn");
By Proceed = By.xpath("//*[@id=\"order_type_display\"]/div[2]/div[4]/div/div/button[2]");
By Choose = By.xpath("//*[@id=\"items\"]/div/div[2]/div/div/div[1]/div[2]/div[2]/div[2]/div/button");
By AddCart = By.id("addtocart");
By CheckOut = By.xpath("//*[@id=\"cart_view\"]/div[1]/div[3]/div[3]/div[4]/a/div");
By ContinueAsGuest = By.id("guest_tabb");
By Name = By.id("guest_name");
By email = By.id("guest_email");
By phone = By.id("guest_phone");
By Next = By.xpath("//*[@id=\"guest-in\"]/div[3]/div/div/div/button");
public LoginPage() {
	
	PageFactory.initElements(driver, this);
}
public void clickOnDelivery() {
	driver.findElement(Delivery).click();
}
public void clickOnProceed() {
	driver.findElement(Proceed).click();
}
public void clickOnChoose() {
	driver.findElement(Choose).click();
}
public void clickOnAddCart() {
	driver.findElement(AddCart).click();
}
public void clickOnCheckOut() throws InterruptedException {
	driver.findElement(CheckOut).click();
	Thread.sleep(10000);
}
public void clickOnContinueAsGuest() {
	driver.findElement(ContinueAsGuest).click();
}
public void enterdetaile(String name,String emailid, String number) throws InterruptedException {
	driver.findElement(Name).sendKeys(name);
	driver.findElement(email).sendKeys(emailid);
	driver.findElement(phone).sendKeys(number);
	Thread.sleep(20000);
	}
public void clickOnNext() {
	
	WebElement nextButton = driver.findElement(Next);
	JavascriptExecutor jse = (JavascriptExecutor)driver;
	jse.executeScript("arguments[0].click()", nextButton);

}
}
