package tests;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import tests.mainToolbar.LogoutTest;
import utilities.OS;
import utilities.OS.OS_TYPE;

public class RememberMeLogin {
	public WebDriver driver;
	public String baseUrl;
	private String user = "admin";
	public static OS os;

	@Before
	public void setUp() throws Exception {
		driver = new FirefoxDriver();
		baseUrl = "http://localhost:8080";
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get(baseUrl + "/frontend.jsp");
		driver.findElement(By.id("isc_V")).sendKeys(user);
		driver.findElement(By.id("isc_Y")).sendKeys(user);
		driver.findElement(By.id("isc_1F")).click(); // Select "Remember Me" option
		driver.findElement(By.id("isc_1M")).click(); 
	}
	@Test
	public void rememberMeLogin() throws Exception {
		if (OS.getOsType() == OS_TYPE.MAC){
			driver. findElement(By.cssSelector("body")).sendKeys(Keys.COMMAND +"t");
		} else {
			driver. findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL +"t"); }
		driver.get(baseUrl + "/frontend.jsp");
		LogoutTest logout = new LogoutTest();
		logout.logout();
		driver.findElement(By.id("isc_1M")).click();
	}
	@After
	public void tearDown(){
		driver.quit();
	}}