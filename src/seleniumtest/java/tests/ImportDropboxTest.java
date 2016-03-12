package tests;

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
import pageObjects.SwitchTabs;
import pageObjects.ToolDropdown;

public class ImportDropboxTest {
	public WebDriver driver;
	public String baseUrl;
	public SwitchTabs tabs;
	public ToolDropdown drop;
	@Before
	public void setUp(){
		driver = new FirefoxDriver();
		tabs = new SwitchTabs(driver);
		drop = new ToolDropdown(driver);
		LoginPage login = new LoginPage(driver);
		login.loginAdmin();		
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	}
	@Test
	public void importFromDropbox() throws Exception {
		tabs.switchTabs("Documents");
		driver.findElements(By.cssSelector("td[onfocus^='isc_ToolStripMenuButton_7'] table tbody tr td"))
		.get(0)
		.click();
		driver.findElement(By.cssSelector("div[eventproxy='isc_Menu_9_body'] div table tbody tr td"))
		.click();
		drop.click("Import from Dropbox");
	}
	
	@After
	public void tearDown(){
		driver.quit();
	}
}
