package tests.mainToolbar;
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
	public void setUp() throws Exception{
		driver = new FirefoxDriver();
		LoginPage login = new LoginPage(driver);
		login.loginAdmin();
		main = new MainToolbar(driver);
	}
	@Test
	public void searchTest() throws Exception {
		main.search("hello",driver);
	}
	@After
	public void tearDown(){
		driver.close();		
	}
}
