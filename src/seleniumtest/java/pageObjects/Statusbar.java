package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Statusbar {
	
	WebDriver driver;

	public Statusbar(WebDriver driver) {
		this.driver = driver;
	}
	
	public String getText(String element) throws Exception{
		switch(element){
			case "Clipboard":
				return driver.findElement(By.cssSelector("div[eventproxy='isc_HTMLFlow_3'] div[eventproxy='isc_HTMLFlow_3']")).getText();
			case "Locked":
				return driver.findElement(By.cssSelector("div[eventproxy='isc_HTMLFlow_4'] div[eventproxy='isc_HTMLFlow_4']")).getText();
			case "Checked":
				return driver.findElement(By.cssSelector("div[eventproxy='isc_HTMLFlow_5'] div[eventproxy='isc_HTMLFlow_5']")).getText();
			case "Messages":
				return driver.findElement(By.cssSelector("div[eventproxy='isc_HTMLFlow_6'] div[eventproxy='isc_HTMLFlow_6']")).getText();
			default:
				throw new Exception("Element unknown.");
		}
	}

}
