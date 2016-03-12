package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.gargoylesoftware.htmlunit.ElementNotFoundException;

public class FolderContextMenu {

	private WebDriver driver;
	private WebElement folder;
	private Actions action;
	
	/**
	 * @param driver
	 */
	public FolderContextMenu(WebDriver driver) {
		this.driver = driver;
	}

	/**
	 * @param folder the folder to set
	 */
	public void setFolder(WebElement folder) {
		this.folder = folder;
	}

	public void click(String item) throws Exception{
		action = new Actions(driver);

		action.contextClick(folder).build().perform();


		switch (item) {

		case "Reload":
			action
			.sendKeys(Keys.ARROW_DOWN)
			.sendKeys(Keys.RETURN).build().perform();
			break;
		case "Search":

			action.click(driver.findElement(By.xpath("//div[contains(@eventproxy,'isc_Menu_')]/div/table/tbody/tr[2]/td")))
			.sendKeys(Keys.RETURN).build().perform();
			break;
		case "New folder":

			action.click(driver.findElement(By.xpath("//div[contains(@eventproxy,'isc_Menu_')]/div/table/tbody/tr[3]/td")))
			.sendKeys(Keys.RETURN).build().perform();
			break;
		case "Rename":

			action.click(driver.findElement(By.xpath("//div[contains(@eventproxy,'isc_Menu_')]/div/table/tbody/tr[4]/td")))
			.sendKeys(Keys.RETURN).build().perform();
			break;
		case "Delete":

			action.click(driver.findElement(By.xpath("//div[contains(@eventproxy,'isc_Menu_')]/div/table/tbody/tr[5]/td")))
			.sendKeys(Keys.RETURN).build().perform();
			break;
		case "Add bookmark":

			action.click(driver.findElement(By.xpath("//div[contains(@eventproxy,'isc_Menu_')]/div/table/tbody/tr[6]/td")))
			.sendKeys(Keys.RETURN).build().perform();
			break;
		case "Paste":

			action.click(driver.findElement(By.xpath("//div[contains(@eventproxy,'isc_Menu_')]/div/table/tbody/tr[7]/td")))
			.sendKeys(Keys.RETURN).build().perform();
			action.click(driver.findElement(By.xpath("//div[contains(@eventproxy,'isc_EmailDialog_')]//div[contains(@eventproxy,'isc_ListGrid_')]/div/table/tbody/tr/td[2]")))
			.sendKeys("your@email.com").sendKeys(Keys.ENTER).build().perform();		
			break;
		case "Paste as alias":

			action.click(driver.findElement(By.xpath("//div[contains(@eventproxy,'isc_ContextMenu_')]/div/table/tbody/tr[8]/td")))
			.sendKeys(Keys.RETURN).build().perform();
			break;
		case "Move":

			action.click(driver.findElement(By.xpath("//div[contains(@eventproxy,'isc_ContextMenu_')]/div/table/tbody/tr[9]/td")))
			.sendKeys(Keys.RETURN).build().perform();
			break;
		case "Copy":

			action.click(driver.findElement(By.xpath("//div[contains(@eventproxy,'isc_ContextMenu_')]/div/table/tbody/tr[10]/td")))
			.sendKeys(Keys.RETURN).build().perform();
			break;
		case "Export to ZIP":

			action.click(driver.findElement(By.xpath("//div[contains(@eventproxy,'isc_ContextMenu_')]/div/table/tbody/tr[11]/td")))
			.sendKeys(Keys.RETURN).build().perform();
			break;
		default:
			throw new Exception("Sorry, but your too dumb for a correct Request");
		}
	}

}
