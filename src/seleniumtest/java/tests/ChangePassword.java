package tests;
import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import pageObjects.ConfirmationPopup;
import pageObjects.PersonalDropdown;
import pageObjects.LoginPage;
import pageObjects.MainToolbar;

public class ChangePassword {
	public WebDriver driver;
	public String baseUrl;
	public MainToolbar main;
	public PersonalDropdown drop;
	public ConfirmationPopup exit;
	@Before
	public void setUp(){
		driver = new FirefoxDriver();
		main = new MainToolbar(driver);
		drop = new PersonalDropdown(driver);
		exit = new ConfirmationPopup(driver);
		LoginPage login = new LoginPage(driver);
		login.loginAdmin();		
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	}
	@Test
	public void changePassword() throws Exception {
		main.click("Personal");
		drop.click("Change password");
		driver.findElement(By.cssSelector("input[onselect*='isc_PasswordItem_6']")).sendKeys("password");
		driver.findElement(By.cssSelector("input[onselect*='isc_PasswordItem_7']")).sendKeys("password");
		driver.findElement(By.cssSelector("input[onselect*='isc_PasswordItem_8']")).sendKeys("password");
		driver.findElement(By.cssSelector("td[onfocus*='isc_ButtonItem_']")).click(); //Save

	}
	@After
	public void tearDown(){
		driver.quit();
	}
}
