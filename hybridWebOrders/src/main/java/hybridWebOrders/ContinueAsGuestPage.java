package hybridWebOrders;

import java.io.IOException;

import org.openqa.selenium.By;

public class ContinueAsGuestPage extends BaseClass{

By Name_CAG = By.name("guest_name");
By Email_CAG = By.name("guest_email");
By Phone_CAG = By.name("guest_phone");
By radio_CAG = By.id("prm_flag21");
By ContinueAsGuest = By.xpath("//*[@id=\"login_popup\"]/div/div/div/div/div[3]/div/div/div/div[3]/div/div/div[2]/button");
By login = By.xpath("//*[@id=\"login_popup\"]/div/div/div/div/div[3]/div/div/div/div[3]/div/div/div[1]/button");
	public ContinueAsGuestPage() throws IOException {
		super();
		
	}
	public void enterDeatilsinContinueAsGuest(String name, String Email,String phone) {
		driver.findElement(Name_CAG).sendKeys(name);
		driver.findElement(Email_CAG).sendKeys(Email);
		driver.findElement(Phone_CAG).sendKeys(phone);
		driver.findElement(radio_CAG).click();
	}
	public void clickOnContinueAsGuest_CAG() {
		driver.findElement(ContinueAsGuest).click();
	}
	public void clickOnLogin() {
		driver.findElement(login).click();
	}
	

}
