package tests;

import java.util.concurrent.TimeUnit;
import org.junit.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;

import pageObjects.AddDocument;
import pageObjects.LoginPage;
import pageObjects.SwitchTabs;

public class DeleteDocumentTest {
	public LoginPage login;
	public WebDriver driver;
	public AddDocument add;
	
	 @Before
	 public void setUp() throws Exception {
		 
		 driver = new FirefoxDriver();
		 login = new LoginPage(driver);
		 login.loginAdmin();
		 driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	 	  }

		@Test
		public void deleteDocument() throws Exception {
			add = new AddDocument();
			driver.findElement(By.id("isc_3X")).click(); // go to Documents
			driver.findElement(By.xpath("//table[@id='isc_2OEtable']/tbody[2]/tr[5]/td[2]/nobr")).click(); // click "Delete" on document on top
			driver.findElement(By.id("isc_2U9")).click(); //send file				
		}

		@After
		public void tearDown(){
			driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
			driver.quit();
		}
	}
	

