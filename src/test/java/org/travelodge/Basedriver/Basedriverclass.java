package org.travelodge.Basedriver;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class Basedriverclass {

	public static WebDriver driver;

	  @BeforeTest
	  public void launchurl() throws InterruptedException, IOException {
	  	System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\src\\test\\java\\org\\travelodge\\driver\\chromedriver.exe");
	  	driver = new ChromeDriver();
	  	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	  	Thread.sleep(2000);
	  	System.out.println("Starting the suite");
	  	driver.get("https://www.travelodge.co.uk/");
	  driver.manage().window().maximize();
	  driver.manage().deleteAllCookies(); Thread.sleep(2000);
	  System.out.println("launching the URL");
	  }

	@AfterTest
	public void closethebrowser() {
		driver.close();
		driver.quit();
	}
}
