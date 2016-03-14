package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ToolDropdown {
	
	WebDriver driver;
	
	public ToolDropdown(WebDriver driver){
		this.driver = driver;
		
	}
	
	/**
	 * Clicks an item of Tool Dropdown menu in MainToolbar.
	 * NOTE: Tool Button in MainToolbar has to be clicked!
	 * 
	 * @param item
	 * @throws Exception
	 */
	public void click(String item) throws Exception{
		switch (item) {
		case "Registration":
			driver.findElements(By.cssSelector("div[eventproxy='isc_Menu_6_body'] div table tbody tr td")).get(1).click();
			break;
			
		case "Export to Dropbox":
			driver.findElements(By.cssSelector("td[onfocus^='isc_ToolStripMenuButton_7'] table tbody tr td"))
			.get(0)
			.click();
			driver.findElement(By.cssSelector("div[eventproxy='isc_Menu_9_body'] div table tbody tr td"))
			.click();
			driver.findElements(By.cssSelector("div[eventproxy='isc_Menu_8_body'] div table tbody tr td")).get(1).click();
			break;
		
		case "Import from Dropbox":
			driver.findElements(By.cssSelector("td[onfocus^='isc_ToolStripMenuButton_7'] table tbody tr td"))
			.get(0)
			.click();
			driver.findElement(By.cssSelector("div[eventproxy='isc_Menu_9_body'] div table tbody tr td"))
			.click();
			driver.findElements(By.cssSelector("div[eventproxy='isc_Menu_8_body'] div table tbody tr td")).get(5).click();
			break;
			
		default:
			throw new Exception("Unknown Item");
		}
	}

}
