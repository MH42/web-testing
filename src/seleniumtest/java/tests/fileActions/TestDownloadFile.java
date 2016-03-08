package tests.fileActions;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import pageObjects.FileContextMenu;
import pageObjects.LoginPage;
import pageObjects.SwitchTabs;

public class TestDownloadFile {
	
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
		file = driver.findElements(By.cssSelector("img[src='http://localhost:8080/skin/images/indexed.png']"))
		.get(0);
		menu.setFile(file);		
	}
	
	@Test
	public void testDownload() throws Exception {
		menu.click("Download");
	}

}
