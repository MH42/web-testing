package tests.personal;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import pageObjects.ConfirmationPopup;
import pageObjects.LoginPage;
import pageObjects.MainToolbar;
import pageObjects.PersonalDropdown;

public class SignatureTest {
	public WebDriver driver;
	public String baseUrl;
	public MainToolbar main;
	public PersonalDropdown drop;
	public ConfirmationPopup exit;
	@Before
	public void setUp() throws Exception{
		driver = new FirefoxDriver();
		main = new MainToolbar(driver);
		drop = new PersonalDropdown(driver);
		exit = new ConfirmationPopup(driver);
		LoginPage login = new LoginPage(driver);
		login.loginAdmin();		
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	}
	@Test
	public void signatureTest() throws Exception {
		main.click("Personal");
		drop.click("My Signature");
	}
	@After
	public void tearDown(){
		driver.quit();
	}
}
