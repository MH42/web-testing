package tests.fileActions;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import pageObjects.AddDocument;
import pageObjects.FileContextMenu;
import pageObjects.LoginPage;
import pageObjects.Statusbar;
import pageObjects.SwitchTabs;

public class CopyFileTest {
	
	WebDriver driver;
	LoginPage login;
	SwitchTabs tabs;
	AddDocument add;
	FileContextMenu menu;
	Statusbar status;
	WebElement file;
	
	@Before
	public void setUp() throws Exception{
		driver = new FirefoxDriver(); 
		login = new LoginPage(driver);
		tabs = new SwitchTabs(driver);
		add = new AddDocument();
		menu = new FileContextMenu(driver);
		status = new Statusbar(driver);
		
		login.loginAdmin();
		tabs.switchTabs("Documents");
		//add.addDocument(dir, driver);
		menu.setFileLocator("div[eventproxy*='isc_DocumentsListGrid'] div table tbody tr td div img");	//locates first document in docList	
	}
	
	@Test
	public void testCopy() throws Exception {
		assertEquals("0",status.getText("Clipboard")); 
		menu.click("Copy"); // clicks copy in files contextmenu
		assertEquals("1",status.getText("Clipboard"));
	}

	@After
	public void tearDown() throws Exception{
		//menu.click("Delete");
		driver.close();
	}
}
