package tests;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LanguageTest {
	public LoginTest login;
	public WebDriver driver;
	public String baseUrl;


	@Before
	public void setUp() throws Exception {
		baseUrl = "http://localhost:8080";
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);


	}

	public void languageTest(String langCode, String text) throws Exception {
		driver.get(baseUrl + "/frontend.jsp?locale=" + langCode);
		String testString = driver.findElement(By.className("login-label")).getText();
		Assert.assertTrue(testString.equals(text));

	}

	// <td class="login-label" valign="center" align="left">Anmelden</td>

	@Test
	public void languageTest() throws Exception {
		languageTest("de", "Anmelden");
		languageTest("en", "Login"); // TODO needs to be parameterized

	}

	@After
	public void tearDown(){
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.quit();
	}
}