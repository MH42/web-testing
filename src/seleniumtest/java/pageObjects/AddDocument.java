package pageObjects;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.*;
import static org.junit.Assert.*;



public class AddDocument {

		
		public void addDocument(String docPath, WebDriver driver) throws Exception {		
			driver.findElement(By.xpath("//img[contains(@src, 'http://localhost:8080/skin/images/page_white_add.png')]")).click();
		    driver.findElement(By.className("gwt-FileUpload")).clear();
		    driver.findElement(By.className("gwt-FileUpload")).sendKeys(docPath);
		   // TODO wait fails at the moment 
		    driver.manage().timeouts().implicitlyWait(14, TimeUnit.SECONDS);
		    Thread.sleep(4000);
		   
		    for (int second = 0;; second++) {
		    	if (second >= 15) fail("timeout");
		    	try { if ("".equals(driver.findElement(By.cssSelector("div.cancel")).getText())) break; } catch (Exception e) {}
		    	Thread.sleep(1000);
		    }
		    
		    driver.findElement(By.xpath("//div[11]/div[2]/div/div/div[3]/table/tbody/tr/td/div")).click(); //send file	
			driver.findElement(By.id("isc_EJ")).click(); //save file
		}
		

	}
	

