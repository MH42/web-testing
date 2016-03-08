package pageObjects;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SwitchTabs {
	public WebDriver driver;
	
	/**
	 * @param driver
	 */
	public SwitchTabs(WebDriver driver) {
		this.driver = driver;
	}

	public void switchTabs(String tab) throws Exception{
		if (tab == "Dashboard"){
			driver.findElement(By.xpath("//div[4]/div/div[1]/div/table/tbody/tr/td")).click();
		}else if (tab == "Documents"){
			driver.findElement(By.xpath("//div[4]/div/div[2]/div/table/tbody/tr/td")).click();
		} else if (tab == "Search"){
			driver.findElement(By.xpath("//div[4]/div/div[3]/div/table/tbody/tr/td")).click();
		}else if (tab == "Administration"){
			driver.findElement(By.xpath("//div[4]/div/div[4]/div/table/tbody/tr/td")).click();
		} else {
			throw new Exception();
		}
	}
}
