
import java.util.concurrent.TimeUnit;
import org.junit.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;

import PageObjects.SwitchTabs;

public class AddDocument {
	public LoginTest login;
	public WebDriver driver;
	public SwitchTabs Switch;
	
	 @Before
	 public void setUp() throws Exception {
		 login = new LoginTest();
		 login.setUp();
		 login.loginTest();
		 driver = login.driver;
		 Switch = new SwitchTabs();
		 Switch.switchTabs("Documents");	 
	 	  }

		@Test
		public void addDocument() throws Exception {		
			
			driver.findElement(By.id("isc_75")).click(); // click "Add Documents"
			driver.findElement(By.className("GWTUpld")).click(); // click "Browse"
		    driver.findElement(By.name("LDOC-04463300797515626")).clear();
		    driver.findElement(By.name("LDOC-04463300797515626")).sendKeys("/web-testing/intro.pdf");
			driver.findElement(By.id("isc_26Z")).click(); //send file				
		}

		@After
		public void tearDown(){
			driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
			driver.quit();
		}
	}
	

