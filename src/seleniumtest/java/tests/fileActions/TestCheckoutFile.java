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
import pageObjects.SwitchTabs;

public class TestCheckoutFile {
	
	WebDriver driver;
	LoginPage login;
	SwitchTabs tabs;
	AddDocument add;
	FileContextMenu menu;
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
		action = new Actions(driver);
		
		login.loginAdmin();
		tabs.switchTabs("Documents");
		//add.addDocument(dir, driver);
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
