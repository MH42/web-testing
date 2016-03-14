package tests.tools;

import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
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
	public void setUp() throws Exception{
		driver = new FirefoxDriver();
		tabs = new SwitchTabs(driver);
		drop = new ToolDropdown(driver);
		LoginPage login = new LoginPage(driver);
		login.loginAdmin();		
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	}
	@Test
	public void failimportFromDropbox() throws Exception {
		tabs.switchTabs("Documents");
		drop.click("Import from Dropbox");
		driver.findElement(By.cssSelector("input[name='code']")).sendKeys("test");
		driver.findElement(By.cssSelector("td[onfocus^='isc_SubmitItem']")).click();
		WebElement warn = driver.findElement(By.cssSelector("div[eventproxy^='isc_globalWarn_messageLabel'] table tbody tr td"));
		Thread.sleep(1000);
		assertEquals("Unable to authorize",warn.getText());
	}
	/**
	 * tests successful import from Dropbox
	 * PLEASE NOTE: test needs fresh oauth token to succeed
	 * 
	 * @throws Exception
	 */
	@Test
	public void importFromDropbox() throws Exception {
		tabs.switchTabs("Documents");
		drop.click("Import from Dropbox");
		driver.findElement(By.cssSelector("input[name='code']")).sendKeys("9XBuaQhr8p0AAAAAAAAA56_yocTWnLRzBuc0n3XXoJg"); //place your new oauth token here
		driver.findElement(By.cssSelector("td[onfocus^='isc_SubmitItem']")).click();
		WebElement warn = driver.findElement(By.cssSelector("div[eventproxy^='isc_globalWarn_headerLabelParent'] table tbody tr td"));
		Thread.sleep(1000);
		assertEquals("Note",warn.getText());
	}
	
	@After
	public void tearDown(){
//		driver.quit();
	}
}
