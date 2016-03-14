package tests.personal;

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
import pageObjects.PersonalDropdown;

public class AddContactTest {
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
		main.click("Personal");
	}
	@Test
	public void addContact() throws Exception {
		drop.click("Contacts");
		driver.findElements(By.xpath("//div[starts-with(@eventproxy,'isc_Contacts_')]//div[starts-with(@eventproxy,'isc_ToolStripButton_')]/table/tbody/tr/td")).get(1).click();
		driver.findElements(By.cssSelector("input[name='email']")).get(1).sendKeys("your@email.de");
		driver.findElement(By.cssSelector("div[eventproxy^='isc_ContactDetails_'] div div div div div div[eventproxy^='isc_ButtonItem_'] table tbody tr td")).click();
		WebElement verify = driver.findElement(By.xpath("//div[starts-with('isc_Contacts_')]/div[2]/div[2]/div/table/tbody[2]/tr/td"));
		assertEquals("your@email.de",verify.getText());
	}
	@After
	public void tearDown(){
		driver.quit();
	}
}
