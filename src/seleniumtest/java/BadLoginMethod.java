import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BadLoginMethod {
	public WebDriver driver;
	public String baseUrl;
	
	@Before
	public void setUp() throws Exception{
		driver = new FirefoxDriver();
		baseUrl="http://localhost:8080";
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	}
	@Test
	public void loginMethod() throws Exception {
		driver.get(baseUrl+"/frontend.jsp");
		driver.findElement(By.id("isc_V")).clear();
		driver.findElement(By.id("isc_V")).sendKeys("noAdmin");
	    driver.findElement(By.id("isc_Y")).clear();		//password
	    driver.findElement(By.id("isc_Y")).sendKeys("noAdmin");
	    driver.findElement(By.id("isc_1M")).click();	//submit
	}
	@After
	public void tearDown(){
		driver.quit();
	}
}
