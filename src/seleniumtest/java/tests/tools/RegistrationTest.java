package tests.tools;

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
import pageObjects.ToolDropdown;

public class RegistrationTest {
	public WebDriver driver;
	public String baseUrl;
	public MainToolbar main;
	public ToolDropdown drop;
	public ConfirmationPopup exit;
	@Before
	public void setUp() throws Exception{
		driver = new FirefoxDriver();
		main = new MainToolbar(driver);
		drop = new ToolDropdown(driver);
		exit = new ConfirmationPopup(driver);
		LoginPage login = new LoginPage(driver);
		login.loginAdmin();		
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	}
	@Test
	public void registerTest() throws Exception {
		main.click("Tools");
		drop.click("Registration");
		driver.findElement(By.cssSelector("input[name='reg_name']")).sendKeys("user");
		driver.findElement(By.cssSelector("td[onfocus*='isc_ButtonItem_']")).click();
	}
	@After
	public void tearDown(){
		driver.quit();
	}
}
