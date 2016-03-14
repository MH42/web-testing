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

import pageObjects.AddDocument;
import pageObjects.FileContextMenu;
import pageObjects.LoginPage;
import pageObjects.Statusbar;
import pageObjects.SwitchTabs;

public class CheckoutFileTest {
	
	WebDriver driver;
	LoginPage login;
	SwitchTabs tabs;
	AddDocument add;
	FileContextMenu menu;
	Statusbar status;
	WebElement file;
	Actions action;
	String sep = System.getProperty("file.separator");
	String dir = System.getProperty("user.dir")+sep+"web-testing" +sep+"intro.pdf";
	
	@Before
	public void setUp() throws Exception{
		driver = new FirefoxDriver(); 
		login = new LoginPage(driver);
		tabs = new SwitchTabs(driver);
		add = new AddDocument();
		menu = new FileContextMenu(driver);
		status = new Statusbar(driver);
		action = new Actions(driver);
		
		login.loginAdmin();
		tabs.switchTabs("Documents");
		//add.addDocument(dir, driver);
		menu.setFileLocator("div[eventproxy*='isc_DocumentsListGrid'] div table tbody tr td div img");		
	}
	
	@Test
	public void testCheckout() throws Exception {
		assertEquals("0", status.getText("Checked"));//checks status if file has been checked
		menu.click("Checkout");//clicks checkout in files contextmenu
	}
	
	@After
	public void tearDown() throws Exception{
		Thread.sleep(1000);
		menu.click("Checkin");
		//menu.click("Delete");
		driver.close();
	}
}
