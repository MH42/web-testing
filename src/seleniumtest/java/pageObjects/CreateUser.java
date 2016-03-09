package pageObjects;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import tests.LoginTest;

public class CreateUser {
	public LoginTest login;
	public WebDriver driver;
	public SwitchTabs switchTabs;


	public void register(String username, String email, String name, String surname, String password) {
		
		// From Selenium
		driver.findElement(By.cssSelector("td.buttonOver")).click();
	    driver.findElement(By.cssSelector("td.toolbarButtonOver")).click();
	    driver.findElement(By.id("isc_HO")).clear();
	    driver.findElement(By.id("isc_HO")).sendKeys(username);
	    driver.findElement(By.id("isc_HR")).clear();
	    driver.findElement(By.id("isc_HR")).sendKeys(email);
	    driver.findElement(By.id("isc_I1")).clear();
	    driver.findElement(By.id("isc_I1")).sendKeys(name);
	    driver.findElement(By.id("isc_I4")).clear();
	    driver.findElement(By.id("isc_I4")).sendKeys(surname);
	    driver.findElement(By.cssSelector("td.pickListCellSelected > div")).click();
	    
		setPW("password", username);
		
//		driver.findElement(By.id("isc_B6")).click(); //click Security
//		driver.findElement(By.id("isc_BJ")).click(); //click Users
//		// Alternatively try	driver.findElement(By.name("Users")).click(); //click Users
//		driver.findElement(By.id("isc_BU")).click(); //click Add User
//		driver.findElement(By.id("isc_EO")).sendKeys(username);
//		driver.findElement(By.id("isc_ER")).sendKeys(email);
//		driver.findElement(By.id("isc_F1")).sendKeys(name);
//		driver.findElement(By.id("isc_F4")).sendKeys(surname);
//		driver.findElement(By.id("isc_GX")).click(); //save credentials
		
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
