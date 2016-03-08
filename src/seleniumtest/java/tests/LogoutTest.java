package tests;
import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import pageObjects.ExitPopup;
import pageObjects.LoginPage;
import pageObjects.MainToolbar;

public class LogoutTest {
	public WebDriver driver;
	public String baseUrl;
	public MainToolbar main;
	public ExitPopup exit;
	
	@Before
	public void setUp(){
		driver = new FirefoxDriver();
		LoginPage login = new LoginPage(driver);
		login.loginAdmin();
		main = new MainToolbar(driver);
		exit = new ExitPopup(driver);
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	}
	@Test
	public void logout() throws Exception {
		main.click("Logout");
		exit.click("Yes");		
	}
	@After
	public void tearDown(){
		driver.quit();
	}
}
