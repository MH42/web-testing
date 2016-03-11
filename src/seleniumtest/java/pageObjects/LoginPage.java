package pageObjects;
import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LoginPage {
	public String baseUrl;
    public WebDriver driver;
	public String username;
	public String password;
 
    public LoginPage(WebDriver driver) {
        baseUrl = "http://localhost:8080";
//  		driver = new FirefoxDriver();
        this.driver = driver;
    	driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.get(baseUrl + "/frontend.jsp");
    }

    public void loginAs(String username, String password) {
    	driver.findElement(By.id("isc_V")).clear();				//clear fields
    	driver.findElement(By.id("isc_Y")).clear();
    	driver.findElement(By.id("isc_V")).sendKeys(username); // input credentials
        driver.findElement(By.id("isc_Y")).sendKeys(password);
        driver.findElement(By.id("isc_1M")).click();			// submit
    }
    
    public void loginAdmin(){
    		username = "admin";
    		password = "admin";
    		
    		try {
    			loginAs(username, password);
    			} catch (Exception e)
    			{
    				driver.quit();
    			}

    }
}