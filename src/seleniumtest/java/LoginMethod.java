
import java.util.concurrent.TimeUnit;
import org.junit.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
// import org.openqa.selenium.remote.RemoteWebDriver;

//This method is used to login to logicaldoc locally

public class LoginMethod {
  public WebDriver driver;
  public String baseUrl;

  @Before
  public void setUp() throws Exception {
	  driver = new FirefoxDriver();
	  baseUrl = "http://localhost:8080";
	  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @Test
  public void loginMethod() throws Exception {
    driver.get(baseUrl + "/frontend.jsp");
    driver.findElement(By.id("isc_V")).clear();		//username
    driver.findElement(By.id("isc_V")).sendKeys("admin");
    driver.findElement(By.id("isc_Y")).clear();		//password
    driver.findElement(By.id("isc_Y")).sendKeys("admin");
    driver.findElement(By.id("isc_1M")).click();	//submit
    
  }
}