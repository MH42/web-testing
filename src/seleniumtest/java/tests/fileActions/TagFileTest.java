package tests.fileActions;

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
import pageObjects.LoginPage;
import pageObjects.SwitchTabs;

public class TagFileTest {

	WebDriver driver;
	LoginPage login;
	SwitchTabs tabs;
	AddDocument add;
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
		WebElement input = driver.findElement(By.name("newtag"));
		action.sendKeys(input, "test").sendKeys(Keys.ENTER).build().perform();
		driver.findElements(By.className("button")).get(3).click();
	}
	
	@After
	public void tearDown() throws Exception{
//		driver.findElement(By.cssSelector("div[eventproxy^='isc_MultiComboBoxItem_'] table tbody tr td table tbody tr td")).click();
//		driver.findElement(By.xpath("//div[contains(@eventproxy,'isc_FlowLayout_')]//img[src='http://localhost:8080/frontend/sc/skins/Simplicity/images/headerIcons/close.gif']")).click();
//		driver.findElements(By.className("button")).get(2).click();
//		driver.findElements(By.className("button")).get(0).click();
		//menu.click("Delete");
		driver.close();
	}

}
