package tests;
import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import pageObjects.LoginPage;
import pageObjects.MainToolbar;

public class SearchTest {
	public WebDriver driver;
	public MainToolbar main;
	@Before
	public void setUp(){
		driver = new FirefoxDriver();
		LoginPage login = new LoginPage(driver);
		login.loginAs("admin", "admin");
	}
	@Test
	public void searchTest() throws Exception {
		main=new MainToolbar(driver);
		main.search("hello");
	}
	@After
	public void tearDown(){
		driver.close();		
	}
}
