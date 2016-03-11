package pageObjects;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.junit.Assert.*;



public class AddDocument {


	public void addDocument(String docPath, WebDriver driver) throws Exception {		
		driver.findElement(By.xpath("//img[contains(@src, 'http://localhost:8080/skin/images/page_white_add.png')]")).click();
		driver.findElement(By.className("gwt-FileUpload")).clear();
		driver.findElement(By.className("gwt-FileUpload")).sendKeys(docPath);

		Thread.sleep(2000);

		driver.findElement(By.cssSelector("div[eventproxy*='isc_IButton']"))
		.click();	 //send file	
		Thread.sleep(500);
		
		// Try one of the selectors below for the "Save" button and pray that god will guide your way
		
		
		//		    driver.findElement(By.cssSelector("div[eventproxy*='isc_Button_49'] table tbody"))
		//			.click();	 //save file 
		//		    driver.findElement(By.cssSelector("html body div#isc_DB.windowBackground div#isc_DK.windowBody div#isc_DL.normal div#isc_DM div#isc_F2.normal div#isc_F3 div#isc_F4 div#isc_F5"))
		//			.click();

		driver.findElement(By.xpath("/html/body/div[9]/div[2]/div/div/div[2]/div/div[1]/div/table/tbody"))
		.click();

		// driver.findElement(By.id("isc_F5")).click();
	}


}


