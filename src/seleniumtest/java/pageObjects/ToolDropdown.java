package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ToolDropdown {
	
	WebDriver driver;
	
	public ToolDropdown(WebDriver driver){
		this.driver = driver;
	}
	
	public void click(String item) throws Exception{
		switch (item) {
		case "Registration":
			driver.findElements(By.cssSelector("div[eventproxy='isc_Menu_6_body'] div table tbody tr td")).get(1).click();
			break;

		default:
			throw new Exception("Unknown Item");
		}
	}

}
