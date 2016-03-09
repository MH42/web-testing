package tests;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import pageObjects.LoginPage;

public class VerifyLogoTest {
	private WebDriver driver;
	private StringBuffer verificationErrors = new StringBuffer();
	private LoginPage login;

	@Before
	public void setUp() throws Exception {
		driver = new FirefoxDriver();
		login = new LoginPage(driver);
		login.loginAdmin();	
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	}

	@Test
	public void testLogo() throws Exception {
		try {
			assertTrue(isElementPresent(By.name("isc_2Amain")));
		} catch (Error e) {
			verificationErrors.append(e.toString());
		}
	}

	@After
	public void tearDown() throws Exception {
		driver.quit();
		String verificationErrorString = verificationErrors.toString();
		if (!"".equals(verificationErrorString)) {
			fail(verificationErrorString);
		}
	}

	private boolean isElementPresent(By by) {
		try {
			driver.findElement(by);
			return true;
		} catch (NoSuchElementException e) {
			return false;
		}
	}


}


