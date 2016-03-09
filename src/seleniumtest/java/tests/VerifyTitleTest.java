package tests;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;

import static org.junit.Assert.*;

import pageObjects.AddDocument;
import pageObjects.LoginPage;
import pageObjects.SwitchTabs;



public class VerifyTitleTest {
	public LoginPage login;
	public WebDriver driver;
	public SwitchTabs switchtabs;
	public AddDocument add;
	private StringBuffer verificationErrors = new StringBuffer();

	@Before
	public void setUp() throws Exception {
		driver = new FirefoxDriver();
		login = new LoginPage(driver);
		switchtabs = new SwitchTabs(driver);	
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

	}

	@Test
	public void testVerifyTitle() throws Exception {

		login.loginAdmin();


		try {
			assertEquals("LogicalDOC Community 7.4", driver.getTitle());
		} catch (Error e) {
			verificationErrors.append(e.toString());
		}
		
		switchtabs.switchTabs("Documents");
		try {
			assertEquals("LogicalDOC Community 7.4", driver.getTitle());
		} catch (Error e) {
			verificationErrors.append(e.toString());
		}
	}


	@After
	public void tearDown(){
		driver.quit();
		String verificationErrorString = verificationErrors.toString();
		if (!"".equals(verificationErrorString)) {
			System.out.println(verificationErrorString);
			fail(verificationErrorString);
		}
	}

}