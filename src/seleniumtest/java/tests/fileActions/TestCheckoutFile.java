package tests.fileActions;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import pageObjects.FileContextMenu;
import pageObjects.LoginPage;
import pageObjects.SwitchTabs;

public class TestCheckoutFile {
	
	WebDriver driver;
	LoginPage login;
	SwitchTabs tabs;
	FileContextMenu menu;
	WebElement file;
	Actions action;
	
	@Before
	public void setUp() throws Exception{
		driver = new FirefoxDriver(); 
		login = new LoginPage(driver);
		tabs = new SwitchTabs(driver);
		menu = new FileContextMenu(driver);
		action = new Actions(driver);
		
		login.loginAdmin();
		tabs.switchTabs("Documents");
		file = driver.findElements(By.cssSelector("div[eventproxy*='isc_DocumentsListGrid'] div table tbody tr td div img"))
		.get(0);
		menu.setFile(file);		
	}
	
	@Test
	public void testCheckout() throws Exception {
		menu.click("Checkout");
	}
	
	@Test
	public void testCheckin() throws Exception {
		menu.click("Checkin");
		action.click(driver.findElement(By.cssSelector("input[class='gwt-FileUpload']")))
			.sendKeys("intro.pdf")
			.sendKeys(Keys.ENTER)
			.build().perform();
	}
	
	@After
	public void tearDown(){
		driver.close();
	}
}
