package tests.fileActions;

import static org.junit.Assert.assertNotNull;

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

public class IndexFileTest {
	
	WebDriver driver;
	LoginPage login;
	SwitchTabs tabs;
	AddDocument add;
	FileContextMenu menu;
	@Before
	public void setUp() throws Exception{
		driver = new FirefoxDriver(); 
		login = new LoginPage(driver);
		tabs = new SwitchTabs(driver);
		add = new AddDocument();
		menu = new FileContextMenu(driver);
		
		login.loginAdmin();
		tabs.switchTabs("Documents");
		//add.addDocument(dir, driver);
		menu.setFileLocator("div[eventproxy*='isc_DocumentsListGrid'] div table tbody tr td div img");		
	}
	
	@Test
	public void testIndex() throws Exception {
		menu.click("Index");
		Thread.sleep(1000);
		WebElement indexed = driver.findElement(By.cssSelector("img[src='http://localhost:8080/skin/images/indexed.png']"));
		assertNotNull(indexed);
	}
	@After
	public void tearDown() throws Exception{
		menu.click("Mark unindexable");
		Thread.sleep(1000);
		menu.click("Mark indexable");
		//menu.click("Delete");
		driver.close();
	}
}
