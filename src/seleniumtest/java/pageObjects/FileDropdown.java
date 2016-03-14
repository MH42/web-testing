package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FileDropdown {
	
	private WebDriver driver;
	
	/**
	 * @param driver
	 */
	public FileDropdown(WebDriver driver) {
		this.driver = driver;
	}
	
	/**
	 * Clicks an item of File Dropdown menu in MainToolbar.
	 * NOTE: File Button in MainToolbar has to be clicked!
	 * 
	 * @param item
	 * @throws Exception
	 */
	public void click(String item) {
		driver.findElements(By.cssSelector("div[eventproxy='isc_Menu_0_body'] div table tbody tr td")).get(1).click();
	}
}

