import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Logout {
	public WebDriver driver;
	public String baseUrl;
	public String username;
	public String password;
	
	@Before
	public void setUp(){
		
		driver = new FirefoxDriver();
		LoginPage login = new LoginPage(driver);
		baseUrl="http://localhost:8080";
		username="admin";
		password="admin";
		login.loginAs(username, password);
	}
	@Test
	public void logout() throws Exception {
		driver.findElement(By.name("isc_2Qicon")).click();
	}
	@After
	public void tearDown(){
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.quit();
	}
}
