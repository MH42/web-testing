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
    	WebElement user = driver.findElement(By.cssSelector("input[name='isc_TextItem_0']"));				//clear fields
    	WebElement pass = driver.findElement(By.cssSelector("input[name='password']"));
    	WebElement submit = driver.findElement(By.cssSelector("div[eventproxy='isc_Button_0'] table tbody tr td div"));
    	user.clear();
    	user.sendKeys(username); // input credentials
        pass.sendKeys(password);
        submit.click();			// submit
    }
    
    public void loginAdmin(){
    		username = "admin";
    		password = "password";
    		try {
				loginAs(username, password);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}


    }
}