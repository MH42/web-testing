package tests;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import org.openqa.selenium.*;

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
		 login = new LoginPage(driver);
		 login.loginAdmin();
		 driver = login.driver;
		 switchtabs = new SwitchTabs();
		 switchtabs.switchTabs("Documents", driver);	
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
	

