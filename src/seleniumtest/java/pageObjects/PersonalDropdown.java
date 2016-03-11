package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PersonalDropdown {

	WebDriver driver;
	
	public PersonalDropdown(WebDriver driver){
		this.driver = driver;
		}
	
	public void click(String item) throws Exception{
		switch(item){
			case "Profile":
				driver.findElements(By.cssSelector("div[eventproxy='isc_Menu_2_body'] div table tbody tr td")).get(1).click();
				break;
			case "Change password":
				driver.findElements(By.cssSelector("div[eventproxy='isc_Menu_2_body'] div table tbody tr td")).get(5).click();
				break;
			case "My Signature":
				driver.findElements(By.cssSelector("div[eventproxy='isc_Menu_2_body'] div table tbody tr td")).get(9).click();
				driver.findElements(By.cssSelector("div[eventproxy='isc_Menu_1_body'] div table tbody tr td")).get(1).click();
				break;
			case "My Private Key":
				driver.findElements(By.cssSelector("div[eventproxy='isc_Menu_2_body'] div table tbody tr td")).get(9).click();
				driver.findElements(By.cssSelector("div[eventproxy='isc_Menu_1_body'] div table tbody tr td")).get(5).click();
				break;
			case "Contacts":
				driver.findElements(By.cssSelector("div[eventproxy='isc_Menu_2_body'] div table tbody tr td")).get(13).click();
				break;
			case "Remove cookies":
				driver.findElements(By.cssSelector("div[eventproxy='isc_Menu_2_body'] div table tbody tr td")).get(17).click();
				break;
			default:
				throw new Exception("Unknown Item.");
		}
	}
}
