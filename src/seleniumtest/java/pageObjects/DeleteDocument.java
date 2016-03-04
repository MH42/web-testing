package pageObjects;

import java.util.concurrent.TimeUnit;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import 

public class DeleteDocument {
	public LoginTest login;
	public WebDriver driver;
	public AddDocument add;
	
	 @Before
	 public void setUp() throws Exception {
		 login = new LoginTest();
		 login.setUp();
		 login.loginTest();
		 driver = login.driver;
	 	  }

		@Test
		public void deleteDocument() throws Exception {
			add = new AddDocument();
			add.addDocument("/web-testing/intro.pdf", driver);
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
	

