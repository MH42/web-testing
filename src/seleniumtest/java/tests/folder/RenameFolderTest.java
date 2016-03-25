package tests.folder;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import pageObjects.AddFolder;
import pageObjects.FolderContextMenu;
import pageObjects.LoginPage;
import pageObjects.SwitchTabs;

public class RenameFolderTest {
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

		folder = 
				driver.findElement(By.xpath("div[eventproxy='isc_FolderNavigator']/div/table[1]/tbody[2]/tr[1]/td/div/table/tbody/tr/td[3]"));

		menu = new FolderContextMenu(driver);
		menu.setFolder(folder);

	}

	@Test
	public void renameFolder() throws Exception {	

		menu.click("Move");


		driver.findElement(By.id("isc_12Yopen_icon_0")).click();
		driver.findElement(By.xpath("//div[contains(@eventproxy,'isc_FolderTree')]"
				+ "/div/table/tbody/tr[2]/td/div/table/tbody/tr/td[3]")).click();

		driver.findElement(By.id("isc_12X")).click(); //confirm



	}


	@After
	public void tearDown(){
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.quit();
	}
}


