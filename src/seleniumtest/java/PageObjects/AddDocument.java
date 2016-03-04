package PageObjects;

import java.util.concurrent.TimeUnit;
import org.junit.*;
import org.openqa.selenium.*;


public class AddDocument {

		
		public void addDocument(String docPath, WebDriver driver) throws Exception {		
			driver.findElement(By.xpath("//img[contains(@src, 'http://localhost:8080/skin/images/page_white_add.png')]")).click();
		    driver.findElement(By.className("gwt-FileUpload")).clear();
		    driver.findElement(By.className("gwt-FileUpload")).sendKeys(docPath);
		   // TODO wait fails at the moment driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		    driver.findElement(By.id("isc_CN")).click(); //send file	
			driver.findElement(By.id("isc_EJ")).click(); //save file
		}
		

	}
	

