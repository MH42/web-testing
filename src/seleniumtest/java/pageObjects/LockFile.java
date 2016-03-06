package pageObjects;

import java.util.concurrent.TimeUnit;
import org.junit.*;
import org.openqa.selenium.*;


public class LockFile {


	public void lockFile(String name, WebDriver driver) throws Exception {		
		driver.findElement(By.name(name)).click();
		//Lock by xpath
		driver.findElement(By.xpath("/html/body/div[11]/div/div/div/div/table[1]/tbody[2]/tr[11]/td[2]/nobr"));
		//give a reason
		driver.findElement(By.id("isc_I2")).sendKeys("Top Secret");
		// confirm
		driver.findElement(By.id("isc_I5")).click(); //save file
	}

	
	public void unLockFile(String name, WebDriver driver) throws Exception {		
		driver.findElement(By.name(name)).click();
		//unlock by xpath
		driver.findElement(By.xpath("/html/body/div[13]/div/div/div/div/table[1]/tbody[2]/tr[12]/td[2]/nobr"));
		// confirm
		driver.findElement(By.id("isc_I5")).click(); //save file
	}

}