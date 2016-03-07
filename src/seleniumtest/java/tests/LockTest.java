package tests;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import pageObjects.LockFile;
import pageObjects.LoginPage;
import pageObjects.SwitchTabs;

public class LockTest {
	public LoginPage login;
	public LoginPage loginUser;
	public WebDriver driver;
	public SwitchTabs switchtabs;
	public LockFile lock;

	@Before
	public void setUp() throws Exception {
		 login = new LoginPage(driver);
		 login.loginAdmin();
		 driver = login.driver;
		 switchtabs = new SwitchTabs();
		 switchtabs.switchTabs("Documents", driver);	
		 driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	 	  }

	@Test
	public void lockTest() throws Exception {
		lock = new LockFile();
		lock.lockFile("intro.pdf", driver);
		loginUser = new LoginPage(driver);
		loginUser.loginAs("user", "password");
		lock.unLockFile("intro.pdf", driver);
		}
		

	@After
	public void tearDown(){
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.quit();
	}
}
