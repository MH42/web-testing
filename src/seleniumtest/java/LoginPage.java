import java.util.concurrent.TimeUnit;
import org.junit.*;
import org.openqa.selenium.*;
import org.openqa.selenium.WebDriver;


// @Before
public class LoginPage {
	
    private final WebDriver driver;
 
    public LoginPage(WebDriver driver) {
        this.driver = driver;
        // Check that we're on the right page.
        if (!"LogicalDOC Community 7.4".equals(driver.getTitle())) {
            throw new IllegalStateException("This is not the login page");
        }
    }
        By usernameLocator = By.id("isc_V");
        By passwordLocator = By.id("isc_Y");
        By loginButtonLocator = By.id("isc_1M");

    // The login page allows the user to type their username into the username field
    public LoginPage typeUsername(String username) {
        // This is the only place that "knows" how to enter a username
        driver.findElement(usernameLocator).sendKeys(username);

        // Return the current page object as this action doesn't navigate to a page represented by another PageObject
        return this;    
    }

    // The login page allows the user to type their password into the password field
    public LoginPage typePassword(String password) {
        // This is the only place that "knows" how to enter a password
        driver.findElement(passwordLocator).sendKeys(password);

        // Return the current page object as this action doesn't navigate to a page represented by another PageObject
        return this;    
    }

    // The login page allows the user to submit the login form
    public LoginPage submitLogin() {
        // This is the only place that submits the login form and expects the destination to be the home page.
        // A seperate method should be created for the instance of clicking login whilst expecting a login failure. 
        driver.findElement(loginButtonLocator).submit();

        // Return a new page object representing the destination. Should the login page ever
        // go somewhere else (for example, a legal disclaimer) then changing the method signature
        // for this method will mean that all tests that rely on this behaviour won't compile.
        return new LoginPage(driver);    
    }

    // The login page allows the user to submit the login form knowing that an invalid username and / or password were entered
    public LoginPage submitLoginExpectingFailure() {
        // This is the only place that submits the login form and expects the destination to be the login page due to login failure.
        driver.findElement(loginButtonLocator).submit();

        // Return a new page object representing the destination. Should the user ever be navigated to the home page after submiting a login with credentials 
        // expected to fail login, the script will fail when it attempts to instantiate the LoginPage PageObject.
        return new LoginPage(driver);   
    }

    // Conceptually, the login page offers the user the service of being able to "log into"
    // the application using a user name and password. 
    public LoginPage loginAs(String username, String password) {
        // The PageObject methods that enter username, password & submit login have already defined and should not be repeated here.
        typeUsername(username);
        typePassword(password);
        return submitLogin();
    }
}