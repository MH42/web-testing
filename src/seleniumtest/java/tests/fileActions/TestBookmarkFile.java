package tests.fileActions;

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

public class TestBookmarkFile {
	
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
		file = driver.findElement(By.cssSelector("div[eventproxy*='isc_DocumentsListGrid'] div table tbody tr td div img"));
		menu.setFile(file);		
	}
	
	@Test
	public void testBookmark() throws Exception {
		menu.click("Add bookmark");
	}
	@After
	public void tearDown(){
		driver.close();
	}
}
