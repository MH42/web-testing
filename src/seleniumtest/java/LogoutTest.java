import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LogoutTest {
	public WebDriver driver;
	public String baseUrl;
	public MainPage main;
	
	@Before
	public void setUp(){
		driver = new FirefoxDriver();
		LoginPage login = new LoginPage(driver);
		baseUrl="http://localhost:8080";
		login.loginAs("admin", "admin");
		main=new MainPage(driver);
	}
	@Test
	public void logout() throws Exception {
//		WebElement mainBar = driver.findElements(By.className("toolStrip")).get(0);
//		WebElement logout = driver.findElement(By.xpath("img[@src='http://localhost:8080/frontend/sc/skins/Simplicity/images/actions/close.png']"));
		main.logoutButton.click();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.findElement(By.id("isc_7E")).click();
	}
	@After
	public void tearDown(){
		driver.quit();
	}
}
