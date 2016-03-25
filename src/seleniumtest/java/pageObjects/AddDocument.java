package pageObjects;
import org.openqa.selenium.*;

public class AddDocument {
	
	public String baseUrl = "http://localhost:8080";

	public void addDocument(String docPath, WebDriver driver) throws Exception {		
		driver.findElement(By.xpath("//img[contains(@src, '" + baseUrl +"/skin/images/page_white_add.png')]")).click();
		driver.findElement(By.className("gwt-FileUpload")).clear();
		driver.findElement(By.className("gwt-FileUpload")).sendKeys(docPath);
		// Explicit sleep needed to wait until button is clickable
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("div[eventproxy*='isc_IButton']"))
		.click();	 //send file	
		Thread.sleep(500);

		driver.findElement(By.cssSelector("div[eventproxy^='isc_BulkUpdateDialog_'] div div div div div div table tbody tr td")).click();
	}


}


