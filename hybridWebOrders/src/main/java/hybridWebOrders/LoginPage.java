package hybridWebOrders;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.util.TimeUtils;

public class LoginPage extends BaseClass {
	//Object Repository
	By Browse_Menu = By.xpath("//*[@id=\"order_type_display\"]/div[2]/div[4]/div/div/button[1]");
	By Login = By.xpath("/html/body/div[4]/div/div/div/div[3]/div");
	By Email = By.id("user_email1");
	By password = By.id("user_pwd1");
	By Login_login = By.xpath("//*[@id=\"login_popup\"]/div/div/div/div/div[1]/div/div/div/div[3]/div/div/div[2]/button");
	By SignUp_login = By.xpath("//*[@id=\"login_popup\"]/div/div/div/div/div[1]/div/div/div/div[3]/div/div/div[1]/button");
	By ForgotPassword = By.id("fb-pwd");
	By Email_fp = By.name("user_email");
	By Submit = By.xpath("//*[@id=\"login_popup\"]/div/div/div/div/div[4]/div/div/div/div[3]/div/div/div[2]/button");
	By Login_fp = By.xpath("//*[@id=\"login_popup\"]/div/div/div/div/div[4]/div/div/div/div[3]/div/div/div[1]/button");
	//Object Initialization
	public LoginPage() throws IOException {
		super();
		
		PageFactory.initElements(driver, this);
		
	}
	
	public void clickOnBrowse_Menu() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, 15);
	    WebElement BrowseMenuElement = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"order_type_display\"]/div[2]/div[4]/div/div/button[1]")));
	    BrowseMenuElement.click();

				
	    Thread.sleep(10000);
	}
	public void clickOnLogin() {
		WebDriverWait wait = new WebDriverWait(driver, 15);
	    WebElement LoginElement = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[4]/div/div/div/div[3]/div")));
	    LoginElement.click();
		

	}
	public void clickOnLogincreds(String email, String pwd) {
		driver.findElement(Email).sendKeys(email);
		driver.findElement(password).sendKeys(pwd);
		driver.findElement(Login_login).click();
		
		
	}
	public void clickOnForgotPassword() {
		driver.findElement(ForgotPassword).click();
	}
	
	public void enterDetailsInEmail(String email) {
		driver.findElement(Email_fp).sendKeys(email);
	}
	public void clickOnSubmit() {
		driver.findElement(Submit).click();
	}
	public void clickOnLogInFp() {
		driver.findElement(Login_fp).click();
	}
	public SignUpPage clickOnSignUp_login() throws IOException{
		driver.findElement(SignUp_login).click();
		
		

		return new SignUpPage();
		
	}

}
