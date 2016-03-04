package tests;

import java.util.concurrent.TimeUnit;
import org.junit.*;
import org.openqa.selenium.*;

public class Search {
	public LoginTest login;
	public WebDriver driver;

	
	 @Before
	 public void setUp() throws Exception {
		 login = new LoginTest();
		 login.setUp();
		 login.loginTest();
		 driver = login.driver;
	 	  }

		@Test
		public void search() throws Exception {
			driver.findElement(By.id("isc_30")).click(); // select search field
			driver.findElement(By.id("isc_30")).sendKeys("example");	
			driver.findElement(By.id("isc_33")).click(); // submit search
		}
		


		@After
		public void tearDown() throws InterruptedException{
			driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
			driver.quit();
		}
	}
	

