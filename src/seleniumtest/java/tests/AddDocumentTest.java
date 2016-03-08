package tests;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;

import pageObjects.AddDocument;
import pageObjects.LoginPage;
import pageObjects.SwitchTabs;

public class AddDocumentTest {
	public LoginPage login;
	public WebDriver driver;
	public SwitchTabs switchtabs;
	public AddDocument add;
	
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
		public void addDocument() throws Exception {		
			add = new AddDocument();
			add.addDocument("/web-testing/intro.pdf", driver);
		}


		@After
		public void tearDown(){
			driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
			driver.quit();
		}
	}
	

