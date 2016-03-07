package tests;
import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import pageObjects.FileDropDown;
import pageObjects.LoginPage;
import pageObjects.MainToolbar;

public class FileDropdownTest {
	public WebDriver driver;
	public String baseUrl;
	public MainToolbar main = new MainToolbar();
	@Before
	public void setUp(){
		driver = new FirefoxDriver();
		LoginPage login = new LoginPage(driver);
		baseUrl="http://localhost:8080";
		login.loginAs("admin", "admin");
	}
	@Test
	public void openDropdown() throws Exception {
		main.mainMenu("File", driver);
	}
	@Test
	public void exitDropDown() throws Exception {
		main.mainMenu("File", driver);
	}
	@After
	public void tearDown(){
		driver.quit();
	}
}
