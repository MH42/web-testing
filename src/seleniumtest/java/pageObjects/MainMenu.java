package pageObjects;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MainMenu {
	public WebDriver driver;

	public void mainMenu(String item, WebDriver driver) throws Exception{

		if (item == "File"){
			driver.findElement(By.id("isc_N")).click();
		}else if (item == "Personal"){
			driver.findElement(By.id("isc_P")).click();
		} else if (item == "Tools"){
			driver.findElement(By.id("isc_11F")).click();
		}else if (item == "Help"){
			driver.findElement(By.id("isc")).click();
		} else {
			throw new Exception();
		}
	}
}
