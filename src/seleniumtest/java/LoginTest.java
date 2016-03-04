
import java.util.concurrent.TimeUnit;
import org.junit.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;

import PageObjects.LoginPage;


public class LoginTest {
	public WebDriver driver;
	public String baseUrl;
	public String username;
	public String password;
	public LoginPage login;
	public LogoutTest logout;
	
	 @Before
	 public void setUp() throws Exception {
		 driver = new FirefoxDriver();
		 login = new LoginPage(driver);
	 	  }

		@Test
		public void loginTest() throws Exception {
			username = "admin";
			password = "admin";
			login.loginAs(username, password);
		}
		
		@Test
		public void failLogin() throws Exception {
			username = "noAdmin";
			password = "noAdmin";
			login.loginAs(username, password);
		}
		@After
		public void tearDown(){
			driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
			driver.quit();
		}
	}
