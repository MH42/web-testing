package tests;
import java.util.Arrays;
import java.util.Collection;
import java.util.concurrent.TimeUnit;

import org.junit.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class LanguageTestParameters {
	public LoginTest login;
	public WebDriver driver = new FirefoxDriver();
	public String baseUrl = "http://localhost:8080";
	

	public String languageTest(String langCode) throws Exception {
		driver.get(baseUrl + "/frontend.jsp?locale=" + langCode);
		String testString = driver.findElement(By.className("login-label")).getText();
		return testString;
	}

	@Parameters
	public static Collection<Object[]> data(){
		return Arrays.asList(new Object[][]{
			{"de", "Anmelden"},{"en", "Login"},{"en_US", "Login"},
			{"ee", "Login"},{"it", "Accedi"},{"fr", "Identifiant"},
			{"es", "Ingresar"},{"pt_BR", "Entrar"},{"zh_CN", "登录"},
			{"hu", "Bejelentkezés"},{"ru", "Вход"},{"da", "Logind"},
			{"tr", "Oturum Aç"},{"no", "Logg Inn"},{"nl", "Aanmelden"},
			{"ar", "تسجيل الدخول"},{"ja", "ログイン"},{"cs", "Přihlásit se"},
			{"sl", "Prijava"},{"ko", "로그인"},{"sv", "Logga in"},
			{"hr", "Prijava"},{"vi", "Đăng nhập"},{"iw", "התחברות"} });
	}

	@Parameter 
	public String Input;

	@Parameter(value = 1)
	public String Expected;

	@Test
	public void languageTestPar() throws Exception {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		Assert.assertEquals(Expected, languageTest(Input));
		
	}

	@After
	public void tearDown(){
		driver.quit();
	}
}