package tests;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import pageObjects.LoginPage;

public class LoginTest {
	public WebDriver driver;
	public String baseUrl;
	public LoginPage login;

	@Before
	public void setUp() throws Exception {
		driver = new FirefoxDriver();
		login = new LoginPage(driver);
	}

	@Test
	public void loginTest() throws Exception {
		// Only one test can be run at a time
		//		Assert.assertFalse(login.loginAs("noAdmin", "noPassword"));	
		Assert.assertTrue(login.loginAs("admin", "password"));
	}

	@After
	public void tearDown(){
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.quit();
	}
}