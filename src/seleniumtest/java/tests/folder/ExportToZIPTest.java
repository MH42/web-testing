package tests.folder;
import static org.junit.Assert.*;

import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import pageObjects.FolderContextMenu;
import pageObjects.LoginPage;
import pageObjects.SwitchTabs;

public class ExportToZIPTest {
	public LoginPage login;
	public WebDriver driver;
	public SwitchTabs switchtabs;
	FolderContextMenu menu;
	WebElement folder;
	Actions actions;
	private StringBuffer verificationErrors = new StringBuffer();

	@Before
	public void setUp() throws Exception {
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		login = new LoginPage(driver);
		login.loginAdmin();
		driver = login.driver;
		switchtabs = new SwitchTabs(driver);
		switchtabs.switchTabs("Documents");	

		folder = driver.findElement(By.xpath("/html/body/div[5]/div/div[4]/div[2]/div[3]/div[2]/div[2]/div/div/table[1]/tbody[2]/tr/td/div/table/tbody/tr/td[3]"));


		menu = new FolderContextMenu(driver);
		menu.setFolder(folder);

	}

	@Test
	public void exportZIP() throws Exception {	
		String parentWindow = driver.getWindowHandle();
		Set<String> handles =  driver.getWindowHandles();

		menu.click("Export to ZIP");

//		   for(String windowHandle  : handles)
//		       {
//		       if(!windowHandle.equals(parentWindow))
//		          {
//		          driver.switchTo().window(windowHandle);
//
//		  		try {
//					assertTrue( driver.getTitle().contains("Opening"));
//				} catch (Error e) {
//					verificationErrors.append(e.toString());
//				}
//		          
//		         driver.close(); //closing child window
//		         driver.switchTo().window(parentWindow); //cntrl to parent window
//		          }
//		       }
		
		
	}


	@After
	public void tearDown(){
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		String verificationErrorString = verificationErrors.toString();
		if (!"".equals(verificationErrorString)) {
			System.out.println(verificationErrorString);
			fail(verificationErrorString);
		driver.quit();
	}
}
}

