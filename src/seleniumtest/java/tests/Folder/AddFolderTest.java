package tests.Folder;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import org.openqa.selenium.*;

import pageObjects.AddDocument;
import pageObjects.AddFolder;
import pageObjects.LoginPage;
import pageObjects.SwitchTabs;

public class AddFolderTest {
	public LoginPage login;
	public WebDriver driver;
	public SwitchTabs switchtabs;
	public AddFolder add;
	
	 @Before
	 public void setUp() throws Exception {
		 login = new LoginPage(driver);
		 login.loginAdmin();
		 driver = login.driver;
		 switchtabs = new SwitchTabs(driver);
		 switchtabs.switchTabs("Documents");	
		 driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	 	  }

		@Test
		public void addFolder() throws Exception {		
			add = new AddFolder();
			add.addFolder("Test", driver, true);
		}


		@After
		public void tearDown(){
			driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
			driver.quit();
		}
	}
	

