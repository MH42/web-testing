package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HelpDropdown {
	
	WebDriver driver;

	public HelpDropdown(WebDriver driver) {
		super();
		this.driver = driver;
	}
	
	public void click(String item) throws Exception{
		switch(item){
			case "Documentation":
				driver.findElements(By.cssSelector("div[eventproxy='isc_Menu_4_body'] div table tbody tr td")).get(1).click();
				break;
			case "Bug Report":
				driver.findElements(By.cssSelector("div[eventproxy='isc_Menu_4_body'] div table tbody tr td")).get(5).click();
				break;
			case "Forum":
				driver.findElements(By.cssSelector("div[eventproxy='isc_Menu_4_body'] div table tbody tr td")).get(9).click();
				break;
			case "About":
				driver.findElements(By.cssSelector("div[eventproxy='isc_Menu_4_body'] div table tbody tr td")).get(13).click();
				break;
			default:
				throw new Exception("Unknown item.");
		}
	}
}
