package pageObjects;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import tests.LoginTest;

public class CreateUser {
	public LoginTest login;
	public WebDriver driver;
	public SwitchTabs switchTabs;


	public void register(String username, String email, String name, String surname, String password) {
		
		// IDs from Selenium
		driver.findElement(By.cssSelector("td.buttonOver")).click(); // Click Security
	    driver.findElement(By.cssSelector("td.toolbarButtonOver")).click(); // Click Users
	    driver.findElement(By.id("isc_HO")).clear();
	    driver.findElement(By.id("isc_HO")).sendKeys(username);
	    driver.findElement(By.id("isc_HR")).clear();
	    driver.findElement(By.id("isc_HR")).sendKeys(email);
	    driver.findElement(By.id("isc_I1")).clear();
	    driver.findElement(By.id("isc_I1")).sendKeys(name);
	    driver.findElement(By.id("isc_I4")).clear();
	    driver.findElement(By.id("isc_I4")).sendKeys(surname);
	    driver.findElement(By.cssSelector("td.pickListCellSelected > div")).click(); // click Save
	    
		setPW("password", username);

		
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
