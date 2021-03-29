package hybridWebOrders;



import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;





public class BaseClass{
	public static WebDriver driver;
	public static Properties prop;
	public BaseClass() throws IOException {
		try {
			prop = new Properties();
			 FileInputStream ip = new FileInputStream("C:\\Users\\home\\Desktop\\EPOS_HYBRID\\hybridWebOrders\\configs\\config.properties");
			 prop.load(ip);
		}catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
	}
	public void initlization()  {
		String BrowserName = prop.getProperty("Browser");
		if(BrowserName.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\home\\Desktop\\java\\chromedriver\\chromedriver_win32 (1)\\chromedriver.exe");
			driver = new ChromeDriver();
			System.out.println("Chrome Opend...");
			
		}else {
			System.out.println("no browser....");
		}
		
		driver.manage().deleteAllCookies();
		 driver.get(prop.getProperty("URL"));
		driver.manage().timeouts().pageLoadTimeout(TestUtils.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
	   
		
		driver.manage().window().maximize();
		
		
	}
}


