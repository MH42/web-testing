package pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class FileContextMenu {
	
	private WebDriver driver;
	private String fileLocator;
	private Actions action;
	
	/**
	 * @param driver
	 */
	public FileContextMenu(WebDriver driver) {
		this.driver = driver;
	}

	/**
	 * @param fileLocator cssSelector to set
	 */
	public void setFileLocator(String fileLocator) {
		this.fileLocator = fileLocator;
	}
	
	/*
	 * this method is needed since we always want to hit
	 * last Contextmenu of all created Contextmenus created by contextClick action
	 */
	private WebElement getLast(List<WebElement> possibleElements){
		int last=0;
		last = possibleElements.size() - 1;
		return possibleElements.get(last);
	}
	
	public void click(String item) throws Exception{
		action = new Actions(driver);
		WebElement file = driver.findElement(By.cssSelector(fileLocator));
		action.contextClick(file).build().perform();
		
		switch (item) {
		case "Download":
			action.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.RETURN).build().perform();
			break;
		case "Preview":
			
			action.click(this.getLast(driver.findElements(By.xpath("//div[starts-with(@eventproxy,'isc_ContextMenu_')]/div/table/tbody/tr[2]/td"))))
			.sendKeys(Keys.RETURN).build().perform();
			break;
		case "Cut":
			action.click(this.getLast(driver.findElements(By.xpath("//div[starts-with(@eventproxy,'isc_ContextMenu_')]/div/table/tbody/tr[3]/td"))))
			.sendKeys(Keys.RETURN).build().perform();
			break;
		case "Copy":
			action.click(this.getLast(driver.findElements(By.xpath("//div[starts-with(@eventproxy,'isc_ContextMenu_')]/div/table/tbody/tr[4]/td"))))
			.sendKeys(Keys.RETURN).build().perform();
			break;
		case "Delete":
			action.click(this.getLast(driver.findElements(By.xpath("//div[starts-with(@eventproxy,'isc_ContextMenu_')]/div/table/tbody/tr[5]/td"))))
			.sendKeys(Keys.RETURN).build().perform();
			break;
		case "Add bookmark":
			action.click(this.getLast(driver.findElements(By.xpath("//div[starts-with(@eventproxy,'isc_ContextMenu_')]/div/table/tbody/tr[6]/td"))))
			.sendKeys(Keys.RETURN).build().perform();
			break;
		case "Send by email":
			action.click(this.getLast(driver.findElements(By.xpath("//div[starts-with(@eventproxy,'isc_ContextMenu_')]/div/table/tbody/tr[7]/td"))))
			.sendKeys(Keys.RETURN).build().perform();
			action.click(driver.findElement(By.xpath("//div[starts-with(@eventproxy,'isc_EmailDialog_')]//div[starts-with(@eventproxy,'isc_ListGrid_')]/div/table/tbody/tr/td[2]")))
			.sendKeys("your@email.com").
			sendKeys(Keys.ENTER).build().perform();	
			action.click(driver.findElement(By.xpath("//td[starts-with(@onfocus,'isc_ButtonItem_')]")))
			.build().perform();
			break;
		case "Paste as link":
			action.click(this.getLast(driver.findElements(By.xpath("//div[starts-with(@eventproxy,'isc_ContextMenu_')]/div/table/tbody/tr[8]/td"))))
			.sendKeys(Keys.RETURN).build().perform();
			break;
		case "Checkout":
			action.click(this.getLast(driver.findElements(By.xpath("//div[starts-with(@eventproxy,'isc_ContextMenu_')]/div/table/tbody/tr[9]/td"))))
			.sendKeys(Keys.RETURN).build().perform();
			action.sendKeys(Keys.RETURN).build().perform();
			action.sendKeys(Keys.RETURN).build().perform();
			action.sendKeys(Keys.RETURN).build().perform();
			break;
		case "Checkin":
			action.click(this.getLast(driver.findElements(By.xpath("//div[starts-with(@eventproxy,'isc_ContextMenu_')]/div/table/tbody/tr[10]/td"))))
			.sendKeys(Keys.RETURN).build().perform();
			action.sendKeys(driver.findElement(By.cssSelector("input[name='comment']")),"test").build().perform();
			action.sendKeys(driver.findElement(By.cssSelector("input[class='gwt-FileUpload']")),"intro.pdf")
			.sendKeys(Keys.ENTER)
			.build().perform();
			action.sendKeys(Keys.RETURN).build().perform();
			break;
		case "Lock":
			action
				.click(this.getLast(driver.findElements(By.xpath("//div[starts-with(@eventproxy,'isc_ContextMenu_')]/div/table/tbody/tr[11]/td"))))			
				.sendKeys(Keys.RETURN).build().perform();
				action.sendKeys(Keys.ENTER).build().perform();
			break;
		case "Unlock":
			action
				.click(this.getLast(driver.findElements(By.xpath("//div[starts-with(@eventproxy,'isc_ContextMenu_')]/div/table/tbody/tr[12]/td"))))			
				.sendKeys(Keys.RETURN)
				.build()
				.perform();
			action
				.sendKeys(Keys.ENTER)
				.build()
				.perform();
			break;
		case "Index":
			action
				.click(driver.findElement(By.xpath("//div[starts-with(@eventproxy,'isc_ContextMenu_')]/div/table/tbody/tr[13]/td")))
				.sendKeys(Keys.RETURN)
				.build()
				.perform();
			action
				.click(driver.findElement(By.xpath("//div[starts-with(@eventproxy,'isc_Menu_')]//table/tbody/tr[1]/td")))
				.sendKeys(Keys.RETURN)
				.build()
				.perform();
			break;
		case "Mark indexable":
			action
				.click(this.getLast(driver.findElements(By.xpath("//div[starts-with(@eventproxy,'isc_ContextMenu_')]/div/table/tbody/tr[13]/td"))))
				.sendKeys(Keys.RETURN)
				.build()
				.perform();
			action
				.click(this.getLast(driver.findElements(By.xpath("//div[starts-with(@eventproxy,'isc_Menu_')]//table/tbody/tr[2]/td"))))
				.sendKeys(Keys.RETURN)
				.build()
				.perform();
			break;
		case "Mark unindexable":
			action
				.click(this.getLast(driver.findElements(By.xpath("//div[starts-with(@eventproxy,'isc_ContextMenu_')]/div/table/tbody/tr[13]/td"))))
				.sendKeys(Keys.RETURN)
				.build()
				.perform();
			action
				.click(this.getLast(driver.findElements(By.xpath("//div[starts-with(@eventproxy,'isc_Menu_')]//table/tbody/tr[3]/td"))))
				.sendKeys(Keys.RETURN)
				.build()
				.perform();
			break;
		case "Mark immutable":
			action
				.click(this.getLast(driver.findElements(By.xpath("//div[starts-with(@eventproxy,'isc_ContextMenu_')]/div/table/tbody/tr[13]/td"))))
				.sendKeys(Keys.RETURN)
				.build()
				.perform();
			action
				.click(this.getLast(driver.findElements(By.xpath("//div[starts-with(@eventproxy,'isc_Menu_')]//table/tbody/tr[4]/td"))))
				.sendKeys("test")
				.sendKeys(Keys.ENTER)
				.build()
				.perform();
			break;
		case "Sign":
			action
				.click(this.getLast(driver.findElements(By.xpath("//div[starts-with(@eventproxy,'isc_ContextMenu_')]/div/table/tbody/tr[13]/td"))))
				.sendKeys(Keys.RETURN)
				.build()
				.perform();
			action
				.click(this.getLast(driver.findElements(By.xpath("//div[starts-with(@eventproxy,'isc_Menu_')]//table/tbody/tr[5]/td"))))
				.sendKeys(Keys.RETURN)
				.build()
				.perform();
			break;
		default:
			throw new Exception("Unknown Item.");
		}
	}

}
