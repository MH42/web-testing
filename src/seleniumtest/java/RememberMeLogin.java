
import java.util.concurrent.TimeUnit;
import org.junit.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;


public class RememberMeLogin {
	public WebDriver driver, driver2;
	public String baseUrl;
	private String user = "admin";


	@Before
	public void setUp() throws Exception {
		driver = new FirefoxDriver();
		baseUrl = "http://localhost:8080";
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get(baseUrl + "/frontend.jsp");
		driver.findElement(By.id("isc_V")).sendKeys(user);
		driver.findElement(By.id("isc_Y")).sendKeys(user);
		driver.findElement(By.id("isc_1F")).click(); // Select "Remember Me" option - the reason why loginAs is not used
		driver.findElement(By.id("isc_1M")).click();

	}

	@Test
	public void rememberMeLogin() throws Exception {

		driver.findElement(By.cssSelector("body")).sendKeys(Keys.COMMAND +"t"); // on none Mac Computers use CONTROL instead of COMMAND
		driver.get(baseUrl + "/frontend.jsp");
		driver.findElement(By.id("isc_1M")).click();

	}


	@After
	public void tearDown(){
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.quit();

	}
}
