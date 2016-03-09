package tests;
import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import pageObjects.ConfirmationPopup;
import pageObjects.FileDropDown;
import pageObjects.LoginPage;
import pageObjects.MainToolbar;

public class FileDropdownTest {
	public WebDriver driver;
	public String baseUrl;
	public MainToolbar main;
	public FileDropDown drop;
	public ConfirmationPopup exit;
	@Before
	public void setUp(){
		driver = new FirefoxDriver();
		main = new MainToolbar(driver);
		drop = new FileDropDown(driver);
		exit = new ConfirmationPopup(driver);
		LoginPage login = new LoginPage(driver);
		login.loginAdmin();		
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	}
	@Test
	public void logout() throws Exception {
		main.click("File");
		drop.click("Exit");
		exit.click("No");
		
	}
	@After
	public void tearDown(){
		driver.quit();
	}
}
