package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ConfirmationPopup {
	
	WebDriver driver;
	
	/**
	 * @param driver
	 */
	public ConfirmationPopup(WebDriver driver) {
		this.driver = driver;
	}
	/**
	 * Clicks an item of Confirmation Popup.
	 * NOTE: Confirmation Popup must be displayed for this method to work!
	 * 
	 * @param item
	 * @throws Exception
	 */
	public void click(String item)throws Exception{
		if(item == "Yes"){
			driver.findElements(By.cssSelector("div[eventproxy='isc_Window_0_body'] div div div[role='button'] table tbody tr td div"))
				.get(0)
				.click();
		}
		if(item == "No"){
			driver.findElements(By.cssSelector("div[eventproxy='isc_Window_0_body'] div div div[role='button'] table tbody tr td div"))
				.get(1)
				.click();
		}
	}

}
