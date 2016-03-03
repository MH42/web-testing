import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SearchTest {
	public WebDriver driver;
	public String baseUrl;
	public MainPage main;
	@Before
	public void setUp(){
		driver = new FirefoxDriver();
		LoginPage login = new LoginPage(driver);
		baseUrl="http://localhost:8080";
		login.loginAs("admin", "admin");
		main = new MainPage(driver);
	}
	@Test
	public void searchTest() throws Exception {
		main.search("HelloWorld");
	}
}
