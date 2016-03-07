package tests;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import pageObjects.LoginPage;

public class TestFilter {
	public LoginPage login;
	public WebDriver driver;
	
	 @Before
	 public void setUp() throws Exception {
		 login = new LoginPage(driver);
		 login.loginAdmin();
		 driver = login.driver;	
		 driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	 	  }

	 @Test
	public void testFilter(String p, WebDriver driver){
		driver.findElement(By.xpath("//img[contains(@src, 'http://localhost:8080/skin/images/filter.png')]")).click();
		driver.findElement(By.id("isc_AZ")).clear();
		driver.findElement(By.id("isc_AZ")).sendKeys("intro");;
	}
	
		@After
		public void tearDown(){
			driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
			driver.quit();
		}
	
}