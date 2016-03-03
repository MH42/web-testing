package com.logicaldoc.gui.frontend.client;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class NavigateTabs {
	public LoginTest login;
	public WebDriver driver;

	@Before
	public void setUp() throws Exception {
		login = new LoginTest();
		login.setUp();
		login.loginTest();
		// login.loginTest();
		driver = login.driver;
	}

	@Test
	public void switchTab() throws Exception {
		clickAt(By.xpath("//div[4]/div/div[2]/div/table/tbody/tr/td")); // Go to Documents
		clickAt(By.xpath("//div[4]/div/div/div/table/tbody/tr/td")); // // Go to Dashboard		
		clickAt(By.id("isc_3W")); // Go to Documents
	}

	@After
	public void tearDown(){
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.quit();
	}

	// @see https://gist.github.com/puddupakkam/5719148
	private void clickAt(By by) throws InterruptedException {
//		Thread.sleep(1500);
		Actions builder = new Actions(driver);
		WebElement tagElement = driver.findElement(by);
		builder.moveToElement(tagElement).click().perform();
	}
}
