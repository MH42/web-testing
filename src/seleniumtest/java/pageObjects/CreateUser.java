package pageObjects;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import 

public class CreateUser {
	public LoginTest login;
	public WebDriver driver;
	public SwitchTabs switchTabs;


	public void register(String username, String email, String name, String surname, String password) throws Exception {
		login = new LoginTest();
		login.setUp();
		login.loginTest();
		// login.loginTest();
		driver = login.driver;
		switchTabs = new SwitchTabs();
		switchTabs.switchTabs("Administration", driver);
		driver.findElement(By.id("isc_B6")).click(); //click Security
		driver.findElement(By.id("isc_BJ")).click(); //click Users
	//Alternatively try	driver.findElement(By.name("Users")).click(); //click Users
		driver.findElement(By.id("isc_BU")).click(); //click Add User
		driver.findElement(By.id("isc_EO")).sendKeys(username);
		driver.findElement(By.id("isc_ER")).sendKeys(email);
		driver.findElement(By.id("isc_F1")).sendKeys(name);
		driver.findElement(By.id("isc_F4")).sendKeys(surname);
		driver.findElement(By.id("isc_GX")).click(); //save credentials
		
	}

	public void setPW(String password, String username){
		driver.findElement(By.name(username)).click();
		driver.findElement(By.id("isc_UQtable")).click();
		driver.findElement(By.name("Change password")).click();
		driver.findElement(By.id("isc_V4")).sendKeys(password);
		driver.findElement(By.id("isc_V7")).sendKeys(password);
		driver.findElement(By.id("isc_V2")).click();
	}
	
	
}
