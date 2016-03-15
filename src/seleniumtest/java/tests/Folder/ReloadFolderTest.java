package tests.Folder;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import pageObjects.AddDocument;
import pageObjects.AddFolder;
import pageObjects.FolderContextMenu;
import pageObjects.LoginPage;
import pageObjects.SwitchTabs;

public class ReloadFolderTest {
	public LoginPage login;
	public WebDriver driver;
	public SwitchTabs switchtabs;
	public AddFolder add;
	FolderContextMenu menu;
	WebElement folder;
	Actions actions;


	@Before
	public void setUp() throws Exception {
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		login = new LoginPage(driver);
		login.loginAdmin();
		driver = login.driver;
		switchtabs = new SwitchTabs(driver);
		switchtabs.switchTabs("Documents");	
		folder = driver.findElement(By.xpath
				("/html/body/div[5]/div/div[4]/div[2]/div[3]/"
						+ "div[2]/div[2]/div/div/table[1]/tbody[2]/tr/td/div/table/tbody/tr/td[3]"));
		menu = new FolderContextMenu(driver);
		menu.setFolder(folder);

	}

	@Test
	public void reloadFolder() throws Exception {	

		menu.click("Reload");
	}


	@After
	public void tearDown(){
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.quit();
	}
}

