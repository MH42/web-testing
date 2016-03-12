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

import pageObjects.AddDocument;
import pageObjects.FileContextMenu;
import pageObjects.LoginPage;
import pageObjects.SwitchTabs;

public class VoteFileTest {
	
	WebDriver driver;
	LoginPage login;
	SwitchTabs tabs;
	FileContextMenu menu;
	AddDocument add;
	WebElement file;
	String sep = System.getProperty("file.separator");
	String dir = System.getProperty("user.dir")+sep+"web-testing" +sep+"intro.pdf";
	
	@Before
	public void setUp() throws Exception{
		driver = new FirefoxDriver(); 
		login = new LoginPage(driver);
		tabs = new SwitchTabs(driver);
		menu = new FileContextMenu(driver);
		add = new AddDocument();
		
		login.loginAdmin();
		tabs.switchTabs("Documents");
		driver.findElement(By.cssSelector("div[eventproxy*='isc_DocumentsListGrid'] div table tbody tr td div img"))
		.click();		
	}
	
	@Test
	public void testDownload() throws Exception {
		//Click on stars for voting
		driver.findElement(By.cssSelector("img[src*='http://localhost:8080/skin/images/rating0.png']")).click();
		
		driver.findElement(By.id("isc_147")).sendKeys("3"); // Vote 1-5
		
		
		driver.findElement(By.cssSelector("div[eventproxy*='isc_ButtonItem_']"))
		.click();		// confirm vote 
		
		
	}
	@After
	public void tearDown() throws Exception{
		//menu.click("Delete");
		driver.close();
	}
}
