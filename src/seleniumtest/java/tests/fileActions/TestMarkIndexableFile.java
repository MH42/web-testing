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
import pageObjects.SwitchTabs;

public class TestMarkIndexableFile {
	
	WebDriver driver;
	LoginPage login;
	SwitchTabs tabs;
	AddDocument add;
	FileContextMenu menu;
	WebElement file;
	String sep = System.getProperty("file.separator");
	String dir = System.getProperty("user.dir")+sep+"web-testing" +sep+"intro.pdf";
	
	@Before
	public void setUp() throws Exception{
		driver = new FirefoxDriver(); 
		login = new LoginPage(driver);
		tabs = new SwitchTabs(driver);
		add = new AddDocument();
		menu = new FileContextMenu(driver);
		
		login.loginAdmin();
		tabs.switchTabs("Documents");
		add.addDocument(dir, driver);
		file = driver.findElements(By.cssSelector("div[eventproxy*='isc_DocumentsListGrid'] div table tbody tr td div img"))
		.get(0);
		menu.setFile(file);		
	}
	
	@Test
	public void testMarkUnindex() throws Exception {
		menu.click("Mark unindexable");
	}
	
	@Test
	public void testMarkIndex() throws Exception {
		menu.click("Mark indexable");
	}
	
	@After
	public void tearDown(){
		driver.close();
	}
}