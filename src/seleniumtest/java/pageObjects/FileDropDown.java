package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FileDropDown {
	
	private WebDriver driver;
	
	/**
	 * @param driver
	 */
	public FileDropDown(WebDriver driver) {
		this.driver = driver;
	}

	public void click(String item) {
		driver.findElements(By.cssSelector("div[eventproxy='isc_Menu_0_body'] div table tbody tr td")).get(1).click();
	}
}
