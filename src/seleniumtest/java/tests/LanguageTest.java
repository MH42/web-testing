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

	public boolean languageTest(String langCode, String text) throws Exception {
		driver.get(baseUrl + "/frontend.jsp?locale=" + langCode);
		String testString = driver.findElement(By.className("login-label")).getText();
		return (testString.equals(text));

	}

	// <td class="login-label" valign="center" align="left">Anmelden</td>

	@Test
	public void languageTest() throws Exception {
		Assert.assertFalse(languageTest("de", "Login")); //fails
		
		Assert.assertTrue(languageTest("de", "Anmelden"));
		Assert.assertTrue(languageTest("en", "Login"));
		Assert.assertTrue(languageTest("en_US", "Login"));
		Assert.assertTrue(languageTest("ee", "Login")); //non-existent language Code leads fallback to English
		Assert.assertTrue(languageTest("it", "Accedi"));
		Assert.assertTrue(languageTest("fr", "Identifiant"));
		Assert.assertTrue(languageTest("es", "Ingresar"));
		Assert.assertTrue(languageTest("pt_BR", "Entrar"));
		Assert.assertTrue(languageTest("zh_CN", "登录"));
		Assert.assertTrue(languageTest("hu", "Bejelentkezés"));
		Assert.assertTrue(languageTest("ru", "Вход"));
		Assert.assertTrue(languageTest("da", "Logind"));
		Assert.assertTrue(languageTest("tr", "Oturum Aç"));
		Assert.assertTrue(languageTest("no", "Logg Inn"));
		Assert.assertTrue(languageTest("nl", "Aanmelden"));
		Assert.assertTrue(languageTest("ar", "تسجيل الدخول"));
		Assert.assertTrue(languageTest("ja", "ログイン"));
		Assert.assertTrue(languageTest("cs", "Přihlásit se"));
		Assert.assertTrue(languageTest("sl", "Prijava"));
		Assert.assertTrue(languageTest("ko", "로그인"));
		Assert.assertTrue(languageTest("sv", "Logga in"));
		Assert.assertTrue(languageTest("hr", "Prijava"));
		Assert.assertTrue(languageTest("vi", "Đăng nhập"));
		Assert.assertTrue(languageTest("iw", "התחברות"));

	}

	@After
	public void tearDown(){
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.quit();
	}
}