package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DocumentToolbar {
	
	WebDriver driver;

	/**
	 * @param driver
	 */
	public DocumentToolbar(WebDriver driver) {
		this.driver = driver;
	}
	
	public void click(String item) throws Exception{
		switch (item) {
		case "Refresh":
			driver.findElement(By.cssSelector("http://localhost:8080/skin/images/arrow_refresh_small.png"))
				.click();
			break;
		case "Download":
			driver.findElement(By.cssSelector("http://localhost:8080/skin/images/download.png"))
				.click();
			break;
		case "AddDocument":
			driver.findElement(By.cssSelector("http://localhost:8080/skin/images/page_white_add.png"))
			   	.click();
			break;
		case "Filter":
			driver.findElement(By.cssSelector("http://localhost:8080/skin/images/filter.png"))
			.click();
		case "Print":
			driver.findElement(By.cssSelector("http://localhost:8080/skin/images/printer.png"))
			.click();
			break;
		case "List":
			driver.findElement(By.cssSelector("http://localhost:8080/skin/images/application_view_list.png"))
			.click();
		case "Gallery":
			driver.findElement(By.cssSelector("http://localhost:8080/skin/images/application_view_tile.png"))
			.click();
		default:
			throw new Exception("Command unknown!");
		}
	}

}
