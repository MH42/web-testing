package tests;
import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import pageObjects.LoginPage;
import pageObjects.MainToolbar;

public class LogoutTest {
	public WebDriver driver;
	public String baseUrl;
	public MainToolbar main = new MainToolbar();
	
	@Before
	public void setUp(){
		driver = new FirefoxDriver();
		LoginPage login = new LoginPage(driver);
		baseUrl="http://localhost:8080";
		login.loginAdmin();
	}
	@Test
	public void logout() throws Exception {
//		WebElement mainBar = driver.findElements(By.className("toolStrip")).get(0);
//		WebElement logout = driver.findElement(By.xpath("img[@src='http://localhost:8080/frontend/sc/skins/Simplicity/images/actions/close.png']"));
		main.mainMenu("Logout", driver);
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.findElement(By.id("isc_7E")).click();
	}
	@After
	public void tearDown(){
		driver.quit();
	}
}
