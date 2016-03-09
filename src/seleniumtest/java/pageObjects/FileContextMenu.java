package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class FileContextMenu {
	
	private WebDriver driver;
	private WebElement file;
	private Actions action;
	
	/**
	 * @param driver
	 */
	public FileContextMenu(WebDriver driver) {
		this.driver = driver;
	}

	/**
	 * @param file the file to set
	 */
	public void setFile(WebElement file) {
		this.file = file;
	}
	
	public void click(String item) throws Exception{
		action = new Actions(driver);
		
		switch (item) {
		case "Download":
			action.contextClick(file)
				.sendKeys(Keys.ARROW_DOWN)
				.sendKeys(Keys.RETURN).build().perform();
			break;
		case "Preview":
			action.contextClick(file).build().perform();
			action.click(driver.findElement(By.xpath("//div[contains(@eventproxy,'isc_ContextMenu_')]/div/table/tbody/tr[2]/td")))
			.sendKeys(Keys.RETURN).build().perform();
			break;
		case "Cut":
			action.contextClick(file).build().perform();
			action.click(driver.findElement(By.xpath("//div[contains(@eventproxy,'isc_ContextMenu_')]/div/table/tbody/tr[3]/td")))
			.sendKeys(Keys.RETURN).build().perform();
			break;
		case "Copy":
			action.contextClick(file).build().perform();
			action.click(driver.findElement(By.xpath("//div[contains(@eventproxy,'isc_ContextMenu_')]/div/table/tbody/tr[4]/td")))
			.sendKeys(Keys.RETURN).build().perform();
			break;
		case "Delete":
			action.contextClick(file).build().perform();
			action.click(driver.findElement(By.xpath("//div[contains(@eventproxy,'isc_ContextMenu_')]/div/table/tbody/tr[5]/td")))
			.sendKeys(Keys.RETURN).build().perform();
			break;
		case "Add bookmark":
			action.contextClick(file).build().perform();
			action.click(driver.findElement(By.xpath("//div[contains(@eventproxy,'isc_ContextMenu_')]/div/table/tbody/tr[6]/td")))
			.sendKeys(Keys.RETURN).build().perform();
			break;
		case "Send by email":
			action.contextClick(file).build().perform();
			action.click(driver.findElement(By.xpath("//div[contains(@eventproxy,'isc_ContextMenu_')]/div/table/tbody/tr[7]/td")))
			.sendKeys(Keys.RETURN).build().perform();
			action.click(driver.findElement(By.xpath("//div[contains(@eventproxy,'isc_EmailDialog_')]//div[contains(@eventproxy,'isc_ListGrid_')]/div/table/tbody/tr/td[2]")))
			.sendKeys("your@email.com").sendKeys(Keys.ENTER).build().perform();		
			break;
		case "Paste as link":
			action.contextClick(file).build().perform();
			action.click(driver.findElement(By.xpath("//div[contains(@eventproxy,'isc_ContextMenu_')]/div/table/tbody/tr[8]/td")))
			.sendKeys(Keys.RETURN).build().perform();
			break;
		case "Checkout":
			action.contextClick(file).build().perform();
			action.click(driver.findElement(By.xpath("//div[contains(@eventproxy,'isc_ContextMenu_')]/div/table/tbody/tr[9]/td")))
			.sendKeys(Keys.RETURN).build().perform();
			break;
		case "Checkin":
			action.contextClick(file).build().perform();
			action.click(driver.findElement(By.xpath("//div[contains(@eventproxy,'isc_ContextMenu_')]/div/table/tbody/tr[10]/td")))
			.sendKeys(Keys.RETURN).build().perform();
			break;
		case "Lock":
			action.contextClick(file).build().perform();
			action.click(driver.findElement(By.xpath("//div[contains(@eventproxy,'isc_ContextMenu_')]/div/table/tbody/tr[11]/td")))
			.sendKeys(Keys.RETURN).build().perform();
			break;
		case "Unlock":
			action.contextClick(file).build().perform();
			action.click(driver.findElement(By.xpath("//div[contains(@eventproxy,'isc_ContextMenu_')]/div/table/tbody/tr[12]/td")))
			.sendKeys(Keys.RETURN).build().perform();
			break;
		case "Index":
			action.contextClick(file).build().perform();
			action.click(driver.findElement(By.xpath("//div[contains(@eventproxy,'isc_ContextMenu_')]/div/table/tbody/tr[13]/td")))
			.sendKeys(Keys.RETURN).build().perform();
			action.click(driver.findElement(By.xpath("//div[contains(@eventproxy,'isc_Menu_')]//table/tbody/tr[1]/td")))
			.sendKeys(Keys.RETURN).build().perform();
			break;
		case "Mark indexable":
			action.contextClick(file).build().perform();
			action.click(driver.findElement(By.xpath("//div[contains(@eventproxy,'isc_ContextMenu_')]/div/table/tbody/tr[13]/td")))
			.sendKeys(Keys.RETURN).build().perform();
			action.click(driver.findElement(By.xpath("//div[contains(@eventproxy,'isc_Menu_')]//table/tbody/tr[2]/td")))
			.sendKeys(Keys.RETURN).build().perform();
			break;
		case "Mark unindexable":
			action.contextClick(file).build().perform();
			action.click(driver.findElement(By.xpath("//div[contains(@eventproxy,'isc_ContextMenu_')]/div/table/tbody/tr[13]/td")))
			.sendKeys(Keys.RETURN).build().perform();
			action.click(driver.findElement(By.xpath("//div[contains(@eventproxy,'isc_Menu_')]//table/tbody/tr[3]/td")))
			.sendKeys(Keys.RETURN).build().perform();
			break;
		case "Mark immutable":
			action.contextClick(file).build().perform();
			action.click(driver.findElement(By.xpath("//div[contains(@eventproxy,'isc_ContextMenu_')]/div/table/tbody/tr[13]/td")))
			.sendKeys(Keys.RETURN).build().perform();
			action.click(driver.findElement(By.xpath("//div[contains(@eventproxy,'isc_Menu_')]//table/tbody/tr[4]/td")))
			.sendKeys(Keys.RETURN).build().perform();
			break;
		case "Sign":
			action.contextClick(file).build().perform();
			action.click(driver.findElement(By.xpath("//div[contains(@eventproxy,'isc_ContextMenu_')]/div/table/tbody/tr[13]/td")))
			.sendKeys(Keys.RETURN).build().perform();
			action.click(driver.findElement(By.xpath("//div[contains(@eventproxy,'isc_Menu_')]//table/tbody/tr[5]/td")))
			.sendKeys(Keys.RETURN).build().perform();
			break;
		default:
			throw new Exception("Unknown Item.");
		}
	}

}
