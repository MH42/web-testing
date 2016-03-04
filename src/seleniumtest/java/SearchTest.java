import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import pageObjects.LoginPage;
import pageObjects.MainPage;

public class SearchTest {
	public WebDriver driver;
	public String baseUrl;
	public MainPage main;
	@Before
	public void setUp(){
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		LoginPage login = new LoginPage(driver);
		baseUrl="http://localhost:8080";
		login.loginAs("admin", "admin");
	}
	@Test
	public void searchTest() throws Exception {
		main=new MainPage(driver);
		main.search("hello");
	}
	@After
	public void tearDown(){
//		logout = new Logout();
//		try {
//			logout.logout();
//		} catch (Exception e) {
//			System.out.println(e);
//		}
		
	}
}
