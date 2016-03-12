package tests.fileActions;

import static org.junit.Assert.assertEquals;

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

public class ChangeLanguageFileTest {

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
		action = new Actions(driver);
		
		login.loginAdmin();
		tabs.switchTabs("Documents");
		//add.addDocument(dir, driver);
		driver.findElements(By.cssSelector("div[eventproxy*='isc_DocumentsListGrid'] div table tbody tr td div img"))
		.get(3).click(); //clicks first File opening fileForm
	}
	
	@Test
	public void changeLanguage() throws Exception {
		driver.findElements(By.cssSelector("div[eventproxy^='isc_HistoryPanel_'] div div form table tbody tr td[class='formCell'] table tbody tr td div")).get(1).click();
		action.sendKeys(Keys.ARROW_UP).sendKeys(Keys.ENTER).build().perform();
		driver.findElements(By.className("button")).get(0).click();
	}
	
	@After
	public void tearDown() throws Exception{
		//menu.click("Delete");
		driver.close();
	}

}
