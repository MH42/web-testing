package tests.tools;

import static org.junit.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import pageObjects.LoginPage;
import pageObjects.MainToolbar;
import pageObjects.SwitchTabs;
import pageObjects.ToolDropdown;

public class ExportDropboxTest {
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
	}
	@Test
	public void exportFromDropbox() throws Exception {
		tabs.switchTabs("Documents");
//		driver.findElements(By.cssSelector("td[onfocus*='isc_ToolStripMenuButton_7'] table tbody tr td"))
//		.get(0)
//		.click();
		drop.click("Export to Dropbox");
		driver.findElement(By.cssSelector("input[name='code']")).sendKeys("test");//inputs oauth key in form
		driver.findElement(By.cssSelector("td[onfocus^='isc_SubmitItem']")).click();//submits oauth key
		WebElement warn = driver.findElement(By.cssSelector("div[eventproxy^='isc_globalWarn_messageLabel'] table tbody tr td"));
		Thread.sleep(1000);
		assertEquals("Unable to authorize",warn.getText());
	}
	@After
	public void tearDown(){
		driver.quit();
	}
}
