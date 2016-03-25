package pageObjects;

import org.openqa.selenium.*;

public class AddFolder {

	public void addFolder(String name, WebDriver driver, Boolean inherit) throws Exception {		

		driver.findElement(By.xpath("//table[@id='isc_7Ytable']/tbody[2]/tr/td/div/table/tbody/tr/td[3]")).click(); //  Select Dropdown
		driver.findElement(By.id("isc_7Ytable")).sendKeys("New folder"); //  Select Add Folder in Dropdown
		driver.findElement(By.className("isc_1CU")).clear();	 // clear "name" field
		driver.findElement(By.className("isc_1CU")).sendKeys(name); // enter name

		if (inherit){
			driver.findElement(By.id("isc_1CS")).click(); // create folder (As Inherit is marked by default, it has to be unmarked, only when inherit is false) 
		}
		driver.findElement(By.id("isc_1CZ")).click(); // unmark inherit

		driver.findElement(By.id("isc_1CS")).click(); //create folder
	}
}


