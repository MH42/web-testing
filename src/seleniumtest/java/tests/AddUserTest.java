package tests;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import static org.junit.Assert.*;
import pageObjects.CreateUser;
import pageObjects.LoginPage;
import pageObjects.SwitchTabs;

public class AddUserTest {
	public LoginPage login;
	public WebDriver driver;
	public SwitchTabs switchtabs;
	public CreateUser add;
	private StringBuffer verificationErrors = new StringBuffer();

	@Before
	public void setUp() throws Exception {
		driver = new FirefoxDriver();
		login = new LoginPage(driver);
		login.loginAdmin();
		switchtabs = new SwitchTabs(driver);
		switchtabs.switchTabs("Administration");	
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	}

	@Test
	public void addUserTest() throws Exception {		
		driver.findElement(By.id("isc_BD")).click(); // select Security

	    driver.findElement(By.id("isc_BQ")).click(); // select Users
	    
	    driver.findElement(By.id("isc_ES")).click(); // click Add User
		
	    driver.findElement(By.id("isc_HO")).clear();
	    driver.findElement(By.id("isc_HO")).sendKeys("user1");
	    driver.findElement(By.id("isc_HR")).clear();
	    driver.findElement(By.id("isc_HR")).sendKeys("x@y.z");
	    driver.findElement(By.id("isc_I1")).clear();
	    driver.findElement(By.id("isc_I1")).sendKeys("Usersens");
	    driver.findElement(By.id("isc_I4")).clear();
	    driver.findElement(By.id("isc_I4")).sendKeys("Smith");
	    driver.findElement(By.cssSelector("td.pickListCellSelected > div")).click();
	    
//	    change password
	    
		driver.findElement(By.name("user1")).click();
		driver.findElement(By.id("isc_UQtable")).click();
		driver.findElement(By.name("Change password")).click();
		driver.findElement(By.id("isc_V4")).sendKeys("password");
		driver.findElement(By.id("isc_V7")).sendKeys("password");
		driver.findElement(By.id("isc_V2")).click();
	}


	@After
	public void tearDown() throws Exception {
		driver.quit();
		String verificationErrorString = verificationErrors.toString();
		if (!"".equals(verificationErrorString)) {
			fail(verificationErrorString);
		}
	}
}


