package tests.fileActions;

import java.util.concurrent.TimeUnit;
import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import pageObjects.LoginPage;
import pageObjects.SwitchTabs;

public class FilterTest {
	public LoginPage login;
	public WebDriver driver;
	public SwitchTabs switchtabs;

	@Before
	public void setUp() throws Exception {
		driver = new FirefoxDriver();	
		login = new LoginPage(driver);
		login.loginAdmin();
		switchtabs = new SwitchTabs(driver);
		switchtabs.switchTabs("Documents");	
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	}

	@Test
	public void testFilter(){
		driver.findElement(By.id("isc_2T")).click();
		driver.findElement(By.id("isc_AZ")).sendKeys("intro");
	}

	@After
	public void tearDown(){
		driver.quit();
	}
}