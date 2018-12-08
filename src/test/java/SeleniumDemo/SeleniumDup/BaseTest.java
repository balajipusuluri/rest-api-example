package SeleniumDemo.SeleniumDup;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public  class BaseTest {

	protected static WebDriver d;

	@Test
	public void openBrowser() {
		System.setProperty("driver.chrome.driver", "D:\\eclipse\\chromedriver");
		d = new ChromeDriver();   
		d.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		d.get("https://www.amazon.com");
	
		d.manage().window().maximize();
	

	}

	@AfterMethod
	public void close() {
		d.close();
	}

}
