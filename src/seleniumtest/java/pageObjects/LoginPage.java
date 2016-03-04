package pageObjects;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.*;

public class LoginPage {
	public String baseUrl;
    public WebDriver driver;
 
    public LoginPage(WebDriver driver) {
        this.driver = driver;
        baseUrl = "http://localhost:8080";
    	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get(baseUrl + "/frontend.jsp");
    }

    public void loginAs(String username, String password) {
    	driver.findElement(By.id("isc_V")).clear();				//clear fields
    	driver.findElement(By.id("isc_Y")).clear();
    	driver.findElement(By.id("isc_V")).sendKeys(username); // input credentials
        driver.findElement(By.id("isc_Y")).sendKeys(password);
        driver.findElement(By.id("isc_1M")).click();			// submit
    }
}