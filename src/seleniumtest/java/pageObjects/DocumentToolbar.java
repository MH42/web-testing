package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DocumentToolbar {
	
	WebDriver driver;
	
	public String baseUrl = "http://localhost:8080";

	/**
	 * @param driver
	 */
	public DocumentToolbar(WebDriver driver) {
		this.driver = driver;
	}
	
	/**
	 * Clicks an item of Document Toolbar in Document Tab.
	 * NOTE: Document Tab has to be clicked for this method to work!
	 * 
	 * @param item
	 * @throws Exception
	 */
	public void click(String item) throws Exception{
		switch (item) {
		case "Refresh":
			driver.findElement(By.cssSelector("img[src='" + baseUrl + "/skin/images/arrow_refresh_small.png']"))
				.click();
			break;
		case "Download":
			driver.findElement(By.cssSelector("img[src='" + baseUrl + "/skin/images/download.png']"))
				.click();
			break;
		case "AddDocument":
			driver.findElement(By.cssSelector("img[src='" + baseUrl + "/skin/images/page_white_add.png']"))
			   	.click();
			break;
		case "Filter":
			driver.findElement(By.cssSelector("img[src='" + baseUrl + "/skin/images/filter.png']"))
			.click();
		case "Print":
			driver.findElement(By.cssSelector("img[src='" + baseUrl + "/skin/images/printer.png']"))
			.click();
			break;
		case "List":
			driver.findElement(By.cssSelector("img[src='" + baseUrl + "/skin/images/application_view_list.png']"))
			.click();
			break;
		case "Gallery":
			driver.findElement(By.cssSelector("img[src='" + baseUrl + "/skin/images/application_view_tile.png']"))
			.click();
			break;
		default:
			throw new Exception("Command unknown!");
		}
	}

}
