package pageObjects;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.*;

public class LoginPage {
	public String baseUrl;
	public WebDriver driver;
	public String username;
	public String password;


	public LoginPage(WebDriver driver) {
		baseUrl = "http://localhost:8080";
		this.driver = driver;
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get(baseUrl + "/frontend.jsp");
	}

	public boolean loginAs(String username, String password) {
		WebElement user = driver.findElement(By.cssSelector("input[name='isc_TextItem_0']"));				//clear fields
		WebElement pass = driver.findElement(By.cssSelector("input[name='password']"));
		WebElement submit = driver.findElement(By.cssSelector("div[eventproxy='isc_Button_0'] table tbody tr td div"));

		user.clear();
		user.sendKeys(username); // input credentials
		pass.sendKeys(password); 
		submit.click();			 // submit

		// Catch Access denied
		try {
			if (driver.findElement(By.cssSelector("div[eventproxy*='isc_globalWarn_messageLabel']"))
					.isDisplayed() // Denied Message visible?
					){
				return false;
			} } catch (Exception e){
				return true;
			}
		return true;
	}

	public void loginAdmin(){
		username = "admin";
		password = "password";
		loginAs(username, password);
	}
}