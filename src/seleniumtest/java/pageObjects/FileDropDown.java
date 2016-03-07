package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FileDropDown {
	private WebDriver driver;
	
	public void click(String item,WebDriver driver) {
		driver.findElements(By.cssSelector("div[eventproxy='isc_Menu_0_body'] div table tbody tr td")).get(1).click();
	}	
//  this.exitFileDropdown = driver.findElements(By.cssSelector("div[eventproxy='isc_Menu_0_body'] div table tbody tr td")).get(1);
//  this.exitFileDropdown = driver.findElements(By.xpath("//div[7]/div/div/div/div/table[1]/tbody[2]/tr/td[2]")).get(1);

}
