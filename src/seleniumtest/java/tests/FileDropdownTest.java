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
	public FileDropDown drop = new FileDropDown();
	@Before
	public void setUp(){
		LoginPage login = new LoginPage(driver);
		login.loginAdmin();
		this.driver=login.driver;
	}
	@Test
	public void openDropdown() throws Exception {
		main.mainMenu("File", driver);
	}
	@Test
	public void exitDropDown() throws Exception {
		main.mainMenu("File", driver);
		drop.click("Exit", driver);		
	}
	@Test
	public void logout() throws Exception {
		main.mainMenu("File", driver);
		drop.click("Exit", driver);
		
	}
	@After
	public void tearDown(){
		driver.quit();
	}
}
