package tests.fileActions;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import pageObjects.FileContextMenu;
import pageObjects.LoginPage;
import pageObjects.SwitchTabs;

public class TestSendEmailFile {
	
	WebDriver driver;
	LoginPage login;
	SwitchTabs tabs;
	FileContextMenu menu;
	WebElement file;
	
	@Before
	public void setUp() throws Exception{
		driver = new FirefoxDriver(); 
		login = new LoginPage(driver);
		tabs = new SwitchTabs(driver);
		menu = new FileContextMenu(driver);
		
		login.loginAdmin();
		tabs.switchTabs("Documents");
		file = driver.findElements(By.cssSelector("div[eventproxy*='isc_DocumentsListGrid'] div table tbody tr td div img"))
		.get(0);
		menu.setFile(file);		
	}
	
	@Test
	public void testEmail() throws Exception {
		menu.click("Send by email");
	}
	@After
	public void tearDown(){
		driver.close();
	}
}
