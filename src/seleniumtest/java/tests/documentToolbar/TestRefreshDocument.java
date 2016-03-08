package tests.documentToolbar;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import pageObjects.DocumentToolbar;
import pageObjects.LoginPage;
import pageObjects.SwitchTabs;

public class TestRefreshDocument {
	
	WebDriver driver;
	LoginPage login;
	SwitchTabs tabs;
	DocumentToolbar toolbar;
	
	
	@Before
	public void setup() throws Exception{
		driver = new FirefoxDriver();
		login = new LoginPage(driver);
		tabs = new SwitchTabs(driver);
		toolbar = new DocumentToolbar(driver);
		login.loginAdmin();
		tabs.switchTabs("Documents");
	}
	@Test
	public void refreshDoc() throws Exception {
		toolbar.click("Refresh");
	}
	@After
	public void tearDown(){
		driver.close();
	}

}
