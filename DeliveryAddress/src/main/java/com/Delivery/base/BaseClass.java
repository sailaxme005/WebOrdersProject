package com.Delivery.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
public static WebDriver driver;
public void initilization() throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\home\\Desktop\\java\\chromedriver\\chromedriver_win32 (1)\\chromedriver.exe");
	driver = new ChromeDriver();
	System.out.println("Chrome Opend...");
	driver.get("https://www.food-order.net/index.php/web_orders/Home/checkout?PHPSESSID=33077538b9eb8fdb253085b50d4b2e47c23126b8&uid=6052eb98d0012");
Thread.sleep(20000);
}
}
