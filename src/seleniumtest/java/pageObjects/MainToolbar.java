package pageObjects;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NotFoundException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MainToolbar {
	public  WebDriver driver;
	
	public MainToolbar(WebDriver driver){
		this.driver = driver;
	}
	public void click(String item) throws Exception {
		if (item == "File"){
			driver.findElements(By.cssSelector("td[onfocus*='isc_ToolStripMenuButton_0'] table tbody tr td"))
				.get(0)
				.click();
		}
		else if (item == "Personal"){
			driver.findElements(By.cssSelector("td[onfocus*='isc_ToolStripMenuButton_1'] table tbody tr td"))
				.get(0)
				.click();
		}
		else if (item == "Tools"){
			driver.findElements(By.cssSelector("td[onfocus*='isc_ToolStripMenuButton_5'] table tbody tr td"))
				.get(0)
				.click();
		}
		else if (item == "Help"){
			driver.findElements(By.cssSelector("td[onfocus*='isc_ToolStripMenuButton_3'] table tbody tr td"))
				.get(0)
				.click();
		}
		else if (item == "Logout"){
			driver.findElement(By.xpath("//img[src='http://localhost:8080/frontend/sc/skins/Simplicity/images/actions/close.png']"))
				.click();
		}
		else {
			throw new Exception("Item unknown");
		}
	}
	public void search(String item,WebDriver driver){
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		WebElement searchInput = driver.findElement(By.name("isc_SearchBox_0"));
		searchInput.clear();
		searchInput.sendKeys(item);
		driver.findElement(By.xpath("//img[contains(@src,'http://localhost:8080/frontend/sc/skins/Simplicity/images/pickers/search_picker.gif')]")).click();
	}	
}
