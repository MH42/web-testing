package tests;
import java.util.concurrent.TimeUnit;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import pageObjects.ConfirmationPopup;
import pageObjects.FileDropdown;
import pageObjects.LoginPage;
import pageObjects.MainToolbar;

public class FileDropdownTest {
	public WebDriver driver;
	public String baseUrl;
	public MainToolbar main;
	public FileDropdown drop;
	public ConfirmationPopup exit;
	@Before
	public void setUp() throws Exception{
		driver = new FirefoxDriver();
		main = new MainToolbar(driver);
		drop = new FileDropdown(driver);
		exit = new ConfirmationPopup(driver);
		LoginPage login = new LoginPage(driver);
		login.loginAdmin();		
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	}
	@Test
	public void logout() throws Exception {
		main.click("File");
		drop.click("Exit");
		exit.click("No");		
	}
	
	@After
	public void tearDown(){
		driver.quit();
	}
}
