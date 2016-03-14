package tests.mainToolbar;
import static org.junit.Assert.*;
import java.util.concurrent.TimeUnit;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import pageObjects.ConfirmationPopup;
import pageObjects.HelpDropdown;
import pageObjects.LoginPage;
import pageObjects.MainToolbar;


public class OpenCredentials {
	public WebDriver driver;
	public String baseUrl;
	public MainToolbar main;
	public HelpDropdown drop;
	public ConfirmationPopup exit;
	private StringBuffer verificationErrors = new StringBuffer();

	@Before
	public void setUp() throws Exception{
		driver = new FirefoxDriver();
		main = new MainToolbar(driver);
		drop = new HelpDropdown(driver);
		exit = new ConfirmationPopup(driver);
		LoginPage login = new LoginPage(driver);
		login.loginAdmin();		
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	}
	@Test
	public void openForum() throws Exception {
		main.click("Help");
		drop.click("About");

		// Closing Dialog fails usually
		
		//driver.findElement(By.xpath("//img[contains(@src,'http://localhost:8080/frontend/sc/skins/Simplicity/images/headerIcons/close.gif')]")).click();




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