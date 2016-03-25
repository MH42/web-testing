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
	 	  }

		@Test
		public void addDocument() throws Exception {		
			add = new AddDocument();
			String sep =System.getProperty("file.seperator");
			add.addDocument(System.getProperty("user.dir") + sep + "web-testing"+ sep +"intro.pdf", driver);
		}


		@After
		public void tearDown(){
			driver.quit();
		}
	}
	

